# Avaliacao Continuada

 > Nessa avaliacao foram necessarios implementar as classes abstratas e interface para seguir as regras dada pelo enumciado do exercicio, onde os metodos implementado dentro da classe interface são abstratas por si só, não necesariamente usar 'abstract' no metodo.

## Diagrama
![diagrama](./img/diagrama.jpg)

## Rotas

* Listar todos os atletas

` $ curl localhost:8080/atleta/listar-todos `

  ![listar](./img/listar.jpg)
  
  
* Busca o atleta

` $ curl localhost:8080/atleta/busca-atleta/{atleta} `

  ![buscar](./img/busca.jpg)
  
  
* Adiciona atleta

` $ curl localhost:8080/atleta/adiciona/{atleta}/{nome}/{treino}/{dieta}/{treinador}/{pontos} `

  ![adiciona](./img/adiciona.jpg)
  

* Deleta atleta

` $ curl localhost:8080/atleta/deleta/{atleta} `

  ![deleta](./img/deleta.jpg)
