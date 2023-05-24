const pesquisaCep = document.getElementById('idcep');

const limpaformulario = ()=> {


document.getElementById('iduf').value = '';
document.getElementById('idcidade').value = '';
document.getElementById('idbairro').value = '';
document.getElementById('idlogradouro').value = '';
 
};

const meuCallback = (conteudo) => {

    if (!('erro'in conteudo)) {

            document.getElementById('iduf').value = (conteudo.uf);
            document.getElementById('idcidade').value = (conteudo.localidade);
            document.getElementById('idbairro').value = (conteudo.bairro);
            document.getElementById('idlogradouro').value = (conteudo.logradouro);

    }
    else {
        limpaformulario();
        alert('CEP não encontrado')

    }




};

pesquisaCep.addEventListener('blur',()=>{
    let cep = pesquisaCep.value.replace(/\D/g,'');
    
    if (cep != "") {
                // validada o codigo [0-9] pode digitar somente numero {8} quantidade de casa
        let validacep = /^[0-9]{8}$/;
        
        if (validacep.test(cep)) {

            
            let script = document.createElement('script');


            script.src = 'https://viacep.com.br/ws/'+ cep + '/json/?callback=meuCallback';

            document.body.appendChild(script);
            
        }
        else{
            limpaformulario();
            alert('CEP INVALIDO.')
        }

        
    }
    else{
        limpaformulario();
    }


});