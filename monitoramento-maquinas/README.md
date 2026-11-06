# CloudTech - Monitoramento de Máquinas

API REST para cadastro de máquinas industriais e registro de dados de produção.

## Tecnologias

- Java 25
- Spring Boot 4.2.0-SNAPSHOT
- Maven
- JSON

## Pré-requisitos

- JDK 25 ou superior
- Git

## Execução

Na raiz do projeto, execute:

```bash
./mvnw spring-boot:run
```

No Windows, use `mvnw.cmd spring-boot:run`. A API ficará disponível em `http://localhost:8080`.

## Endpoints

| Método | Endpoint | Descrição |
| --- | --- | --- |
| `GET` | `/` | Informações iniciais da aplicação. |
| `GET` | `/status` | Verifica o status da API. |
| `GET` | `/versao` | Retorna a versão da aplicação. |
| `POST` | `/maquinas/cadastro` | Cadastra uma máquina. |
| `GET` | `/maquinas` | Lista as máquinas cadastradas. |
| `POST` | `/producao` | Registra dados de produção. |
| `GET` | `/producao` | Lista os registros de produção. |

Todos os endpoints de cadastro recebem e retornam JSON.

## Exemplos

### Cadastrar uma máquina

```bash
curl -X POST http://localhost:8080/maquinas/cadastro \
  -H "Content-Type: application/json" \
  -d '{
    "identificador": "MAQ-001",
    "tipo": "Esteira",
    "setor": "Producao",
    "status": "Ativa"
  }'
```

### Registrar produção

```bash
curl -X POST http://localhost:8080/producao \
  -H "Content-Type: application/json" \
  -d '{
    "identificadorMaquina": "MAQ-001",
    "consumoKw": 12.5,
    "tempoAtivacao": 8,
    "pecasProduzidas": 350
  }'
```

### Consultar dados

```bash
curl http://localhost:8080/maquinas
curl http://localhost:8080/producao
curl http://localhost:8080/status
curl http://localhost:8080/versao
```

## Estrutura

```text
src/
├── main/java/com/cloudtech/monitoramento_maquinas/
│   ├── *Controller.java
│   ├── Maquina.java
│   ├── Producao.java
│   └── MonitoramentoMaquinasApplication.java
└── main/resources/application.properties
```

## Observações

- Os dados são armazenados somente em memória e são perdidos ao reiniciar a aplicação.
- A aplicação usa a porta `8080` por padrão.
- Para executar os testes, use `./mvnw test`.