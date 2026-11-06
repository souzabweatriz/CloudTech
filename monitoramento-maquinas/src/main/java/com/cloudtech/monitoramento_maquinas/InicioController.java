package br.com.cloudtech.monitoramento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class InicioController {

    @GetMapping("/")
    public Map<String, String> inicio() {
        return Map.of(
            "aplicacao", "CloudTech - Monitoramento de Máquinas",
            "mensagem", "API em execução",
            "status", "online"
        );
    }
}