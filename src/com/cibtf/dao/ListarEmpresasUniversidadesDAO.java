package com.cibtf.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cibtf.connection.Conexion;
import com.cibtf.model.ListaEmpresaUniversidad;

public class ListarEmpresasUniversidadesDAO {
	
	ArrayList<ListaEmpresaUniversidad> listaEmpresas = new ArrayList<ListaEmpresaUniversidad>();
	ArrayList<ListaEmpresaUniversidad> listaUniversidades = new ArrayList<ListaEmpresaUniversidad>();
	
	public ListarEmpresasUniversidadesDAO() {
		
	}
	
	public ArrayList<ListaEmpresaUniversidad> getListaEmpresas(){
		
		Connection conn = Conexion.getConnection();
		String sql = "SELECT * FROM empresas";
		
		Statement stmnt = null;
		ResultSet rs = null;
		
		try {
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(sql);
			
			while(rs.next()) {
				if(rs.getInt("id_empresa") != 0) {
					ListaEmpresaUniversidad registro = new ListaEmpresaUniversidad();
					registro.setIdRegistro(rs.getInt("id_empresa"));
					registro.setNombreRegistro(rs.getString("nombre_empresa"));
					listaEmpresas.add(registro);
				}
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
		
		return listaEmpresas;
	}
	
	public ArrayList<ListaEmpresaUniversidad> getListaUniversidades(){
		
		Connection conn = Conexion.getConnection();
		String sql = "SELECT * FROM universidades";
		
		Statement stmnt = null;
		ResultSet rs = null;
		
		try {
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(sql);
			
			while(rs.next()) {
				if(rs.getInt("id_universidad") != 0) {
					ListaEmpresaUniversidad registro = new ListaEmpresaUniversidad();
					registro.setIdRegistro(rs.getInt("id_universidad"));
					registro.setNombreRegistro(rs.getString("nombre_universidad"));
					listaUniversidades.add(registro);
				}
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
		
		return listaUniversidades;
	}
	
}
