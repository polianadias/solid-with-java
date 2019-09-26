package DIP.Solucao;

import DIP.Solucao.Interface.ICPFService;
import SRP.Solucao.CPFService;

import java.util.Date;

public class Cliente {
    
    private  ICPFService cpfService;
    
    public Cliente(ICPFService cpfService) {
        this.cpfService = cpfService;
    }
    
    Integer Id;
    String nome;
    String email;
    String cpf;
    Date dataCadastro;
    
    public Boolean IsValid()
    {
        return cpfService.IsValid(cpf);
    }
    
}
