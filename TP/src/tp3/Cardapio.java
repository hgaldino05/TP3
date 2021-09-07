package tp3;

//Classe referente ao cardápio
public class Cardapio {
	
	private String produtos[];
	private String combos[];
	private String descricaoProdutos[];
	private String descricaoCombos[];
	private double precoProdutos[];
	private double precoCombos[];

public Cardapio( String p, String c,String dp,String dc,double pp,double pc) {
	
	for(int i = 0; i <= 99; i++) {
	produtos[i] = p;
	combos[i] = c;
	descricaoProdutos[i] = dp;
	descricaoCombos[i] = dc;
	precoProdutos[i] = pp;
	precoCombos[i] = pc;
	}
}

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


}
