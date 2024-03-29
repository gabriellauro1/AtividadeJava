public class Main {
    public static void main(String[] args) {

        Contato contato1 = new Contato("João", "123456789");
        Contato contato2 = new Contato("Maria", "987654321");

        Agenda agenda = new Agenda();
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        String nomeBusca = "Maria";
        Contato contatoEncontrado = agenda.buscarContatoPorNome(nomeBusca);

        if (contatoEncontrado != null)
        {
            System.out.println("Contato encontrado: " + contatoEncontrado.nome() + ", Telefone: " + contatoEncontrado.telefone());
        }else
        {
            System.out.println("Contato com o nome " + nomeBusca + " não encontrado.");
        }
    }
}