import javax.swing.JOptionPane;

public class Main {

	public int id;
	
	public static void main(String[] args) {
		int opc = 0;
		int posicao;
		//Pessoa da Fila
		AppDetran pessoa;
		// ---*---
		Fila op = new Fila(1);
		AppDetran removido; // Elemento removido da fila que será incluído na pilha
		boolean auxbool; // Variável que auxiliará na verificação da lista
		
		int qtdPessoas = Integer.parseInt(JOptionPane
				.showInputDialog("Digite a quantidade de pessoas que serão atendidas hoje: ")); //Tamanho do array que trataremos como fila e pilha
		Fila data = new Fila(qtdPessoas); // Criação da fila, juntamente com a instancia
		Pilha dataPilha = new Pilha(qtdPessoas); // Criação da pilha, instanciando
		
		
		
		do {//Menu de opções
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
					+ "1 - Adiciona pessoa à fila; \n"
					+ "2 - Retira pessoa da fila; \n"
					+ "3 - Verificar se fila esta vazia; \n"
					+ "4 - Pesquisar a ordem de espera de uma pessoa na Fila; \n"
					+ "5 - Percorrer a fila\n"
					+ "6 - Percorrer a pilha\n"
					+ "0 - Sair da aplicação."));
			
			switch(opc) {
			case 1: pessoa = op.definirPessoa(); 													//Entrara os menus para digitação dos dados da pessoa
			data.enqueue(pessoa); 																	//Coloca a pessoa na fila
			System.out.println(data.print()); 														// Printa a fila			
			break;
			
			case 2: removido = data.dequeue(); 														// Retira a primeira pessoa a entrar na fila
			System.out.println("O elemento removido foi o de ID: \n" +removido.getId()); 			// Mostra o ID do elemento retirado
				dataPilha.push(removido); 															// Todos dados removidos estão sendo incluídos na pilha
			break;
			
			case 3: auxbool = data.verificarLista();												//Verifica se a fila esta vazia
			if(auxbool == true) {
				System.out.println("Lista vazia");
			}else {
				System.out.println("Lista não está vazia");
			}
			break;
			
			case 4: posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da pessoa que vc" 
					+ " gostaria de saber a posição de atendimento :"));
					data.pesquisarOrdem(posicao);													//Verifica em qual ordem esta a pessoa na fila
			break;
			
			case 5: System.out.println(data.print()); 												//Percorre a fila
			break;
			
			case 6: dataPilha.percorrePilha();														//Percorre a pilha
			break;
			
			case 0 : JOptionPane.showMessageDialog(null, "Obrigado por utilizar a aplicação.");
			break; 
			default: JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		}while(opc != 0);

	}
	


}
