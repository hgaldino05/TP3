package tp3;

public class Venda {

	private Colaborador colaborador;
	private Cardapio produtoVendido;
	private Cliente cliente;
	private String formaDePagamento;
	protected String nome;
	public Colaborador getColaborador() {
		return colaborador;
	}
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	public Cardapio getProdutoVendido() {
		return produtoVendido;
	}
	public void setProdutoVendido(Cardapio produtoVendido) {
		this.produtoVendido = produtoVendido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	
}
