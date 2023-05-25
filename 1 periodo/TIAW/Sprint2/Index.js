//mobile
document.getElementById('menu-toggle').addEventListener('click', () => {
    if (document.querySelector('.leftSide').style.display == 'block') {
        document.querySelector('.leftSide').style.display = 'none';
    } else {
        document.querySelector('.leftSide').style.display = 'block';
    }
});

//-----Teste-----
var pessoas = [
    {
        'foto': 'FOTO', 'nome-input': 'Fulano', 'comment-input': 'Minha pasta', 'mensagens':
            [{ 'msg1': '1', 'msg2': '2', 'ms3': '3', 'msg4': '4' }]
    }];

var pessoaAtual = 0;

if (sessionStorage.getItem('pessoas') != null) {
    pessoas = JSON.parse(sessionStorage.getItem('pessoas'));
    atualizaCampos();
}
else {
    atualizaCampos();
}

function atualizaCampos() {
    document.getElementById('pessoas').innerHTML = '';

    for (let i = 0; i < pessoas.length; i++) {
        document.getElementById('pessoas').innerHTML += `
            <div onclick="atualizaRightSide(${i})" class="block" id="pessoa-item${i}">
                <div class="imgbox">
                    <img src="img6.jpg" class="cover">
                </div>
                <div class="details">
                    <div class="listHead">
                        <h4>${pessoas[i]['nome']}</h4>
                        <p class="time">09:48</p>
                    </div>
                    <div class="message_p">
                        <p>${pessoas[i]['mensagem']}</p>
                    </div>
                </div>
            </div>
        `;
    }

}

//consertar
function atualizaRightSide(item) {
    pessoaAtual = item;
    for (let i = 0; i < pessoas.length; i++) {
        document.getElementById(`pasta-item${i}`).style.backgroundColor = '#1b222d';
    }
    document.getElementById(`pasta-item${item}`).style.backgroundColor = '#131820';

    document.querySelector('#tituloPasta').innerHTML = `${pastas[item]['nome-input']}`;

    if (pastas[item]['corSelecionada'] == 'plaranja' || pastas[item]['corSelecionada'] == 'plime' || pastas[item]['corSelecionada'] == 'pverde' || pastas[item]['corSelecionada'] == 'pazul' || pastas[item]['corSelecionada'] == 'proxo') {
        document.querySelector('#pasta-img').innerHTML = `<ion-icon name="folder-outline" class="pasta-black" style="background-color:${converteCor(pastas[item]['corSelecionada'])}";></ion-icon>`
    } else {
        document.querySelector('#pasta-img').innerHTML = `<ion-icon name="folder-outline" class="pasta-white" style="background-color:${converteCor(pastas[item]['corSelecionada'])}";></ion-icon>`
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