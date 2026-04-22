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

---

## 📷 Prints

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/3bfccf85-d928-4a5f-9976-837397c66e19" />
<img width="1919" height="1018" alt="image" src="https://github.com/user-attachments/assets/eb5a61ad-158b-4785-9dec-5d1133845e71" />
<img width="1915" height="1019" alt="image" src="https://github.com/user-attachments/assets/ee1388aa-ecc3-4f82-8023-ab135aa3b4ec" />
<img width="1919" height="1019" alt="image" src="https://github.com/user-attachments/assets/8f4c76ef-682a-470a-ab01-25916f660ce9" />
<img width="1919" height="1014" alt="image" src="https://github.com/user-attachments/assets/2d56d2bc-2807-446e-96d5-6c0db4656ec6" />


