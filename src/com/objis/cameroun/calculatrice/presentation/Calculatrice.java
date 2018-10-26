package com.objis.cameroun.calculatrice.presentation;

import java.util.Scanner;

import com.objis.cameroun.calculatrice.domaine.Nombres;
import com.objis.cameroun.calculatrice.service.IOperations;
import com.objis.cameroun.calculatrice.service.Operations;

/**
 * @author MINMAP-WTT
 *
 */
public class Calculatrice {

	public static void main(String arg[]) {
		System.out.println("initiation aux opérations");

		// creation d'un objet sc de type Scanner
		Scanner sc = new Scanner(System.in);
		Scanner sca = new Scanner(System.in);
		char reponse;
		char choix = 'O';

		float nombre1, nombre2;
		// Instance de types opérations
		IOperations calculeur = new Operations();
		
		while (choix == 'O') {
			System.out.println("choisir l'operation:");
			System.out.println("taper + pour l'addition");
			System.out.println("taper - pour la soustraction");
			System.out.println("taper * pour la multiplication");
			System.out.println("taper / pour la division");

			reponse = sca.nextLine().charAt(0);

			switch (reponse) {
			case '+': {

				System.out.println("donne le premier nombre à additionner");
				nombre1 = sc.nextFloat();
				System.out.println("donne le deuxieme nombre à additionner");
				nombre2 = sc.nextFloat();
				// somme=nombre1+nombre2;
				// somme=calculeur.addition(nombre1,nombre2);
				Nombres nombre = new Nombres(nombre1, nombre2);
				calculeur.addition(nombre);

				System.out.println(nombre1 +" + "+nombre2 + " = "+ calculeur.addition(nombre));
				break;
			}

			case '-': {

				System.out.println("donne le premier nombre à soustraire");
				nombre1 = sc.nextFloat();
				System.out.println("donne le deuxieme nombre à soustraire");
				nombre2 = sc.nextFloat();

				// difference =calculeur.soustraction(nombre1, nombre2);
				Nombres nombre = new Nombres(nombre1, nombre2);

				System.out.println(nombre1 +" - "+ nombre2 +" = "+ calculeur.soustraction(nombre));
				break;
			}

			case '*': {
				System.out.println("donne le premier nombre à multiplier");
				nombre1 = sc.nextFloat();

				System.out.println("donne le deuxieme nombre à multiplier");
				nombre2 = sc.nextFloat();

				// produit = calculeur.produit(nombre1, nombre2);
				Nombres nombre = new Nombres(nombre1, nombre2);

				System.out.println(nombre1+" * "+ nombre2 +" = "+ calculeur.produit(nombre));
				break;
			}

			case '/': {
				System.out.println("donne le premier nombre à diviser");
				nombre1 = sc.nextFloat();

				System.out.println("donne le deuxieme nombre à diviser");
				nombre2 = sc.nextFloat();

				// quotient = calculeur.division(nombre1, nombre2);
				Nombres nombre = new Nombres(nombre1, nombre2);

				System.out.println(nombre1 +" / "+ nombre2 +" = "+ calculeur.division(nombre));
				break;
			}
			}
			System.out.print("voulez-vous reessayer?  O/N: ");
			choix = Character.toUpperCase(sca.nextLine().charAt(0));
		}

		sc.close();
		sca.close();
		System.out.println("aurevoir");

	}
}
