import vitoria.iphone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Besties - Karol G");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("123456789");
        iphone.iniciarCorreioVoz();
        iphone.ligar("123456789");
        iphone.atender();

        iphone.exibirPagina("www.google.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
