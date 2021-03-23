package com.cibtf.panel.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cibtf.connection.Conexion;

/**
 * Servlet implementation class ControlerIMGnoticias
 */
@WebServlet(name = "GetImagenNoticiaServlet", urlPatterns = {"/GetImagenNoticiaServlet"},loadOnStartup = -1)
public class GetImagenNoticiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {

	       response.setContentType("image/png");
	       Conexion con = new Conexion();

	        PreparedStatement ps = null;
	       ResultSet rs = null;
	       byte[] b = null;

	       try {

	           int id = Integer.parseInt(request.getParameter("id"));
	           ps = Conexion.getConnection().prepareStatement("select imagen_noticia from noticias where id_noticia = ?;");
	           ps.setInt(1, id);
	           rs = ps.executeQuery();
	           while (rs.next()) {
	               b = rs.getBytes(1);
	           }
	           InputStream bos = new ByteArrayInputStream(b);

	           int tamanoInput = bos.available();
	           byte[] datosIMAGEN = new byte[tamanoInput];
	           bos.read(datosIMAGEN, 0, tamanoInput);

	           response.getOutputStream().write(datosIMAGEN);
	           bos.close();
	           ps.close();
	           rs.close();
	 
	       } catch (Exception ex) {
	           System.out.println(ex.getMessage());
	       }

	   }
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	       processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	       processRequest(request, response);
	}

}
