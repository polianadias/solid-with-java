package OCP.Solucao;

public class DebitoContaInvestimento extends DebitoConta {
    
    @Override
    public String Debitar(Double valor, String conta) {
       
            // Debita Conta Investimento
            // Isentar Taxas
            return FormatarTransacao();
    }
}
