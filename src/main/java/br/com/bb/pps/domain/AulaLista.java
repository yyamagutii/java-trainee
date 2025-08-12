package br.com.bb.pps.domain;

public class AulaLista {

    private String nome;
    private int idade;


    //CONSTRUTOR CHEIO
    public AulaLista(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //CONSTRUTOR VAZIO
    public AulaLista(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //sobreescrever o métodos toString()
    @Override
    //toString() -> é uma metodo que retornar uma representação do objeto como string
    public String toString(){
        return "Nome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\n";
    }
}
