import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try { 
			contar(parametroUm, parametroDois);
		} catch(ParametrosInvalidosException e){
			System.out.println("Erro: " + e.getMessage());
		}  
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois){
			throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor ou igual ao do segundo parâmetro.");
		}

		int contagem = parametroDois - parametroUm;
		for(int i=0; i <= contagem; i++){
				System.out.println("Imprimindo o número " + i);
			}
	}

	static class ParametrosInvalidosException extends Exception {
		public ParametrosInvalidosException(String mensagem){
			//construtor para a mensagem
			super(mensagem);
		}
	}
}