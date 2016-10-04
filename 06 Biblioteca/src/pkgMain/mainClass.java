package pkgMain;

import pkgBiblioteca.*;
import pkgGestione.*;

public class mainClass {

	public static void main(String[] args) {
		
		Biblioteca myBiblioteca = new Biblioteca("Alessandria");
		Gestione segreteria = new Gestione();
		
		
		// Registra utenti
		boolean bool;
		bool = segreteria.registraUtente(myBiblioteca, "Mario", "Rossi");
		System.out.print(bool + " ");
		bool = segreteria.registraUtente(myBiblioteca, "Cristina", "Colli");
		System.out.print(bool + " ");
		bool = segreteria.registraUtente(myBiblioteca, "Marta", "Verdi");
		System.out.print(bool + " ");
		bool = segreteria.registraUtente(myBiblioteca, "Ciccio", "Franco");
		System.out.print(bool + " ");
		bool = segreteria.registraUtente(myBiblioteca, "Valentino", "Rossi");
		System.out.print(bool + " ");
		
		System.out.println();
		
		
		// Registra libri
		int temp;
		temp = segreteria.registraLibro(myBiblioteca, "Sahara", "Cussler", "0001", 1);
		System.out.print(temp + " ");
		temp = segreteria.registraLibro(myBiblioteca, "Inferno", "Dan Brown", "0002", 3);
		System.out.print(temp + " ");
		temp = segreteria.registraLibro(myBiblioteca, "Nel Bianco", "Follet", "0003", 2);
		System.out.print(temp + " ");
		temp = segreteria.registraLibro(myBiblioteca, "Il Barone Rampante", "Italo Calvino", "0004", 1);
		System.out.print(temp + " ");
		temp = segreteria.registraLibro(myBiblioteca, "Sahara", "Cussler", "0001", 1);
		System.out.print(temp + " ");
		
		System.out.println();
		
		// Check inserisci
		bool = segreteria.prestaLibro(myBiblioteca, "Sahara", "Cussler", "Marta", "Verdi");
		System.out.print(bool + " ");
		bool = segreteria.prestaLibro(myBiblioteca, "Inferno", "Dan Brown", "Mario", "Rossi");
		System.out.print(bool + " ");
		
		// Check inserisci libro non più disponibile
		bool = segreteria.prestaLibro(myBiblioteca, "Sahara", "Cussler", "Marta", "Verdi");
		System.out.print(bool + " ");
		
		System.out.println();
		
		// Check rimuovi e reinserisci da stesso utente
		bool = segreteria.restituzioneLibro(myBiblioteca, "Sahara", "Cussler", "Marta", "Verdi");
		System.out.print(bool + " ");
		bool = segreteria.prestaLibro(myBiblioteca, "Sahara", "Cussler", "Marta", "Verdi");
		System.out.print(bool + " ");
		
		System.out.println();
		
		// Check se raggiungo il massimo numero di libri imprestabili
		bool = segreteria.prestaLibro(myBiblioteca, "Nel Bianco", "Follet", "Marta", "Verdi");
		System.out.print(bool + " ");
		bool = segreteria.prestaLibro(myBiblioteca, "Il Barone Rampante", "Italo Calvino", "Marta", "Verdi");
		System.out.print(bool + " ");
		bool = segreteria.prestaLibro(myBiblioteca, "Inferno", "Dan Brown", "Marta", "Verdi");
		System.out.print(bool + " ");
	
		bool = segreteria.restituzioneLibro(myBiblioteca, "Sahara", "Cussler", "Marta", "Verdi");
		System.out.print(bool + " ");
	}
}
