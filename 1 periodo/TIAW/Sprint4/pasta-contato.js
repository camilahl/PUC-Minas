var pastas = [
    {
        'nome-input': 'Léo', 'comment-input': '(31) 94902-8922', 'corSelecionada': 'azul', 'cor': converteCor('azul'), 'mensagens':
            [{ 'foto': 'img3.jpg', 'nome': 'Léo', 'horario': '14:20', 'mensagem': 'Fala pro André me responder pf' },
            { 'foto': 'img3.jpg', 'nome': 'Léo', 'horario': '14/06/22', 'mensagem': 'O André tá falando com vc?' },
            { 'foto': 'img3.jpg', 'nome': 'Léo', 'horario': '14/06/22', 'mensagem': 'Vei, o André tá me ignorando' },
            { 'foto': 'img3.jpg', 'nome': 'Léo', 'horario': '14/06/22', 'mensagem': 'Ele é chato dms' },
            ]
    },
    {
        'nome-input': 'André Campos', 'comment-input': '(31) 94361-5243', 'corSelecionada': 'red', 'cor': converteCor('red'), 'mensagens':
            [{ 'foto': 'img4.jpg', 'nome': 'André Campos', 'horario': '16:40', 'mensagem': 'Rolê na casa do Daniel dia 5' },
            { 'foto': 'img4.jpg', 'nome': 'André Campos', 'horario': '11/06/22', 'mensagem': 'Vamo viajar pra Disney?' },
            { 'foto': 'img4.jpg', 'nome': 'André Campos', 'horario': '06/06/22', 'mensagem': 'Não esqueçe que temos prova de AEDs na terça!' }]
    }];
var pastaAtual = 0;

const overlay = document.querySelector("#overlay");
document.querySelector("#show-modal-btn").addEventListener("click", () => {
    overlay.style.display = "block";
})

document.querySelector("#close-modal-btn").addEventListener("click", () => {
    overlay.style.display = "none";
})

const overlayCog = document.querySelector("#overlay-cog");
document.querySelector("#show-modal-btn-cog").addEventListener("click", () => {
    overlayCog.style.display = "block";
    document.getElementById('nome-input-cog').value = pastas[pastaAtual]['nome-input'];
    document.getElementById('comment-input-cog').value = pastas[pastaAtual]['comment-input'];
})

document.querySelector("#close-modal-btn-cog").addEventListener("click", () => {
    overlayCog.style.display = "none";
})


document.querySelector("#menu-toggle").addEventListener("click", () => {
    document.querySelector('.rightSide').style.display = 'none';
    let esqSide = document.querySelector('.leftSide');
    if (esqSide.style.display == 'block') {
        esqSide.style.display = 'none';
    }
    else {
        esqSide.style.display = 'block';
    }
})


if (sessionStorage.getItem('pastas') != null) {
    pastas = JSON.parse(sessionStorage.getItem('pastas'));
    atualizaCampos();
}
else {
    atualizaCampos();
}

document.getElementById('criarPasta').addEventListener('submit', (evento) => {
    let newObjeto = new Object();
    newObjeto['nome-input'] = document.getElementById('nome-input').value;
    newObjeto['comment-input'] = document.getElementById('comment-input').value;
    newObjeto['corSelecionada'] = pegaCor('criarPasta');
    newObjeto['cor'] = converteCor(newObjeto['corSelecionada'])
    newObjeto['mensagens'] = [];
    pastas.push(newObjeto);
    sessionStorage.setItem('pastas', JSON.stringify(pastas));
    atualizaCampos();
    overlay.style.display = "none";
    document.getElementById('nome-input').value = '';
    document.getElementById('comment-input').value = '';
    evento.preventDefault();
});

document.getElementById('altera').addEventListener('submit', (evento) => {
    pastas[pastaAtual]['nome-input'] = document.getElementById('nome-input-cog').value;
    pastas[pastaAtual]['comment-input'] = document.getElementById('comment-input-cog').value;
    pastas[pastaAtual]['corSelecionada'] = pegaCor('altera');
    pastas[pastaAtual]['cor'] = converteCor(pastas[pastaAtual]['corSelecionada'])

    sessionStorage.setItem('pastas', JSON.stringify(pastas));
    atualizaCampos();
    atualizaRightSide(pastaAtual);
    overlayCog.style.display = "none";
    evento.preventDefault();
});

