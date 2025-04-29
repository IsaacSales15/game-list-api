🎮 Game List API

Uma API RESTful desenvolvida em Java com Spring Boot para gerenciamento de uma lista de jogos. Este projeto permite a criação, leitura, atualização e exclusão (CRUD) de informações sobre jogos.
🚀 Tecnologias Utilizadas

    Java: Linguagem de programação principal.

    Spring Boot: Framework para simplificar a criação de aplicações Java.

    Spring Data JPA: Para interações com o banco de dados.

    Banco de Dados: (Especifique o banco de dados utilizado, como H2, PostgreSQL, etc.)

    Maven: Gerenciador de dependências e build.

📁 Estrutura do Projeto

game-list-api/
├── .vscode/                 # Configurações do editor
├── springboot-api/          # Código-fonte da aplicação
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── example/
│   │   │   │           └── gamelist/
│   │   │   │               ├── controller/   # Controladores REST
│   │   │   │               ├── model/        # Entidades JPA
│   │   │   │               ├── repository/   # Repositórios JPA
│   │   │   │               └── service/      # Lógica de negócio
│   │   │   └── resources/
│   │   │       └── application.properties    # Configurações da aplicação
├── README.md                # Documentação do projeto

⚙️ Como Executar

    Clone o repositório:

    git clone https://github.com/IsaacSales15/game-list-api.git
    cd game-list-api/springboot-api

    Configure o banco de dados:

        Atualize o arquivo application.properties com as configurações do seu banco de dados.

    Compile e execute a aplicação:

    ./mvnw spring-boot:run

    A aplicação estará disponível em http://localhost:8080.

📌 Endpoints Disponíveis

    GET /games: Lista todos os jogos.

    GET /games/{id}: Obtém detalhes de um jogo específico.

    POST /games: Adiciona um novo jogo.

    PUT /games/{id}: Atualiza as informações de um jogo existente.

    DELETE /games/{id}: Remove um jogo da lista.

🧪 Testes

Para executar os testes da aplicação:

./mvnw test

🛠 Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.
📄 Licença

Este projeto está licenciado sob a Licença MIT.
