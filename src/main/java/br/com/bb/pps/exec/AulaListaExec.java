package br.com.bb.pps.exec;

import br.com.bb.pps.domain.AulaLista;
import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class AulaListaExec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //CRIAÇÃO DE UM ARRAYLIST
        ArrayList<AulaLista> listaUsuario = new ArrayList<>();

        int qtdNome = 2;

        for(int i = 1; i <= qtdNome; i++){

            System.out.println("nome: ");
            String nome = input.nextLine();

            System.out.println("idade: ");
            int idade = input.nextInt();
            input.nextLine();

            AulaLista lista = new AulaLista(nome, idade);

            //ADICIONANDO ELEMENTOS AO ARRAY
            listaUsuario.add(lista);
        }

        //IMPRIMIR TODA A LISTA
        System.out.println(listaUsuario + "\n -------------------");
        //IMPRIMIR O TAMANHO DA LISTA
        System.out.println("tamanho da lista: " + listaUsuario.size() + "\n -------------------");
        //IMPRIMIR UM REGISTRO INTEIRO POR INDICE
        System.out.println("registro 1: \n" + listaUsuario.get(0) + "\n -------------------");
        //IMPRIMIR O PRIMEIRO NOME INDICE DA LISTA
        System.out.println("primeiro usuario: \n" + listaUsuario.get(0).getNome() + "\n -------------------");
        //IMPRIMIR A SEGUNDA IDADE POR INDICE
        System.out.println("segunda idade: \n" + listaUsuario.get(1).getIdade() + "\n -------------------");

    }

}
