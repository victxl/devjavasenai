const nomemsg = document.getElementById('idnome');

const emailmsg = document.getElementById('idemail');

const telmsg = document.getElementById('idemail');

const profissaomsg = document.getElementById('idemail');

const btn = document.getElementById('idbtn');

nomemsg.addEventListener('blur',()=>{

    nome = nomemsg.value;

    if (nome ==='') {
        document.getElementById('idspannome').innerHTML = '*Campo obrigatorio';
        
    }
    else{ 
    document.getElementById('idspannome').innerHTML = '';}
})

emailmsg.addEventListener('blur',()=>{

    email = emailmsg.value;

    if (nome ==='') {
        document.getElementById('idspanemail').innerHTML = '*Campo obrigatorio';
        
    }
    else{ 
    document.getElementById('idspanemail').innerHTML = '';}
})

telmsg.addEventListener('blur',()=>{

    tel = telmsg.value;

    if (tel ==='') {
        document.getElementById('idspantel').innerHTML = '*Campo obrigatorio';
        
    }
    else{ 
    document.getElementById('idspantel').innerHTML = '';}
})


profissaomsg.addEventListener('blur',()=>{

    profissao = profissaomsg.value;

    if (profissao ==='') {
        document.getElementById('idspanprofissao').innerHTML = '*Campo obrigatorio';
        
    }
    else{  
    document.getElementById('idspanprofissao').innerHTML = '';}
})

btn.addEventListener('click',()=>{

    

    if (nome == '' && email == '' && tel == '' && profissao == '') {
        alert('ok')
        
    }else{
        document.getElementById('idmensagem').innerHTML = 'NOME:'+nome+ '<br>'+ 'Email:'+email + '<br>'+ 'Telefone:'+tel+ '<br>'+ 'Profissão:'+profissao  }
    }



);

