package OCP.Solucao;


import java.security.SecureRandom;

public abstract class DebitoConta {
    
    public String NumeroTransacao;
    public abstract String Debitar(Double valor, String conta);
    
    public String FormatarTransacao()
    {
        String  chars = "0123456789ABCDEFGHIJK";
        Integer capacity = 23;
        StringBuilder sb = new StringBuilder( capacity );
        SecureRandom secury = new SecureRandom();
        for( int i = 0; i < capacity; i++ ) {
            sb.append(chars.charAt(secury.nextInt(chars.length())));
            return sb.toString();
        }
        NumeroTransacao = sb.toString();
        
        // Numero de transacao formatado
        return NumeroTransacao;
    }
    
}
