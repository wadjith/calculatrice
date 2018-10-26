package com.objis.cameroun.calculatrice.service;

import com.objis.cameroun.calculatrice.domaine.Nombres;

/**
 * @author MINMAP-WTT
 *
 */
public interface IOperations {
	
	public float addition(Nombres nombre);
	public float soustraction(Nombres nombre);
	public float produit(Nombres nombre);
	public float division(Nombres nombre);

}
