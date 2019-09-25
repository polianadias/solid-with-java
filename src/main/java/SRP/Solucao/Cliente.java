package SRP.Solucao;

import java.util.Date;

public class Cliente {
    Integer Id;
    String nome;
    String email;
    String cpf;
    Date dataCadastro;
    
    public Boolean IsValid()
    {
        return CPFService.IsValid(cpf);
    }
}
