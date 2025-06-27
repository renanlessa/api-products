# API de Produtos

Uma API RESTful para gerenciamento de produtos desenvolvida com Spring Boot.

## Descrição

Esta API fornece endpoints para acessar informações de produtos, incluindo detalhes como título, preço, descrição, categorias e imagens. Os dados dos produtos são carregados a partir de um arquivo JSON localizado nos recursos da aplicação (`products.json`).

## Tecnologias Utilizadas

- Java
- Spring Boot
- Jackson (para processamento de JSON)

## Endpoints Disponíveis

### Listar todos os produtos

```
GET /api/v1/products
```

Retorna uma lista com todos os produtos disponíveis.

### Buscar produto por ID

```
GET /api/v1/products/{id}
```

Retorna os detalhes de um produto específico com base no ID fornecido.

## Estrutura de Dados

### Produto

```json
{
  "id": Long,
  "title": String,
  "price": Long,
  "description": String,
  "slug": String,
  "category": Category,
  "images": [String],
  "creationAt": DateTime,
  "updatedAt": DateTime
}
```

### Categoria

```json
{
  "id": Long,
  "name": String,
  "slug": String,
  "image": String,
  "creationAt": DateTime,
  "updatedAt": DateTime
}
```

## Como executar

1. Clone este repositório
2. Navegue até a pasta do projeto
3. Execute o comando:

```bash
./mvnw spring-boot:run
```