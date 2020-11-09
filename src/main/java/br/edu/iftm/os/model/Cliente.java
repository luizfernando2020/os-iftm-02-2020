
package br.edu.iftm.os.model;

import java.util.Date;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Cliente {
    private Integer id;
    private String nomeFantasia;
    private String sobrenome;
    private Date dataNascimento;
    private Date dataCadastro;
    private String cpfCnpj;
    private String rgInscricao;
    private String email;
    private String sexo;
}
