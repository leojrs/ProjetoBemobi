import java.io.FileWriter;
import java.io.PrintWriter;

public class Pais {

	String nome;
	String ddi;
	int totalUsuarios;
	int totalAtivos;
	
	public Pais(String nome, String ddi, int totalUsuarios, int totalAtivos) {
		super();
		this.nome = nome;
		this.ddi = ddi;
		this.totalUsuarios = totalUsuarios;
		this.totalAtivos = totalAtivos;
	}
	
	public void addUsuarios() {
		this.totalUsuarios++;
	
	}
	
	public void addAtivos() {
		this.totalAtivos++;
	
	}

	public void imprimir(PrintWriter gravarResultado) {
		gravarResultado.println("" + this.nome + ", " + this.totalUsuarios + ", " + this.totalAtivos);
	}
}


