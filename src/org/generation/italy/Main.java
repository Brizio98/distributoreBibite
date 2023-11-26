package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float creditoIns;
		String bevscelta;
		
	HashMap<String, Float> listaBevanda = new HashMap<String, Float>();
	listaBevanda.put("Coca-cola", 1f);
	listaBevanda.put("Fanta", 1f);
	listaBevanda.put("Sprite", 1f);
	listaBevanda.put("redbull", 2.5f);
	listaBevanda.put("acqua frizzante", 0.4f);
	listaBevanda.put("acqua naturale", 0.4f);
		
	distributoreBevande distributore=new distributoreBevande(listaBevanda);
	System.out.println("le bevande sono:");
	for (String i:listaBevanda.keySet())
		System.out.println(i + "-" + listaBevanda.get(i)+"€");
	
	System.out.println("sgangia i dinderi");
	creditoIns=Float.parseFloat(sc.nextLine());
	
	distributore.inserisciMoneta(creditoIns);
	
	System.out.println("che bevanda vuoi? ");
	bevscelta=sc.nextLine();
	
		if (listaBevanda.containsKey(bevscelta))
			distributore.erogaBevanda(bevscelta);
		
		
	
		
		sc.close();
	}
	
}