function mudaCor(cor) {
    let tipoCores = document.querySelectorAll('.cores-menu label');
    for (let i = 0; i < tipoCores.length; i++) {
        tipoCores[i].style.width = '15px';
        tipoCores[i].style.height = '15px';
    }
    switch (cor) {
        case 'red':
            tipoCores[0].style.width = '30px';
            tipoCores[10].style.width = '30px';
            tipoCores[0].style.height = '30px';
            tipoCores[10].style.height = '30px';
            break;

        case 'amarelo':
            tipoCores[1].style.width = '30px';
            tipoCores[11].style.width = '30px';
            tipoCores[1].style.height = '30px';
            tipoCores[11].style.height = '30px';
            break;

        case 'verde':
            tipoCores[2].style.width = '30px';
            tipoCores[12].style.width = '30px';
            tipoCores[2].style.height = '30px';
            tipoCores[12].style.height = '30px';
            break;

        case 'azul':
            tipoCores[3].style.width = '30px';
            tipoCores[13].style.width = '30px';
            tipoCores[3].style.height = '30px';
            tipoCores[13].style.height = '30px';
            break;

        case 'roxo':
            tipoCores[4].style.width = '30px';
            tipoCores[14].style.width = '30px';
            tipoCores[4].style.height = '30px';
            tipoCores[14].style.height = '30px';
            break;

        case 'plaranja':
            tipoCores[5].style.width = '30px';
            tipoCores[15].style.width = '30px';
            tipoCores[5].style.height = '30px';
            tipoCores[15].style.height = '30px';
            break;

        case 'plime':
            tipoCores[6].style.width = '30px';
            tipoCores[16].style.width = '30px';
            tipoCores[6].style.height = '30px';
            tipoCores[16].style.height = '30px';
            break;

        case 'pverde':
            tipoCores[7].style.width = '30px';
            tipoCores[17].style.width = '30px';
            tipoCores[7].style.height = '30px';
            tipoCores[17].style.height = '30px';
            break;

        case 'pazul':
            tipoCores[8].style.width = '30px';
            tipoCores[18].style.width = '30px';
            tipoCores[8].style.height = '30px';
            tipoCores[18].style.height = '30px';
            break;

        case 'proxo':
            tipoCores[9].style.width = '30px';
            tipoCores[19].style.width = '30px';
            tipoCores[9].style.height = '30px';
            tipoCores[19].style.height = '30px';
            break;

        default:
            break;
    }
}

function pegaCor(modificacao) {
    let tipoCor = document.querySelectorAll(`#${modificacao} .cores-menu input`);
    let result = 'red';
    for (let i = 0; i < tipoCor.length; i++) {
        if (tipoCor[i].checked == true) {
            switch (i) {
                case 0:
                    result = 'red';
                    break;

                case 1:
                    result = 'amarelo';
                    break;

                case 2:
                    result = 'verde';
                    break;

                case 3:
                    result = 'azul';
                    break;

                case 4:
                    result = 'roxo';
                    break;

                case 5:
                    result = 'plaranja';
                    break;

                case 6:
                    result = 'plime';
                    break;

                case 7:
                    result = 'pverde';
                    break;

                case 8:
                    result = 'pazul';
                    break;

                case 9:
                    result = 'proxo';
                    break;

                default:
                    result = 'erro';
                    break;
            }
            i = tipoCor.length;
        }
    }
    return result;
}

function converteCor(cor) {
    let result = '#0000';
    switch (cor) {
        case 'red':
            result = "#FF595E";
            break;

        case 'amarelo':
            result = "#FFCA3A";
            break;

        case 'verde':
            result = "#8AC926";
            break;

        case 'azul':
            result = "#1982C4";
            break;

        case 'roxo':
            result = "#6A4C93";
            break;

        case 'plaranja':
            result = "#FFE3AB";
            break;

        case 'plime':
            result = "#E7FAA7";
            break;

        case 'pverde':
            result = "#B4F7B4";
            break;

        case 'pazul':
            result = "#BCF4F5";
            break;

        case 'proxo':
            result = "#BAB9FB";
            break;

        default:
            break;
    }
    return result;
}

