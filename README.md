DOC JAVA -> https://docs.oracle.com/en/java/
------------------------------------------------------------------------------------------------------------------------
DECLARAR VARIÁVEIS COM VAR
 
 - a partir do java 10 é possível declarar variáveis usar a palavra chave "VAR", ela faz com que o compilador infira
    automaticamente o tipo da variável de acordo com o valor atribuito a ela

    var nomeVariavel = valorInicial
    var nome = "Lucas" -> essa variável será interpreta como String

 - com VAR o tipo da variável precisa ser inferido automaticamente, por tanto é obrigatório que essas variáveis tenham
    um valor inicial
------------------------------------------------------------------------------------------------------------------------
 ARRAYS
 
 - são estruturas de dados que permitem armazenar uma coleção de dados do mesmo tipo
 - um array comum deve ter seu tipo e tamano defidos

  tipo em array          tamanho
    int[] numeros = new int[5]

 - o indice começa em zero (0)
 - também pode-se criar arrays de objetos, assim ele armazenara os dados referentes a um objeto
 - arrays não possuem métodos que falicitam um "CRUD", por isso existem classes Java, como o ArrayList, que encapsulam
    e abstraem um arrays, adicionando métodos em uma estrutura de array
------------------------------------------------------------------------------------------------------------------------
OBJECT

- todo objeto em java possui uma serie de métodos prontos que podemos usar, como o toString
------------------------------------------------------------------------------------------------------------------------
CONSTRUTOR

- um construtor é um método especial usado para criar e inicializar um objeto recém-criado, usados para popular um objeto
- por padrão o java cria um construtor vazio/default, que permite que o objeto simplesmente não receba nada
- podemos criar o construturo cheio, que torna obrigatória o recebimento de dados no objeto
- quando um construtor cheio é criado e o vazio não, a classe não possui o vazio, o que torna obrigatória o recebimento de todos os dados
- não é uma boa pratica criar todos os gets e sets, deve-se cria-los quando se sabe se algo pode ser alterado, inserido e tudo mais
- é um recurso para encapsular objetos
- o tipo do array pode ser uma superclasse, assim o array irá englobar todas as subclasses que extendem ela
------------------------------------------------------------------------------------------------------------------------
FOR-EACH

- permite que se percorra todos os elementos de uma lista, sem a necessidade de se preocupar com índices ou o tamanho dela, tornando o código mais simples e legível
- percorre todos os elementos da lista e os atribui a uma variável que será usada para alguma operação
- útil em situação que não há a necessidade de realizar nenhuma operação complexa sobre os elementos da lista
- possibilita a iteração sobre os elementos da lista de forma mais concisa e elegante
  ArrayList<Trabalho> listaUsuario = new ArrayList<>();
  nomes.forEach(nome -> System.out.println(nome));
------------------------------------------------------------------------------------------------------------------------
VARIAVEIS DE REFERENCIAS
- formas de fazer referencia a um objeto
