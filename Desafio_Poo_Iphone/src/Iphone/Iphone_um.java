package Iphone;


import Iphone.funcao.AparelhoTelefonico;
import Iphone.funcao.Navegador;
import Iphone.funcao.ReprodutorMusical;

public class Iphone_um implements ReprodutorMusical, Navegador, AparelhoTelefonico {

    @Override
    public void ligar(int numero) {
        System.out.println("Ligando: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica);
    }
}
