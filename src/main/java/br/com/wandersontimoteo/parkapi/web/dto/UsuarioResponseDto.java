package br.com.wandersontimoteo.parkapi.web.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioResponseDto {

    private Long id;
    private String username;
    private String role;
}
