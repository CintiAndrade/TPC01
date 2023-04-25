# TPC01
Esse jogo oriundo de Cabo-Verde é chamada de Frikfrak
Para fazer esse jogo usei a parte consola e a gráfica
A parte gráfica usarei para desenhar o tabuleiro
Mostrar as mensagem na tela 
Imagem das peças e a parte consola será estritamente usada para os códigos
As  regras  do jogo são:
1º O tabuleiro deve ter 3 linha e 3 colunas
Para isso criei um tab do tipo tabuleiro com 3 linhas e 3 colunas
2ºTer 2 jogadores, jogando na sua vez
Criei o metodo ValidarJogada 
Com o cliclo for de linha e coluna até 3
Se nosso tabuleiro estiver vazio a rodada é zero
terá o incremento da rodada quando o jogador 1 com a peca X jogar
Quando isso contece ele ficará apenas com 2 peça para jogar
Na tela será emitida uma mensagem que lhe resta apenas 2 peças
e após isso será verificado se ele venceu e uma mensagem que ele ganhou será emitida e será fim do jogo
caso contrario será a vez do segundo jogador com as mesmas segras do primeiro ate ter um vencedor
3ºCada jogador deve ter 3 peça,
Para isso criei o um metodo que não retorna nada com a inicialização dessas peças
4º Quando o tabuleiro estiver prenchido com 6 peças e tiver vencedor
 Para isso criei o metodo bolleano imprimirVencedor que recebe uma peça do tipo inteiro
Para essa validação se uma peça for jogada como por exemplo na linha e coluna 0 elinha 0 e coluna 1 e linha 0 e coluna 2 teramos um vencedor e assim sucessivamento seja elas na horizontal vertical ou na diagonal
5º Enão tiver um vencedor as peças deveram ser movidas
Para mover essa peça criei um metodo mover do tipo boolean
Se o jogador 1 ou 2 tiver a sua peça no tabuleiro e que remover terá de seguir a regra 
Como por exemplo se a bola tiver na linha 0 e coluna 0 esse jogador so poderá mover para linha 0 e coluna 1, linha 1 e coluna 0 ou linha e coluna 1 após mover por um desses essa peça será removida de origem
