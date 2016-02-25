import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  
		  Scanner imput = new Scanner(System.in) ;
		  
		  System.out.println("Insira o numero do produto: ");
		  String numero = imput.nextLine() ;
		  System.out.println("Insira a descricao do produto: ");
		  String descricao = imput.nextLine() ;
		  System.out.println("Insira a quantidade de produtos disponiveis: ");
		  int quantidade = imput.nextInt() ;
		  System.out.println("Insira o preco do produto: ");
		  double preco = imput.nextDouble() ;
		  
	    imput.close();
	    
	  Fatura fatura = new Fatura(preco, quantidade,numero,descricao) ;
	  
	        fatura.setPreco(preco);
	        fatura.setQuantidade(quantidade);
	        fatura.setNumero(numero) ;
	        fatura.setDescricao(descricao);
	  
	 System.out.println("Numero do produto: "+fatura.getNumero());
	 System.out.println("Descricao do produto: "+fatura.getDescricao()) ;
	 System.out.println("Quantidade dispnivel: "+fatura.getQuantidade());
	 System.out.println("Preco do produto: "+fatura.getPreco());
	 System.out.println("Valor da fatura: "+fatura.getValorFatura());

	}

}
