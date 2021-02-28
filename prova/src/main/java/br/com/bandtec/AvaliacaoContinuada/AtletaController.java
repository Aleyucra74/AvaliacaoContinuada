package br.com.bandtec.AvaliacaoContinuada;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/atleta")
public class AtletaController {

    private List<Atleta> atletas = new ArrayList<Atleta>();

    public AtletaController() {
        this.atletas.add(new Futebol(
                "paulinho",
                2,
                "cardio",
                "seu paulo",
                5));
        this.atletas.add(new Corredor(
                "marquinhos",
                5,
                "folga",
                "carlao",
                10));
        this.atletas.add(new Nadador(
                "felps",
                3,
                "carioca",
                "juliao",
                20));
    }

    @GetMapping("/listar-todos")
    public List<Atleta> listar(){
        return  this.atletas;
    }

    @GetMapping("/busca-atleta/{atleta}")
    public List<Atleta> buscar(@PathVariable String atleta){
        return atletas.stream().filter(a -> a.getNomeAtleta().equals(atleta)).collect(Collectors.toList());
    }

    @GetMapping("/adiciona/{atleta}/{nome}/{treino}/{dieta}/{treinador}/{pontos}")
    public String adiciona(@PathVariable String atleta,
                           @PathVariable String nome,
                           @PathVariable Integer treino,
                           @PathVariable String dieta,
                           @PathVariable String treinador,
                           @PathVariable Integer pontos
                           ){
        try {
            switch (atleta){
                case "futebol" :
                    this.atletas.add(new Futebol(
                            nome,
                            treino,
                            dieta,
                            treinador,
                            pontos));
                case "nadador" :
                    this.atletas.add(new Nadador(
                            nome,
                            treino,
                            dieta,
                            treinador,
                            pontos));
                case "corredor" :
                    this.atletas.add(new Corredor(
                            nome,
                            treino,
                            dieta,
                            treinador,
                            pontos));
            }

        }catch (Exception e){
            return e.getMessage();
        }
        return "adicionado com sucesso";
    }

    @DeleteMapping("/deleta/{atleta}")
    public String deleta(@PathVariable Integer atleta){
        if (atleta < atletas.size()) {
            atletas.remove(atleta);
            return "atleta deletado com sucesso";
        }else {
            return "atleta nao encontrado";
        }
    }

}
