package com.cibtf.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cibtf.connection.Conexion;

public class NumeroNotificaciones {

	private int numeroVacantes;
	private int numeroUsuarios;
	private int numeroEventos;
	private int numeroNoticias;
	private String sql = "";
	
	public NumeroNotificaciones() {
		
	}
	
	public void getNotificaciones() {
		
		Connection conn = Conexion.getConnection();
		
		Statement stmnt = null;
		ResultSet rs = null;
		

		try {
			//numero de vacantes
			sql = "SELECT COUNT(status_vacante) AS vacantes FROM vacantes WHERE status_vacante = 4";
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(sql);
			
			while(rs.next()) {
				numeroVacantes = rs.getInt("vacantes");
				System.out.println("Numero de Vacantess: "+numeroVacantes);
			}
			rs.close();
			
			//numero de usuarios

			sql = "SELECT COUNT(status_usuario) AS usuarios FROM usuarios WHERE status_usuario = 4";
			rs = stmnt.executeQuery(sql);
			
			while(rs.next()) {
				numeroUsuarios = rs.getInt("usuarios");
				System.out.println("Numero de Usuarios: "+numeroUsuarios);
			}
			rs.close();
			
			//numero de noticias

			sql = "SELECT COUNT(status_noticia) AS noticias FROM noticias WHERE status_noticia = 4";
			rs = stmnt.executeQuery(sql);
			
			while(rs.next()) {
				numeroNoticias = rs.getInt("noticias");
				System.out.println("Numero de Noticias: "+numeroNoticias);
			}
			rs.close();

			//numero de eventos
			String sql = "SELECT COUNT(status_evento) AS eventos FROM eventos WHERE status_evento = 4";
			rs = stmnt.executeQuery(sql);
			
			while(rs.next()) {
				numeroEventos = rs.getInt("eventos");
				System.out.println("Numero de Eventos: "+numeroEventos);
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

	public int getNumeroVacantes() {
		return numeroVacantes;
	}


	public int getNumeroUsuarios() {
		return numeroUsuarios;
	}


	public int getNumeroEventos() {
		return numeroEventos;
	}


	public int getNumeroNoticias() {
		return numeroNoticias;
	}

	

	
}
