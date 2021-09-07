package tp3;


//Classe referente ao relatório de venda
public class RelatorioVenda {
	private Venda venda[];
	private String dataVenda[];
	
	public RelatorioVenda(Venda v, String data) {
		for (int i = 0; i < 99; i++) {
			venda[i] = v;
			dataVenda[i] = data;
		}
	}
	public Venda[] getVenda() {
		return venda;
	}

	public void setVenda(Venda[] venda) {
		this.venda = venda;
	}

	public String[] getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String[] dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	
}
