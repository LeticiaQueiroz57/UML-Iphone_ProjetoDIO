public class ReprodutorMusical extends Iphone {
    String musica;
    public ReprodutorMusical(String musica){this.musica = musica;}
    public void TocarMusica(){
        System.out.println(this.musica+" está tocando");
    }
    public void Pausar(){
        System.out.println(this.musica+" foi pausada");
    }
    public void SelecionarNovaMusica(String musica){
        this.musica = musica;
        System.out.println("Música selecionada com sucesso!");
    }
}
