package LSP.Violacao;

public class CalculoArea {
    
    private static Double ObterAreaRetangulo(Retangulo ret)
    {
    return ret.Altura * ret.Largura;
    }
    
    public static void Calcular()
    {
        Quadrado quad = new Quadrado();
        
            quad.Altura = 10;
            quad.Largura = 5;
        
        
        ObterAreaRetangulo(quad);
    }
}
