/*2.    Criar e coletar um vetor[99] inteiro e exibir:
a.    O maior e o menor valor;
b.    A média dos valores.*/

vt = new Array(99);
var soma = 0;

for (i=0; i<=99; i++){

    vt[i] = parseFloat(prompt("Insira um Numero"));
    soma = soma + vt[i];

}

for ( i=1; i <= 100; i++){
    for (var j=100; j<1; j--){
        if (parseInt(vt[i-1]) < parseInt(vt[i])){
            var temp = vt[i-1];
            vt[i-1] =  vt[i];
            vt[i] = temp;
        }
    }
}

var media = soma /100;
console.log("Media: ", media);
console.log("Menor: ", vt[0]);
console.log("Maior: ", vt[9]);