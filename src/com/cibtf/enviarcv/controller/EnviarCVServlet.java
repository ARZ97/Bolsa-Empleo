package com.cibtf.enviarcv.controller;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.cibtf.connection.Conexion;
import com.cibtf.dao.CorreoDAO;
import com.cibtf.dao.FormatoCorreosDAO;
import com.cibtf.dao.VacantesDAO;
import com.cibtf.model.AdminVacante;
import com.cibtf.session.controller.SessionUser;

/**
 * Servlet implementation class EnviarCVServlet
 */
@MultipartConfig
@WebServlet("/EnviarCVServlet")
public class EnviarCVServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stu
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//Establecemos UTF-8 en el Servlet para que pueda recibir carácteres especiales
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8"); 
		
		
		//Obtenemos datos del formulario
		FormatoCorreosDAO formatoCorreosDAO = new FormatoCorreosDAO();
		
		String nombre = request.getParameter("universidadContacto");
		String correo = request.getParameter("correoContacto");
		String asunto = request.getParameter("asuntoContacto");
		String mensaje = request.getParameter("mensajeContacto");
		String correoVacante = request.getParameter("correoVacante");
		String nombreVacante = request.getParameter("nombreVacante");
		
		//Obtenemos el HTML del correo ya construido
		String html = formatoCorreosDAO.getFormatoEnvioCV(nombre, correoVacante, nombreVacante, mensaje);

		
		//Guardamos el archivo en el servidor de forma temporal
		Part part = request.getPart("archivoCV");
		InputStream documento = part.getInputStream();
		String extension = "";
		
		//Examinamos el MIME Type del archivo
		switch (part.getContentType().toString()) {
			case "image/jpeg":
			case "image/png":
				extension = ".png";
				break;
			case "application/pdf":
				extension = ".pdf";
				break;
			case "application/vnd.openxmlformats-officedocument.wordprocessingml.document":
				extension = ".docx";
				break;
			default:
				extension = ".unknow";
				break;
		}

		String path = "C:\\Users\\Francisco\\Documents\\Eclipse\\Servicio\\WebContent\\documents\\cv"+extension;
		//String path = "187.188.199.177:8086/CIBTF/cv"+extension;
		File upload = new File(path);
		upload.mkdirs();
		Files.copy(documento, upload.toPath(), StandardCopyOption.REPLACE_EXISTING);
		
		
		
		//Log
		System.out.println("Nombre Archivo: "+upload.getName());
		System.out.println("Tipo: "+part.getContentType().toString());
		System.out.println("Ruta: "+path);
		System.out.println("Correo Destino: "+correoVacante);
		

		//Enviamos correo
		CorreoDAO correoDAO = new CorreoDAO();
		String status = correoDAO.enviarCorreoCVDAO(asunto, "bolsaempleo.ad@gmail.com", part.getContentType().toString(), html);
		
		
		
		//Obtener datos de la vacante nuevamente para mostrar en la página
		int idVacante = Integer.parseInt(request.getParameter("idVacante"));
		
		AdminVacante vacante = new AdminVacante();
		VacantesDAO vacantesDAO = new VacantesDAO();
		vacante = vacantesDAO.getVacanteDAO(idVacante);
		
		Connection conn = Conexion.getConnection();
		String sql = "SELECT usuarios.correo_usuario FROM usuarios INNER JOIN vacantes ON usuarios.id_usuario = vacantes.id_usuario INNER JOIN empresas ON usuarios.id_empresa = empresas.id_empresa WHERE id_vacante = "+idVacante;
		
		Statement stmnt = null;
		ResultSet rs = null;
		
		
		try {

			String correoDestinatario = "";
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(sql);
			
			while(rs.next()) {

				correoDestinatario = rs.getString("correo_usuario");
				
			}
			
			request.setAttribute("vacante", vacante);
			request.setAttribute("correo", correoDestinatario);
		
		} catch (Exception e) {
			// TODO: handle exception

		}finally {
			try {

				stmnt.close();
				rs.close();
				conn.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		
		
		//Validar Sesión y Rol
		SessionUser sessionUser = new SessionUser();
		
		HttpSession session = request.getSession();
		
		sessionUser = (SessionUser) session.getAttribute("sessionUser");
		if(sessionUser == null) {
			request.setAttribute("status", status);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else if(sessionUser.getRolUsuario().equals("universidad") || sessionUser.getRolUsuario().equals("admin")){
			request.setAttribute("status", status);
			request.getRequestDispatcher("response_vacantes.jsp").forward(request, response);
		}
		//Fin Validar Sesión y Rol

		
		
	}

}
