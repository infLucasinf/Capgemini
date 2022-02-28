Linguagem: JAVA;

Instruções: 

Use apenas a primeira String (anagrama1) para fazer o teste das substrings, a segunda String(anagrama2)é usado apenas para testar
se é anagrama ou não embaralhando as letras;

Solução: 

Inicio o código com duas Strings (anagrama1 e anagrama2) definidas, através dessas Strings aplico teste para saber se é anagrama ou não. 

Para o teste crio dois vetores de char onde esses recebem as duas Strings transformadas em caracteres pelo método ToChaArray(); logo após aplico a ordenação através do Arrays.sort, tornando assim duas String distintas em ordens iguais, caso as duas strings tenham palavras diferentes porém usando as mesmas letras é aprovado no teste por isso a ordenação.

Efetuo o teste comparando através do if e do método equals(); os Arrays de cada String, se iguais é aprovado e segue para o próximo bloco do código.

No último bloco do código verifico apenas a primeira String (anagrama1) através do <for (i)>  percorrendo toda a String, logo após aplico novo <for (j)> que percorre o que o <for i> já percorreu mais 1, ainda dentro do laço do segundo <for (j)> crio variável substring para extrair da String (anagrama1) as substrings através do método substring();, onde é inserido por parametro (i,j) o resultado da "varredura" do <for i> e do <for j>.

Por fim para pegar a quantidade de substrings coloco um contador (i++) e imprimo ele fora dos laços for's, fecho as chaves e encerro o código. 
