function carregaMais(){
    $.get(TMDB_ENDPOINT + '/movie/popular' + '?api_key=' + APIKEY).then((data) => {
        for (let i = 4; i < 8; i++) {
            let nomeFilme = data.results[i].title;
            let lancamento = data.results[i].release_date;
            let nota = data.results[i].vote_average;
            let imagem = IMG_PREFIX + data.results[i].poster_path;
            $("#tela").append(`<div class=" mx-auto card col-12 col-sm-12 col-md-3 col-lg-3">
                <img src="${imagem}" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">${nomeFilme}</h5>
                    <p>Data de Lançamento: ${lancamento}</p>
                    <p>Nota: ${nota} <i class="fas fa-star"></i></p>
                    <a href="https://www.themoviedb.org/movie/${data.results[i].id}" class="btn btn-primary">Saiba Mais</a>
                </div>
            </div>`);
        }
    })

    $("#botaoDestaque").html("");
    $("#botaoDestaque").append(`<button type="button" class="btn btn-primary btn-lg" onclick="carregaMenos()">- Carregar menos</button>`);
}

function carregaMenos(){
    $.get(TMDB_ENDPOINT + '/movie/popular' + '?api_key=' + APIKEY).then((data) => {
        $("#tela").html("");
        for (let i = 0; i < 4; i++) {
            let nomeFilme = data.results[i].title;
            let lancamento = data.results[i].release_date;
            let nota = data.results[i].vote_average;
            let imagem = IMG_PREFIX + data.results[i].poster_path;
            $("#tela").append(`<div class=" mx-auto card col-12 col-sm-12 col-md-3 col-lg-3">
                <img src="${imagem}" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">${nomeFilme}</h5>
                    <p>Data de Lançamento: ${lancamento}</p>
                    <p>Nota: ${nota} <i class="fas fa-star"></i></p>
                    <a href="https://www.themoviedb.org/movie/${data.results[i].id}" class="btn btn-primary">Saiba Mais</a>
                </div>
            </div>`);
        }
    })

    $("#botaoDestaque").html("");
    $("#botaoDestaque").append(`<button type="button" class="btn btn-primary btn-lg" onclick="carregaMais()">+ Carregar mais</button>`);
}