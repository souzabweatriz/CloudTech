package br.com.cloudtech.monitoramento;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/maquinas")
public class MaquinaController {

    private final List<Maquina> maquinas = new ArrayList<>();

    @PostMapping("/cadastro")
    public Maquina cadastrar(@RequestBody Maquina maquina) {
        maquinas.add(maquina);
        return maquina;
    }

    @GetMapping
    public List<Maquina> listar() {
        return maquinas;
    }
}