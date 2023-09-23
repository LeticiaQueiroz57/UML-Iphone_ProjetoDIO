public class NavegadorDeInternet extends Iphone{
    String site;

    public NavegadorDeInternet(String site){this.site=site;}
    public void exibirPagina(){
        System.out.println("Entrada no site: "+this.site);
    }
    public void AdicionarNovaAba(){
        System.out.println("Nova aba aberta!");
    }
    public void AtualizarPagina(){
        System.out.println("Página atualizada!");
    }
    public void AtualizarFavoritos(){
        System.out.println(this.site+" foi adicionado aos favoritos!");
    }
}
