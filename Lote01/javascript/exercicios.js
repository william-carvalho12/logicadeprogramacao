//1. Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.

function lote1_01() {

    var Lado = parseInt(prompt("Digite a medida do lado: "));
    var Area = (Lado^2);

    alert("Area:" + Area);
    
    return 0;
}

//2. Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
function lote1_02() {

    var Salario = parseInt(prompt("Digite o salario: "));
    var Area = (Lado^2);
 
    Salario = Salario * 1.15;
    
    alert("Salario:" + Salario);

    return 0;
}

//3. Receba a base e a altura de um triângulo. Calcule e mostre sua área.
function lote1_03() {

    var Base = parseInt(prompt("Digite o valor da base: "));
    var Altura = parseInt(prompt("Digite o valor da altura: "));

    Area = (Base * Altura) / 2;
    alert("Area:" + Area);

    return 0;
}

//4. Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
function lote1_04() {
    var c = 0;
    var f = 0;

    var c = parseInt(prompt("Digite o temperatura em Celsius: "));
    F = (9*C + 160) / 5
    alert("Valor em Fahreheit: " + f)

    return 0;
}

//5.	Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
function lote1_05() {

    var a = parseInt(prompt("Digite A: "));
    var b = parseInt(prompt("Digite B: "));
    var c = parseInt(prompt("Digite C: "));
    var Delta = (b^2) - 4*a*c
    var R1 = (-b + delta^(1/2)) / (2*a);
    var R2 = (-b - delta^(1/2)) / (2*a);
    
    alert("x1 = " + R1 + "e x2 = " + R2);

    return 0;
}

//6.	Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
function lote1_06(){

    var x = parseInt(prompt("Digite X: "));
    var y = parseInt(prompt("Digite Y: "));

    var t1 = x;
    x = y;
    y = t1;
    alert(x + " , " + y);

    return 0;
}

//7.	Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
function lote1_07(){
    var comp = parseInt(prompt("Digite o comprimento: "));
    var largura = parseInt(prompt("Digite a largura: "));
    var h = parseInt(prompt("Digite altura: "));

    var Volume =  comp * largura * h;
    alert("Volume:" + Volume);

    return 0;
}

//8.	Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
function lote1_08(){
    var dep = parseInt(prompt("Digite o valor do deposito: "));
    var valorf = dep*1.013;

    alert("Valor Final" + valorf)

}

//9.	Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
function lote1_09(){
    var n1 = parseInt(prompt("Digite a N1: "));
    var n2 = parseInt(prompt("Digite a N2: "));

    var R = (N1^2) + (N2^2);

    alert("Soma dos Quadrados: " + R);

    return 0;
}

//10.	Receba 2 números reais. Calcule e mostre a diferença desses valores.
function lote1_10(){
    var x = parseInt(prompt("Digite o valor 1: "));
    var y = parseInt(prompt("Digite o valor 2: "));

    var r = x - y

    alert("Diferença" + R)

    return 0;
}

//11.	Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
function lote1_11(){
    var r = parseInt(prompt("Raio: "));

    var c = 2*3,14*r
    alert("Comprimento: " + c)

    return 0;
}

//12.	Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
function lote1_12(){
    var Anon = parseInt(prompt("Ano de Nascimento: "));
    var Anoa = parseInt(prompt("Ano atual: "));

    var Ia = AnoA - AnoN;
    var If = Ia + 17;

    alert("Idade: " + Ia);
    alert("Idade em 17 anos: " + If);

    return 0;
}

//13.	Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
function lote1_13(){
    var akg = parseInt(prompt("Kilos de alimento: "));

    var dias = akg / 0.05

    alert("A duração do alimento sera de: " + dias + " dias.");
    
    return 0;
}

//14.	Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
function lote1_14(){
    var a1 = parseInt(prompt("Angulo 1: "));
    var a2 = parseInt(prompt("Angulo 2: "));

    var ax = 100 - a1 - a2;

    alert("Terceiro angulo: " + ax)

    return 0;
}

//15.	Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
function lote1_15(){
    var c1 = parseInt(prompt("Cateto 1: "));
    var c2 = parseInt(prompt("Cateto 2: "));

    var h = ((c1^2) + (c2^2)) ^ (1/2);
    alert("Hipotenusa: " + h);

    return 0;

}

/*16.	Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes.Calcule o salário que serão as horas trabalhadas
 x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.*/
function lote1_16(){
    var ht = parseInt(prompt("Horas Trabalhadas: "));
    var vph = parseInt(prompt("Valor por hora: "));
    var PD = parseInt(prompt("Percentual de desconto: "));
    var nd = parseInt(prompt("Numero de dependentes: "));


    var sB = hT * vPH;
    var sL = (sB * (1-(pD/100))) + (100*nD);
    
    alert("Salario a receber: R$" + SL);
}

//17.	Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
function lote1_17(){
    var t = parseInt(prompt("Tempo de percurso: "));
    var vm = parseInt(prompt("Velocidade média: "));

    var s = vm * t
    var lg = s/12

    alert("Litros gastos " + lg);
}

//18.	Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
function lote1_18(){
    var x = parseInt(prompt("Valor 1: "));
    var y = parseInt(prompt("Valor 2: "));
    var df = 0;
    
    if (x >=y){
        df = x - y;
    }
    else{
        df y - x;
    }

    alert(df)
}

//19.	Receba 2 valores reais. Calcule e mostre o maior deles.

Algoritmo Lot01_Dec19
Declarar
    x,y:NUM;
Inicio
    Ler x, y;
    Se (x>= y) então
        Mostra x;
    Senão
        Mostra y;
    Fim-Se
Fim

//20.	Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.

