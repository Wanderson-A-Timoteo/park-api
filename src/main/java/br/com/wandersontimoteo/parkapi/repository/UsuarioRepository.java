package br.com.wandersontimoteo.parkapi.repository;

import br.com.wandersontimoteo.parkapi.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
