package br.com.bb.pps.lista;

import java.util.ArrayList;
import java.util.Scanner;

public class MainII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Trabalho> listaUsuario = new ArrayList<>();

        System.out.println("nome: ");
        String nome = input.nextLine();

        System.out.println("idade: ");
        int idade = input.nextInt();
        input.nextLine();

        System.out.println("Empresa: ");
        String empresa = input.nextLine();

        System.out.println("Função: ");
        String funcao = input.nextLine();

        Usuario lista = new Usuario(nome, idade, empresa, funcao);

        listaUsuario.add(lista);


        // para cada registro de Usuario dentro da lista, faça...
        for (Trabalho item: listaUsuario) {
            //Trazer os dados da subclasse com uns "cast"
            //System.out.println(item);
            System.out.println(item.getEmpresa());
            //verificar se objeto retornado pertence a classe correta
            if(item instanceof Usuario){
                Usuario usuario = (Usuario) item;
                System.out.println(usuario.getNome());
            }
        }

        //listaUsuario.forEach(listaUsuarios -> System.out.println(listaUsuarios));
    }
}
