
package br.com.cloudtech.monitoramento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StatusController {

    @GetMapping("/status")
    public Map<String, String> verificarStatus() {
        return Map.of(
            "status", "online",
            "mensagem", "Aplicação de monitoramento em execução"
        );
    }
}