function atualizaRightSide(item) {
    pastaAtual = item;
    for (let i = 0; i < pastas.length; i++) {
        document.getElementById(`pasta-item${i}`).style.backgroundColor = '#1b222d';
    }
    document.getElementById(`pasta-item${item}`).style.backgroundColor = '#131820';

    document.querySelector('#tituloPasta').innerHTML = `${pastas[item]['nome-input']}`;

    if (pastas[item]['corSelecionada'] == 'plaranja' || pastas[item]['corSelecionada'] == 'plime' || pastas[item]['corSelecionada'] == 'pverde' || pastas[item]['corSelecionada'] == 'pazul' || pastas[item]['corSelecionada'] == 'proxo') {
        document.querySelector('#pasta-img').innerHTML = `<ion-icon name="person" class="pasta-black" style="background-color:${converteCor(pastas[item]['corSelecionada'])}";></ion-icon>`
    } else {
        document.querySelector('#pasta-img').innerHTML = `<ion-icon name="person" class="pasta-white" style="background-color:${converteCor(pastas[item]['corSelecionada'])}";></ion-icon>`
    }

    if (pastas[item]['mensagens'].length != 0) {
        document.querySelector('.rightSide .mensagens').innerHTML = '';
    }
    else {
        document.querySelector('.rightSide .mensagens').innerHTML = `
            <div class="block">
                <div class="details">
                    <div class="listHead">
                        <h4>Não há mensagens salvas</h4>
                        <p class="time">${new Date().getHours()}:${(new Date().getMinutes() > 9) ? new Date().getMinutes() : '0' + new Date().getMinutes()}</p>
                    </div>
                    <div class="message_p">
                        <p>Salve mensagens nesta pasta antes</p>
                    </div>
                </div>
            </div>
        `;
    }

    for (let i = 0; i < pastas[item]['mensagens'].length; i++) {
        document.querySelector('.rightSide .mensagens').innerHTML += `
            <div class="block">
                <div class="imgbox">
                    <img src="${pastas[item]['mensagens'][i]['foto']}" class="cover">
                </div>
                <div class="details">
                    <div class="listHead">
                        <h4>${pastas[item]['mensagens'][i]['nome']}</h4>
                        <p class="time">${pastas[item]['mensagens'][i]['horario']}</p>
                    </div>
                    <div class="message_p">
                        <p>${pastas[item]['mensagens'][i]['mensagem']}</p>
                    </div>
                </div>
            </div>
        `;
    }

    if (window.screen.width <= 540) {
        document.querySelector('.leftSide').style.display = 'none';
        document.querySelector('.rightSide').style.display = 'block';
    }
}

function atualizaCampos() {
    document.getElementById('pastas').innerHTML = '';

    for (let i = 0; i < pastas.length; i++) {
        let corPasta;
        if (pastas[i]['corSelecionada'] == 'plaranja' || pastas[i]['corSelecionada'] == 'plime' || pastas[i]['corSelecionada'] == 'pverde' || pastas[i]['corSelecionada'] == 'pazul' || pastas[i]['corSelecionada'] == 'proxo') {
            corPasta = `pasta-black`;
        } else {
            corPasta = `pasta-white`;
        }
        document.getElementById('pastas').innerHTML += `
            <div onclick="atualizaRightSide(${i})" class="block" id="pasta-item${i}">
                <div class="imgbox">
                <ion-icon name="person" class="${corPasta}" style="background-color:${converteCor(pastas[i]['corSelecionada'])}";></ion-icon>
                </div>
                <div class="details">
                    <div class="listHead">
                        <h4>${pastas[i]['nome-input']}</h4>
                        <p class="time">09:48</p>
                    </div>
                    <div class="message_p">
                        <p>${pastas[i]['comment-input']}</p>
                    </div>
                </div>
            </div>
        `;
    }

}

function colocaCampo(item) {
    document.querySelector('#rightSide').style.backgroundColor = `${pastas[item]['cor']}`;
    document.querySelector('#rightSide').innerHTML = `
        <h1>Nome do Objeto: ${pastas[item]['nome']}</h1>
        <p>Comentario do objeto: ${pastas[item]['comentario']}</p>
        <p>Cor Selecionada: ${pastas[item]['corSelecionada']}</p>
    `;
}

document.getElementById('trash').addEventListener('click', (evento) => {
    let confirma = confirm(`Deseja deletar este contato?`);
    if (confirma == true) {
        pastas.splice(pastaAtual, 1);
        sessionStorage.setItem('pastas', JSON.stringify(pastas));
        window.location.reload();
    }

    evento.preventDefault();
});