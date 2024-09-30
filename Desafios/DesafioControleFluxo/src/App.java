import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		terminal.close();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
            System.out.println("O primeiro parametro precisa ser menor que o segundo");
        }
		
		int contagem = parametroDois - parametroUm;
		for (int i = 0; i < contagem; i++) {
				System.out.printf("Imprimindo o número %d\n", (i + 1));
		}
	}
}
