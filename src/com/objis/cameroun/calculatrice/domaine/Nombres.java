package com.objis.cameroun.calculatrice.domaine;

public class Nombres {

	private float nombre1;
	private float nombre2;

	public Nombres(float nombre12, float nombre22) {
		super();
		this.nombre1 = nombre12;
		this.nombre2 = nombre22;
	}

	public float getNombre1() {
		return nombre1;
	}

	public void setNombre1(int nombre1) {
		this.nombre1 = nombre1;
	}

	public float getNombre2() {
		return nombre2;
	}

	public void setNombre2(int nombre2) {
		this.nombre2 = nombre2;
	}

	@Override
	public String toString() {
		return "Nombres [nombre1=" + nombre1 + ", nombre2=" + nombre2 + "]";
	}

}
