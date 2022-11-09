package br.ucsal.listacircular;

public class FilaCircular {
	
	Elemento inicio;
	Elemento fim;
	int tamanho = 0;
	
	public void adicionarFila(int dado) {
		
		Elemento novo = new Elemento(dado);
		
		if(vazia()) {
			
			inicio = novo;
			fim = novo;
			fim.proximo = inicio;
			
		} else {
			
			novo.proximo = inicio;
			fim.proximo = novo;
			fim = novo;
			
		}
	}
	
	public int removerFila() {
		
		int removido;
		
		if (vazia()) {
			removido = -1;
		} else if (inicio == fim) {
			removido = inicio.dado;
			inicio = null;
			fim = null;
		} else {
			removido = inicio.dado;
			fim = inicio;
			inicio = inicio.proximo;
			fim.proximo = inicio;
		} return removido;
		
	}
	
	public boolean vazia() {
		return inicio == null && fim == null;
	}
	public String toString() {
		
		String listados = "Números" + "\n";
		int numero = 1;
		
		if(vazia()) {
			return listados = "Não foi possível encontrar valores cadastrados.";
		} else if (inicio == fim) {
			listados = listados + numero + "-" + inicio.dado; 
		} else {
			
			Elemento local = inicio;
			
			if (local == fim.proximo) {
				listados = listados +numero + "-" + local.dado + "\n";
				local = local.proximo;
				numero++;
			}
			
			while (local != fim.proximo) {
				listados = listados + numero + "-" + local.dado + "\n";
				local = local.proximo;
				numero++;
			}
		}
		return listados;
	}
}
