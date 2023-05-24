const btn2 = document.getElementById('idbtn2');
const btn3 = document.getElementById('idbtn3');
btn2.addEventListener('click', () => {
     let usuario = {
        'nome': document.getElementById('idnome').value,
        'email': document.getElementById('idemail').value,
        'endereco': document.getElementById('idendereco').value,
        'telefone': document.getElementById('idtelefone').value,
        'cpf': document.getElementById('idcpf').value,
        'profissao': document.getElementById('idprofissao').value
    }


    document.getElementById('idconf').innerHTML =
        '<b>Nome: </b>' + usuario.nome +
        '<br /><b>Email: </b>' + usuario.email +
        '<br /><b>Endereco: </b>' + usuario.endereco +
        '<br /><b>Telefone: </b>' + usuario.telefone +
        '<br /><b>Cpf: </b>' + usuario.cpf +
        '<br /><b>Profissão: </b>' + usuario.profissao ;
    

});


btn3.addEventListener('click', () => {


    let usuario = {
        'nome': document.getElementById('idnome').value,
        'email': document.getElementById('idemail').value,
        'endereco': document.getElementById('idendereco').value,
        'telefone': document.getElementById('idtelefone').value,
        'cpf': document.getElementById('idcpf').value,
        'profissao': document.getElementById('idprofissao').value
    }
    document.getElementById('idresult').innerHTML =
    '<b>Nome: </b>' + usuario.nome +
    '<br /><b>Email: </b>' + usuario.email +
    '<br /><b>Endereco: </b>' + usuario.endereco +
    '<br /><b>Telefone: </b>' + usuario.telefone +
    '<br /><b>Cpf: </b>' + usuario.cpf +
    '<br /><b>Profissão: </b>' + usuario.profissao ;



});


