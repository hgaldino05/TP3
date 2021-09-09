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
	private List<Venda> venda;
	private List<RelatorioVenda> relatorioVenda;
	
	
	
	static String data[];

	public static void main(String[] args) {
		new Programa();
	}
	
	private Programa(){
		
		
		ler = new Scanner(System.in);
		executar = true;
		bebida = new ArrayList<Bebida>();
		pastel = new ArrayList<Pastel>();
		cardapio = new ArrayList<Cardapio>();
		cliente = new ArrayList<Cliente>();
		colaborador = new ArrayList<Colaborador>();
		relatorioVenda = new ArrayList<RelatorioVenda>();
		venda = new ArrayList<Venda>();
		System.out.println("BEM-VINDO AO SISTEMA DA PASTELARIA! \n");
		
		while(executar) {
			//opcoes();
			cardapioCadastrado();
			preCadastros();
			vendaCadastrada();
			int opcao = ler.nextInt();
			ler.nextLine();
			
			System.out.println(opcao);
			if(opcao != 0) {
				
				exibir();
				System.out.println("Deseja editar algum dado? (S/N)");
				String edita = ler.nextLine();
				
				if(edita.equalsIgnoreCase("S")) {
					editar();
				}else if(edita.equalsIgnoreCase("N")) {
					executar = false;
				}
				executar = false;
			}
		}
		
	}
	
	
	
	/*private void opcoes() {
		System.out.println("O que deseja acessar?:");
		System.out.println("1 - Exibir dados cadastrados");
		System.out.println("2 - Editar dados cadastrados");
		System.out.println("3 - Cadastrar novos dados");
		System.out.println("7 - Sair");
	}*/
	
	private void cardapioCadastrado() {
		for(int i = 0; i < 10; i++) {
			Cardapio ca = new Cardapio();
			
			if (i == 0) {
				ca.setProdutos("Pastel m�dio");
				ca.setDescricaoProdutos("Pastel m�dio, com recheio a escolha");
				ca.setPrecoProdutos(3.99);
				ca.setCombos("Pastel em dobro");
				ca.setDescricaoCombos("Combo com 2 past�is m�dios");
				ca.setPrecoCombos(7.49);
			}
			if (i == 1) {
				ca.setProdutos("Pastel Grande");
				ca.setDescricaoProdutos("Pastel grande, com recheio a escolha");
				ca.setPrecoProdutos(6.99);
				ca.setCombos("Pastel Grande em dobro");
				ca.setDescricaoCombos("Combo com 2 past�is grandes");
				ca.setPrecoCombos(12.99);
			}
			if (i == 2) {
				ca.setProdutos("Mini pastel - 10 unidades");
				ca.setDescricaoProdutos("Cesto com 10 mini past�is");
				ca.setPrecoProdutos(8.99);
				ca.setCombos("Matador de fome");
				ca.setDescricaoCombos("Combo com 10 mini past�is + 1 pastel grande");
				ca.setPrecoCombos(14.99);
			}
			if (i == 3) {
				ca.setProdutos("Mini pastel - 5 unidades");
				ca.setDescricaoProdutos("Cesto com 5 mini past�is");
				ca.setPrecoProdutos(4.99);
				ca.setCombos("M�dia 5");
				ca.setDescricaoCombos("Combo com 1 pastel m�dio + 5 mini past�is");
				ca.setPrecoCombos(7.99);
			}
			if (i == 4) {
				ca.setProdutos("Coxinha");
				ca.setDescricaoProdutos("Salgado coxinha");
				ca.setPrecoProdutos(4.99);
				ca.setCombos("Del�cia em dobro");
				ca.setDescricaoCombos("Combo com 1 pastel m�dio + 1 coxinha");
				ca.setPrecoCombos(7.99);
			}
			if (i == 5) {
				ca.setProdutos("Mini Coxinha - 10 unidades");
				ca.setDescricaoProdutos("Prato com 10 mini coxinhas");
				ca.setPrecoProdutos(9.99);
				ca.setCombos("Fam�lia Coxinha");
				ca.setDescricaoCombos("Combo com 20 mini coxinhas");
				ca.setPrecoCombos(18.99);
			}
			if (i == 6) {
				ca.setProdutos("Refrigerante Lata 350ml");
				ca.setDescricaoProdutos("Refrigerante 350ml em Lata");
				ca.setPrecoProdutos(3.99);
				ca.setCombos("Pastel + Refri");
				ca.setDescricaoCombos("Combo com 1 pastel m�dio + 1 lata de refri 350ml");
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
				ca.setDescricaoCombos("Combo com 1 pastel m�dio + 1 copo de suco natural 300ml ");
				ca.setPrecoCombos(12.99);
			}
			if (i == 9) {
				ca.setProdutos("Caldo de cana");
				ca.setDescricaoProdutos("Copo com Caldo de cana,mo�do na hora, 400ml");
				ca.setPrecoProdutos(4.99);
				ca.setCombos("Cl�ssico");
				ca.setDescricaoCombos("Combo com 1 Pastel m�dio + 1 copo de caldo de cana");
				ca.setPrecoCombos(7.99);
			}
			
			cardapio.add(ca);
		}
	}
	//Dados pr�-cadastrados
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
				co.setID("0001.2019");
				co.setDataEntrada("15/8/2019");
								
			}
			
			if(i == 1) {
				
				b.setSabor("Guaran�");
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
				cl.setNome("An�nimo da Silva");
				cl.setTelefone("1234-4321");
				cl.setPontuacao(80);
				
				co.setNome("Patrick Vieira");
				co.setID("0003.2019");
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
				
				co.setNome("Rogerinho do Quer�");
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
				cl.setNome("Maur�cio de Sousa");
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
				
				b.setSabor("Suco de maracuj�");
				b.setEstoque(50);
				
				p.setSabor("Pizza (Calabresa,Queijo,Or�gano");
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
				
				p.setSabor("Br�colis");
				p.setEstoque(30);
				
				cl.setCPF("222.333.222-33");
				cl.setNome("Eduardo Suplicy");
				cl.setTelefone("6655-2020");
				cl.setPontuacao(1000);
				
				co.setNome("Ronaldinho Ga�cho");
				co.setID("0009.2021");
				co.setDataEntrada("2/5/2021");
				
			}
			
			if(i == 9) {
				
				b.setSabor("Caldo de Cana");
				b.setEstoque(70);
				
				p.setSabor("Coxinha");
				p.setEstoque(200);
				
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
	
	private void vendaCadastrada() {
		for(int i = 0; i < 10; i++) {
			Venda v = new Venda();
			Cliente cl = cliente.get(i);
			Colaborador co = colaborador.get(i);
			Cardapio ca = cardapio.get(i);
			
		
				
					if(i == 0) {
						v.setCliente(cl.getNome());
						v.setVendedor(co.getID());
						v.setValor(ca.getPrecoProdutos() *v.getQtdPastel());
						v.setPastelPedido(ca.getProdutos());
						v.setQtdPastel(2);
						v.setFormaDePagamento("Pagamento via PIX");
					}
				
				
					if(i == 2) {
						v.setCliente(cl.getNome());
						v.setVendedor(co.getID());
						v.setValor(ca.getPrecoProdutos() *v.getQtdPastel());
						v.setPastelPedido(ca.getProdutos());
						v.setQtdPastel(2);
						v.setFormaDePagamento("Pagamento via PIX");
					}
				}
			}

	
	private void relatorioCadastrado() {
		for(int i = 0; i < 10; i++) {
			RelatorioVenda r = new RelatorioVenda();
			
			if(i == 0) {
				
			}
		}
	}
	
	private void exibir() {
		System.out.println("Bebidas cadastradas no sistema: ");
			for(int i = 0; i < bebida.size(); i++) {
				Bebida b = bebida.get(i);
			
				System.out.println("BEBIDA #" + (i+1) + ": " + b.getSabor());
			
				if(b.getSabor().contains("Suco")) {
					System.out.println("Op��es: Copo com 300ml" + b.getSabor());
				}else if(b.getSabor().contains("Caldo")) {
					System.out.println("Op��es: Copo com 300ml");
				}else {
					System.out.println("Latinha 350ml; Garrafa 600ml");
				}
				
				System.out.println("Quantidade em estoque: " + b.getEstoque() + "\n");
			}
			
		System.out.println("Past�is cadastradas no sistema: ");
			for(int i = 0; i < pastel.size(); i++) {
				Pastel p = pastel.get(i);
			
				System.out.println("PASTEL #" + (i+1) + ": " + p.getSabor());
				System.out.println("Op��es: Pastel M�dio, Pastel Grande, Mini pastel, Coxinha, Mini Coxinha");
				System.out.println("Quantidade em estoque: " + p.getEstoque() + "\n");
			}
		
		System.out.println("Produtos cadastrados no sistema: ");
			for(int i = 0; i < cardapio.size(); i++) {
				Cardapio ca = cardapio.get(i);
				
				System.out.println("PRODUTO #" + (i+1) + ": " + ca.getProdutos());
				System.out.println("Pre�o: " + ca.getPrecoProdutos() + "\n");
			}
			
		System.out.println("Combos cadastrados no sistema: ");
			for(int i = 0; i < cardapio.size(); i++) {
				Cardapio ca = cardapio.get(i);
				
				System.out.println("COMBO #" + (i+1) + ": " + ca.getCombos());
				System.out.println("Pre�o: " + ca.getPrecoProdutos() + "\n");
			}
		
		System.out.println("Clientes cadastrados no sistema: ");
		for(int i = 0; i < cliente.size(); i++) {
			Cliente cl = cliente.get(i);
			
			System.out.println("Cliente #" + (i+1) + ": " + cl.getNome());
			System.out.println("Pontos: " + cl.getPontuacao());
			System.out.println("CPF: " + cl.getCPF() + "\n");
		}
		
		System.out.println("Colaboradores cadastrados no sistema: ");
		for(int i = 0; i < colaborador.size(); i++) {
			Colaborador co = colaborador.get(i);
			
			System.out.println("COLABORADOR #" + (i+1) + ": " + co.getID());
			System.out.println("Nome: " + co.getNome());
			System.out.println("Funcion�rio desde: " + co.getDataEntrada() + "\n");
	
		}
		
		for(int i = 0; i < venda.size(); i++) {
			Venda v = venda.get(i);
			System.out.println("TESTE: " + v.getCliente());
		}
	}
	
	private void editar() {
		System.out.println("O que deseja editar?");
		System.out.println("1-Bebida");
		System.out.println("2-Pastel");
		System.out.println("3-Card�pio");
		System.out.println("4-Cliente");
		System.out.println("5-Colaborador");
		System.out.println("6- Relat�rio de Venda");
		
	}
}