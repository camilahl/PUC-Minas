const ENDPOINT = 'https://api.themoviedb.org/3';
const KEY = '64d059568c0e31389b9b682b5aa95e3f';
const IMG = 'https://image.tmdb.org/t/p/w500';
let xhr;

console.log(3);
function pesquisaFilmes () {
    xhr = new XMLHttpRequest ();

    let query = $('#barra').val();

    xhr.open ('GET', ENDPOINT + '/search/movie' + '?api_key=' + KEY + '&query=' + query, true);
    xhr.onload = exibeFilmes;
    xhr.send();
    evento.preventDefault();
}

function exibeFilmes ()
{
    let data = JSON.parse (xhr.responseText);
    let textoHTML = '';

    for (let i = 0; i < data.results.length; i++) {
        let nomeFilme = data.results[i].title;
        let lancamento = data.results[i].release_date;
        let nota = data.results[i].vote_average;
        let imagem = IMG_PREFIX + data.results[i].poster_path;

        textoHTML += `<div class=" mx-auto card col-12 col-sm-12 col-md-3 col-lg-3">
        <img src="${imagem}" class="card-img-top" alt="...">
        <div class="card-body">
            <h5 class="card-title">${nomeFilme}</h5>
            <p>Data de Lançamento: ${lancamento}</p>
            <p>Nota: ${nota} <i class="fas fa-star"></i></p>
            <a href="https://www.themoviedb.org/movie/${data.results[i].id}" class="btn btn-primary">Saiba Mais</a>
        </div>
    </div>`
    }

    document.getElementById('boxPesquisa').innerHTML = textoHTML;
    evento.preventDefault();
}