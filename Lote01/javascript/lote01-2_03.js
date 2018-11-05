/*3.    Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. 
ex:
VT1|    1|    2|    3|    |
VT2|    4|    5|    6|    |
VT3|    1|    2|    3|    4|    5|    6
*/

vt1 = new Array(2);
vt2 = new Array(2);
vt3 = new Array(5);

for (i=0; i<=5; i++){
    if (i < 3){
        vt1[i] = parseFloat(prompt("Insira um numero"));
    }else{
        vt2[i -3] = parseFloat(prompt("Insira um numero"));        
    }
}

for (i=0; i<=5; i++){
    if (i < 3) {
        vt3[i] = vt1[i];
    }else{
        vt3[i] = vt2[i - 3]
    }
}

console.log("VT3:", vt3);
