/*4.    Criar e coletar em um vetor [30] real e calcular e exibir:
a.    A média do grupo;
b.    A quantidade de notas acima do grupo;
c.    As posições dos valores abaixo da média do grupo.*/

vt = new Array(29);
var media = 0;
var maiores = 0;
var menores = 0;

for (i=0; i<=29; i++){
    vt[i] = parseFloat(prompt("Insira a nota do aluno: "));
    media = media + vt[i];
}
media = media / 30

for (i=0; i<=29; i++){
    if (vt[i] < media){
        menores++
    }else{
        maiores++
    }
}

console.log("Media", media);
console.log("Acima da Media", maiores);
console.log("Abaixo da Media", menores);