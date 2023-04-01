package model;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nombre;
	private final List<Departamento> listaDepartamentos = new ArrayList<Departamento>();

	public Pais(String nombre) {
		this.nombre = nombre;
	}

	public int obtenerCantidadNinos() {
		int cant = 0;
		for (int i = 0; i < getListaDepartamentos().size(); i++)
			cant += getListaDepartamentos().get(i).obtenerCantidadNinos();
		return cant;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}

}
