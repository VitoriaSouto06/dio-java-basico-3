package vitoria.iphone;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void tocar() {
       System.out.println("Tocar musica");
    }

    @Override
    public void pausar() {
        
        System.out.println("Pausar musica");    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar musica: "+ musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibir página: "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligar");
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz");
    }


}
