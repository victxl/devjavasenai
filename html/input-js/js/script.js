// declaração de constante

const btn = document.getElementById('idbtn');

// criando evento click no botão atraves de um arrow function

btn.addEventListener('mouseover',() => {
    //  declaração de variaveis

    let nome = document.getElementById('idnome').value;
    let email = document.getElementById('idemail').value;

// saida de dados:


    alert('Nome: '+ nome +'\nEmail: '+ email)

});

//