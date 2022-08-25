package br.unigran.listacompras;

public class Produtos {
    private String nome;
    private String marca;
    private String quatidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getQuatidade() {
        return quatidade;
    }

    public void setQuatidade(String quatidade) {
        this.quatidade = quatidade;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", quatidade='" + quatidade + '\'' +
                '}';
    }
}
