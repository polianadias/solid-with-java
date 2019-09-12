package SRP.Violacao;

import java.util.Date;
import java.sql.Connection;

public class Cliente {
    Integer Id;
    String nome;
    String email;
    String cpf;
    Date dataCadastro;
    
    public static Connection connection;
    
    public String adicionarCliente(){
    
     if(!email.contains("@")){
         return "Cliente com e-mail inválido";
     }
    
     if (cpf.length() != 11){
            return "Cliente com CPF inválido";
    }
        return "Cliente cadastrado com sucesso!";
}
}
