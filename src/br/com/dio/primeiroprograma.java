package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroprograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro Livro1 = new Livro("O problema dos 3 corpos",300);
        System.out.println(Livro1);




        /*int a = 5;
        int b = 3;
        System.out.println("Hello World" + (a+b));*/
    }
}

class Livro {
    private string nome;
    private integer numpaginas;

    public Livro(string nome, integer numpaginas) {
        this.nome = nome;
        this.numpaginas = numpaginas;
    }

    public string getNome() {
        return nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }

    public integer getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(integer numpaginas) {
        this.numpaginas = numpaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome=" + nome +
                ", numpaginas=" + numpaginas +
                '}';
    }
}
