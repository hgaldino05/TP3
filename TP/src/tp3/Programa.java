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
	
	static Bebida b;
	static Pastel p;
	static Cliente c1;
	static Cliente c2;
	static Colaborador co1;
	static Colaborador co2;
	static Cardapio c[];
	static Venda v[];
	static RelatorioVenda r[];
	
	static String data[];

	public static void main(String[] args) {
		//new Programa();
		
		b = new Bebida("Coca-cola", "Latinha 350ml", 3.49, 2);
		
		
		p = new Pastel("Carne com queijo", "Normal", 3.99, 2);
		
		c1 = new Cliente("123.456.789-10", "4002-8922", 200, "Fulano");
		c2 = new Cliente("012.345.678-90", "4004-0440", 125, "Fausto Silva");
		
		co1 = new Colaborador("0123", "Cleiton Rasta","11/3/2018");
		co2 = new Colaborador("0456", "Mariana Vargas","9/2/2017");
		
		c[0] = new Cardapio("Pastel médio","Pastel em dobro","Pastel médio com recheio a escolha","2 pastéis médios, recheio a escolha",3.99, 7.49);
		c[1] = new Cardapio("Coca-cola","Pastel + Lata","Latinha 350ml","Pastel médio e latinha 350ml, recheio e bebida a escolha",3.49, 6.99);
		
		v[0] = new Venda(c[0],"Cartão de débito",c[0].getPrecoProdutos());
		
		data[0] = "7/9/2021";
		
		r[0] = new RelatorioVenda(v[0],data[0]);
		
		System.out.println(b.toString());
		System.out.println(p.toString());
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(co1.toString());
		System.out.println(co2.toString());
		
		System.out.println(c[0].toString());
		System.out.println(c[1].toString());

		System.out.println(v[0].toString());
		System.out.println(r[0].toString());
	}
	
	/*private Programa(){
		
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
	
	
}
