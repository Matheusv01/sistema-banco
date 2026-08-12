import static java.lang.IO.*;

public class ContaBancaria {

    private String titular;
    private float saldo = 0;
    private float limite;

    public ContaBancaria(String titular, float saldo, float limite){
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }
    public void sacar (float valor1){
        this.saldo -= valor1;
    }

     public void depositar (float valor){
        this.saldo += valor;
     }
    public float getSaldo() {
        return saldo;
    }

    public String pagarFatura(){
        return "fatura paga com sucesso";
    }
    public String transferir(){
        return "dinheiro transferido com sucesso";
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
