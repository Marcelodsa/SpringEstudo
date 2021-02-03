package br.com.alura.forum.controller;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<Topico> lista(){
        Topico topico= new Topico("Duvida", "Duvida com spring", new Curso("Spring", "Programação"));
        return Arrays.asList(topico, topico, topico);
    }
}
