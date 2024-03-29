import java.util.ArrayList;
import java.util.List;

class Contato{
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String nome(){
        return nome;
    }

    public String telefone(){
        return telefone;
    }
}

class Agenda{
    private List<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato){
        contatos.add(contato);
    }

    public Contato buscarContatoPorNome(String nome){
        for (Contato contato : contatos){
            if (contato.nome().equalsIgnoreCase(nome))
            {
                return contato;
            }
        }
        return null;
    }
}

