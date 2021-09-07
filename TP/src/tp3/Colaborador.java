package tp3;

import java.util.Date;

//Classe referente aos dados do colaborador
public class Colaborador extends Pessoa{
	
	private String ID;
	private Date dataEntrada;
	
	public Colaborador(String i, String n, Date d) {
		ID = i;
		nome = n;
		dataEntrada = d;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	
}
