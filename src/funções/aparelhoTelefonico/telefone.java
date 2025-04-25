package funções.aparelhoTelefonico;

public class telefone implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void iniciarCorreio() {
        System.out.println("Iniciando correio...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação...");
    }
}
