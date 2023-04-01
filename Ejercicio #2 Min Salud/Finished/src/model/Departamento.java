package model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private final List<Ciudad> listaCiudades = new ArrayList<Ciudad>();
	private String nombre;

	public Departamento(String nombre) {
		this.nombre = nombre;
	}

	public List<Ciudad> getListaCiudades() {
		return listaCiudades;
	}

	public int obtenerCantidadNinos() {
		int cant = 0;
		for (int i = 0; i < listaCiudades.size(); i++)
			cant += listaCiudades.get(i).obtenerCantidadNinos();
		return cant;
	}

	public int obtenerCantidadCiudadesVacunadas() {
		int cant = 0;
		for (int i = 0; i < listaCiudades.size(); i++)
			if (listaCiudades.get(i).seVacuno())
				cant++;
		return cant;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
