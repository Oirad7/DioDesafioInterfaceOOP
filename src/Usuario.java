import iphone.*;

public class Usuario {
    public static void main(String[] args) {

        Iphone celular = new Iphone();

        System.out.println("===telefone");
        celular.ligar();
        celular.atender();
        celular.iniciarCorreioVoz();
        
        System.out.println("===reprodutor de musica");
        celular.tocar();
        celular.pausar();
        celular.selecionarMusica();

        System.out.println("===navegador");
        celular.exibirPagina();
        celular.adicionarNovaAba();
        celular.atualizarPagina();




        


    }
}
