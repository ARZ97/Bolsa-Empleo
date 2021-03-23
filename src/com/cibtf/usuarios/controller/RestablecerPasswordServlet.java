package com.cibtf.usuarios.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cibtf.connection.Conexion;
import com.cibtf.dao.CorreoDAO;
import com.cibtf.dao.FormatoCorreosDAO;
import com.cibtf.md5.MD5;
import com.cibtf.model.Usuario;
import com.cibtf.session.controller.SessionUser;

/**
 * Servlet implementation class RestablecerPasswordServlet
 */
@WebServlet("/RestablecerPasswordServlet")
public class RestablecerPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Validar Sesi�n y Rol
				SessionUser sessionUser = new SessionUser();
				
				HttpSession session = request.getSession();
				
				sessionUser = (SessionUser) session.getAttribute("sessionUser");
				if(sessionUser == null) {
					request.setAttribute("error", "noLogin");
					request.getRequestDispatcher("ErrorLoginServlet").forward(request, response);
				}else if(sessionUser.getRolUsuario().equals("universidad") || sessionUser.getRolUsuario().equals("empresa")) {
					request.getRequestDispatcher("NotFoundServlet").forward(request, response);
				}
				//Fin Validar Sesi�n y Rol
				
				Connection conn = Conexion.getConnection();
				
				Usuario usuario = new Usuario();
				
				String sql = "UPDATE usuarios SET password_usuario=? WHERE id_usuario=?";
				
				PreparedStatement stmnt = null;
				int nRegistros = 0;
				
				String newPassword = "cibtf"+request.getParameter("idUsuario");
				
				//Llenamos el objeto Usuario
				usuario.setIdUsuario(Integer.parseInt(request.getParameter("idUsuario")));
				usuario.setPassUsuario(MD5.getMd5(newPassword));
				//Fin de llenado de objeto
				

				try {
					//preparado de PreparedStatement
					stmnt = conn.prepareStatement(sql);
					stmnt.setString(1, usuario.getPassUsuario());
					stmnt.setInt(2, usuario.getIdUsuario());
					//Fin del preparado
					
					//Ejecutamos el query y esperamos un n�mero diferente de cero
					nRegistros = stmnt.executeUpdate();
					
					
					System.out.println("Restablecer Password: "+request.getParameter("correoUsuario"));
					System.out.println("Nueva Pass: "+newPassword);
					System.out.println("Nueva MDP Pass:"+MD5.getMd5(newPassword));
					CorreoDAO correoDAO = new CorreoDAO();
					FormatoCorreosDAO formatoCorreosDAO = new FormatoCorreosDAO();
					String html = formatoCorreosDAO.getFormatoNotificacion("Recuperaci�n De Contrase�a", "Se ha restablecido tu contrase�a, esta contrase�a es generada autom�ticamente y se te pide de favor la cambies la pr�xima vez que inicies sesi�n.<br><br>"
							+ "Puedes acceder nuevamente a la plataforma con la siguiente contrase�a: "+newPassword, 1);
					correoDAO.enviarCorreoDAO("Recuperaci�n de Contrase�a - CIBTF", html, "bolsaempleo.ad@gmail.com");

					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					
					
					if(nRegistros==0) {
						request.setAttribute("status", "error");
					}else {
						request.setAttribute("status", "newPass");
					}
					

					RequestDispatcher rst = request.getRequestDispatcher("GoEditarUsuarioServlet?idUsuario="+request.getParameter("idUsuario"));
					rst.forward(request, response);
					try {
						
						stmnt.close();
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	}

}
