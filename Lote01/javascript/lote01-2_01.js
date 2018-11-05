vt = new Array(49) 
var x = 0;
var md = 0;
var soma_imp = 0;

for (i=0; i<=49; i++){
    console.log("i: ", i);
    vt[i] = parseFloat(prompt("Insira um Numero"));  
    console.log(vt[i]);
 
    if (vt[i] >=10 && vt[i] <=200){

        x++;
        console.log("X: ", x);
        md = parseFloat(md) + parseFloat(vt[i]);
        console.log("MD:",md);

    }

    if ( vt[i] % 2 == 1){
        soma_imp = soma_imp + vt[i];
        console.log("Soma_imp:",soma_imp);

    }


}
md = md / x;

console.log("Media: ", md);

console.log("Soma dos Impares: ", soma_imp);