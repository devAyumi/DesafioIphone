package iPhone;

import iPhone.funcoes.AparelhoTelefonico;
import iPhone.funcoes.NavegadorInternet;
import iPhone.funcoes.ReprodutorMusical;

import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    Scanner scan = new Scanner(System.in);
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }

    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
    }

    public void selecionarMusica(String musica) {
        System.out.println("MÚSICA SELECIONADA: " + musica);
    }

    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA");
    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA");
    }

    public void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero);
    }

    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
}
