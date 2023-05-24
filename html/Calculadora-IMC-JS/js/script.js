const btn = document.getElementById('idbtn');


btn.addEventListener('click',()=>{

let peso = parseFloat (document.getElementById('idpeso').value);
let altura = parseFloat (document.getElementById('idalt').value);

// let imc = parseFloat(peso)/parseFloat(altura)*parseFloat(altura);
let imc = (peso/(altura**2)).toFixed(2);
alert(imc);









});