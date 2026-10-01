package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {NinjaMapper.class})
public interface MissoesMapper {

    MissoesModel map(MissoesDTO missoesDTO);

    MissoesDTO map(MissoesModel missoesModel);
}

