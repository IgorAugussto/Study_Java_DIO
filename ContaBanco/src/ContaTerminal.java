import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.println("BEM-VINDO AO SISTEMA BANCÁRIO !\n");

        System.out.println("Por escolha uma das opções abaixo.\n");
        System.out.println("Digite 1 caso possua uma conta cadastrada\n");
        System.out.println("Digite 2 caso não tenha conta cadastrada");
        int opcao = sc.nextInt();
        banco.VerificarUsuario(opcao);
        sc.close();
        
    }
}
