const btnsom = document.getElementById('idbtnsomar');

btnsom.addEventListener('click',()=>{

let n1  = parseInt(document.getElementById('idn1').value) ;
let n2 = parseInt(document.getElementById('idn2').value);

document.getElementById('idresult').innerHTML = n1+n2;


});



const btnsub = document.getElementById('idbtnsubtrair');

btnsub.addEventListener('click',()=>{

let n1  = parseInt(document.getElementById('idn1').value) ;
let n2 = parseInt(document.getElementById('idn2').value);

document.getElementById('idresult').innerHTML = n1-n2;


});



const btnmult = document.getElementById('idbtnmult');

btnmult.addEventListener('click',()=>{

let n1  = parseInt(document.getElementById('idn1').value) ;
let n2 = parseInt(document.getElementById('idn2').value);

document.getElementById('idresult').innerHTML = n1*n2;


});



const btndiv = document.getElementById('idbtndiv');

btndiv.addEventListener('click',()=>{

let n1  = parseInt(document.getElementById('idn1').value) ;
let n2 = parseInt(document.getElementById('idn2').value);

document.getElementById('idresult').innerHTML = n1/n2;


});