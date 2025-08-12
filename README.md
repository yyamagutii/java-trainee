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
