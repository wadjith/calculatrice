package com.objis.cameroun.calculatrice.service;

import com.objis.cameroun.calculatrice.domaine.Nombres;

/**
 * @author MINMAP-WTT
 *
 */
public class Operations implements IOperations {
	/**
	 * @param nombre
	 * @return cette methode permet d'additionner 02 nombres en parametre
	 */
	public float addition(Nombres nombre) {

		float resultat = nombre.getNombre1() + nombre.getNombre2();
		return resultat;
	}

	public float soustraction(Nombres nombre) {
		float resultat = nombre.getNombre1() - nombre.getNombre2();
		return resultat;
	}

	public float produit(Nombres nombre) {
		float resultat = nombre.getNombre1() * nombre.getNombre2();
		return resultat;
	}

	public float division(Nombres nombre) {
		float resultat = nombre.getNombre1() / nombre.getNombre2();
		return resultat;
	}
}
