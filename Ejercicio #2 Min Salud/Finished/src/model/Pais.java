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
		for (int i = 0; i < listaDepartamentos.size(); i++) {
			Departamento departamento =  listaDepartamentos.get(i);
			cant += departamento.obtenerCantidadNinos();
		} return cant;
	}
	
}
