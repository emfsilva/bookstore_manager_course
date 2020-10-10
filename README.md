# BOOKSTORE 


API SPRING onde pode ser feito o gerênciamento de uma coleção particular de livros, cadastrando nome do livro e autor e isbn, deploy no heroku.

## Bibliotecas utilizadas.

``
Mockito, Lombok, junit, JPA,  H2 banco de dados em memoria, Heroku para deploy
``
## Exemplos de resquest

Para testar é necessário uma ferramenta para fazer os requests diretamente no heroku, durante os testes da aplicação foi usado o **POSTMAN**, mas pode ser usado qual quer outra, inclusive alguma online.

https://reqbin.com/

#### exemplo resquest usando post

https://bookstore-manager-course-udemy.herokuapp.com/api/v1/books

```json
json
{
    "id":1,
    "name":"Investidor Inteligente", 
    "pages": 200, 
    "chapters":20,
    "isbn":"0-596-52068-9", 
    "publisherName": "Harper Collins", 
        "author":{ 
        "id":1, 
        "name":"Benjamin Graham", 
        "age":100 
    } 
}
```


#### exemplo resquest usando get 

https://bookstore-manager-course-udemy.herokuapp.com/api/v1/books/1

