public class VerificarUsuario {

  private String nomeUsuario;
  private String senhaUsuario;

  public VerificarUsuario(String nomeUsuario, String senhaUsuario) {
    this.nomeUsuario = nomeUsuario;
    this.senhaUsuario = senhaUsuario;
  }

  // Método para iniciar o processo de login
  public boolean iniciarLogin(String userTeste, String senhaTeste) {
    // Verificar credenciais
    if (nomeUsuario.equals(userTeste) && senhaUsuario.equals(senhaTeste)) {
      System.out.println("Login realizado com sucesso!");
      return true; // Credenciais válidas
    } else {
      System.out.println("Usuário ou senha incorretos.");
      return false; // Credenciais inválidas
    }
  }
}

