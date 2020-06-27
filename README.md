## BOOKSTORE

API SPRING onde pode ser feito o gerênciamento de uma coleção particular de livros, cadastrando nome do livro e autor e isbn, deploy no heroku.

Bibliotecas utilizadas.

Spring, 
Mockito,
Lombok,
junit,
H2 banco de dados em memoria,
Heroku para deploy

Os requests foram testados via **POSTMAN**

###### exemplo de resquest  POST

 https://bookstore-manager-course-udemy.herokuapp.com/api/v1/books
 
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

###### exemplo de Request Get Id

 https://bookstore-manager-course-udemy.herokuapp.com/api/v1/books/1
