package iphone;


import iphone.telefone.Telefone;
import iphone.navegador.Navegador;
import iphone.reprodutorMusica.ReprodutorMusica;


public class Iphone implements Telefone, ReprodutorMusica, Navegador {
    
    //telefone
    public void ligar(){
        System.out.println("ligando");
    }

    public void atender() {
        System.out.println("atendendo");
    }

    public void iniciarCorreioVoz(){
        System.out.println("iniciando correio de voz");
    }

    //reprodutor de música
    public void tocar(){
        System.out.println("tocando");
    }

    public void pausar() {
        System.out.println("pausando");
    }

    public void selecionarMusica() {
        System.out.println("selecionando musica");
    }


    //navegador 
    public void exibirPagina(){
        System.out.println("exibindo página");
    }

    public void adicionarNovaAba(){
        System.out.println("adicionando nova aba");
    }

    public void atualizarPagina(){
        System.out.println("atualizando página");
    }
       
}

