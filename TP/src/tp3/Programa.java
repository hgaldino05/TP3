package tp3;

/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
*/

//Classe "main"
public class Programa {
	
	/*private boolean executar;
	
	private Scanner ler;
	private List<Bebida> bebida;
	private List<Pastel> pastel;
	private List<Cliente> cliente;
	private List<Colaborador> colaborador;
	private List<RelatorioVenda> relatorioVenda; */
	
	
	
	static String data[];

	public static void main(String[] args) {
		//new Programa();
		
	}
	
	/*private Programa(){
		
		preCadastros();
		
		ler = new Scanner(System.in);
		executar = true;
		bebida = new ArrayList<Bebida>();
		pastel = new ArrayList<Pastel>();
		cliente = new ArrayList<Cliente>();
		colaborador = new ArrayList<Colaborador>();
		relatorioVenda = new ArrayList<RelatorioVenda>();
		
		System.out.println("BEM-VINDO AO SISTEMA DA PASTELARIA! \n");
		
		while(executar) {
			opcoes();
			
			int opcao = ler.nextInt();
			ler.nextLine();
			
			System.out.println(opcao);
			if(opcao != 0) {
				
				executar = false;
			}
		}
		
	}*/
	
	
	
	/*private void opcoes() {
		System.out.println("O que deseja acessar?:");
		System.out.println("1 - Colaboradores");
		System.out.println("2 - Clientes");
		System.out.println("3 - Produtos");
		System.out.println("4 - Cardápio");
		System.out.println("5 - Cadastrar venda");
		System.out.println("6 - Relatório de vendas");
		System.out.println("7 - Sair");
	}*/
	
	//Dados pré-cadastrados
	private void preCadastros(){
		for(int i = 0; i < 10; i++) {
			
		Bebida b = new Bebida();
		Pastel p = new Pastel();
		Cliente cl = new Cliente();
		Colaborador co = new Colaborador();
		//Cardapio ca = new Cardapio();
		Venda v = new Venda();
		RelatorioVenda r = new RelatorioVenda();
		
			if(i == 0) {
				b.setNome("Coca-cola Lata");
				b.setTamanho("350ml");
				b.setPreco(3.49);
				b.setEstoque(200);
				
				p.setSabor("Queijo com carne");
				p.setTipo("Pastel médio");
				p.setPreco(3.99);
				p.setEstoque(200);
				
				cl.setCPF("123.456.789-10");
				cl.setNome("Yudi Playstation");
				cl.setTelefone("4002-8922");
				cl.setPontuacao(120);
				
				co.setNome("Cleiton Rasta");
				co.setID("0011.2019");
				co.setDataEntrada("15/12/2019");
								
				v.setPastelPedido(p.getTipo() + " Sabor:" + p.getSabor());
				v.setFormaDePagamento("Cartão de débito");
				v.setQtdPastel(2);
				v.setQtdBebida(1);
				v.setValor((b.getPreco() * v.getQtdBebida()) + (p.getPreco() * v.getQtdPastel()));
				
				r.setDataVenda("3/5/2021");
				r.setVenda(v);
			}
			
		}
	}
}
