import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class iPhone implements ReprodutorMusical, AparelhoTelefone, NavegadorInternet, DesbloquearCelular {

  Scanner sc = new Scanner(System.in);
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  // Desbloquear celular
  public boolean Desbloquear(boolean isDesbloqueado) {
    isDesbloqueado = false;
    boolean novoStatus = !isDesbloqueado;
    System.out.println("Celular desbloquado");
    return novoStatus;
  }

  // Selecionar musica
  public void SelecionarMusica(String musica) {
    System.out.println("Digite o nome da musica que deseja escutar ");
    musica = sc.nextLine();
    System.out.printf("A musica escolhida foi " + musica);
  }

  // Tocar musica
  public void Tocar() {
    System.out.println("Tocando música...");
  }

  // Pausar musica
  public void Pausar() {
    System.out.println("Musica pausada"); 
  }

  public void ExibirPagina(String url) {
    System.out.println("Digite o site que deseja navegar ");
    url = sc.nextLine();
    System.out.printf("Você está navegando no site: " + url);;
  }

  public void AdicionarNovaAba() {
    System.out.println("\nNova aba adicionada");
  }

  public void AtualizarPagina() {
    System.out.println("Pagina atualizada");
  }

  public void Ligar(String numero) {
    System.out.println("digite o numero que deseja fazer a ligação ");
    numero = sc.nextLine();
    sc.close();
    System.out.printf("Ligando para " + numero + "...\n");
  }

  public void Atender() {
    System.out.println("Atendendo ligação");
  }

  public void IniciarCorreioVoz() {
    System.out.println("iniciando gravação para correio de voz...");
  }

}
