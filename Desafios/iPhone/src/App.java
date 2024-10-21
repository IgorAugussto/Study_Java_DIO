public class App {
    public static void main(String[] args) throws Exception {
       iPhone iPhone = new iPhone();
       
       System.out.println("Bem-Vindo ao iPhone");

       iPhone.Desbloquear(false);
       iPhone.SelecionarMusica(null);
       iPhone.Tocar();
       iPhone.Pausar();
       iPhone.ExibirPagina(null);
       iPhone.AdicionarNovaAba();
       iPhone.AtualizarPagina();
       iPhone.Ligar(null);
       iPhone.Atender();
       iPhone.IniciarCorreioVoz();
    }
}
