public class MainConta {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.setNumeroConta(10);
        c1.setSaldo(2000);
        c1.setTitular("Saymon");

        System.out.println("Número da Conta: " + c1.getNumeroConta());
        System.out.println("Saldo: " + c1.getSaldo());
        System.out.println("Titular: " + c1.getTitular());

        c1.depositar(4000);
        c1.verificar();
        c1.sacar(8000);
        c1.verificar();
        c1.sacar(250);
        c1.verificar();        

    }
}
