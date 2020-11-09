
package br.edu.iftm.os.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Cliente implements Serializable{
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
