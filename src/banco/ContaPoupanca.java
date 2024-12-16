package src.banco;

public class ContaPoupanca extends Conta implements Investimento {

    public ContaPoupanca(int numero, String nome_titular) {
        super(numero, nome_titular);
    }



    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "saldo=" + saldo +
                '}';
    }

    @Override
    public void reajustar(double taxa) {
        this.saldo = getSaldo() + (getSaldo() * (taxa / 100));
        System.out.println("Saldo reajustado com taxa de " + taxa + "%: " + getSaldo());
    }
}
