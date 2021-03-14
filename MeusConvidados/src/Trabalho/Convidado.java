package Trabalho;

public class Convidado {
	private String nome; // Nome do convidado
	private String telefone; // Telefone
	private String email; // email
	private int quantAcompanhante; // quantidade de acompanhantes

	// sobrecarga do método convidado
	public Convidado(String nom, int quant) {
		nome = nom;
		quantAcompanhante = quant;
	}

	public Convidado(String nom, int quant, String telefone, String email) {
		nome = nom;
		quantAcompanhante = quant;
		this.telefone = telefone;
		this.email = email;
	}

	public String toString() {
		return "Convidado: " + nome + "\nAcompanhante(s): " + quantAcompanhante;
	}

	// getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuantAcompanhante() {
		return quantAcompanhante;
	}

	public void setQuantAcompanhante(int quantAcompanhante) {
		this.quantAcompanhante = quantAcompanhante;
	}

}
