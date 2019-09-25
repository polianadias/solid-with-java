package SRP.Violacao;

import java.util.Date;

public class Cliente {
    Integer Id;
    String nome;
    String email;
    String cpf;
    Date dataCadastro;
    
    public String adicionarCliente(){
    
     if (cpf.length() != 11){
            return "Cliente com CPF inválido";
    }
        return "Cliente cadastrado com sucesso!";
}
}
