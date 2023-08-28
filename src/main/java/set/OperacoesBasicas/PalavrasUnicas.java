package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class PalavrasUnicas {
    //atributos
    private String palavra;

    public PalavrasUnicas(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PalavrasUnicas that)) return false;
        return getPalavra().equals(that.getPalavra());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavra());
    }

    @Override
    public String toString() {
        return "PalavrasUnicas{" +
                "palavra='" + palavra + '\'' +
                '}';
    }
}
