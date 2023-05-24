const btncalc = document.getElementById('idbtn')

btncalc.addEventListener('click', () => {


    let nome = document.getElementById('idnome').value;

    let idade = document.getElementById('ididade').value;


    // var variavel = condicao ? valorSeTrue : valorSeFalse;

    nome != ''&& idade != '' ? 


    idade >= 18 ? alert(nome + ' você é maior de idade') : alert(nome + ' você é menor de idade') : 
    
    alert('PREENCHIMENTO OBRIGRATORIO!!!');


    // if(nome == '' || idade == ''){
    //     alert('PREENCHIMENTO OBRIGRATORIO!!!')


    // } else {
    //     if(idade >= 18){
    //         alert( nome + ' você é maior de idade')

    //         };
    //         if (idade < 18){
    //             alert( nome + ' você é menor de idade')

    //         };
    // }



});