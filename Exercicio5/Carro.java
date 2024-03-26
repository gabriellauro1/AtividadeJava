public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int incrementoVelocidade){
        if (incrementoVelocidade > 0)
        {
            velocidadeAtual += incrementoVelocidade;
            System.out.println("Carro acelerou para " + velocidadeAtual + " km/h.");
        }else
        {
            System.out.println("Incremento de velocidade inválido.");
        }
    }

    public void frear(int decrementoVelocidade) {
        if (decrementoVelocidade > 0 && decrementoVelocidade <= velocidadeAtual)
        {
            velocidadeAtual -= decrementoVelocidade;
            System.out.println("Carro reduziu a velocidade para " + velocidadeAtual + " km/h.");
        }else
        {
            System.out.println("Decremento de velocidade inválido.");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }

}
