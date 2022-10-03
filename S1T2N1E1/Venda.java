package S1T2N1E1;

import java.util.ArrayList;

public class Venda {
	//atributs
	private String nomTenda;
	//private static double preuTotal;
	private static ArrayList<Producte> productes = new ArrayList<Producte>(); //col·lecció de productes, static para que sea leída desde el Main
	
	//constructor
	public Venda (String nomTenda) {
		this.nomTenda = nomTenda;
	}
	
	public static ArrayList<Producte> getProductes(){
		return productes;
	}
	public String getNomTenda() {
		return nomTenda;
	}
	
	public void setProductes(ArrayList<Producte> productes) {
		this.productes = productes;
	}
	public void setNomTenda(String nomTenda) {
		this.nomTenda = nomTenda;
	}
	
	public void mostraProductes() {
		for (Producte producte : productes) {
			System.out.println(producte.getNom() + " " + producte.getPreu() + " euros.");
		}
	}
	
	public void InsertaProductes(Producte producte) {
		this.productes.add(producte);
	}
	
	public static void calcularPreuFinal() throws VendaBuidaException {
		double preuFinal = 0;
		
		if (productes.size() == 0) { //si el tamaño de la Array es igual a cero
			throw new VendaBuidaException(); //crea la excepción throw new
		} else {
		for (Producte producte : productes) { //busca els productes i suma tots el preus
			preuFinal += producte.getPreu();
		}
		System.out.println(preuFinal + " euros.");
	}
}
}
