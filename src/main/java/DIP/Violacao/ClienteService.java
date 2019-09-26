package DIP.Violacao;

import SRP.Solucao.Cliente;

public class ClienteService {
    public String AdicionarCliente(Cliente cliente)
    {
        if (!cliente.IsValid())
            return "Dados inválidos";
        
        return "Cliente cadastrado com sucesso";
    }
}
