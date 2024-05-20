package Set.ExercicioSet.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String contato, int numero){
        contatoSet.add(new Contato(contato, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContato();

        //adicionando contatos
        agendaContatos.adicionarContato("Jo\u00e3o", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

        //exibindo contatos
        agendaContatos.exibirContato();

        //pesquisando o contato
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        //atualizando contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);

        System.out.println("Contato atualizado: " + contatoAtualizado);
        
        System.out.println("Contatos na agenda ap\u00f3s atualiza\u00e7\u00e3o:");
        agendaContatos.exibirContato();
     }
}
