
public class Pilha {

	int topo = 0; //Final da pilha
	private AppDetran [] dataPilha; 
	
	//Construir o objeto com n posições
	public Pilha(int n) {
		 dataPilha = new AppDetran[n];
	}
	
	//Adiciona elemento na pilha
	public void push(AppDetran fulano) {
		if(topo<dataPilha.length) {
			dataPilha[topo] = fulano;
			topo++;
		}
		else {
			System.out.println("Pilha cheia, a pilha tem o mesmo tamanho da fila que esta sendo trabalhada,"
					+ "não é possível add ao final."); //foi limitado a pilha ao mesmo tamanho da fila
		}
	}

	//Faz o print de toda a pilha.
	public void percorrePilha() {
		 String aux = "";
		 for(int i = 0 ; i<topo; i++) {
			 aux = aux + "\n" + "Id: " + dataPilha[i].getId() + ", Nome: " + dataPilha[i].getNome() 
					 + ", RG: " +dataPilha[i].getRG() + ", Telefone: " + dataPilha[i].getTelefone() 
					 + ", Data de Nascimento: " +dataPilha[i].getDataNasc();
			 System.out.println(aux);
		 }
		 
	}
	
}
