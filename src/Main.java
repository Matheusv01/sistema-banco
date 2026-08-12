import static java.lang.IO.*;

void main() {

    boolean sair = false;

    ContaBancaria informacoes = new ContaBancaria("pedro", 0, 0);


    do {
        String entrada = readln("Digite 1 para depositar, 2 para sacar, 3 para ver seu saldo e 4 para sair:  ");
        switch (entrada) {
            case "1":
                float depositar = Float.parseFloat(readln("digite o valor que deseja depositar: "));
                if (depositar <= 0) {
                    return;
                }else {
                    informacoes.depositar(depositar);
                }break;

            case "2":
                float sacar = Float.parseFloat(readln("digite o valor no qual deseja sacar: "));
                if (informacoes.getSaldo() > sacar){
                    informacoes.sacar(sacar);
                    println("saque realizado com sucesso");
                } else {
                    println("voce nao tem saldo suficiente");
                }break;

            case "3":
                println("o seu saldo é de " + informacoes.getSaldo());
                break;

            case "4":
                    sair = true;
                break;

            default:
                println("opção invalida");
                break;
        }

    }while (!sair) ;
}





