package tp3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//Classe "main"
public class Programa {
	
	private boolean executar;
	
	private Scanner ler;
	private List<Bebida> bebida;
	private List<Pastel> pastel;
	private List<Cardapio> cardapio;
	private List<Cliente> cliente;
	private List<Colaborador> colaborador;
	private List<RelatorioVenda> relatorioVenda;
	
	
	
	static String data[];

	public static void main(String[] args) {
		//new Programa();
		
	}
	
	private Programa(){
		
		preCadastros();
		ler = new Scanner(System.in);
		executar = true;
		bebida = new ArrayList<Bebida>();
		pastel = new ArrayList<Pastel>();
		cardapio = new ArrayList<Cardapio>();
		cliente = new ArrayList<Cliente>();
		colaborador = new ArrayList<Colaborador>();
		relatorioVenda = new ArrayList<RelatorioVenda>();
		
		System.out.println("BEM-VINDO AO SISTEMA DA PASTELARIA! \n");
		
		while(executar) {
			//opcoes();
			
			int opcao = ler.nextInt();
			ler.nextLine();
			
			System.out.println(opcao);
			if(opcao != 0) {
				
				
				executar = false;
			}
		}
		
	}
	
	
	
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
			Cardapio ca = new Cardapio();
			
			if (i == 0) {
				ca.setProdutos("Pastel médio");
				ca.setDescricaoProdutos("Pastel médio, com recheio a escolha");
				ca.setPrecoProdutos(3.99);
				ca.setCombos("Pastel em dobro");
				ca.setDescricaoCombos("Combo com 2 pastéis médios");
				ca.setPrecoCombos(7.49);
			}
			if (i == 1) {
				ca.setProdutos("Pastel Grande");
				ca.setDescricaoProdutos("Pastel grande, com recheio a escolha");
				ca.setPrecoProdutos(6.99);
				ca.setCombos("Pastel Grande em dobro");
				ca.setDescricaoCombos("Combo com 2 pastéis grandes");
				ca.setPrecoCombos(12.99);
			}
			if (i == 2) {
				ca.setProdutos("Mini pastel - 10 unidades");
				ca.setDescricaoProdutos("Cesto com 10 mini pastéis");
				ca.setPrecoProdutos(8.99);
				ca.setCombos("Matador de fome");
				ca.setDescricaoCombos("Combo com 10 mini pastéis + 1 pastel grande");
				ca.setPrecoCombos(14.99);
			}
			if (i == 3) {
				ca.setProdutos("Mini pastel - 5 unidades");
				ca.setDescricaoProdutos("Cesto com 5 mini pastéis");
				ca.setPrecoProdutos(4.99);
				ca.setCombos("Média 5");
				ca.setDescricaoCombos("Combo com 1 pastel médio + 5 mini pastéis");
				ca.setPrecoCombos(7.99);
			}
			if (i == 4) {
				ca.setProdutos("Coxinha");
				ca.setDescricaoProdutos("Salgado coxinha");
				ca.setPrecoProdutos(4.99);
				ca.setCombos("Delícia em dobro");
				ca.setDescricaoCombos("Combo com 1 pastel médio + 1 coxinha");
				ca.setPrecoCombos(7.99);
			}
			if (i == 5) {
				ca.setProdutos("Mini Coxinha - 10 unidades");
				ca.setDescricaoProdutos("Prato com 10 mini coxinhas");
				ca.setPrecoProdutos(9.99);
				ca.setCombos("Família Coxinha");
				ca.setDescricaoCombos("Combo com 20 mini coxinhas");
				ca.setPrecoCombos(18.99);
			}
			if (i == 6) {
				ca.setProdutos("Refrigerante Lata 350ml");
				ca.setDescricaoProdutos("Refrigerante 350ml em Lata");
				ca.setPrecoProdutos(3.99);
				ca.setCombos("Pastel + Refri");
				ca.setDescricaoCombos("Combo com 1 pastel médio + 1 lata de refri 350ml");
				ca.setPrecoCombos(6.99);
			}
			if (i == 7) {
				ca.setProdutos("Refrigerante PET 600ml");
				ca.setDescricaoProdutos("Refrigerante 600ml em garrafa PET");
				ca.setPrecoProdutos(6.49);
				ca.setCombos("Matador de Fome 2");
				ca.setDescricaoCombos("Combo com 1 pastel grande + 1 garrafa de refri 600ml");
				ca.setPrecoCombos(12.49);
			}
			if (i == 8) {
				ca.setProdutos("Suco Natural 300ml");
				ca.setDescricaoProdutos("Suco feito da fruta ou da polpa");
				ca.setPrecoProdutos(4.25);
				ca.setCombos("Pastel e suco");
				ca.setDescricaoCombos("Combo com 1 pastel médio + 1 copo de suco natural 300ml ");
				ca.setPrecoCombos(12.99);
			}
			if (i == 9) {
				ca.setProdutos("Caldo de cana");
				ca.setDescricaoProdutos("Copo com Caldo de cana,moído na hora, 400ml");
				ca.setPrecoProdutos(4.99);
				ca.setCombos("Clássico");
				ca.setDescricaoCombos("Combo com 1 Pastel médio + 1 copo de caldo de cana");
				ca.setPrecoCombos(7.99);
			}
			
			cardapio.add(ca);
		}
		
		for(int i = 0; i < 10; i++) {
			
		Bebida b = new Bebida();
		Pastel p = new Pastel();
		Cliente cl = new Cliente();
		Colaborador co = new Colaborador();
		Venda v = new Venda();
		RelatorioVenda r = new RelatorioVenda();
		Cardapio ca = new Cardapio();
		
			if(i == 0) {
				
				b.setTamanho("350ml");
				b.setPreco(3.49);
				b.setEstoque(200);
				
				p.setSabor("Queijo com carne");
				p.setPreco(3.99);
				p.setEstoque(200);
				
				cl.setCPF("123.456.789-10");
				cl.setNome("Yudi Playstation");
				cl.setTelefone("4002-8922");
				cl.setPontuacao(120);
				
				co.setNome("Cleiton Rasta");
				co.setID("0011.2019");
				co.setDataEntrada("15/12/2019");
								
				v.setPastelPedido(p.getSabor());
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
