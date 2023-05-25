package app;

import static spark.Spark.*;
import service.UsuarioService;


public class Aplicacao {
	
	private static UsuarioService usuarioService = new UsuarioService();
	
    public static void main(String[] args) {
        port(6789);
        
        staticFiles.location("/public");
        
        post("/cadastrar/usuario", (request, response) -> usuarioService.add(request, response));

        post("/login", (request, response) -> usuarioService.login(request, response));
          
    }
}