package br.com.bb.pps.lista;

public class Usuario extends Trabalho{

    private String nome;
    private int idade;


    //CONSTRUTOR CHEIO
    public Usuario(String nome, int idade, String empresa, String funcao) {
        //construtor da superclasse
        super(empresa, funcao);
        this.nome = nome;
        this.idade = idade;
    }

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
        //                                                                     chamando o toString da superclasse
        return "Nome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\n" + super.toString();
    }

}
