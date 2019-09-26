package ICP.Solucao;

import ICP.Solucao.Interfaces.ICadastroCliente;

public class CadastroCliente implements ICadastroCliente {
    @Override
    public void ValidarDados() {
        // Validar CPF, Email
    }
    
    @Override
    public void SalvarBanco() {
        // Insert na tabela Cliente
    }
    
    @Override
    public void EnviarEmail() {
        // Enviar e-mail para o clienteg
    }
}
