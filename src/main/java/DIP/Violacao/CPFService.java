package DIP.Violacao;

public class CPFService {
    
    public static Boolean IsValid(String cpf)
    {
        return cpf.length() == 11;
    }
}
