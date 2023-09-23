public class Telefone extends Iphone{
    public void ligar(long numero){
        System.out.println("Ligar para "+numero);
    }
    public void atender(){
        System.out.println("Ligação!");
    }
    public void correioDeVoz(){
        System.out.println("Novo correio de voz!");
    }
    public void receberMensagem(){
        System.out.println("Uma nova mensagem te aguarda!");
    }
    public void mandarMensagem(String msg, long numero){
        System.out.println(msg);
        System.out.println("Mensagem enviada para: "+numero);
    }
}
