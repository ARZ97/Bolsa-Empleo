package com.cibtf.enviarcv.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cibtf.connection.Conexion;
import com.cibtf.dao.VacantesDAO;
import com.cibtf.model.AdminVacante;
import com.cibtf.session.controller.SessionUser;

/**
 * Servlet implementation class EnviarCVServlet
 */
@WebServlet("/EnviarCVPageServlet")
public class EnviarCVPageServlet extends HttpServlet {
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
		//Validar Sesión y Rol
		SessionUser sessionUser = new SessionUser();
		
		HttpSession session = request.getSession();
		
		sessionUser = (SessionUser) session.getAttribute("sessionUser");
		if(sessionUser == null) {
			request.setAttribute("error", "noLogin");
			request.getRequestDispatcher("ErrorLoginServlet").forward(request, response);
		}else if(sessionUser.getRolUsuario().equals("empresa")) {
			request.getRequestDispatcher("NotFoundServlet").forward(request, response);
		}
		//Fin Validar Sesión y Rol
		
		
		int idVacante = Integer.parseInt(request.getParameter("idVacante"));
		
		AdminVacante vacante = new AdminVacante();
		VacantesDAO vacantesDAO = new VacantesDAO();
		vacante = vacantesDAO.getVacanteDAO(idVacante);
		
		Connection conn = Conexion.getConnection();
		String sql = "SELECT usuarios.correo_usuario FROM usuarios INNER JOIN vacantes ON usuarios.id_usuario = vacantes.id_usuario INNER JOIN empresas ON usuarios.id_empresa = empresas.id_empresa WHERE id_vacante = "+idVacante;
		
		Statement stmnt = null;
		ResultSet rs = null;
		
		
		try {

			String correo = "";
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(sql);
			
			while(rs.next()) {

				correo = rs.getString("correo_usuario");
				
			}
			
			request.setAttribute("vacante", vacante);
			request.setAttribute("correo", correo);
			
			request.getRequestDispatcher("response_vacantes.jsp").forward(request, response);
			
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
		
		
	}

}
