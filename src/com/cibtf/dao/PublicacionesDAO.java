package com.cibtf.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cibtf.connection.Conexion;
import com.cibtf.model.Evento;
import com.cibtf.model.Noticia;

public class PublicacionesDAO {

	private ArrayList<Noticia> noticiasDAO = new ArrayList<Noticia>();
	private ArrayList<Evento> eventosDAO = new ArrayList<Evento>();
	private String sql = "";

	public PublicacionesDAO() {
		
	}
	
	public void getPublicaciones() {
		Connection conn = Conexion.getConnection();		
		Statement stmnt = null;
		ResultSet rs = null;
		

		sql = "SELECT * FROM noticias WHERE status_noticia = 1";
		try {
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(sql);
			
			while(rs.next()) {
				Noticia noticia = new Noticia();
				noticia.setIdNoticia(rs.getInt("id_noticia"));
				noticia.setTituloNoticia(rs.getString("titulo_noticia"));
				noticia.setDescripcionNoticia(rs.getString("descripcion_noticia"));
				
				noticiasDAO.add(noticia);
			}
			rs.close();
			

			sql = "SELECT * FROM eventos WHERE status_evento = 1";
			rs = stmnt.executeQuery(sql);
			
			while(rs.next()) {
				Evento evento = new Evento();
				evento.setIdEvento(rs.getInt("id_evento"));
				evento.setTituloEvento(rs.getString("titulo_evento"));
				evento.setDescripcionEvento(rs.getString("descripcion_evento"));
				
				eventosDAO.add(evento);
			}
			
			
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

	public ArrayList<Noticia> getNoticiasDAO() {
		return noticiasDAO;
	}


	public ArrayList<Evento> getEventosDAO() {
		return eventosDAO;
	}


}
