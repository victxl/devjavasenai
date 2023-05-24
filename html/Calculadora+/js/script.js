// constante do botao
let texto = '';
let igual = '';

const btnreset = document.getElementById('idreset');
// criando o evento atraves do arrow function

btnreset.addEventListener('click', () => {


    texto = ' ';

    document.getElementById('idresult').innerHTML = texto;

});

const btn1 = document.getElementById('id1');
// criando o evento atraves do arrow function

btn1.addEventListener('click', () => {


    texto = texto + '1';

    document.getElementById('idresult').innerHTML = texto;

});

const btn1 = document.getElementById('id1');
// criando o evento atraves do arrow function

btn1.addEventListener('click', () => {


    texto = texto + '1';

    document.getElementById('idresult').innerHTML = texto;

});

const btn2 = document.getElementById('id2');
// criando o evento atraves do arrow function

btn2.addEventListener('click', () => {


    texto = texto + '2';

    document.getElementById('idresult').innerHTML = texto;

});

const btn3 = document.getElementById('id3');
// criando o evento atraves do arrow function

btn3.addEventListener('click', () => {


    texto = texto + '3';

    document.getElementById('idresult').innerHTML = texto;

});
const btn4 = document.getElementById('id4');
// criando o evento atraves do arrow function

btn4.addEventListener('click', () => {


    texto = texto + '4';

    document.getElementById('idresult').innerHTML = texto;

});

const btn5 = document.getElementById('id5');
// criando o evento atraves do arrow function

btn5.addEventListener('click', () => {


    texto = texto + '5';

    document.getElementById('idresult').innerHTML = texto;

});

const btn6 = document.getElementById('id6');
// criando o evento atraves do arrow function

btn6.addEventListener('click', () => {


    texto = texto + '6';

    document.getElementById('idresult').innerHTML = texto;

});

const btn7 = document.getElementById('id7');
// criando o evento atraves do arrow function

btn7.addEventListener('click', () => {


    texto = texto + '7';

    document.getElementById('idresult').innerHTML = texto;

});
const btn8 = document.getElementById('id8');
// criando o evento atraves do arrow function

btn8.addEventListener('click', () => {


    texto = texto + '8';

    document.getElementById('idresult').innerHTML = texto;

});
const btn9 = document.getElementById('id9');
// criando o evento atraves do arrow function

btn9.addEventListener('click', () => {


    texto = texto + '9';

    document.getElementById('idresult').innerHTML = texto;

});

const btn0 = document.getElementById('id0');
// criando o evento atraves do arrow function

btn0.addEventListener('click', () => {


    texto = texto + '0';

    document.getElementById('idresult').innerHTML = texto;

});

const btnvirgula = document.getElementById('idvirgula');
// criando o evento atraves do arrow function

btnvirgula.addEventListener('click', () => {


    texto = texto + '.';

    document.getElementById('idresult').innerHTML = texto;

});
const btnmult = document.getElementById('idmult');
// criando o evento atraves do arrow function

btnmult.addEventListener('click', () => {

    n1 = parseFloat(texto);
    texto = '';
    operacao = 'mult';
    document.getElementById('idresult').innerHTML = texto;

});

const btndiv = document.getElementById('iddiv');
// criando o evento atraves do arrow function

btndiv.addEventListener('click', () => {

    n1 = parseFloat(texto);
    texto = '';
    operacao = 'div';
    document.getElementById('idresult').innerHTML = texto;

});


const btnmais = document.getElementById('idmais');
// criando o evento atraves do arrow function

btnmais.addEventListener('click', () => {

    n1 = parseFloat(texto);
    texto = '';
    operacao = 'mais';
    document.getElementById('idresult').innerHTML = texto;

});

const btnsub = document.getElementById('idsub');
// criando o evento atraves do arrow function

btnsub.addEventListener('click', () => {

    n1 = parseFloat(texto);
    texto = '';
    operacao = 'sub';
    document.getElementById('idresult').innerHTML = texto;

});

const btnporcent = document.getElementById('idporcent');
// criando o evento atraves do arrow function

btnporcent.addEventListener('click', () => {

    n1 = parseFloat(texto);
    texto = '';
    operacao = 'porcent';
    document.getElementById('idresult').innerHTML = texto;

});
const btnraiz = document.getElementById('idraiz');
// criando o evento atraves do arrow function

btnraiz.addEventListener('click', () => {

    n1 = parseFloat(texto);
    texto = '';
    operacao = 'raiz';
    document.getElementById('idresult').innerHTML = texto;

});



const btnigual = document.getElementById('idigual');
// criando o evento atraves do arrow function

btnigual.addEventListener('click', () => {

    let n2 = parseFloat(texto);

    if (operacao === 'mult') {
        igual = parseFloat(n1 * n2)
    };
    if (operacao === "div") {
        igual = parseFloat(n1 / n2)
    }
    if (operacao === "sub") {
        igual = parseFloat(n1 - n2)
    }
    if (operacao === "mais") {
        igual = parseFloat(n1 + n2)
    }
    if (operacao === "porcent") {
        igual = parseFloat(n1 * n2/100)
    }
    if (operacao === "raiz") {
        igual = parseFloat(Math.sqrt(n2))
    }
    
    

    document.getElementById('idresult').innerHTML = igual;

});
