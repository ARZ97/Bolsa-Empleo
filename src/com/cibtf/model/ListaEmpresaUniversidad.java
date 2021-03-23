package com.cibtf.model;

public class ListaEmpresaUniversidad {
	int idRegistro;
	String nombreRegistro;
	
	public ListaEmpresaUniversidad() {
		
	}
	
	public int getIdRegistro() {
		return idRegistro;
	}
	public void setIdRegistro(int idRegistro) {
		this.idRegistro = idRegistro;
	}
	public String getNombreRegistro() {
		return nombreRegistro;
	}
	public void setNombreRegistro(String nombreRegistro) {
		this.nombreRegistro = nombreRegistro;
	}
	public ListaEmpresaUniversidad(int idRegistro, String nombreRegistro) {
		super();
		this.idRegistro = idRegistro;
		this.nombreRegistro = nombreRegistro;
	}
	@Override
	public String toString() {
		return "ListaEmpresaUniversidad [idRegistro=" + idRegistro + ", nombreRegistro=" + nombreRegistro + "]";
	}
	
}
