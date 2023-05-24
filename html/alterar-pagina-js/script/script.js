// constante do botao
const btn = document.getElementById('idbtn');

// criando o evento atraves do arrow function

btn.addEventListener('click', ()=>{

let texto = document.getElementById('idtexto').value;

document.getElementById('idresult').innerHTML = texto;

});
