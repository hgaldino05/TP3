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
	private List<Cliente> cliente;
	private List<Colaborador> colaborador;
	private List<RelatorioVenda> relatorioVenda;
	
	public static void main(String[] args) {
		new Programa();
	}
	
	private Programa(){
		
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
		
	}
	
	
	
	private void opcoes() {
		/*System.out.println("O que deseja acessar?:");
		System.out.println("1 - Colaboradores");
		System.out.println("2 - Clientes");
		System.out.println("3 - Produtos");
		System.out.println("4 - Cardápio");
		System.out.println("5 - Cadastrar venda");
		System.out.println("6 - Relatório de vendas");
		System.out.println("7 - Sair");*/
	}
}
