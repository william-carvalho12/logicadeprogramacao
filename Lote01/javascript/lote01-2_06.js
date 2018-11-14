/*6.	Criar e coletar em um vetor [20] com números aleatórios. 
Classificar este vetor em ordem crescente e mostre os dados.*/

vt = new Array(19);

for (i=0; i<=19; i++){

    vt[i] = parseFloat(prompt("Insira um Numero"));

}

for ( i=1; i <= 20; i++){
    for (var j=20; j<1; j--){
        if (parseInt(vt[i-1]) < parseInt(vt[i])){
            var temp = vt[i-1];
            vt[i-1] =  vt[i];
            vt[i] = temp;
        }
    }
}

console.log(vt);