package br.com.cloudtech.monitoramento;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/producao")
public class ProducaoController {

    private final List<Producao> producoes = new ArrayList<>();

    @PostMapping
    public Producao registrar(@RequestBody Producao producao) {
        producoes.add(producao);
        return producao;
    }

    @GetMapping
    public List<Producao> consultar() {
        return producoes;
    }
}