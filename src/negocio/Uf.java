package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Uf {
	// propriedades da classe // 
	
	private String sigla = "";
	
	
	//metodos construtores da classe // 
	public Uf(String sigla) {
		super();
		this.sigla = sigla;
	}

	public Uf() {
		super();
	}

	//metodos de acesso da classe // 
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	//METODOS DA CLASSE //
	public static Collection<Uf> getTodos() throws Exception{
		ArrayList<Uf> colecao = new ArrayList<Uf>();
		
		colecao.add(new Uf("AM"));
		colecao.add(new Uf("BA"));
		colecao.add(new Uf("CE"));
		colecao.add(new Uf("DF"));
		colecao.add(new Uf("GO"));
		colecao.add(new Uf("RJ"));
		colecao.add(new Uf("SP"));
		colecao.add(new Uf("RS"));
		
		return colecao;
	}
}
