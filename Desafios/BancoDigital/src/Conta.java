import java.util.Random;

public abstract class Conta implements IConta {

  private static final Random random = new Random();

  protected int agencia;
  protected int conta;
  protected double saldo;
  protected Usuario usuario;

  public Conta(Usuario usuario) {
    this.agencia = gerarNumeroAleatorio(1000, 9999); // Agência com 4 dígitos
    this.conta = gerarNumeroAleatorio(10000, 99999); // Conta com 5 dígitos
    this.usuario = usuario;
  }

  // Método para gerar números aleatórios dentro de um intervalo
  private int gerarNumeroAleatorio(int min, int max) {
    return random.nextInt((max - min) + 1) + min;
  }

  protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.usuario.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.conta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

  @Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

  public int getAgencia() {
    return agencia;
  }

  public int getConta() {
    return conta;
  }

  public double getSaldo() {
    return saldo;
  }

  
}
