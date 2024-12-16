package src.banco;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(int numero, String nome_titular, double limite) {
        super(numero, nome_titular);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= this.limite + this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }


    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                ", saldo=" + saldo +
                '}';
    }
}
