public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;    

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setSaldo(double saldo){
        if (saldo >= 0){
            this.saldo = saldo;
        } else {
            System.out.println("Saldo não pode ser negativo.");
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo+=valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Não é possível depositar um valor negativo!");
        }
    }

    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo-=valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else{
            System.out.println("Valor de saque inválido.");
        }
    }

    public void verificar(){
        System.out.println("Saldo da conta: R$" + saldo + "!");
    }

}

