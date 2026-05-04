public class Banho {
    private int agua;
    private int shampoo;
    private boolean ocupado;
    String mensagem;

    //construtor
    public Banho (){
        agua = 30;
        shampoo = 10;
        ocupado = false;
    }

    public String darBanho(){
        if (agua < 10){
            mensagem = "Capacidade de água abaixo do necessário, favor abastecer.";
        } else if (shampoo < 2) {
            mensagem = "Capacidade de shampoo abaixo do necessário, favor abastecer.";
        } else if (ocupado) {
            mensagem = "Máquina ocupada, favor retirar o animal.";
        } else {
            agua -= 10;
            shampoo -= 2;
            ocupado = true;
            mensagem = "Animal banhado.";
        }

        return mensagem;
    }

    public String abastecerAgua(){
        agua += 2;
        if (agua > 30){
            agua = 30;
        }
        mensagem = "Agua abastecida com mais 2 Litros";
        return mensagem;
    }

    public String abastecerShampoo(){
        shampoo += 2;
        if (shampoo > 30){
            shampoo = 30;
        }
        mensagem = "Shampoo abastecida com mais 2 Litros";
        return mensagem;
    }

    public String getAgua(){
        mensagem = "Agua:" + agua + " Litros";
        return mensagem;
    }

    public String getShampoo(){
        mensagem = "Agua:" + shampoo + " Litros";
        return mensagem;
    }

    public Boolean getOcupacao(){
        return ocupado;
    }

    public String retirar(){
        ocupado = false;
        mensagem = "Animal retirado";
        return mensagem;
    }
}
