public class Main {
    public static void main(String[] args) {
        ReprodutorMusical musical = new ReprodutorMusical("Four Seasons: Autumn");
        NavegadorDeInternet site = new NavegadorDeInternet("google.com");
        Telefone tel = new Telefone();

        musical.TocarMusica();
        musical.SelecionarNovaMusica("Dói sem tanto");
        musical.Pausar();

        site.exibirPagina();
        site.AdicionarNovaAba();
        site.AtualizarPagina();
        site.AtualizarFavoritos();

        tel.atender();
        tel.correioDeVoz();
        tel.ligar(11934002);
        tel.receberMensagem();
        tel.mandarMensagem("Bom dia!", 119304932);
    }
}