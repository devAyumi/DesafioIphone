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
        scan.nextLine();

        switch (sistemaAcessado){
            case "REPRODUTOR":{
                System.out.println("Selecione uma música: ");
                musica.selecionarMusica(scan.nextLine());
                musica.tocar();

                System.out.println("Deseja pausar? ");
                String pausar = scan.next();
                if (pausar.equals("SIM")) {
                    musica.pausar();
                }
                break;
            }
            case "NAVEGADOR":{
                System.out.println("Inserir URL: ");
                navegador.exibirPagina(scan.next());
                navegador.adicionarNovaAba();

                System.out.println("Deseja atualizar a página?");
                String atualizar = scan.next();
                if (atualizar.equals("SIM"))
                    navegador.atualizarPagina();
                break;
            }
            case "TELEFONE":{
                System.out.println("Informe o número de telefone que deseja ligar: ");
                telefone.ligar(scan.nextLine());
                telefone.iniciarCorreioVoz();
                telefone.atender();
                break;
            }
        }
    }
}
