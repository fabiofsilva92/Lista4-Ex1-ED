
public class AppDetran {

	//Dados das pessoas atendidas
	private int id;
	private String nome;
	private String RG;
	private String telefone;
	private String dataNasc;
	
	//Construindo o objeto
	public AppDetran(int id, String nome, String RG, String telefone, String dataNasc ) {
		this.id = id;
		this.nome = nome;
		this.RG = RG;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
	}

	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		this.RG = rG;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
}
