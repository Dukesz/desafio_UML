package Exibicao;
import Iphone.Iphone_um;

public class Tela {
    public static void main(String[] args) {
        Iphone_um iphone = new Iphone_um();
        String song = "Count me Out";
        int number = 995623375;
        String site = "www.Dio.com.br";

        iphone.selecionarMusica(song);
        iphone.tocar();
        iphone.pausar();
        iphone.exibirPagina(site);
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.ligar(number);
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
