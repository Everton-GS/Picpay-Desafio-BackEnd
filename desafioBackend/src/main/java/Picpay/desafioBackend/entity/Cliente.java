package Picpay.desafioBackend.entity;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "db_cliente")
public class Cliente extends DadosCompartilhado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CPF
    @NotBlank(message = "cpf em branco")
    private String cpf;

    public Cliente(String cpf,String nome,String email,String senha,double saldo){
        super(nome,email,senha,saldo);
        this.cpf=cpf;
    }
}
