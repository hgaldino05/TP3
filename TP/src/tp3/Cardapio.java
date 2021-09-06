package tp3;

public class Cardapio {
	private String produtos[];
	private String combos[];
	private String descricaoProdutos[];
	private String descricaoCombos[];
	private double precoProdutos[];
	private double precoCombos[];
	private Pastel pastel[];
	private Bebida bebida[];
	
	public String[] getProdutos() {
		return produtos;
	}
	public void setProdutos(String[] produtos) {
		this.produtos = produtos;
	}
	public String[] getCombos() {
		return combos;
	}
	public void setCombos(String[] combos) {
		this.combos = combos;
	}
	public String[] getDescricaoProdutos() {
		return descricaoProdutos;
	}
	public void setDescricaoProdutos(String[] descricaoProdutos) {
		this.descricaoProdutos = descricaoProdutos;
	}
	public String[] getDescricaoCombos() {
		return descricaoCombos;
	}
	public void setDescricaoCombos(String[] descricaoCombos) {
		this.descricaoCombos = descricaoCombos;
	}
	public double[] getPrecoProdutos() {
		return precoProdutos;
	}
	public void setPrecoProdutos(double[] precoProdutos) {
		this.precoProdutos = precoProdutos;
	}
	public double[] getPrecoCombos() {
		return precoCombos;
	}
	public void setPrecoCombos(double[] precoCombos) {
		this.precoCombos = precoCombos;
	}
	public Pastel[] getPastel() {
		return pastel;
	}
	public void setPastel(Pastel[] pastel) {
		this.pastel = pastel;
	}
	public Bebida[] getBebida() {
		return bebida;
	}
	public void setBebida(Bebida[] bebida) {
		this.bebida = bebida;
	}
}
