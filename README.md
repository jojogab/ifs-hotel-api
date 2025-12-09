# 🏨 IFS Hotel API

> API REST desenvolvida com Spring Boot para gerenciamento de reservas e administração hoteleira.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![H2 Database](https://img.shields.io/badge/H2_Database-003B57?style=for-the-badge&logo=h2&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

## 📖 Sobre o Projeto

O **Hotel API** é um sistema backend desenvolvido como estudo de caso para gerenciamento de um hotel. O objetivo é fornecer endpoints para controlar todo o fluxo de hospedagem, desde o cadastro de cidades e hóspedes até o check-out e cálculo de diárias.

O projeto segue as regras de negócio definidas no diagrama de classes do estudo de caso, implementando conceitos de Orientação a Objetos e arquitetura em camadas.

---

## 🚀 Tecnologias Utilizadas

O projeto foi configurado com as seguintes dependências:

* **Java 21**
* **Spring Boot 4.0.0**
    * `spring-boot-starter-web`: Criação da API REST.
    * `spring-boot-starter-data-jpa`: Persistência de dados com Hibernate.
    * `spring-boot-devtools`: Ferramentas para facilitar o desenvolvimento (Hot reload).
* **H2 Database**: Banco de dados em memória para desenvolvimento rápido e testes.
* **Maven**: Gerenciamento de dependências.

---

## 📂 Estrutura do Projeto

A arquitetura segue o padrão de camadas (Layered Architecture):

```text
br.ifs.edu.cads.api.hotel
├── controller   # Camada de API (Endpoints REST)
├── dto          # Objetos de Transferência de Dados (Records)
├── model        # Entidades JPA e Enumerações
├── repository   # Interfaces de acesso ao banco (Spring Data)
└── service      # Regras de Negócio