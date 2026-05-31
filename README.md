# Plan+Invest

Aplicação fullstack de gestão financeira pessoal: controle de gastos, categorização de transações e acompanhamento de metas. Projeto desenvolvido na FIAP.

## Tecnologias

**Backend:** Java 21, Spring Boot 4.0.6, Spring Data JPA / Hibernate, Oracle Database, API REST
**Frontend:** React 19, Vite, React Router, Axios

## Estrutura do projeto

```
.
├── Backend/      API REST em Spring Boot
└── Frontend/     SPA em React + Vite
```

## Como rodar

### Backend

1. Abra a pasta `Backend` no IntelliJ IDEA.
2. Configure as credenciais do banco via variáveis de ambiente (veja [Configuração do banco](#configuração-do-banco)).
3. Execute a classe `PlaninvestApplication`.
4. A API ficará disponível em `http://localhost:8080`.

### Frontend

1. Acesse a pasta `Frontend`.
2. Instale as dependências: `npm install`.
3. Inicie o servidor de desenvolvimento: `npm run dev`.
4. Acesse `http://localhost:5173`.

> ⚠️ O backend precisa estar rodando antes de iniciar o frontend.

## Configuração do banco

As credenciais do banco **não ficam no código** — são lidas de variáveis de ambiente. Use o arquivo `Backend/src/main/resources/application.properties.example` como referência.

Defina as seguintes variáveis no seu ambiente (ou no campo *Environment variables* da configuração de execução do IntelliJ):

| Variável | Descrição |
|----------|-----------|
| `DB_URL` | URL JDBC do banco (opcional — há um valor padrão) |
| `DB_USERNAME` | Usuário do banco |
| `DB_PASSWORD` | Senha do banco |

## Funcionalidades

CRUD completo das principais entidades do domínio, expostas via API REST e consumidas pelo frontend:

- **Usuários** — cadastro e gestão de usuários
- **Contas** — contas financeiras do usuário
- **Transações** — registro de receitas e despesas
- **Categorias** — categorização das transações
- **Metas** — metas financeiras
- **Contribuições de meta** — aportes para as metas
- **Endereços** — dados de endereço do usuário

### Endpoints REST

Cada entidade segue o mesmo padrão de rotas. Exemplo para `/usuarios`:

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/usuarios` | Lista todos |
| GET | `/usuarios/{id}` | Busca por id |
| POST | `/usuarios` | Cria novo |
| PUT | `/usuarios/{id}` | Atualiza |
| DELETE | `/usuarios/{id}` | Remove |

O mesmo padrão se aplica a `/contas`, `/transacoes`, `/categorias`, `/metas`, `/contribuicoes-meta` e `/enderecos`.

## Observações

- O banco utilizado é a instância Oracle da FIAP.
- Não é possível excluir uma conta que possua transações vinculadas (restrição de integridade).
- Projeto desenvolvido como Grand Finale da disciplina de Desenvolvimento Fullstack.

## Status

🚧 Em desenvolvimento — o projeto segue em evolução ao longo do ano letivo.
