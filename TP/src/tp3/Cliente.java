package tp3;

//Classe referente aos dados do Cliente
public class Cliente extends Venda{
	private String CPF;
	private String telefone;
	private int pontuacao;
	
	public Cliente(String c, String t, int p, String n) {
		CPF = c;
		telefone = t;
		pontuacao = p;
		nome =  n;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cpf) {
		CPF = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	
}
