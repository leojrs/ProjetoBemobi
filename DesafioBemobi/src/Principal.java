import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {			
		
		
		Pais brasil = new Pais("Brasil", "55", 0, 0); 
		Pais chile = new Pais("Chile", "56", 0, 0);
		Pais mexico = new Pais("México", "52", 0, 0);
		
		Scanner ler = new Scanner(System.in);
	    System.out.printf("Informe o endereço e o nome do arquivo de texto: ");
	    String origem = ler.nextLine();
		BufferedReader leitor = new BufferedReader(new FileReader(origem));
		String linha = leitor.readLine();	
		
		
		while ((linha != null)){					
			
			String cod = linha.substring(0, 2);
			String status = linha.substring(15);

			if(cod.equals(brasil.ddi)){
				brasil.addUsuarios();
				if(status.equals("assinado")) {
					brasil.addAtivos();
				}
			}
			else if(cod.equals(chile.ddi)) {
				chile.addUsuarios();
				if(status.equals("assinado")) {
					chile.addAtivos();
				}
			}else if(cod.equals(mexico.ddi)) {
				mexico.addUsuarios();
				if(status.equals("assinado")) {
					mexico.addAtivos();					
				}
			}
			
			linha = leitor.readLine();
	    }
		
		leitor.close();
		
		System.out.printf("Informe a pasta destino e o nome do arquivo que deseja salvar: ");
	    String destino = ler.nextLine();
	    FileWriter arquivo = new FileWriter(destino) ;
	    PrintWriter gravarResultado = new PrintWriter(arquivo);
		
	    brasil.imprimir(gravarResultado);	    
		
	    chile.imprimir(gravarResultado);
		
	    mexico.imprimir(gravarResultado);
		
	    arquivo.close();
	    

	}

}
