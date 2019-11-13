## Pergunta
Pesquise sobre Garbage Collector e faça uma explanação de como este algoritmo funciona na plataforma Java. Também implemente dois algoritmos em Java: um que exemplifique um possível erro de OutOfMemoryError e outro que mostre os cuidados tomados para não acontecer este tipo de erro durante o desenvolvimento de software.

## Resposta
Em Java, o gerenciamento de memória acontece de maneira automática. O Garbage Collector (GC) é o responsável por realizar de maneira automática esse gerenciamento que tem a finalidade de evitar os problemas de desalocação explícita dos espaços ocupados por objetos não mais referenciados.

A técnica do Garbage Collector consiste na recuperação segura do espaço de memória ocupado por um objeto que não é mais referenciado dentro de uma aplicação.

Esta maneira de gerenciar o espaço também resolve o problema do ‘vazamento de memória’ (quando um objeto deixa de ser referenciado e sua memória não é liberada), visto que toda memória não mais referenciada é liberada automaticamente.

Diz-se que um objeto X referenciado por x torna-se lixo quando x passa a se referir a outro objeto ou a null. São esses objetos, denominados lixo, que precisam ser localizados e ter seu espaço de memória desalocado no processo denominado Garbage Collection.

Garbage Collector é o recurso responsável por realizar o desalocamento da memória. 

Garbage Collection é o processo realizado pelo Garbage Collector que realiza a desalocação.

Em geral, quando não há interferência do programador, a máquina virtual executa o Coletor de Lixo quando percebe que a memória está ficando sem espaço. De qualquer maneira, pode ser que uma aplicação encerre sua execução sem que o Garbage Collector seja executado uma única vez. Assim, quando um objeto deixa de ser referenciado, o espaço de memória ocupado por ele não é imediatamente desalocado. O lixo se torna qualificado para a coleta de lixo, podendo então ser desalocado na próxima execução do GC (Garbage Collector).

Um Garbage Collector tem a função de:
* Alocar memória;
* Assegurar que quaisquer objetos referenciados permaneçam na memória;
* Recuperar a memória alocada pelos objetos que não são mais alcançáveis pelas referências no código em execução.