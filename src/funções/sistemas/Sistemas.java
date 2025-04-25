package funções.sistemas;

import funções.aparelhoTelefonico.AparelhoTelefonico;
import funções.navegadorinternet.NavegadorInternet;
import funções.reprodutorMusical.ReprodutorMusical;

public class Sistemas implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

            public void ligar() {
                System.out.println("Ligando...");
            }

            public void iniciarCorreio() {
                System.out.println("Iniciando Correio...");
            }

            public void atender() {
                System.out.println("Atendendo ligação...");
            }

            public void exibirPagina() {
                System.out.println("Exibindo página...");
            }

            public void adicionarNovaAba() {
                System.out.println("Adicionando nova aba...");
            }

            public void atualizarPagina() {
                System.out.println("Atualizando página...");
            }

            public void tocar() {
                System.out.println("Tocando música...");
            }

            public void pausar() {
                System.out.println("Pausando a música");
            }

            public void selecionarMusica() {
                System.out.println("Selecionando música...");
            }
        }

