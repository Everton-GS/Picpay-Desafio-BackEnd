package Picpay.desafioBackend.entity;

import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "db_logista")
public class Logista extends DadosCompartilhado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CNPJ
    @NotBlank(message = "cnpj em branco")
    private String cnpj;

    public Logista(String nome, String email, String senha, Double saldo,String cnpj) {
        super(nome, email, senha, saldo);
        this.cnpj=cnpj;
    }
    
}
