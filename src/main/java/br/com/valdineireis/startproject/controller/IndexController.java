package br.com.valdineireis.startproject.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import javax.inject.Inject;

@Controller
public class IndexController {
    @Inject private Result result;
    
    @Path("/")
    public void index() {
        result.include("mensagem", "Novo projeto com VRaptor 4");
    }
}
