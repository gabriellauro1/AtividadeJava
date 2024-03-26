public class Jogador {
    
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacaoInicial, int nivelInicial){
        this.nome = nome;
        this.pontuacao = pontuacaoInicial;
        this.nivel = nivelInicial;
    }

    public void aumentarPontuacao(int valor){
        if (valor > 0)
        {
            pontuacao += valor;
            System.out.println("Pontuação aumentada em " + valor + ".");
        }else
        {
            System.out.println("Valor de pontuação inválido.");
        }
    }

    public void subirNivel(){
        nivel++;
        System.out.println("Jogador subiu para o nível " + nivel + ".");
    }

    public void exibirInformacoes(){
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
}