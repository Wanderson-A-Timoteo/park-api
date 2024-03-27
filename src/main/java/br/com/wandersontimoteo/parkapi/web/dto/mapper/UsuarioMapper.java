package br.com.wandersontimoteo.parkapi.web.dto.mapper;

import br.com.wandersontimoteo.parkapi.entity.Usuario;
import br.com.wandersontimoteo.parkapi.web.dto.UsuarioCreateDto;
import org.modelmapper.ModelMapper;

public class UsuarioMapper {

    public static Usuario toUsuario(UsuarioCreateDto usuarioCreateDto) {
        return new ModelMapper().map(usuarioCreateDto, Usuario.class);
    }
}
