public class atividade3 {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(1, "Pedro", 10000);

        conta.exibir();

        conta.depositar(500);
        conta.exibir();

        conta.sacar(200);
        conta.exibir();

        conta.sacar(2000); 
    }
}


