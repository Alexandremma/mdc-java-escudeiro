[Ir para o menu](https://github.com/Alexandremma/mdc-java-escudeiro)

## Pergunta
O Java possui vários tipos de dados primitivos para resolvermos diversos problemas e, para cada tipo primitivo, existe uma classe WRAPPER. Pontue:

1. Diferença entre os tipos primitivos e as classes Wrapper;
2. Quais são os tipos primitivos e suas classes Wrapper;
3. Qual o valor default de cada tipo primitivo e de cada classe Wrapper;
4. Como consigo converter cada tipo primitivo em uma classe Wrapper e como consigo converter cada classe Wrapper em um tipo primitivo;
5. Um exemplo de utilização de cada tipo durante o desenvolvimento de software.

## Resposta
1. Uma aplicação pode manipular valores de naturezas distintas tais como caracteres, inteiros e reais. O uso pretendido de uma variável deve ser declarado para orientar o compilador no processo de análise sintática do "código fonte”. A declaração de uso pretendido se dá através da definição de um tipo para cada identificador utilizado para representar um valor. Um tipo caracteriza o universo de valores válidos que podem ser associados a identificadores definidos como sendo do tipo em questão. Tais tipos são chamados de tipos primitivos.

    As classes Wrappers tem o papel de empacotar os tipos primitivos em objetos correspondentes ao tipo. Quando você declara um valor em uma classe Wrapper, você está criando um objeto, permitindo assim, através de métodos disponibilizados pelo objeto, a realização de operações como conversão entre tipos, mudanças de base numérica e trabalhar com coleções (o que só é permitido com objetos). Basicamente, classe Wrapper é uma classe que possui um atributo de um tipo primitivo correspondente, o que permite realizar operações básicas com esse valor.
    
    ###### Diferenças
    - A declaração de um tipo primitivo é uma variável, já uma declaração wrapper é um objeto. O objeto pode ou não assumir uma referência, uma posição em memória;
    - Por ser um objeto, uma declaração com classe Wrapper já tem métodos que podem ser utilizados, como métodos de conversão por exemplo;
    - Tipos primitivos são digitados em letras minúsculas, já as classes Wrappers tem sua primeira letra maiúscula;
    - A declaração de um tipo primitivo e de uma classe Wrapper é diferente: uma classe Wrapper deve ser inicializado da mesma forma que um novo objeto, já o tipo primitivo não.
    
        Ex: Tipo Primitivo: int número = 10;
            Classe Wrapper: Integer número = new Integer(10);

2.

3. Dos tipos primitivos: os numéricos são sempre inicializados em Zero, os booleans com false e o char é inicializado com vazio.
   - byte: 0
   - short: 0
   - int: 0
   - long: 0
   - float: 0.0
   - double: 0.0
   - boolean: false
   - char: vazio, equivalente a 0
   
   Os tipos de referência são todos inicializados com null.

4. 
5. Resposta em código no arquivo TiposDeDados.java(COLOCAR LINK PARA O ARQUIVO) deste mesmo pacote (exercicio1).