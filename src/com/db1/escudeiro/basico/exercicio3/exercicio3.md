#### Pergunta
Para começarmos desenvolver em Java, precisamos de muito pouco. Basta um editor de texto, uma outra coisinha que você aprendeu na questão de número 2 e um terminal. Crie uma classe Java utilizando um editor qualquer. Esta classe deve ter um método main que imprima a frase “Hello World!”, para começarmos com o pé direito esta aventura de programação. Agora faça uma explanação sobre:

1. O que você precisou para resolver esta questão;
2. O comando que você usou para compilar;
3. O comando que você usou para executar;
4. Qual é a estrutura miníma de uma classe Java;
5. O que é o método main e qual a sua importância;
6. O que é e em que momento da resolução da questão foi gerado o BYTECODE;

#### Resposta
1. Foi necessário um editor de texto, do JDK (Java Development Kit), do terminal, digitar os códigos corretos para criar a classe com o método “main” com a instrução “System.out.printl(‘Hello World!’)” para imprimir a frase “Hello World!”. Depois precisei executar os códigos corretos no terminal para compilar e posteriormente executar o código.

2. Na IDE já tem um compilador que compila “por baixo dos panos”, só é necessário apertar o botão de executar o programa.
Fazendo apenas com editor de texto foi necessário (estando dentro do diretório da classe) digitar “javac helloWorld.class” no terminal.

3. Na IDE é só executar pelo botão da interface ou pelo atalho do teclado.
Fazendo apenas com editor de texto foi necessário (estando dentro do diretório da classe) digitar “java helloWorld.class”

4. Modificador de acesso, a palavra reservada “class”, definição do nome da classe, abertura e fechamento de chaves e a definição dos elementos entre as chaves: atributos, construtores, getters e setters, e métodos

5. Quando o java virtual machine (JVM) inicia, ele procura na sua classe principal por um método muito específico, chamado de método main.
O método main é o método principal do código. Quando executamos um programa é esse método que é chamado. Em outras palavras, sem ele não há programa.
Uma aplicação java obrigatóriamente deverá possuir pelo menos uma classe e um método main. Por regra, todo método main deverá ser: Público, estático, sem retorno(void), com nome de “main”, e deverá receber como argumento um array do tipo String.

6. Bytecode é um formato de código intermediário entre o código fonte que é o “texto” que o programador consegue manipular, e o código de máquina, que é o que o computador consegue executar. Ele é gerado quando o código fonte é compilado, para depois poder ser executado pelo sistema operacional em questão.
