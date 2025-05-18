import dispositivos.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone meuIphone = new Iphone();

        //Testando funcionalidades do telefone
        meuIphone.fazerChamada("Ligando para trabalho 999998281...");
        meuIphone.receberChamada();


        //Testando funcionalidades de reproducao musical
        meuIphone.reproduzir();
        meuIphone.pausar();
        meuIphone.parar();

        //Testando funcionalidades de navegação na internet

        meuIphone.abrirPagina("  www.youtube.com");
        meuIphone.atualizarPagina();

    }
}