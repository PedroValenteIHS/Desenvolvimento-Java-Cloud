import java.util.Arrays;
import java.util.List;

public class Carro {
    private boolean status;
    private int velocidade;
    private String marcha = "N";
    List<String> marchas = Arrays.asList("N", "1", "2", "3", "4", "5", "R");
    String mensagem;

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
        if (!status) {
            mensagem = "O carro está desligado";
        } else if (marcha.equals("N")) {
            mensagem = "Marcha está no neutro";
        } else {
            velocidade += acelerar;
            mensagem = "Carro acelerando";

            if(velocidade > 40 && marcha.equals("R")){
                mensagem = "Limite de velocitade na ré = 40km/h";
                velocidade = 40;
            }
            if (velocidade > 20 && marcha.equals("1")){
                mensagem = "Passe para a proxima marcha antes de acelerar";
                velocidade -= acelerar;
            } else if (velocidade > 40 && marcha.equals("2")) {
                mensagem = "Passe para a proxima marcha antes de acelerar";
                velocidade -= acelerar;
            } else if (velocidade > 60 && marcha.equals("3")) {
                mensagem = "Passe para a proxima marcha antes de acelerar";
                velocidade -= acelerar;
            } else if (velocidade > 80 && marcha.equals("4")) {
                mensagem = "Passe para a proxima marcha antes de acelerar";
                velocidade -= acelerar;
            } else if (velocidade > 100 && marcha.equals("5")) {
                mensagem = "Passe para a proxima marcha antes de acelerar";
                velocidade -= acelerar;
            } else if (velocidade > 150) {
                mensagem = "O carro atinge no máximo 150km/h.";
                velocidade = 150;
            }
        }
        return mensagem;
    }

    public String desacelerar(int desacelerar){
        if (!status) {
            mensagem = "O carro está desligado";
        } else if (marcha.equals("N")) {
            mensagem = "Marcha está no neutro";
        } else {
            velocidade -= desacelerar;
            mensagem = "Carro desacelerando";

            if(velocidade < 0 && marcha.equals("R")){
                mensagem = "O carro parou";
                velocidade = 0;
            }
            if (velocidade < 0 && marcha.equals("1")){
                mensagem = "O carro parou";
                velocidade = 0;
            } else if (velocidade < 10 && marcha.equals("2")) {
                mensagem = "Diminua a marcha antes de desacelerar";
                velocidade += desacelerar;
            } else if (velocidade < 30 && marcha.equals("3")) {
                mensagem = "Diminua a marcha antes de desacelerar";
                velocidade += desacelerar;
            } else if (velocidade < 50 && marcha.equals("4")) {
                mensagem = "Diminua a marcha antes de desacelerar";
                velocidade += desacelerar;
            } else if (velocidade < 70 && marcha.equals("5")) {
                mensagem = "Diminua a marcha antes de desacelerar";
                velocidade += desacelerar;
            }
        }
        return mensagem;
    }

    public int velocimetro(){
        return velocidade;
    }

    public String trocarMarcha(String marcha){
        if (!marchas.contains(marcha)){
            mensagem = "Marcha inválida";
        } else {
            this.marcha = marcha;
            if (marcha.contains("R")) {
                velocidade = 0;
            }

            mensagem = "Marcha trocada para a " + marcha;
        }
        return mensagem;
    }
}