Algorítmo Lot01_Dec20
Declarar
    a, b ,c, delta, r1, r2:num;
Inicio
    Ler a, b, c;
    delta = (b^2) - 4*a*c;
    Se (delta >= 0) então
        r1 = (-b + delta^(1/2)) / (2*a);
        r2 = (-b - delta^(1/2)) / (2*a);
        Mostra "As raízes reais são: " + r1 + " e " + r2;
    Senão
        Mostra "Não existem raízes reais."
    Fim-Se
Fim

/*21.	Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
a.	Se a média for >= 6,0 exibir “APROVADO”;
b.	Se a média for >= 3,0 e < 6,0 exibir “EXAME”;
c.	Se a média for < 3,0 exibir “RETIDO”.*/

Algorítmo Lot01_Dec21
Declarar
    n1, n2, n3, n4, mA:Num;
Inicio
    Ler n1, n2, n3, n4;
    mA = (n1 + n2 + n3 + n4) / 4;
    Se (mA>=6) então
        Mostra "APROVADO";
    Senão
        Se (mA>=3) então
            Mostra "EXAME";
        Senão
            Mostra "RETIDO";
        Fim-Se
    Fim-Se
Fim

//22.	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.

Algorítmo Lot01_Dec22
Declarar
    x, y:Int;
Inicio
    Ler x, y;
    Se(x>y) então
        Mostra y, x;
    Senão
        Mostra x, y;
    Fim-se
Fim

//23.	Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.

Algoritmo  Lot01_Dec23
Declarar
    a, b, c, x:Num;
Inicio
    Ler a, b, c, x;
    Se(x<=a) então
        Mostra x, a, b, c;
    Senão
        Se(x<=b) então
            Mostra a, x, b, c;
        Senão
            Se(x<=c) então
                Mostra a, b, x ,c;
            Senão
                Mostra a, b, c, x;
            Fim-Se
        Fim-Se
    Fim-Se
Fim

//24.	Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.

Algorítmo Lot01_Dec24
Declarar
    x, r2, r3:Int;
Inicio
    Ler x;
    r2 = x % 2;
    r3 = x % 3;
    Se (r2 == 0 && r3 == 0) então
        Mostra "Divisível por 2 e 3.";
    Senão
        Se(r2 == 0) então
            Mostra "Divisível apenas por 2.";
        Senão
            Se (r3 == 0) então
                Mostra "Divisível apenas por 3.";
            Senão
                Mostra "Não divisível por 2 nem 3.";
            Fim-Se
        Fim-Se
    Fim-Se
Fim

/*25.	Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, sabendo que o tempo máximo é menor que 24 horas e pode começar
dia e terminar noutro.*/

Algorítmo Lot01_Dec25
Declarar
    horaInicio, minutosInicio, horaFim, minutosFim, horas, minutos:int;
Inicio
    Ler horaInicio;
    Ler minutosInicio;
    Ler horaFim;
    Ler minutosFim;
    
    horas = horaFim - horaInicio;

    Se (horas < 0) então
        horas = 24 + horas
    Fim-Se

    minutos = minutosFim-minutosInicio;

    Se (minutos < 0) então
        Se(minutosFim<minutosInicio) então
            horas--;
        Fim-Se
        minutos = 60 + minutos;
    Fim-Se
    
    Mostra horas;
    Mostra Minutos;
Fim

//26.	Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.

Algorítmo Lot01_Dec26
Declarar
    x, y, r:Int;
Inicio
    Ler x;
    Ler y;
    Se (x>=y) então
        r = x % y;
    Senão
        r = y % x;    
    Fim-Se
    Se (r == 0) então
        Mostra "O maior é múltiplo do menor";
    Senão
        Mostra "O maior não é múltiplo do menor";
    Fim-Se    
Fim

//27.	Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.

Algorítmo Lot01_Dec27
Declarar
    nV, eC, t, vM:Num;
Inicio
    Ler nV;
    Ler eC;
    Ler t;
    vM = (nV * eC) / t;
    vM = (vM * 60) / 1000;
    Mostra vM;
Fim

/*28.	Receba a média mensal e o preço atual de um produto. Calcule e mostre o novo preço sabendo que:
Venda Mensal    | 	Preço Atual	 |   Preço Novo
< 500           |	  < 30       |	+10%
>= 500 e < 1000 |  >= 30 e < 80  |  +15%
>= 1000      	|     >= 80      |  -5%
Obs.: para outras condições, preço novo será igual ao preço atual.*/

Algorítmo Lot01_Dec28
Declarar
    precoA, mediaM, precoN:Num;
Inicio
    Ler mediaM;
    Ler precoA;
    Se (mediaM < 500 && precoA < 30) então
        precoN = precoA * 1.10;
    Senao
        Se(mediaM >= 500 && mediaM < 1000 && precoA >=30 && precoA <80) então
            precoN = precoA * 1.15;
        Senao
            Se(mediaM >= 1000 && precoA >= 80) então
                precoN = precoA * 0.95;
            Senao
                precoN = precoA;
            Fim-Se
        Fim-Se
    Fim-Se
    Mostra precoN;
Fim

/*29.	Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3%
e a renda fixa = 5%. Demais tipos não serão considerados.*/

Algorítmo Lot01_Dec29
Declarar
    tipo, valor, resultado:Num;
Inicio
    Ler tipo;
    Ler valor;
    Se (tipo == 1) então
        resultado = valor * 1,03;
    Senão
        Se (tipo == 2) então
            resultado = valor * 1,05;
        Senão
            Mostra "Tipo desconhecido, insira 1 para poupança ou 2 para renda fixa";
        Fim-se 
    Fim-se
    Mostra resultado; 
Fim