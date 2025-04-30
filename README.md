# 🎮 Game List API

Uma API RESTful desenvolvida em Java com Spring Boot para gerenciamento de uma lista de jogos. Este projeto permite a criação, leitura, atualização e exclusão (CRUD) de informações sobre jogos.

## 🚀 Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para simplificar a criação de aplicações Java.
- **Spring Data JPA**: Para interações com o banco de dados.
- **Banco de Dados**: H2.
- **Maven**: Gerenciador de dependências e build.

## ⚙️ Como Executar

1. Clone o repositório:

    ```bash
    git clone https://github.com/IsaacSales15/game-list-api.git
    cd game-list-api/springboot-api
    ```

2. Configure o banco de dados:

    Atualize o arquivo `application.properties` com as configurações do seu banco de dados.

3. Compile e execute a aplicação:

    ```bash
    ./mvnw spring-boot:run
    ```

    A aplicação estará disponível em [http://localhost:8080](http://localhost:8080).

## 📌 Endpoints Disponíveis

- **GET /games**: Lista todos os jogos.
- **GET /games/{id}**: Obtém detalhes de um jogo específico.
- **POST /games**: Adiciona um novo jogo.
- **PUT /games/{id}**: Atualiza as informações de um jogo existente.
- **DELETE /games/{id}**: Remove um jogo da lista.

## 🧪 Testes

Para executar os testes da aplicação:

```bash
./mvnw test
