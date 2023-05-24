const theme = document.getElementById('idbtndark');

theme.addEventListener('click',()=>{

document.getElementById('idbody').setAttribute('data-bs-theme','dark');
document.getElementById('idimg').setAttribute('src','imagem/iconthema (2).png');










});

const theme2 = document.getElementById('idbtnlight');

theme2.addEventListener('click',()=>{

document.getElementById('idbody').setAttribute('data-bs-theme','light');
document.getElementById('idimg').setAttribute('src','imagem/iconthema (1).png');








});