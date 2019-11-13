## Pergunta
No mundo Java existe uma sopa de letrinhas e siglas, mas algumas são fundamentais para o entendimento do propósito da linguagem. Vamos, então, aprender um pouco mais sobre a plataforma. Pesquise sobre:

- JVM
- JDK
- JRE

Pontue o que cada palavra significa, onde e quando usamos e qual a importância de cada uma delas.

## Resposta

* ##### JVM
JVM - Java Virtual Machine (Máquina Virtual Java)
Uma máquina virtual é um software que simula uma máquina física e consegue executar vários programas, gerenciar processos, memórias e arquivos. Ou seja, é uma plataforma onde a memória, o processador e seus outros recursos, são totalmente virtuais, não dependendo de hardware. 
A Java Virtual Machine é a máquina virtual do Java, responsável pelas características de portabilidade dos códigos, ela mantém a independência entre as plataformas da linguagem.

Em uma linguagem como a C, o código é compilado para uma máquina específica, ou seja, quando código fonte é compilado e transformado em um código executável, este executável só poderá ser executado no sistema operacional para qual o código fonte foi compilado. Para executar este mesmo código em outro sistema operacional é necessário fazer ajustes de acordo com as necessidades e recompilar.
O Java já não tem esse problema, pois sua execução não está diretamente relacionada com o sistema operacional, ele conversa diretamente com a JVM (Java Virtual Machine), o que possibilita a portabilidade do código. O código escrito em um sistema operacional irá rodar nos outros sistemas operacionais (salvo algumas exceções de código nativo). Isso cria uma independência do sistema operacional, assim o desenvolvedor pode desenvolver para múltiplas plataformas sem a preocupação de fazer mudanças em seu código para cada sistema operacional.
A JVM não entende código Java e sim um código específico chamado ByteCode, que é gerado pelo compilador Java, o “javac”. Esse código que é traduzido pelo JVM para o código que funcionará em cada sistema operacional em questão.

Graças à máquina virtual Java, os programas desenvolvidos em Java podem funcionar em qualquer plataforma de hardware e software que possua uma versão da JVM, tornando assim essas aplicações independentes da plataforma onde funcionam.

* ##### JDK
JDK, abreviação de Java Development Kit (Kit de Desenvolvimento Java), é uma ferramenta que tem a finalidade de distribuir todos os recursos necessários para se desenvolver uma aplicação Java. É composto pelo compilador e pelas bibliotecas necessárias para criação de programa em Java e ferramentas úteis para o desenvolvimento e testes dos programas escritos por esta linguagem de programação (isso inclui a JVM e o JRE).

Esta ferramenta é utilizada por quem quer desenvolver na linguagem Java. O JDK dispõe um arquivo executável que faz todo o trabalho de instalação e configuração do ambiente, o que facilita ainda mais a execução de qualquer aplicação Java e criação de programas de forma mais simplificada, diminuindo os esforços do desenvolvedor.

O JDK disponibiliza todo o ambiente necessário para a criação e execução de aplicações desenvolvidas em Java.

* ##### JRE

JRE, Java Runtime Enviroment (Ambiente de Execução Java), é o ambiente de tempo de execução Java. É composto por bibliotecas e pela Máquina Virtual Java (JVM).

O JRE é necessário para executar aplicações Java, então ele é utilizado por qualquer pessoa que deseja executar algum programa ou jogo desenvolvido em linguagem Java. Normalmente destinado a usuários finais.

Todas as máquinas que rodam uma aplicação Java precisam desse runtime, pois é onde a JVM estará contida, e como já comentado anteriormente, irá fazer todo o controle das aplicações Java. O Java Runtime atua como um interpretador, ele carrega o “bytecodes” da aplicação compilada em Java, interpreta esse código para a arquitetura do computador que está sendo usado e depois executa a aplicação. Ele também é responsável pelo gerenciamento dos aplicativos, à medida que são executados.
