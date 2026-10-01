package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaDTO;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaMapper;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MissoesMapper {

    private final NinjaMapper ninjaMapper;

    public MissoesMapper(NinjaMapper ninjaMapper) {
        this.ninjaMapper = ninjaMapper;
    }

    public MissoesModel map(MissoesDTO missoesDTO) {
        if (missoesDTO == null) {
            return null;
        }

        MissoesModel missoesModel = new MissoesModel();
        missoesModel.setId(missoesDTO.getId());
        missoesModel.setNome(missoesDTO.getNome());
        missoesModel.setDificuldade(missoesDTO.getDificuldade());
        if (missoesDTO.getNinjas() != null) {
            List<NinjaModel> ninjaModels = missoesDTO.getNinjas().stream()
                    .map(ninjaMapper::map)
                    .collect(Collectors.toList());
            missoesModel.setNinjas(ninjaModels);
        }

        return missoesModel;
    }

    public MissoesDTO map(MissoesModel missoesModel) {
        if (missoesModel == null) {
            return null;
        }
        MissoesDTO missoesDTO = new MissoesDTO();
        missoesDTO.setId(missoesModel.getId());
        missoesDTO.setNome(missoesModel.getNome());
        missoesDTO.setDificuldade(missoesModel.getDificuldade());
        if (missoesModel.getNinjas() != null) {
            List<NinjaDTO> ninjaDTOs = missoesModel.getNinjas().stream()
                    .map(ninjaMapper::map)
                    .collect(Collectors.toList());
            missoesDTO.setNinjas(ninjaDTOs);
        }

        return missoesDTO;
    }
}

