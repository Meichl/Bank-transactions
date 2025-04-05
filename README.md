# Aplicação de um Banco com transações
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)

# 💳 Aplicação Bancária com Transações

Esta é uma API RESTful desenvolvida em **Java** utilizando **Spring Boot** e **Apache Maven**, baseada no desafio técnico de backend do **PicPay** para vagas de desenvolvedor júnior.

A aplicação simula funcionalidades de um sistema de pagamentos, permitindo transações entre usuários, com validações de saldo, tipos de conta e integração com serviços externos simulados.

---

## 🚀 Funcionalidades

- 📋 Cadastro de usuários (Pessoa Física ou Lojista)
- 🔐 Validação de CPF/CNPJ e e-mail (únicos no sistema)
- 💸 Transferências entre usuários (usuário comum → usuário comum / lojista)
- 💰 Validação de saldo antes da transferência
- 🧾 Transações financeiras com rollback automático em caso de falha
- 📡 Integração com serviço autorizador externo (mock)
- 📲 Notificações de recebimento via serviço externo (mock)
- 🧪 Arquitetura preparada para testes e produção

---

## 🧑‍💼 Tipos de Usuário

- **Usuário comum (pessoa física)**: pode **enviar e receber** dinheiro.
- **Lojista (pessoa jurídica)**: pode **apenas receber** dinheiro.

---

## 🔒 Regras de Negócio

- CPF/CNPJ e e-mail devem ser **únicos** no sistema.
- Lojistas **não podem enviar** dinheiro.
- Transferência deve ser **autorizada externamente** antes de ser concluída.
- Transferência deve ser **atômica** (transação revertida em caso de erro).
- Notificações são enviadas ao **destinatário** após recebimento.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (banco em memória)
- **Apache Maven**
- **Lombok**
- **Feign Client / RestTemplate** (integração com serviços externos)
- **Spring Validation**
- **Swagger / OpenAPI**

---

## 🌐 Serviços Externos Simulados (Mocks)

- **Autorizador de Transação**  
  `https://run.mocky.io/v3/5794d450-d2e2-4412-8131-73d0293ac1cc`  
  → Deve retornar `{"message": "Autorizado"}` para aprovar a transação.

- **Serviço de Notificação**  
  `https://run.mocky.io/v3/54dc2cf1-3add-45b5-b5a9-6bf7e7f1f4a6`  
  → Simula envio de SMS ou e-mail ao recebedor.

---

## 📦 Como Executar o Projeto

### Pré-requisitos

- Java 17+
- Maven 3.8+

### Passos

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/banco-transacoes-api.git
cd banco-transacoes-api

# Execute o projeto
./mvnw spring-boot:run
