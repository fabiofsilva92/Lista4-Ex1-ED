import javax.swing.JOptionPane;

public class Fila {
	
	private AppDetran data[]; 
	private int finalFila; //Auxiliar para saber quantas pessoas tem na fila
	private int id = 1;
	
	//A chamada do construtor cria um array do tamanho selecionado pelo usuário
	public Fila(int n) {
		this.data = new AppDetran [n];
	}
		
	//Colocará a pessoa na fila
	public void enqueue(AppDetran tal) {
		if(finalFila<data.length) {
			data[finalFila] = tal;
			finalFila++;
			System.out.println(data[finalFila-1]);
		}
		else {
			JOptionPane.showMessageDialog(null, "Fila cheia");
		}
	}
	//Retirará a pessoa da fila
	 public AppDetran dequeue() {
		 AppDetran tal = null;
		 if(finalFila > 0) {
			 	tal = data[0];
				for(int i = 0; i<data.length-1; i++) {
					data[i] = data[i+1];
				}
				data[finalFila-1] = null;
				finalFila--;
				return tal;
			}
			else {
				System.out.println("Não há elementos na lista");
				return tal;
			}
	 }
	 //Método para definir os dados das pessoas
	public AppDetran definirPessoa() {
			
			String nome = JOptionPane.showInputDialog("Digite o nome da pessoa :");
			String RG = JOptionPane.showInputDialog("Digite o RG da pessoa (com pontuação) :");
			String telefone = JOptionPane.showInputDialog("Digite o telefone (##### - ####) :") ;
			String dataNasc = JOptionPane.showInputDialog("Digite a data de nascimento (##/##/##): ");
			AppDetran pessoa = new AppDetran(id, nome, RG, telefone, dataNasc);
			id++;
			
			return pessoa;
	}
	
	//Procedimento para print da fila, utilizando get.
	 public String print() {
			 String aux = "";
			 for(int i = 0 ; i<finalFila; i++) {
				 aux = aux + "\n" + "Id: " + data[i].getId() + ", Nome: " + data[i].getNome() 
						 + ", RG: " +data[i].getRG() + ", Telefone: " + data[i].getTelefone() 
						 + ", Data de Nascimento: " +data[i].getDataNasc();
			 }
			 return aux;
	 }
	 
	 //Verifica se a fila esta vazia
	 public boolean verificarLista() {
		 int len = data.length;
		 System.out.println(len);
		 int aux = 0;
		 
		 for(int i = 0; i< len; i++) {
			 if(data[i] == null) {
				 aux++;
			 }
			 else {
				 //System.out.println("Lista não está vazia");
				 i = len;
			 }
		 }
		 if(aux == len) {
			 //System.out.println("Lista vazia");
			 return true;
		 }else {
			 return false;
		 }
	 }
	 
	 //Verifica a ordem de um indíviduo com ID x
	 public void pesquisarOrdem(int posicao) {
		 for(int i = 0; i<finalFila; i++) {
			 if(data[i].getId() == posicao) {
				 System.out.println("A pessoa com nome " +data[i].getNome() + " está na "
				 		+ "posição " +(i+1) + " da ordem de atendimento.");
			 }
		 }
	 }
	
}
