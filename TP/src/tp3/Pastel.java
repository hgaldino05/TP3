package tp3;


//Classe referente aos dados dos Past�is presentes no card�pio
public class Pastel {
	private String sabor;
	private String tipo;
	private double preco;
	private int estoque;
	
	public Pastel() {
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
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
}
