package br.ucsal.listacircular;

public class Elemento {
	
	public Elemento proximo;
	public int dado;
	
	public Elemento(int dado) {
		this.proximo = null;
		this.dado = dado;
	}
}
