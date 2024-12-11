public class ContaCorrente extends Conta {

	public ContaCorrente(Usuario usuario) {
		super(usuario);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}