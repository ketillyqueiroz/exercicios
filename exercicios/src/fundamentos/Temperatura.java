package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double temperaturaF = 86;
		double diminuir = 32;
		double divisao = 5/9.0;
		
		double valorCelsius = (temperaturaF - diminuir) * divisao;
		
		
		System.out.println("Resultado da temperatura em Celsius: " + valorCelsius);
	}

}


