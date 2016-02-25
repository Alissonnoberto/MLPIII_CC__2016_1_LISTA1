public class Main{
	
	public static void main(String[] args) {
		Carro ecosport = new Carro ("Branco","freestale2016",220) ;
	
	ecosport.ligar();
	ecosport.acelerar(220) ;
	
System.out.println("ecosport "+ecosport.getCor()) ;
System.out.println("modelo "+ecosport.getModelo());
System.out.println("velocidade atual "+ecosport.getVelocidadeAtual()+"km/h..");
		
	}
}