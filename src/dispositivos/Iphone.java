package dispositivos;

public class Iphone implements ReprodutorMusical, Telefone, NavegadorInternet {

    @Override
    public void reproduzir(){
        System.out.println("Reproduzindo uma música....");
    }

    @Override
    public void pausar(){
        System.out.println("Pausa na reprodução");
    }

    @Override
    public void parar() {
        System.out.println("Stop na reprodução");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo uma página na Internet " + url);

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println(numero);


    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada...");

    }
}
