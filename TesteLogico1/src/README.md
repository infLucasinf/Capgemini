Linguagem: JAVA;

Solução:

Inicio o código solicitando dados do usuário

Aplico uma validação onde o valor digitado pelo usuário for menor ou igual a zero é emitido um erro.

Passando pela validação segue para o próximo bloco onde o primeiro for é usado para inserir uma nova linha ou espaço para baixo de acordo com a quantidade de degraus digitado pelo usuário, considere cada degrau uma linha.

No segundo for é aplicado cálculo interno com o objetivo de criar espaço da esquerda para a direita de acordo com cada degrau acima do degrau base. Ex: 5 é o valor digitado, 5 é o degrau base, o próximo degrau é o quarto, desse em diante é aplicado o espaço da direita para esquerda, desse modo de acordo com o cálculo, cada degrau(linha) recebe uma quantidade de espaço diferente. 

Ex: (quantidade_de_degraus - (quantidade_de_degraus - degrau))
          5                -          (5    -   4)
          5                -                1
                       4
O reultado 4 é a quantidade de espaço a ser inserido, nesse caso, seria onde tem 1 asterisco.                       

No terceiro for enquanto coluna for menor que cálculo interno é inserido asterisco formando o desenho.

Por fim fecho o primeiro for imprimindo espaço, onde esse tem o objetivo de inserir o espaço de cima pra baixo.


