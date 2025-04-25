import funções.aparelhoTelefonico.AparelhoTelefonico;
import funções.navegadorinternet.NavegadorInternet;
import funções.reprodutorMusical.ReprodutorMusical;
import funções.sistemas.Sistemas;

public class Iphone {
    public static void main(String[] args) {
        Sistemas sistemas = new Sistemas();


        AparelhoTelefonico ligacao = sistemas;
        NavegadorInternet navegador = sistemas;
        ReprodutorMusical musica = sistemas;

        System.out.println("Telefone: ");
        ligacao.ligar();
        ligacao.atender();
        ligacao.iniciarCorreio();

        System.out.println("Navegador: ");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        navegador.exibirPagina();

        System.out.println("Música: ");
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();

    }
}
