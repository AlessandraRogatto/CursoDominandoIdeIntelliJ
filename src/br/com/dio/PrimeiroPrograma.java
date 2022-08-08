package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro2 = new Livro( "As Crônicas de gelo e fogo",3500);
        System.out.println(livro2);

/*        int a = 5;
        int b = 10;

        System.out.println("Hello world! " + (a+b));*/



    }
}

class Livro{
    private String nome;
    private Integer numpg;

    public Livro(String nome, Integer numpg) {
        this.nome = nome;
        this.numpg = numpg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpg() {
        return numpg;
    }

    public void setNumpg(Integer numpg) {
        this.numpg = numpg;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpg=" + numpg +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(numpg, livro.numpg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numpg);
    }
}
