package S1T2N1E1;


public class Main {

	public static void main(String[] args) throws VendaBuidaException  { //añadir throws y el nombre de la clase Exception para que acceda al mensaje 
		Venda tenda1 = new Venda ("Mercadona");
		//productes
		Producte producte1 = new Producte("Coca-Cola",2);
		Producte producte2 = new Producte("Llet", 0.70);
		Producte producte3 = new Producte("Macarrons", 0.80);
		Producte producte4 = new Producte("Llonganiza", 4);
		Producte producte5 = new Producte("Whisky", 20);
		
		tenda1.InsertaProductes(producte1);
		tenda1.InsertaProductes(producte2);
		tenda1.InsertaProductes(producte3);
		tenda1.InsertaProductes(producte4);
		tenda1.InsertaProductes(producte5);
		
		tenda1.mostraProductes();
		
		Venda.calcularPreuFinal(); 
		
		try { //Try se utiliza cuando se desean prever excepciones en el transcurso de la ejecución de un programa.
			Venda.calcularPreuFinal();

		} catch (ArrayIndexOutOfBoundsException ex) { //catch señala un bloque de instrucciones a intentar ( try ), y especifica una respuesta si se produce una excepción
			System.out.println(ex.getMessage()); //El método getMessage() de la clase Throwable se usa para devolver un mensaje detallado del objeto Throwable que también puede ser nulo.
		}
		
		// TODO Auto-generated method stub

	}

}
