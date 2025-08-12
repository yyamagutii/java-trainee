package br.com.bb.pps.lista;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Trabalho> listaUsuario = new ArrayList<>();

        int qtdNome;
        System.out.print("Quantos usuarios deseja incluir: ");
        qtdNome = input.nextInt();
        input.nextLine();

        for(int i = 1; i <= qtdNome; i++) {

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
        }
        /*
        // para cada registro de Usuario dentro da lista, faça...
        for (Trabalho item: listaUsuario) {
            //Trazer os dados da subclasse com uns "cast"
            System.out.println(item);
            System.out.println(item.getEmpresa());
            //verificar se objeto retornado pertence a classe correta
            if(item instanceof Usuario){
                Usuario usuario = (Usuario) item;
                System.out.println(usuario.getNome());
            }
        }
        listaUsuario.forEach(listaUsuarios -> System.out.println(listaUsuarios));
        */
        /*
        Collections.sort(listaUsuario);
        System.out.println("ordem alfabetica pela empresa: ");
        System.out.println(listaUsuario);
        */

        //outra forma de comparação por alfabeto
        //dispensa a necessidade de implementar a interface nas classes
        listaUsuario.sort(Comparator.comparing(Trabalho::getEmpresa));
        System.out.println(listaUsuario);


    }
}
