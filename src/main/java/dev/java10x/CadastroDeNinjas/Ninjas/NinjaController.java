package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {


    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é minha primeira menssagem nessa nessa rota";
    }

    // Add Ninja - CREATE
    @PostMapping("/criar")
    public String criarNinja(){return "Ninja criado com sucesso!";}

    // Mostrar todos os ninjas - READ
    @GetMapping("/listar")
    public String mostrarTodosOsNinjas(){
        return "Mostrar Ninja!";
    }

    // Mostrar ninja por ID - READ
    @GetMapping("/listarID")
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
