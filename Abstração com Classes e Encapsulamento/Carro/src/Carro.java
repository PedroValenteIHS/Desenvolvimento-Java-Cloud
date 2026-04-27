public class Carro {
    private boolean status;
    private int velocidade;

    public Carro(){
        status = false;
    }

    public void ligar(){
        status = true;
    }

    public void desligar(){
        status = false;
    }

    public String acelerar(int acelerar){
        String mensagem;
        if (status){
            velocidade += acelerar;
            mensagem = "Acelerando carro";
            return mensagem;
        } else {
            mensagem = "O carro está desligado";
            return mensagem;
        }
    }

    public String desacelerar(int desacelerar){
        String mensagem;
        if (status){
            velocidade += desacelerar;
            mensagem = "Desacelerando carro";
            return mensagem;
        } else {
            mensagem = "O carro está desligado";
            return mensagem;
        }
    }

    public int velocimetro(){
        return velocidade;
    }
}
