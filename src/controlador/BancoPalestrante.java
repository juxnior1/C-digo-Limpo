package controlador;

import modelo.Palestrante;
import java.util.ArrayList;

	public class BancoPalestrante {
	
	private ArrayList<Palestrante> palestrantes;
	
	public void adicionarPalestrante(Palestrante palestrante) {
		palestrantes.add(palestrante);
	}
	public void removerPalestrante(Palestrante palestrante) {
		palestrantes.remove(palestrante);
	}
	public void atualizarPalestrante(int y, Palestrante palestrante) {
		palestrantes.set(y,palestrante);
	}
	public void mostrarPalestrantes() {
		for (Palestrante palestrante : palestrantes) {
			System.out.println(palestrante.getInfo());
		}
	}
}
