package modelo;

public class Palestrante extends Pessoa  {
	
	//private boolean presente;
	
	public Palestrante(String nome, String cpf) {
		super(nome, cpf);
	
	}	

	public String getInfo() {
		System.out.println();
		return "Palestrante\n" + super.getInfo() ;
	}
	



}
