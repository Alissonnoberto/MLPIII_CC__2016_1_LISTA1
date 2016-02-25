public class Fatura {
      private String numero ;
      private String descricao ;
      private int quantidade ;
      private double preco ;



public Fatura(double preco,int quantidade,String numero,String descricao){
	  this.preco = preco ;
	  this.quantidade = quantidade ;
	  this.numero = numero ;
	  this.descricao = descricao ;
	  
}
    
   public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
  
public double getValorFatura(){
       double   total = quantidade * preco ; 	
    
    if(quantidade<0){
    	this.quantidade = 0 ;
    }
    
    if(preco<0){
    	this.preco = 0.0 ;
    }
       return total ;
    }

  }
