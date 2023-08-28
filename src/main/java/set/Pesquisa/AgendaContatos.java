package main.java.set.Pesquisa;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111);
        agendaContatos.adicionarContato("Camila DIO", 6455909);
        agendaContatos.adicionarContato("Maria Silva", 1234444);

        agendaContatos.exibirContato();
        agendaContatos.atualizarNumeroContato("Camila DIO", 123457);
        agendaContatos.adicionarContato("Antonio", 1233333);
        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

    }
}