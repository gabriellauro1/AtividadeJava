public class Atividade4 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Neymar", 100, 100);
        jogador1.exibirInformacoes();

        System.out.println();

        jogador1.aumentarPontuacao(100);
        jogador1.exibirInformacoes();

        jogador1.subirNivel();
        jogador1.exibirInformacoes();
    }
}
