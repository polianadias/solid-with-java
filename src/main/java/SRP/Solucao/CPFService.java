package SRP.Solucao;

public class CPFService {
    
        public static Boolean IsValid(String cpf)
        {
            return cpf.length() == 11;
        }
}
