public class ContaPoupanca extends Conta {

	public ContaPoupanca(Usuario usuario) {
		super(usuario);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}