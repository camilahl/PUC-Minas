const TMDB_ENDPOINT = 'https://api.themoviedb.org/3';
const APIKEY = '64d059568c0e31389b9b682b5aa95e3f';
const IMG_PREFIX = 'https://image.tmdb.org/t/p/w500';
const GNDB_ENDPOINT = 'https://gnews.io/api/v4/top-headlines';
const KEY_GNDB = '1d138f06f337533679ac493a0b91ce98';

$(() => {

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

    $.get(TMDB_ENDPOINT + '/movie/now_playing' + '?api_key=' + APIKEY).then((data) => {
        $("#boxDentroDoCarrossel").html("");
        for (let i = 0; i < 3; i++) 
        {
            let nomeFilme = data.results[i].title;
            let lancamento = data.results[i].release_date;
            let nota = data.results[i].vote_average;
            let id = data.results[i].id;
            let sinopese = data.results[i].overview; 
            if(i == 1)
            {
                $.get(TMDB_ENDPOINT + '/movie/' + id + '/videos' + '?api_key=' + APIKEY).then((video) => {
                    let keyVideo = video.results[0].key;
                    $("#boxDentroDoCarrossel").append(`
                    <div class="carousel-item active">
                        <div class="row">
                            <div class="col-12 col-sm-12 col-md-12 col-lg-6">
                            <iframe src="https://www.youtube.com/embed/9Jgua93Xhcw" class="videos_carrossel"
                            frameborder="0" allowfullscreen></iframe>
                            </div>
                            <div class="col-12 col-sm-12 col-md-12 col-lg-6">
                                <!--Texto 1-->
                                <h2>Top Gun: Maverick</h2>
                                <p> Sinopse: Depois de mais de 30 anos de serviço como um dos principais aviadores da Marinha, Pete "Maverick" Mitchell está de volta, rompendo os limites como um piloto de testes corajoso. No mundo contemporâneo das guerras tecnológicas, Maverick enfrenta drones e prova que o fator humano ainda é essencial..
                                </p>
                                <p>
                                    Estreia: 26/05/2022
                                </p>
                                <p>Avaliação: 8.6 <i class="fas fa-star"></i></p>
                                <a href="https://www.themoviedb.org/movie/361743-top-gun-maverick?language=pt-BR" class="btn btn-primary">Saiba Mais</a>
                            </div>
                        </div>
                    </div>`)
                })
            }
            else if(i > 1)
            {
                $.get(TMDB_ENDPOINT + '/tv/' + id + '/videos' + '?api_key=' + APIKEY).then((video) => {
                    let keyVideo = video.results[0].key;
                    $("#boxDentroDoCarrossel").append(`
                    <div class="carousel-item">
                        <div class="row">
                            <div class="col-12 col-sm-12 col-md-12 col-lg-6">
                            <iframe src="https://www.youtube.com/embed/${keyVideo}" class="videos_carrossel"
                            frameborder="0" allowfullscreen></iframe>
                            </div>
                            <div class="col-12 col-sm-12 col-md-12 col-lg-6">
                                <!--Texto 1-->
                                <h2>${nomeFilme}</h2>
                                <p> Sinopse: ${sinopese}.
                                </p>
                                <p>
                                    Estreia: ${lancamento}
                                </p>
                                <p>Avaliação: ${nota} <i class="fas fa-star"></i></p>
                                <a href="https://www.themoviedb.org/movie/${data.results[i].id}" class="btn btn-primary">Saiba Mais</a>
                            </div>
                        </div>
                    </div>`)
                })
            }
        }
        $.get(TMDB_ENDPOINT + '/movie/popular' + '?api_key=' + APIKEY).then((data) => {
            $("#rowTrailers").html("");
            for (let i = 0; i < 3; i++) {
                let nomeFilme = data.results[i].title;
                let lancamento = data.results[i].release_date;
                let nota = data.results[i].vote_average;
                let id = data.results[i].id;
                if(i == 1){
                    $.get(TMDB_ENDPOINT + '/movie/' + id + '/videos' + '?api_key=' + APIKEY).then((video) => {
                        let keyVideo = video.results[0].key;

                        $("#rowTrailers").append(`
                        <div class="col-12 col-sm-12 col-md-6 col-lg-4 entrevista_1">
                            <div>
                                <iframe src="https://www.youtube.com/embed/hLoc55VAByk" class="videos_entrevistas"
                                    frameborder="0" allowfullscreen></iframe>
                                <!--Video 1-->
                            </div>
                            <div>
                                <h2 class="titulo_entrevistas">Animais Fantásticos: Os Segredos de Dumbledore</h2>
                                <!--Texto 1-->
                                <p class="Texto_entrevistas">
                                    Lançamento: 14/04/2022
                                </p>
                                <p class="Texto_entrevistas">
                                    Nota: 6.3 <i class="fas fa-star"></i>
                                </p>
                            </div>
                        </div>`);
                    })
                } else if(i == 2) {
                    $.get(TMDB_ENDPOINT + '/movie/' + id + '/videos' + '?api_key=' + APIKEY).then((video) => {
                        let keyVideo = video.results[0].key;

                        $("#rowTrailers").append(`
                        <div class="col-12 col-sm-12 col-md-6 col-lg-4 entrevista_1">
                            <div>
                                <iframe src="https://www.youtube.com/embed/vIMm04L916I" class="videos_entrevistas"
                                    frameborder="0" allowfullscreen></iframe>
                                <!--Video 1-->
                            </div>
                            <div>
                                <h2 class="titulo_entrevistas">Arremessando Alto</h2>
                                <!--Texto 1-->
                                <p class="Texto_entrevistas">
                                    Lançamento: 03/06/2022
                                </p>
                                <p class="Texto_entrevistas">
                                    Nota: 7.8 <i class="fas fa-star"></i>
                                </p>
                            </div>
                        </div>`);
                    })
                } else {
                    $.get(TMDB_ENDPOINT + '/movie/' + id + '/videos' + '?api_key=' + APIKEY).then((video) => {
                        let keyVideo = video.results[0].key;

                        $("#rowTrailers").append(`
                        <div class="col-12 col-sm-12 col-md-6 col-lg-4 entrevista_1">
                            <div>
                                <iframe src="https://www.youtube.com/embed/KvVW_ER0t5E" class="videos_entrevistas"
                                    frameborder="0" allowfullscreen></iframe>
                                <!--Video 1-->
                            </div>
                            <div>
                                <h2 class="titulo_entrevistas">Lightyear</h2>
                                <!--Texto 1-->
                                <p class="Texto_entrevistas">
                                    Lançamento: 16/06/2022
                                </p>
                                <p class="Texto_entrevistas">
                                    Nota: 7.1 <i class="fas fa-star"></i>
                                </p>
                            </div>
                        </div>`);
                    })  
                }  
            }   

            
        })
    })

    $.get(GNDB_ENDPOINT + '?country=br' + '&q=loki' + '&token=' + KEY_GNDB).then((data) => {
        console.log(data);
        $("#materias").html("");
        for (let i = 0; i < 3; i++)
        {
            let titulo = data.articles[i].title;
            let descricao = data.articles[i].description;
            let imagem = data.articles[i].image;
            let link = data.articles[i].url;
            $("#materias").append(`
            <div class="row materias">
                <div class="col-12 col-sm-12 col-md-12 col-lg-4">
                    <img class="imagens_novidades" src="${imagem}" alt="">
                </div>
                <div class="col-12 col-sm-12 col-md-12 col-lg-8 texto_materia">
                    <h2>${titulo}</h2>
                    <p>${descricao}</p>
                    <a href="${link}" class="btn btn-primary">Saiba Mais</a>
                </div>
            </div>`);
        }
    })

})