package br.com.bandtec.AvaliacaoContinuada;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/atletas")
public class AtletaController {

    private List<Atleta> atletas = new ArrayList<Atleta>();

    Boolean isCreatead = false;
// caso a lista nao esteja iniciada o metodo nao faz nada, se nao ele inicia a lista com um valor

    public void getIsCreatead() {
        if (!isCreatead) {
            isCreatead=true;
            atletas.add(new Futebol(
                    "paulinho",
                    2,
                    "cardio",
                    "seu paulo",
                    5));
        }
    }

    @GetMapping("/")
    public List<Atleta> getListar(){
        getIsCreatead();
        return this.atletas;
    }

    @GetMapping("/{atleta}")
    public List<Atleta> getBuscar(@PathVariable String atleta){
        getIsCreatead();
        return atletas.stream().filter(a -> a.getNomeAtleta().equals(atleta)).collect(Collectors.toList());
    }

    //futebol
    @PostMapping("/jogador")
    public String postFutebol(@RequestBody Futebol atleta){
        getIsCreatead();
        try {
            atletas.add(atleta);
        }catch (Exception e){
            return e.getMessage();
        }
        return "adicionado com sucesso";
    }

    @PostMapping("/nadador")
    public String postNadador(@RequestBody Nadador atleta){
        getIsCreatead();
        try {
            atletas.add(atleta);
        }catch (Exception e){
            return e.getMessage();
        }
        return "adicionado com sucesso";
    }

    @PostMapping("/corredor")
    public String postCorredor(@RequestBody Corredor atleta){
        getIsCreatead();
        try {
            atletas.add(atleta);
        }catch (Exception e){
            return e.getMessage();
        }
        return "adicionado com sucesso";
    }

    @DeleteMapping("/{atleta}")
    public String getDelete(@PathVariable int atleta){
        if (atleta < atletas.size()) {
            atletas.remove(atleta);
            return "atleta deletado com sucesso";
        }else {
            return "atleta nao encontrado";
        }
    }

}
