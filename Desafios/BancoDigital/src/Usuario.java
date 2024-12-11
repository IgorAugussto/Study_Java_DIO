public class Usuario {

  private String nome;
  private int idade;
  private String nomeUsuario;
  private String senhaUsuario;
  private String userTeste = "User-test";
  private String senhaTeste = "12345";


  // Método para criar usuário
  public Usuario(String nome, int idade, String nomeUsuario, String senhaUsuario) {
    this.nomeUsuario = nomeUsuario;
    this.senhaUsuario = senhaUsuario;
    this.nome = nome;
    this.idade = idade;
  }

  public Usuario(String userTeste, String senhaTeste) {
    this.userTeste = userTeste;
    this.senhaTeste = senhaTeste;
  }

  public void FormatarNome(String nomeCompleto) {
    String[] partes = nomeCompleto.split(" ");
    String nome = partes[0];// Primeiro nome
    String sobrenome = partes[partes.length - 1];// Ultimo nome
    System.out.printf("Conta criada com sucesso! Bem-vindo(a), %s %s", nome, sobrenome);
  }

  

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getNomeUsuario() {
    return nomeUsuario;
  }

  public void setNomeUsuario(String nomeUsuario) {
    this.nomeUsuario = nomeUsuario;
  }

  public String getSenhaUsuario() {
    return senhaUsuario;
  }

  public void setSenhaUsuairo(String senhaUsuario) {
    this.senhaUsuario = senhaUsuario;
  }

  public String getUserTeste() {
    return userTeste;
  }

  public void setUserTeste(String userTeste) {
    this.userTeste = userTeste;
  }

  public String getSenhaTeste() {
    return senhaTeste;
  }

  public void setSenhaTeste(String senhaTeste) {
    this.senhaTeste = senhaTeste;
  }

}
