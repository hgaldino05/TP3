package tp3;

//Classe referente aos dados das bebidas presentes no cardápio
public class Bebida {
	
	private String tamanho;
	private double preco;
	private int estoque;
	
	public Bebida() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
}
