package OCP.Violacao;

public class DebitoConta {
    
    public void Debitar(Double valor, String conta, TipoConta tipoConta)
    {
        if (tipoConta == TipoConta.Corrente)
        {
            // Debita Conta Corrente
        }
        
        if (tipoConta == TipoConta.Poupanca)
        {
            // Valida Aniversário da Conta
            // Debita Conta Poupança
        }
    }
}
