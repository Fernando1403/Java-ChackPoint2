# Checkpoint 2 — API REST de Pedidos

**Disciplina:** Arquitetura SOA e Web Services  
**Professor:** Carlos Eduardo Machado de Oliveira  
**Turma:** 3ESR

---

## 👥 Integrantes do Grupo

| Nome | RM |
|---|---|
| Fernando Gonzales Alexandre | RM: 555045 |
| Gabriel Guerreiro | RM: 554973 |
| Lucas Dias | RM: 555450 |
| Luiz Felipe Coelho | RM: 555074 |
| Vitor Musolino | RM: 555012 |

---

## 📋 Descrição

API REST desenvolvida com Spring Boot para gerenciamento de pedidos de clientes.  
Implementa um CRUD completo com banco de dados H2 em memória.

---

## 🚀 Como executar

1. Clone o repositório
2. Abra o projeto no IntelliJ IDEA
3. Aguarde o Maven baixar as dependências
4. Execute a classe `Checkpoint2Application.java`
5. A API estará disponível em: `http://localhost:8085`
6. Console H2: `http://localhost:8085/h2-console`

---

## 🌐 Endpoints

| Método | URL | Descrição |
|---|---|---|
| `GET` | `/pedidos` | Lista todos os pedidos |
| `GET` | `/pedidos/{id}` | Busca pedido por ID |
| `POST` | `/pedidos` | Cria novo pedido |
| `PUT` | `/pedidos/{id}` | Atualiza pedido |
| `DELETE` | `/pedidos/{id}` | Remove pedido |

---

## 📦 Exemplo de JSON para criar/atualizar pedido

```json
{
  "clienteNome": "João da Silva",
  "valorTotal": 150.00
}
```

---

## 🛠️ Tecnologias

- Java 17
- Spring Boot 3.2.5
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Validation
