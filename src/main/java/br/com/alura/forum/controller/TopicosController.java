package br.com.alura.forum.controller;

import br.com.alura.forum.controller.DTO.TopicoDTO;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import br.com.alura.forum.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicoService topicoService;

    @RequestMapping("/topicos")
    public List<TopicoDTO> lista() {
        List<Topico> topicos = topicoService.findAll();
        return TopicoDTO.converter(topicos);
    }
}
