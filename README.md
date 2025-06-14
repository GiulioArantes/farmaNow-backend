# FarmaNow - Farmácia Digital

![FarmaNow Main Page](https://i.postimg.cc/SxrWPh4Y/FarmaNow.png)

**FarmaNow** é uma aplicação web intuitiva para gerenciamento e controle de produtos de farmácia, desenvolvida com **React** no front-end e **Spring Boot** no back-end. A plataforma permite que usuários cadastrem, atualizem e excluam categorias e produtos, além de visualizar informações de forma simples, rápida e eficiente.
>⚠️ **Observação:** Este repositório contém o back-end da aplicação, responsável pela API e integração com o banco de dados MySQL.
>🔗 O front-end já está implementado e pode ser acessado clicando [aqui](https://github.com/GiulioArantes/farmanow).

## ✨ Funcionalidades

* 🔗 **API RESTful completa**, seguindo boas práticas de desenvolvimento.
* **🔎 CRUD de Produtos e Categorias:**
    * Cadastrar, listar, editar e excluir.
    * Buscar por ID, nome ou departamento.

*  🏗️ **Arquitetura organizada:**
    * **Model:** Estrutura das entidades (Produto e Categoria).
    * **Repository:** Comunicação com o banco de dados, incluindo consultas personalizadas.
    * **Service:** Regra de negócio e tratamento de erros.
    * **Controller:** Disponibilização dos endpoints para consumo externo.
*  🚀 **Escalável:** Estrutura pensada para crescimento e inclusão de novas funcionalidades no futuro.
> 💡 Este projeto é um MVP e seguirá em constante evolução para atender a demandas mais robustas no gerenciamento de farmácias.

## 🚀 Tecnologias Utilizadas

Este projeto foi construído com uma stack moderna, performática e escalável:

* **Backend & Banco de Dados:**
    * [**Spring Boot**](https://spring.io/projects/spring-boot) - Framework Java para aplicações web robustas e seguras.
    * [**MySQL**](https://www.mysql.com/) - Banco de dados relacional utilizado para persistência dos dados.

* **Testes:**
    * [**Postman**](https://www.postman.com/) - Ferramenta usada para validar as requisições HTTP.

## ⚙️ Como Rodar o Projeto

### 🖥️ Aplicação Back-end

Siga os passos abaixo para executar o projeto em seu ambiente local.

```bash
# 1. Clone o repositório
git clone https://github.com/GiulioArantes/farmaNow-backend.git

# 2. Navegue até o diretório do projeto
cd farmaNow-backend

# 3. Configure o arquivo application.properties em:
src/main/resources/application.properties

# 4. Defina suas credenciais e informações do banco de dados MySQL

# 5. Execute a aplicação Spring Boot
```

## 🌐 Front-end

> **🔗 Importante:** Para utilizar este back-end, é necessário rodar o front-end da aplicação.
> Acesse o repositório do front-end clicando [aqui](https://github.com/GiulioArantes/farmanow) e siga as instruções disponíveis por lá.

### 🔗 Endpoints

> ✅ Supondo que a aplicação está rodando na porta padrão `localhost:8080` (ajuste conforme necessário).

**GET**
* `/products` — Lista todos os produtos
* `/categories` — Lista todas as categorias
* `/products/{id}` — Busca um produto por ID
* `/categories/{id}` — Busca uma categoria por ID
* `/products/name/{name}` — Busca produtos por nome
* `/categories/department/{department}` — Busca categorias por departamento

**POST & PUT**
*  `/products` — Cria ou atualiza um produto
*  `/categories` — Cria ou atualiza uma categoria

> ⚠️ No método **PUT**, o ID do item a ser alterado deve ser informado no corpo do JSON.

**DELETE**
* `/products/{id}` — Deleta um produto
* `/categories/{id}` — Deleta uma categoria

## 🤝 Contribuição

Sua colaboração é muito bem-vinda! Existem duas formas de contribuir:

* **💡 Sugestões e feedbacks:** Me envie um e-mail em [giulio.arantes@icloud.com](giulio.arantes@icloud.com) ou me chame no [LinkedIn](https://www.linkedin.com/in/giulio-arantes/).
* **🔧 Contribuição no código:** Fork o projeto, crie suas melhorias e envie um Pull Request.

> Toda contribuição será analisada com atenção e respeito. Vamos construir algo incrível juntos! 💙
