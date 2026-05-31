# Plan+Invest

Aplicação fullstack de gerenciamento financeiro pessoal desenvolvida com Spring Boot e ReactJS.

## Tecnologias

**Backend:** Java 25, Spring Boot 4.0.6, JPA/Hibernate, Oracle Database  
**Frontend:** ReactJS, Vite, Axios

## Como rodar

### Backend
1. Abra o projeto `planinvest` no IntelliJ IDEA
2. Verifique as credenciais Oracle em `src/main/resources/application.properties`
3. Execute a classe `PlaninvestApplication`
4. API disponível em `http://localhost:8080`

### Frontend
1. Acesse a pasta `planinvest-frontend`
2. Execute `npm install`
3. Execute `npm run dev`
4. Acesse `http://localhost:5173`

> ⚠️ O backend deve estar rodando antes de iniciar o frontend.

## Credenciais de teste
- **Email:** admin@planinvest.com
- **Senha:** admin123

## Entidades e Endpoints

### Usuários — `/usuarios`
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | /usuarios | Lista todos |
| POST | /usuarios | Cria novo |
| PUT | /usuarios/{id} | Atualiza |
| DELETE | /usuarios/{id} | Remove |

### Contas — `/contas`
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | /contas | Lista todas |
| POST | /contas | Cria nova |
| PUT | /contas/{id} | Atualiza |
| DELETE | /contas/{id} | Remove |

### Transações — `/transacoes`
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | /transacoes | Lista todas |
| POST | /transacoes | Cria nova |
| PUT | /transacoes/{id} | Atualiza |
| DELETE | /transacoes/{id} | Remove |

## Observações
- O banco de dados utilizado é a instância Oracle da FIAP
- Não é possível excluir uma conta que possui transações vinculadas (restrição de integridade)
- O projeto foi desenvolvido como Grand Finale da disciplina de Desenvolvimento Fullstack