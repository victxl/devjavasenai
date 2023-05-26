const nomemsg = document.getElementById('idnome');
const cpfmsg = document.getElementById('idcpf');
const emailmsg = document.getElementById('idemail');
const profissaomsg = document.getElementById('idprofissao');
const generomsg = document.getElementById('idgenero');
const escolamsg = document.getElementById('idescola');
const telmsg = document.getElementById('idtel');
const cepmsg = document.getElementById('idcep');





nomemsg.addEventListener('blur', () => {

    nome = nomemsg.value;

    if (nome === '') document.getElementById('idnome').setAttribute('placeholder', '*Campo obrigatorio');

    else document.getElementById('idnome').setAttribute('placeholder', '')

});

cpfmsg.addEventListener('blur', () => {

    cpf = cpfmsg.value;

    if (cpf === '') document.getElementById('idcpf').setAttribute('placeholder', '*Campo obrigatorio');

    else document.getElementById('idcpf').setAttribute('placeholder', '')

});

emailmsg.addEventListener('blur', () => {

    email = emailmsg.value;

    if (email === '') document.getElementById('idemail').setAttribute('placeholder', '*Campo obrigatorio');

    else document.getElementById('idemail').setAttribute('placeholder', '')

});



profissaomsg.addEventListener('blur', () => {

    profissao = profissaomsg.value;

    if (profissao === '') document.getElementById('idprofissao').setAttribute('placeholder', '*Campo obrigatorio');

    else document.getElementById('idprofissao').setAttribute('placeholder', '')

});



generomsg.addEventListener('blur', () => {

    genero = generomsg.value;

    if (genero === '') document.getElementById('idgenero').setAttribute('placeholder', '*Campo obrigatorio');

    else document.getElementById('idgenero').setAttribute('placeholder', '')

});



escolamsg.addEventListener('blur', () => {

    escola = escolamsg.value;

    if (escola === '') document.getElementById('idescola').setAttribute('placeholder', '*Campo obrigatorio');

    else document.getElementById('idescola').setAttribute('placeholder', '')

});



telmsg.addEventListener('blur', () => {

    tel = telmsg.value;

    if (tel === '') document.getElementById('idtel').setAttribute('placeholder', '*Campo obrigatorio');

    else document.getElementById('idtel').setAttribute('placeholder', '')



});



// SCRIPT CEP

const pesquisaCep = document.getElementById('idcep');

const limpaformulario = () => {


    document.getElementById('iduf').value = '';
    document.getElementById('idcidade').value = '';
    document.getElementById('idbairro').value = '';
    document.getElementById('idlogradouro').value = '';
    document.getElementById('idddd').innerHTML = '(DDD)';

};

const meuCallback = (conteudo) => {

    if (!('erro' in conteudo)) {

        document.getElementById('iduf').value = (conteudo.uf);
        document.getElementById('idcidade').value = (conteudo.localidade);
        document.getElementById('idbairro').value = (conteudo.bairro);
        document.getElementById('idlogradouro').value = (conteudo.logradouro);
        document.getElementById('idddd').innerHTML = ('(' + conteudo.ddd + ')');
    }
    else {
        limpaformulario();
        alert('CEP não encontrado')

    }




};

pesquisaCep.addEventListener('blur', () => {
    let cep = pesquisaCep.value.replace(/\D/g, '');

    if (cep != "") {
        // validada o codigo [0-9] pode digitar somente numero {8} quantidade de casa
        let validacep = /^[0-9]{8}$/;

        if (validacep.test(cep)) {


            let script = document.createElement('script');


            script.src = 'https://viacep.com.br/ws/' + cep + '/json/?callback=meuCallback';

            document.body.appendChild(script);

        }
        else {
            limpaformulario();
            alert('CEP INVALIDO.')
        }


    }
    else {
        limpaformulario();
    }


});


// script btn

const btn = document.getElementById('idbtn');


btn.addEventListener('click', () => {
    nome = nomemsg.value;
    cpf = cpfmsg.value;
    email = emailmsg.value;
    profissao = profissaomsg.value;
    genero = generomsg.value;
    escola = escolamsg.value;
    tel = telmsg.value;
    cep = cepmsg.value;

    if (nome  =='' ) {
            

        document.getElementById('idnome').setAttribute('placeholder', '*Campo obrigatorio');

    }
    if (cpf == '' ) {
        document.getElementById('idcpf').setAttribute('placeholder', '*Campo obrigatorio')


    }
     if (email == '' ) {
        document.getElementById('idemail').setAttribute('placeholder', '*Campo obrigatorio')

    } 
    if (profissao == '' ) {
        document.getElementById('idprofissao').setAttribute('placeholder', '*Campo obrigatorio')

    }
    if (genero == '' ) {
        document.getElementById('idgenero').setAttribute('placeholder', '*Campo obrigatorio')

    }
    if (escola == '' ) {
        document.getElementById('idescola').setAttribute('placeholder', '*Campo obrigatorio')

    }
    if (tel == '' ) {
        document.getElementById('idtel').setAttribute('placeholder', '*Campo obrigatorio')

    }
    if (cep == '' ) {
        document.getElementById('idcep').setAttribute('placeholder', '*Campo obrigatorio')

    }
    else 
    { 
        
        
        document.getElementById('idmensagem').innerHTML = 
        '<b>NOME:</b>' + nome + '<b>Email:</b>' + email + '<br>' + 
        '<b>Telefone:</b>' + tel + '<br>' + 
        '<b>Profissão:</b>' + profissao + '<br>'+
        '<b>Escola:</b>' + escola + '<br>'+
        '<b>Genero:</b>' + genero + '<br>'+
        '<b>cep:</b>' + cep + '<br>'
        
    }
});
