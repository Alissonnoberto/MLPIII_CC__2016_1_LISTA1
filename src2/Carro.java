
public class Carro {
    private String cor ;
    private String modelo ;
    private int velocidadeAtual ;
    private int velocidadeMaxima ;

public Carro(String cor, String modelo,int velocidadeMaxima) {
	this.cor = cor ;
	this.modelo = modelo ;
	this.velocidadeMaxima = velocidadeMaxima ;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getVelocidadeAtual() {
	return velocidadeAtual;
}

public void setVelocidadeAtual(int velocidadeAtual) {
	this.velocidadeAtual = velocidadeAtual;
}

public int getVelocidadeMaxima() {
	return velocidadeMaxima;
}

public void setVelocidadeMaxima(int velocidadeMaxima) {
	this.velocidadeMaxima = velocidadeMaxima;
}

public void ligar(){
	if(velocidadeAtual == 0){
		System.out.println("Vrum Vrum");
	}
}

public void acelerar(int velocidadeAcrescentada){
	if(velocidadeMaxima <= (velocidadeAtual + velocidadeAcrescentada)){
		velocidadeAtual += velocidadeAcrescentada ;
	}else{
		System.out.println("Velocidade excedida") ;
	}
}
}