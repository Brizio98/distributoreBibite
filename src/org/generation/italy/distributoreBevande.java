package org.generation.italy;


import java.util.HashMap;


public class distributoreBevande {
	private HashMap<String, Float> bevanda;
	private float credito;

	public distributoreBevande(HashMap<String, Float> listaBevanda) {
		// TODO Auto-generated constructor stub
	}

	public void distributore(HashMap<String, Float> bevanda) {
		this.bevanda = bevanda;
		this.credito = 0;

	}
		 
	public void inserisciMoneta(float moneta) { // tra le parentesi dichiarare le ariabili che si utilizzano nel metodo
			credito += moneta;
			System.out.println("credito attuale " + credito + "€");
	}	

	public void erogaBevanda(String nomeBevanda) {

		if (bevanda.containsKey(nomeBevanda)) {
			System.out.println("la bevanda te la scoli");
			float prezzo = bevanda.get(nomeBevanda); // PRENDO IL VALORE DELLA BEVANDA
			if (credito >= prezzo) {
				System.out.println("erogazione prodotto ");
				credito -= prezzo;
				System.out.println("il credito residuo " + credito + "€");
			} else
				System.out.println("caccia i sordi purciaro ");
		} else
			System.out.println("bevanda non disponibile");
		
	}
	

	
		
	}	

