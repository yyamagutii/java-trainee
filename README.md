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
------------------------------------------------------------------------------------------------------------------------
LIST
- é uma variação do ArrayList, é mais comum de ser usada
- List<Objeto> obj = new ArrayList<>();
- LinkedList<>() -> melhora a performance

ArrayList
A principal característica do ArrayList é que ele é baseado em um array dinâmico. Ele armazena os elementos em uma matriz interna e, conforme novos elementos são adicionados, o tamanho da matriz é automaticamente ajustado para acomodar o novo elemento. Da mesma forma, quando um elemento é removido, o tamanho do array é ajustado para evitar o desperdício de espaço. O ArrayList é amplamente utilizado devido à sua facilidade de uso e eficiência em termos de desempenho.

LinkedList
A classe LinkedList fornece uma lista encadeada de elementos. Diferentemente do ArrayList, que é baseado em um array, o LinkedList é baseado em uma lista encadeada, o que significa que cada elemento da lista é um objeto que contém uma referência para o próximo elemento. Isso permite que os elementos sejam adicionados e removidos de maneira eficiente em qualquer posição da lista, mas pode tornar a pesquisa de um elemento específico menos eficiente.

O LinkedList é uma boa escolha quando a inserção e remoção de elementos em qualquer posição da lista é frequente e quando não é necessário acessar os elementos de forma aleatória.

Vector
A classe Vector é semelhante ao ArrayList, mas é sincronizada, o que significa que é segura para uso em threads concorrentes. No entanto, a sincronização adiciona uma sobrecarga de desempenho, então o Vector pode ser mais lento que o ArrayList em algumas situações.

Stack
A classe Stack implementa uma pilha, que é uma coleção ordenada de elementos onde a inserção e remoção de elementos ocorrem sempre no mesmo extremo da lista. Os elementos são adicionados e removidos em uma ordem conhecida como "last-in, first-out" (LIFO), ou seja, o último elemento adicionado é o primeiro a ser removido. A classe Stack é usada com frequência em algoritmos de processamento de texto, bem como em outras situações em que a LIFO é a maneira natural de organizar os dados.

Map
O Map é uma interface que permite que os desenvolvedores associem chaves a valores. É uma estrutura de dados útil para muitas aplicações Java, especialmente aquelas que envolvem a manipulação de grandes quantidades de dados, portanto, é comum usá-lo para realizar buscas, atualização e recuperação de elementos por chaves

Ele é implementado por diversas classes, sendo a mais comum delas o HashMap.

HashMap
O HashMap é uma classe que implementa a interface Map usando uma tabela hash para armazenar os pares chave-valor. Ele é conhecido por sua eficiência em termos de tempo de execução. Essa classe tem uma complexidade de tempo O(1) - constante - para inserção, recuperação e remoção de elementos. Isso significa que o desempenho do HashMap não depende do tamanho da coleção de dados!

No entanto, é importante lembrar que o HashMap não mantém a ordem de inserção dos elementos e não garante a ordem dos elementos na saída. Isso ocorre porque a ordem dos elementos depende da função de hash usada para mapear as chaves para índices na tabela hash. Além disso, o desempenho do HashMap pode ser afetado se houver muitas colisões de hash entre as chaves.
