/*6.	Criar e coletar em um vetor [20] com números aleatórios. 
Classificar este vetor em ordem crescente e mostre os dados.*/

vt = new Array(19);

for (i=0; i<=19; i++){

    vt[i] = parseDouble(prompt("Insira um Numero"));

}

for (i = 0; i < 19; i++){
    for (var j = i + 1; j <= 19; j++){
        if (parseDouble(vt[j]) < parseDouble(vt[i])){
           var temp = vt[i];
            vt[i] =  vt[j];
            vt[j] = temp ;
        }
    }
}

console.log(vt);