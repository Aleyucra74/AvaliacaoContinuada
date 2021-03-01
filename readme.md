# Avaliacao Continuada

 > Nessa avaliacao foram necessarios implementar as classes abstratas e interface para seguir as regras dada pelo enumciado do exercicio, onde os metodos implementado dentro da classe interface são abstratas por si só, não necesariamente usar 'abstract' no metodo.


## Rotas

* Listar todos os atletas

` $ curl localhost:8080/atleta/listar-todos `

  ![listar](img/Captura de tela de 2021-02-28 20-28-04.png)
  
  
* Busca o atleta

` $ curl localhost:8080/atleta/busca-atleta/{atleta} `

  ![buscar](img/Captura de tela de 2021-02-28 20-38-21.png)
  
  
* Adiciona atleta

` $ curl localhost:8080/atleta/adiciona/{atleta}/{nome}/{treino}/{dieta}/{treinador}/{pontos} `

  ![adiciona](img/Captura de tela de 2021-02-28 20-40-51.png)
  

* Deleta atleta

` $ curl localhost:8080/atleta/deleta/{atleta} `

  ![deleta](img/Captura de tela de 2021-02-28 20-44-46.png)
