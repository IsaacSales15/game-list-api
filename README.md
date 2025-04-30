<h1>🎮 Game List API – Catálogo de Jogos</h1>
<p>API REST desenvolvida com Spring Boot para gerenciamento de uma lista de jogos. Permite cadastrar, listar, buscar e deletar jogos com informações como nome, descrição, plataforma e status.</p>

<hr>

<h2>🔧 Tecnologias</h2>
<ul>
  <li>Java 17+</li>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>H2 Database</li>
  <li>Lombok</li>
  <li>Jakarta Validation</li>
</ul>

<hr>

<h2>🏁 Como executar</h2>
<pre><code>git clone https://github.com/IsaacSales15/game-list-api.git
cd game-list-api
./mvnw spring-boot:run
</code></pre>

<hr>

<h2>📦 Estrutura do Projeto</h2>
<ul>
  <li><b>controller</b>: camada de controle da API (<code>GameController</code>)</li>
  <li><b>model</b>: entidade <code>Game</code></li>
  <li><b>repository</b>: interface JPA para acesso ao banco de dados</li>
  <li><b>dto</b>: representação dos dados transferidos</li>
</ul>

<hr>

<h2>🚀 Endpoints</h2>

<h3>🔹 GET /games</h3>
<p>Retorna a lista de todos os jogos cadastrados.</p>
<pre><code>[
  {
    "id": 1,
    "title": "God of War",
    "description": "Aventura e ação mitológica",
    "platform": "PlayStation 4",
    "status": "COMPLETED"
  }
]
</code></pre>

<h3>🔹 GET /games/{id}</h3>
<p>Busca um jogo pelo ID.</p>
<b>Resposta (200 OK):</b>
<pre><code>{
  "id": 1,
  "title": "God of War",
  "description": "Aventura e ação mitológica",
  "platform": "PlayStation 4",
  "status": "COMPLETED"
}
</code></pre>

<b>Resposta (404 Not Found):</b>
<p>Sem corpo de resposta.</p>

<h3>🔹 POST /games</h3>
<p>Cadastra um novo jogo.</p>
<b>Corpo da Requisição:</b>
<pre><code>{
  "title": "Elden Ring",
  "description": "RPG de ação em mundo aberto",
  "platform": "PC",
  "status": "PLAYING"
}
</code></pre>

<b>Resposta (201 Created):</b>
<pre><code>{
  "id": 2,
  "title": "Elden Ring",
  "description": "RPG de ação em mundo aberto",
  "platform": "PC",
  "status": "PLAYING"
}
</code></pre>

<h3>🔹 DELETE /games/{id}</h3>
<p>Remove um jogo da lista pelo ID.</p>
<b>Resposta (204 No Content):</b> Jogo deletado com sucesso. <br>
<b>Resposta (404 Not Found):</b> Jogo não encontrado.

<hr>

<h2>📌 Validações</h2>
<ul>
  <li><code>title</code>: obrigatório</li>
  <li><code>description</code>: obrigatório</li>
  <li><code>platform</code>: obrigatório</li>
  <li><code>status</code>: obrigatório (ex: <code>PLAYING</code>, <code>COMPLETED</code>, <code>WISHLIST</code>)</li>
</ul>

<hr>

<p>A API estará disponível em: <a href="http://localhost:8080/games">http://localhost:8080/games</a></p>
