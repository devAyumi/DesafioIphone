import iPhone.Iphone;
import iPhone.funcoes.AparelhoTelefonico;
import iPhone.funcoes.NavegadorInternet;
import iPhone.funcoes.ReprodutorMusical;

import java.util.*;

public class Celular {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        ReprodutorMusical musica = iphone;
        NavegadorInternet navegador = iphone;
        AparelhoTelefonico telefone = iphone;

        Scanner scan = new Scanner(System.in);

        System.out.println("QUAL SISTEMA QUER ACESSAR?");
        String sistemaAcessado = scan.next();

        switch (sistemaAcessado){
            case "REPRODUTOR":{
                musica.selecionarMusica("Baby - Justin Bieber");
                musica.tocar();
                musica.pausar();
                break;
            }
            case "NAVEGADOR":{
                navegador.adicionarNovaAba();
                navegador.exibirPagina("wikipedia.com");
                navegador.atualizarPagina();
                break;
            }
            case "TELEFONE":{
                telefone.ligar("(41)99999-9999");
                telefone.atender();
                telefone.iniciarCorreioVoz();
                break;
            }
        }
    }
}
