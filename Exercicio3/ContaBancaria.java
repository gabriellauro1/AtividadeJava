public class ContaBancaria{
    
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0)
        {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado.");
        }else
        {
            System.out.println("Valor inválido.");
        }
    }
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo)
        {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else
        {
            System.out.println("Saldo insuficiente para saque ou valor de saque inválido.");
        }
    }
    public void exibir() {
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Nome do titular: " + nomeTitular);

    }
}
