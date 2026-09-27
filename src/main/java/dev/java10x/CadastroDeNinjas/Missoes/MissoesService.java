package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {
    private MissoesRepository missoesRepository;


    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    public MissoesModel listarMissoesPorId(Long id){
        Optional<MissoesModel> missoesPorId = missoesRepository.findById(id);
        return missoesPorId.orElse(null);
    }
    public MissoesModel criarMissoes(MissoesModel missao){ return missoesRepository.save(missao);}

    public void deletarMissoesPorId(Long id){
        missoesRepository.deleteById(id);

    }
    public MissoesModel atualizarMissoes(Long id, MissoesModel missoesAtualizada){
        if (missoesRepository.existsById(id)) {
            missoesAtualizada.setId(id);
            return missoesRepository.save(missoesAtualizada);
        }
        return null;
    }
}
