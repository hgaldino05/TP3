package tp3;


//Classe referente aos dados dos Pastéis presentes no cardápio
public class Pastel {
	private String sabor;
	private String tipo;
	private double preco;
	private int quantidade;
	
	public Pastel(String s, String t, double d, int i) {
		// TODO Auto-generated constructor stub
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
