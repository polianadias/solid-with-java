package OCP.Solucao;

public class DebitoContaCorrente extends DebitoConta {
    
    @Override
    public String Debitar(Double valor, String conta)
    {
        // Debita Conta Corrente
        return FormatarTransacao();
    }
}
