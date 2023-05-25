const LOGIN_URL = "login.html";

var db_usuarios = {};

var usuarioCorrente = {};

// Fonte: https://stackoverflow.com/questions/105034/how-to-create-guid-uuid
function generateUUID() { // Public Domain/MIT
    var d = new Date().getTime();//Timestamp
    var d2 = (performance && performance.now && (performance.now()*1000)) || 0;
    return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
        var r = Math.random() * 16;
        if(d > 0){
            r = (d + r)%16 | 0;
            d = Math.floor(d/16);
        } else {
            r = (d2 + r)%16 | 0;
            d2 = Math.floor(d2/16);
        }
        return (c === 'x' ? r : (r & 0x3 | 0x8)).toString(16);
    });
}


const dadosIniciais = {
    usuarios: [
        { "id": generateUUID (), "login": "admin", "senha": "123", "nome": "Administrador do Sistema", "email": "admin@abc.com"},
        { "id": generateUUID (), "login": "user", "senha": "123", "nome": "Usuario Comum", "email": "user@abc.com"},
    ]
};

function initLoginApp () {
    usuarioCorrenteJSON = sessionStorage.getItem('usuarioCorrente');
    if (usuarioCorrenteJSON) {
        usuarioCorrente = JSON.parse (usuarioCorrenteJSON);
    }
    var usuariosJSON = localStorage.getItem('db_usuarios');
    if (!usuariosJSON) { 
        alert('Dados de usuários não encontrados no localStorage. \n -----> Fazendo carga inicial.');
        db_usuarios = dadosIniciais;
        localStorage.setItem('db_usuarios', JSON.stringify (dadosIniciais));
    }
    else  {  
        db_usuarios = JSON.parse(usuariosJSON);    
    }
};

function loginUser (login, senha) {
    for (var i = 0; i < db_usuarios.usuarios.length; i++) {
        var usuario = db_usuarios.usuarios[i];
        if (login == usuario.login && senha == usuario.senha) {
            usuarioCorrente.id = usuario.id;
            usuarioCorrente.login = usuario.login;
            usuarioCorrente.email = usuario.email;
            usuarioCorrente.nome = usuario.nome;
            sessionStorage.setItem ('usuarioCorrente', JSON.stringify (usuarioCorrente));
            return true;
        }
    }
    return false;
}

function logoutUser () {
    usuarioCorrente = {};
    sessionStorage.setItem ('usuarioCorrente', JSON.stringify (usuarioCorrente));
    window.location = LOGIN_URL;
}

function addUser (nome, login, senha, email) {
    let newId = generateUUID ();
    let usuario = { "id": newId, "login": login, "senha": senha, "nome": nome, "email": email };
    db_usuarios.usuarios.push (usuario);
    localStorage.setItem('db_usuarios', JSON.stringify (db_usuarios));
}

function setUserPass () {

}

initLoginApp ();

function validaCadastro () {
    window.onload = () => {
        btn_salvar.disabled = true;
        let validaCadastro = () => {
            if (txt_senha == 0 || txt_senha2 == 0)
            btn_salvar.disabled = true;
            else btn_salvar.disabled = false;
        };
        txt_senha.onchange = validaCadastro;
        txt_senha2.onchange = validaCadastro;
    }
}

function validaLogin () {
    window.onload = () => {
        salvar.disabled = true;
        let validaLogin = () => {
            if (username == 0 || password == 0) {
            salvar.disabled = true; 
            alert('Cadastro negado. Senha não pode ficar em branco.');
            } else salvar.disabled = false;
        };
        username.onchange = validaLogin;
        password.onchange = validaLogin;
    }
}