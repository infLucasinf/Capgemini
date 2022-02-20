Linguagem: JAVA;


Inicio o código inserindo orientações e solicitando dados do usuário. 

Já no primeiro if aplico a lógica do código onde pego o tamanho (length) da senha digitada e verifico se ela é menor que 6, se sim,
vai para a próxima comparação que é o cálculo, onde diminuo o tamanho da String por 6, o resultado é a quantidade de caracter(es) que
falta(m), após a subtração multiplico por -1 para o resultado ser impresso posito e também acrescento diferente de 1 porque se faltar 
apenas 1 caracter a leitura vai para o próximo if para fazer impressão do texto correta, sem ser no plural.

Feito isso, aplico validação extra para verificar se as senhas estão iguais usando o método equals();, se estiver igual o usuário é
informado que a senha foi cadastrada.
