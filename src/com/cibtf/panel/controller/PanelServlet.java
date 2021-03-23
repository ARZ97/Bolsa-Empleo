package com.cibtf.panel.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cibtf.dao.NumeroNotificaciones;
import com.cibtf.dao.PublicacionesActiveDAO;
import com.cibtf.dao.PublicacionesDAO;
import com.cibtf.dao.VacantesDAO;
import com.cibtf.session.controller.SessionUser;

/**
 * Servlet implementation class PanelServlet
 */
@WebServlet("/PanelServlet")
public class PanelServlet extends HttpServlet {
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
		}
		//Fin Validar Sesión y Rol
		
		
		
		//Cuadros de Notificaciones
		NumeroNotificaciones numeroNotificaciones = new NumeroNotificaciones();


		numeroNotificaciones.getNotificaciones();
		request.setAttribute("numeroEventos", numeroNotificaciones.getNumeroEventos());
		request.setAttribute("numeroVacantes", numeroNotificaciones.getNumeroVacantes());
		request.setAttribute("numeroUsuarios", numeroNotificaciones.getNumeroUsuarios());
		request.setAttribute("numeroNoticias", numeroNotificaciones.getNumeroNoticias());
		
		
		
		//Publicaciones
		PublicacionesDAO publicacionesDAO = new PublicacionesDAO();


		publicacionesDAO.getPublicaciones();
		PublicacionesActiveDAO actives = new PublicacionesActiveDAO();
		VacantesDAO vacantesDAO = new VacantesDAO();
		
		request.setAttribute("vacantesDAO", vacantesDAO.getAllVacantesDAO());
		request.setAttribute("noticiasDAO", publicacionesDAO.getNoticiasDAO());
		request.setAttribute("eventosDAO", publicacionesDAO.getEventosDAO());
		request.setAttribute("actives", actives);
		
		
		
		request.getRequestDispatcher("panel.jsp").forward(request, response);
		
		
	}

}
