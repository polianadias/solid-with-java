package LSP.Solucao;

abstract class Paralelogramo {
        
        protected Paralelogramo(int altura, int largura)
        {
            Altura = altura;
            Largura = largura;
        }
        
        public double Altura;
        public double Largura;
        public double Area () {return Altura * Largura; }
}
