import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Usuario user = null;
        Conta conta = null;
        VerificarUsuario login;
        String opcao;

        System.out.println("Bem-Vindo ao seu banco digital");


        System.out.println("Você já tem uma conta? (s/n)");
        opcao = sc.nextLine();

        if (opcao.equalsIgnoreCase("n")) {
            System.out.println("Digite seu nome completo");
            String nome = sc.nextLine();
            System.out.println("Digite sua idade");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite um nome de usuário para criar a conta"); 
            String nomeUser = sc.nextLine();
            System.out.println("Digite uma senha");
            String senhaUser = sc.nextLine();

            user = new Usuario(nome, idade, nomeUser, senhaUser);
            user.FormatarNome(user.getNome());

        } else {

            System.out.println("Digite seu nome de usuário:");
            String nomeTeste = sc.nextLine(); // Inicialização de nomeTeste com entrada do usuário

            System.out.println("Digite sua senha:");
            String senhaTeste = sc.nextLine();

            login = new VerificarUsuario(nomeTeste, senhaTeste);

            // Tentar autenticar
            if (login.iniciarLogin(nomeTeste, senhaTeste)) {
                System.out.println("Bem-vindo(a) de volta! Acesse sua conta.");
            } else {
                System.out.println("Falha no login. Encerrando o programa.");
            }
        }
        sc.close();
    }
}
