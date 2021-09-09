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
	
	private void cardapioCadastrado() {
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
	}
	//Dados pré-cadastrados
	private void preCadastros(){
		
		for(int i = 0; i < 10; i++) {
			
		Bebida b = new Bebida();
		Pastel p = new Pastel();
		Cliente cl = new Cliente();
		Colaborador co = new Colaborador();
		
			if(i == 0) {
				
				b.setSabor("Coca-cola");
				b.setEstoque(50);
				
				p.setSabor("Queijo");
				p.setEstoque(50);
				
				cl.setCPF("123.456.789-10");
				cl.setNome("Yudi Playstation");
				cl.setTelefone("4002-8922");
				cl.setPontuacao(120);
				
				co.setNome("Cleiton Rasta");
				co.setID("001.2019");
				co.setDataEntrada("15/8/2019");
								
			}
			
			if(i == 1) {
				
				b.setSabor("Guaraná");
				b.setEstoque(50);
				
				p.setSabor("Carne");
				p.setEstoque(50);
				
				cl.setCPF("555.666.777-88");
				cl.setNome("Neymar Jr");
				cl.setTelefone("5555-0000");
				cl.setPontuacao(150);
				
				co.setNome("Fulana Costa");
				co.setID("0002.2019");
				co.setDataEntrada("16/8/2021");
				
			}
			
			if(i == 2) {
				
				b.setSabor("Fanta laranja");		
				b.setEstoque(50);
				
				p.setSabor("Carne e queijo");
				p.setEstoque(50);
				
				cl.setCPF("111.222.333-44");
				cl.setNome("Anônimo da Silva");
				cl.setTelefone("1234-4321");
				cl.setPontuacao(80);
				
				co.setNome("Patrick Vieira");
				co.setID("003.2019");
				co.setDataEntrada("16/8/2019");
				
			}
			
			if(i == 3) {
				
				b.setSabor("Sprite");
				b.setEstoque(50);
				
				p.setSabor("Frango");
				p.setEstoque(50);
				
				cl.setCPF("777.888.999-00");
				cl.setNome("Alan Silva");
				cl.setTelefone("0000-0000");
				cl.setPontuacao(200);
				
				co.setNome("Rogerinho do Querô");
				co.setID("0004.2019");
				co.setDataEntrada("25/11/2019");
				
			}
			
			if(i == 4) {
				
				b.setSabor("Suco de acerola");
				b.setEstoque(50);
				
				p.setSabor("Frango com queijo");
				p.setEstoque(50);
				
				cl.setCPF("098.765.432-10");
				cl.setNome("Felipe Smith");
				cl.setTelefone("9090-1010");
				cl.setPontuacao(140);
				
				co.setNome("Fausto Silva");
				co.setID("0005.2020");
				co.setDataEntrada("5/4/2020");
				
			}
			
			if(i == 5) {
				
				b.setSabor("Suco de goiaba");
				b.setEstoque(50);
				
				p.setSabor("Calabresa");
				p.setEstoque(50);
				
				cl.setCPF("123.321.213-00");
				cl.setNome("Maurício de Sousa");
				cl.setTelefone("5040-6070");
				cl.setPontuacao(115);
				
				co.setNome("Hiromu Arakawa");
				co.setID("0006.2020");
				co.setDataEntrada("5/4/2020");
				
			}
			
			if(i == 6) {
				
				b.setSabor("Suco de laranja");
				b.setEstoque(50);
				
				p.setSabor("Calabresa com queijo");
				p.setEstoque(50);
				
				cl.setCPF("192.837.465-54");
				cl.setNome("Maria Soares");
				cl.setTelefone("4545-5454");
				cl.setPontuacao(15);
				
				co.setNome("Alice Nunes");
				co.setID("0007.2020");
				co.setDataEntrada("9/6/2020");
				
			}
			
			if(i == 7) {
				
				b.setSabor("Suco de maracujá");
				b.setEstoque(50);
				
				p.setSabor("Pizza (Calabresa,Queijo,Orégano");
				p.setEstoque(50);
				
				cl.setCPF("303.404.505-66");
				cl.setNome("Fabio Lima");
				cl.setTelefone("7078-8089");
				cl.setPontuacao(0);
				
				co.setNome("Jeff Bezos");
				co.setID("0008.2021");
				co.setDataEntrada("12/1/2021");
				
			}
			
			if(i == 8) {
				
				b.setSabor("Suco de uva");
				b.setEstoque(50);
				
				p.setSabor("Brócolis");
				p.setEstoque(30);
				
				cl.setCPF("222.333.222-33");
				cl.setNome("Eduardo Suplicy");
				cl.setTelefone("6655-2020");
				cl.setPontuacao(1000);
				
				co.setNome("Ronaldinho Gaúcho");
				co.setID("0009.2021");
				co.setDataEntrada("2/5/2021");
				
			}
			
			if(i == 9) {
				
				b.setSabor("Caldo de Cana");
				b.setEstoque(70);
				
				p.setSabor("Brócolis com queijo");
				p.setEstoque(30);
				
				cl.setCPF("000.000.110-11");
				cl.setNome("Dwayne Johnson");
				cl.setTelefone("1333-3331");
				cl.setPontuacao(75);
				
				co.setNome("The Rock");
				co.setID("0010.2021");
				co.setDataEntrada("9/9/2021");
				
			}
			
			bebida.add(b);
			pastel.add(p);
			cliente.add(cl);
			colaborador.add(co);
		}
	}
}
