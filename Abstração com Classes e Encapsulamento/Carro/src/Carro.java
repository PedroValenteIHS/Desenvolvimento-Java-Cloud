import java.util.Arrays;
import java.util.List;

public class Carro {
    //Declara as propriedades
    private boolean status;
    private int velocidade;
    private String marcha = "N";
    List<String> marchas = Arrays.asList("N", "1", "2", "3", "4", "5", "R");
    String mensagem;

    //Construtor
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
        // Acelera o carro de acordo com verificação se está com a marcha adequada
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
        //Desacelera o carro verificando se está com a marcha adequada
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
        //Troca de marcha verificando se a marcha escolhida pra ser trocada é muito superior.
        mensagem = "Marcha trocada para a " + marcha;
        if (!marchas.contains(marcha)){
            mensagem = "Marcha inválida";
        } else {
            if(this.marcha.contains("N") || this.marcha.contains("R")){
                if (marcha.contains("R")){
                    this.marcha = marcha;
                } else if (marcha.contains("1")){
                    this.marcha = marcha;
                }else {
                    mensagem = "Marcha muito elevada";
                }
            }else if (this.marcha.contains("1")){
                if (marcha.contains("R")){
                    this.marcha = marcha;
                }else if (marcha.contains("N")){
                    this.marcha = marcha;
                } else if (marcha.contains("2")){
                    this.marcha = marcha;
                } else {
                    mensagem = "Marcha muito elevada";
                }
            } else if (this.marcha.contains("2")){
                if (marcha.contains("R")){
                    this.marcha = marcha;
                }else if (marcha.contains("N")){
                    this.marcha = marcha;
                } else if (marcha.contains("1")){
                    this.marcha = marcha;
                }
                else if (marcha.contains("3")){
                    this.marcha = marcha;
                }else {
                    mensagem = "Marcha muito elevada";
                }
            } else if (this.marcha.contains("3")){
                if (marcha.contains("R")){
                    this.marcha = marcha;
                }else if (marcha.contains("N")){
                    this.marcha = marcha;
                }else if (marcha.contains("1")){
                    this.marcha = marcha;
                }else if (marcha.contains("2")){
                    this.marcha = marcha;
                }else if (marcha.contains("4")){
                    this.marcha = marcha;
                }else {
                    mensagem = "Marcha muito elevada";
                }
            } else if (this.marcha.contains("4")){
                if (marcha.contains("R")){
                    this.marcha = marcha;
                }else if (marcha.contains("N")){
                    this.marcha = marcha;
                }else if (marcha.contains("1")){
                    this.marcha = marcha;
                }else if (marcha.contains("2")){
                    this.marcha = marcha;
                }else if (marcha.contains("3")){
                    this.marcha = marcha;
                }else if (marcha.contains("5")) {
                    this.marcha = marcha;
                }else {
                    mensagem = "Marcha muito elevada";
                }
            }else {
                this.marcha = marcha;
            }

            if (marcha.contains("R")) {
                velocidade = 0;
            }
        }
        return mensagem;
    }
}

