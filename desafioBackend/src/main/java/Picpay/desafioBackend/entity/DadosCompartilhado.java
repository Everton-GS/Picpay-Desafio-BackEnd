package Picpay.desafioBackend.entity;

import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class DadosCompartilhado {
    
    @NotBlank(message = "nome em branco")
    private String nome;

    @NotBlank(message = "email em branco")
    @Email
    private String email;

    @NotBlank(message = "senha em branco")
    private String senha;

    @NotNull
    private Double saldo;
}
