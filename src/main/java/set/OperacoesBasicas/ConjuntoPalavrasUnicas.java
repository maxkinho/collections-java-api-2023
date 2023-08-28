package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<PalavrasUnicas> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(new PalavrasUnicas(palavra));
    }

    public void removerPalavra(String palavra){
        PalavrasUnicas palavrasUnicasParaRemover = null;
        for (PalavrasUnicas p: palavrasSet) {
            if (p.getPalavra() == palavra) {
                palavrasUnicasParaRemover = p;
                break;
            }
        }
        palavrasSet.remove(palavrasUnicasParaRemover);
    }

    public int contarPalavras() {
        return palavrasSet.size();
    }

    public void exibirpalavras() {
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavraUnicas = new ConjuntoPalavrasUnicas();
        System.out.println(conjuntoPalavraUnicas.contarPalavras());

        conjuntoPalavraUnicas.adicionarPalavra("aula");
        conjuntoPalavraUnicas.adicionarPalavra("salvar");
        conjuntoPalavraUnicas.adicionarPalavra("retorna");
        conjuntoPalavraUnicas.adicionarPalavra("pulo");
        conjuntoPalavraUnicas.adicionarPalavra("aula");

        conjuntoPalavraUnicas.exibirpalavras();

        System.out.println(conjuntoPalavraUnicas.contarPalavras());
        conjuntoPalavraUnicas.removerPalavra("pulo");

        conjuntoPalavraUnicas.exibirpalavras();
    }
}
