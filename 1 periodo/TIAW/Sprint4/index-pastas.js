let searchable = [
    'Pasta1',
    'Pasta2',
    'Pasta3',
    'Pasta4',
    'Pasta5',
    'Pasta6',
    'Pasta7',
    'Pasta8',
    'Pasta9',
    'Camila',
    'CamilaMacedo',
    'Bruna',
    'Brownie',
];

for(let i = 0; i < pastas.length; i++){
    document.getElementById('opcoes').innerHTML += `
        <option value="${pastas[i]['nome-input']}">
    `;
}


const searchInput = document.getElementById('search');
const searchWrapper = document.querySelector('.wrapper');
const resultsWrapper = document.querySelector('.results');

document.getElementById('searchForm').addEventListener('submit',(evento)=>{
    for(let i = 0; i < pastas.length; i++){
        if(pastas[i]['nome-input'] == opcao.value){
            pastaAtual = i;
            atualizaRightSide(pastaAtual);
            atualizaCampos();
            opcao.value = '';
            i = pastas.length;
        }
    }
    evento.preventDefault();
});