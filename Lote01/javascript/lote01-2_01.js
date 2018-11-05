vt = new Array(49) 
for (i=0; i<=49; i++){

    vt[i] = parseInt(prompt("Insira um Numero")); 

    if (vt[i] >=10 && vt[i] <=200){

        var x++;
        var md=md+vt[i];

    }

    if (vt[i] % 2 == 1){
        var soma_imp = soma_imp+vt[i];
    }


}
var md = md / x;
console.log(md);
console.log(soma_imp);

