package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {


    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é minha primeira menssagem nessa nessa rota";
    }

    // Add Ninja - CREATE
    @PostMapping("/criar")
    public String criarNinja(){return "Ninja criado com sucesso!";}

    // Mostrar todos os ninjas - READ
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar Ninja!";
    }

    // Mostrar ninja por ID - READ
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorID(){
        return "Mostrar Ninja por ID";
    }

    // Alterar dados dos ninjas - UPDATE
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Alterar ninja por id";
    }

    // Deletar Ninja DELETE
    @DeleteMapping("/deletarID")
    public String DeletarNinjaPorId(){
        return "Ninja deletado por id";
    }
}
