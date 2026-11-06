package br.com.cloudtech.monitoramento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class VersaoController {

    @GetMapping("/versao")
    public Map<String, String> versao() {
        return Map.of(
            "aplicacao", "CloudTech - Monitoramento de Máquinas",
            "versao", "1.0.0"
        );
    }
}