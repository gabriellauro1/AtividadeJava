public class Atividade5 {
    
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford", "Mustang", 1970, "AMY5678");
        carro1.exibirInformacoes();

        System.out.println();

        carro1.acelerar(50);
        carro1.exibirInformacoes();

        carro1.frear(10);
        carro1.exibirInformacoes();
    }
    
}
