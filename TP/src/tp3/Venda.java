package tp3;


//Classe referente as vendas que serão cadastradas no sistema
public class Venda {

	private Double valor;
	private String pedido;
	private String formaDePagamento;
	
	public Venda(Cardapio c, String f, double v[]) {
		for(int i = 0; i < 99; i++) {
		valor = v[i];
		}
		pedido = c.toString();
		formaDePagamento = f;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getPedido() {
		return pedido;
	}
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	

	
}
