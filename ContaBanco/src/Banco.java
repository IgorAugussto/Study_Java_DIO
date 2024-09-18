import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Banco {
  Scanner sc = new Scanner(System.in);
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  int numero;
  String agencia, nomeCliente;
  //Nome também para simular um cadastro do cliente no banco de dados.
  String nomeBanco;
  double saldo, novoSaldo;
  //Saldo para simular algo gravado no banco de dados do cliente
  final double SALDO = 25.00;

  // Verifica se usuário ja possui conta ou não
  public void VerificarUsuario(int opcao) {
    if (opcao == 2) {
      CadastrarConta();
    } else {
      System.out.println("Informe o nome completo para confirmar sua conta");
      nomeBanco = sc.nextLine();
      System.out.println("\nNome confirmado !");
      System.out.println("Adicione o saldo que que depositar");
      novoSaldo = sc.nextFloat();
      AdicionarValorConta(novoSaldo);
      sc.close();
    }
  }

  // --- CASO O CLIENTE NÃO TENHA CONTA ---
  public void CadastrarConta() {

    System.out.println("Por favor, digite o número da Agência !");
    agencia = sc.nextLine();

    System.out.println("Por favor, digite o número da Conta !");
    numero = sc.nextInt();

    System.out.println("Por favor, digite o seu nome completo !");
    sc.nextLine(); // Consumir a nova linha pendente
    nomeCliente = sc.nextLine();

    System.out.println("\nPor favor, digite o saldo a ser depositado !");
    saldo = sc.nextFloat();

    sc.close();

    MostrarResultadoContaNova();
  }

  public void MostrarResultadoContaNova() {
    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, " +
        "sua conta é a %d e seu saldo de R$ %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
  }

  //CASO CLIENTE TENHA UMA CONTA CADASTRADA
  public void AdicionarValorConta(double saldoDepositado) {
    novoSaldo = SALDO + saldoDepositado;
    imprimirResultadoContaExistente();
  }

  public void MostrarResultadoContaCriada(float novoSaldo) {
    System.out.println("Informe o saldo que deseja adicionar ou retirar");
  }

  //MOSTRAR RESULTADO NA TELA
  public void imprimirResultadoContaExistente() {
    System.out.printf("Olá %s, o novo saldo da sua conta é: R$ %.2f ", nomeBanco, novoSaldo);
  }
}
