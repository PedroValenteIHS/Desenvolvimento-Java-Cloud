public class Conta {
    private float saldo = 0;

    public void setDeposito(float valor){
        saldo = saldo + valor;
    }

    public float getSaldo(){
        return saldo;
    }
}
