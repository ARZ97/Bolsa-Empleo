package com.cibtf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.cibtf.connection.Conexion;
import com.cibtf.md5.MD5;
import com.cibtf.model.Empresa;

public class EmpresaDAO {
	private String statusRE;
	private String statusRU;
	private String status;
	
	
	public String NuevaEmpresa(Empresa empresa) {
		FormatoCorreosDAO formatoCorreosDAO = new FormatoCorreosDAO();
		String html = "";

		CorreoDAO correoDAO = new CorreoDAO();
		
		RegistrarEmpresa(empresa);
		if(statusRE.equals("done")) {
			RegistrarUsuario(empresa);
			if(statusRU.equals("done")) {
				status = "done";
				//correoDAO.enviarCorreoDAO("Nuevo Usuario Registrado", "Un nuevo usuario ha registrado su empresa, por favor revisalo en el panel \n http://bolsadeempleo.mx/", "bolsaempleo.ad@gmail.com");
				html = formatoCorreosDAO.getFormatoNuevaEmpresa(empresa);
				correoDAO.enviarCorreoNuevaEmpresa("Una nueva empresa ha solicitado unirse a CIBTF", html);
			}else {
				html = formatoCorreosDAO.getFormatoError("Error al Registrar un Usuario", "El usuario "+empresa.getNombreUsuario()+" intentó registrarse sin éxito, esto puede deberse a un usuario dupliclado en el formulario de solicitud."
						+ "<br><br>Favor de revisar la Base de Datos y atender el problema a la brevedad.");
				status = "error";
				correoDAO.enviarCorreoDAOSppt("Error en el Registro de un Nuevo Usuario", html);
			}
		}else {
			html = formatoCorreosDAO.getFormatoError("Error al Registrar la Empresa", "Un usuario intento registrar la empresa "+empresa.getNombreEmpresa()+" sin éxito, esto puede deberse a un duplicado en los registros o un usuario dupliclado en el formulario de solicitud."
					+ "<br><br>Favor de atender el problema a la brevedad.");
			status = "error";
			correoDAO.enviarCorreoDAOSppt("Error en el Registro de una Nueva Empresa", html);
		}
		
		
		return status;
	}
	
	public void RegistrarEmpresa(Empresa empresa) {
		Connection conn = Conexion.getConnection();
		String sql = "INSERT INTO empresas VALUES(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmnt = null;
		int nRegistros = 0;
		
		try {
			
			stmnt = conn.prepareStatement(sql);
			stmnt.setString(1, empresa.getNombreEmpresa());
			stmnt.setString(2, empresa.getTelefonoEmpresa());
			stmnt.setString(3, empresa.getCalleEmpresa());
			stmnt.setString(4, empresa.getNoCalleEmpresa());
			stmnt.setString(5, empresa.getColoniaEmpresa());
			stmnt.setString(6, empresa.getCpEmpresa());
			stmnt.setString(7, empresa.getPaisEmpresa());
			stmnt.setString(8, empresa.getEstadoEmpresa());
			stmnt.setString(9, empresa.getCiudadEmpresa());
			stmnt.setString(10, empresa.getMunicipioEmpresa());
			stmnt.setString(11, empresa.getPaginaEmpresa());
			stmnt.setString(12, empresa.getRazonSocialEmpresa());
			stmnt.setString(13, empresa.getRfcEmpresa());
			stmnt.setString(14, empresa.getCorreoEmpresa());
			
			nRegistros = stmnt.executeUpdate();
			

			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(nRegistros==0) {
				statusRE = "error";
			}else {
				statusRE = "done";
			}
			try {
				stmnt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	public void RegistrarUsuario(Empresa empresa) {
		Connection conn = Conexion.getConnection();
		String sql = "INSERT INTO usuarios VALUES(null,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmnt = null;
		int nRegistros = 0;
		
		try {
			
			stmnt = conn.prepareStatement(sql);
			stmnt.setString(1, empresa.getNombreUsuario());
			stmnt.setString(2, empresa.getApellidosUsuario());
			stmnt.setString(3, empresa.getCorreoUsuario());
			stmnt.setString(4, MD5.getMd5(empresa.getPassUsuario()));
			stmnt.setString(5, "empresa");
			stmnt.setInt(6, 4);
			stmnt.setInt(7, 0);
			stmnt.setInt(8, getLastEmpresaId());
			
			nRegistros = stmnt.executeUpdate();
			

		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(nRegistros==0) {
				statusRU = "error";
			}else {
				statusRU = "done";
			}
			
			try {
				stmnt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public int getLastEmpresaId() {
		int lastEmpresaId = 0;
		
		Connection conn = Conexion.getConnection();
		String sql = "SELECT id_empresa FROM empresas ORDER BY id_empresa DESC LIMIT 1";
		
		Statement stmnt = null;
		ResultSet rs= null;
		
		try {
			
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(sql);
			
			while(rs.next()) {
				lastEmpresaId = rs.getInt("id_empresa");
			}
			
		
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				conn.close();
				rs.close();
				stmnt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		return lastEmpresaId;
	}

}
