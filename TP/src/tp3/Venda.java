package tp3;


//Classe referente as vendas que ser�o cadastradas no sistema
public class Venda {

	private Double valor;
	private int qtdPastel;
	private int qtdBebida;	
	private String pastelPedido;
	private String bebidaPedida;
	private String formaDePagamento;
	private String cliente;
	private String vendedor;
	
	public Venda() {
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getPastelPedido() {
		return pastelPedido;
	}
	public void setPastelPedido(String pastelPedido) {
		this.pastelPedido = pastelPedido;
	}
	
	public String getBebidaPedida() {
		return bebidaPedida;
	}
	public void setBebidaPedida(String bebidaPedida) {
		this.bebidaPedida = bebidaPedida;
	}
	
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public int getQtdPastel() {
		return qtdPastel;
	}
	public void setQtdPastel(int qtdPastel) {
		this.qtdPastel = qtdPastel;
	}
	public int getQtdBebida() {
		return qtdBebida;
	}
	public void setQtdBebida(int qtdBebida) {
		this.qtdBebida = qtdBebida;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}	
	
}
