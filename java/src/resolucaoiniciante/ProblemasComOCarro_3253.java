package resolucaoiniciante;

/*
O centro da cidade de uma cidade universitária nórdica sem nome consiste no que já foi uma cidade medieval com ruas estreitas e sinuosas completamente cercadas por um muro alto que protege a cidade contra 
invasores suecos e outros elementos indesejados. O muro foi removido e substituído por um sistema de estradas interligadas que circunscrevem completamente a parte antiga da cidade. As estradas no interior 
ainda permanecem mais ou menos as mesmas que eram na idade média, o que obviamente entra em conflito com os requisitos modernos de acessibilidade de carro, resultando em um labirinto de pequenas ruas de mão 
única sinuosa, todas iguais, misturadas com levemente ruas de mão dupla mais largas.

Fazer alterações nas rotas de tráfego em tal cidade pode facilmente causar efeitos colaterais inesperados se você não planejar com antecedência. A história conta que um proeminente membro do conselho municipal 
uma vez apresentou uma proposta ao conselho sobre mudanças extensas na forma como o tráfego deveria ser organizado no centro da cidade. A proposta tinha o mérito de ser muito fácil entrar de carro na praça central, 
mas infelizmente também seria impossível sair de novo. O vereador em questão posteriormente se tornou ministro da Justiça do país sob a liberdade condicional de que a sociedade deveria ser mais dura com os criminosos -
 “deveria ser fácil ir para a cadeia, mas difícil sair de novo”.

Para evitar erros como o acima, os planejadores da cidade precisam que você desenvolva uma ferramenta que possa ajudá-los a descobrir quaisquer problemas de tráfego na fase de planejamento. Os planejadores precisam 
ser alertados sobre duas situações diferentes. A primeira situação é que existe uma rua no centro da cidade a partir da qual você não pode alcançar o sistema de estradas circulares circundantes, ou seja, você está 
preso dentro da cidade. A segunda situação é que existe uma rua na cidade que não pode ser alcançada a partir da rede viária envolvente, ou seja, é inacessível.

Entrada
A entrada consiste em uma descrição de como as ruas se conectam umas às outras e ao sistema viário circular circundante. Cada rua (ou segmento de rua) no centro da cidade é representada por um número  inteiro arbitrário 
id > 0 (0 < id < 1000). O sistema rodoviário circular circundante é representado pelo número de id especial 0.

Primeira linha: Um número inteiro que fornece o número de ruas (incluindo o sistema viário circundante, 0 < ruas ≤ 1000).

As seguintes linhas: Uma linha para cada rua (nenhuma ordem particular necessária e o sistema de estradas circunvizinhas está incluído) consistindo de inteiros. Primeiro, um inteiro fornecendo o id da rua. Em segundo lugar, 
o número de (outras) ruas que podem ser alcançadas a partir desta rua. Terceiro, uma sequência de id de ruas indicando quais ruas podem ser alcançadas a partir dessa rua.

Saída
Uma linha para cada rua na qual você ficaria preso dentro da cidade consistindo no texto “TRAPPED X” onde “X” é substituído pelo número de identificação da rua em questão.

Em seguida, uma linha para cada rua dentro da cidade que é inacessível do sistema de vias circunvizinhas consistindo no texto ““UNREACHABLE X” onde X deve ser substituído pelo código da rua em questão.

Se nenhum problema for encontrado, ou seja, você não está preso em nenhuma rua e todas as ruas estão acessíveis, você deve imprimir uma única linha contendo o texto “NO PROBLEMS”.

Se várias ruas fizerem com que você fique preso - ou ficar inacessível - você deve listá-las na mesma ordem em que foram inseridas na entrada (dentro da respectiva categoria).
 */

public class ProblemasComOCarro_3253 {

}
