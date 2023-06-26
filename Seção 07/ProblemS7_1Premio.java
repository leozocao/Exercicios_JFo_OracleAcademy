public class ProblemS7_1Premio {
        private String nome;
        private int ticketsObrigatorios;
        private int quantidadeDisponivel;
        
        public ProblemS7_1Premio(String nome, int ticketsObrigatorios, int quantidadeDisponivel) {
            this.nome = nome;
            this.ticketsObrigatorios = ticketsObrigatorios;
            this.quantidadeDisponivel = quantidadeDisponivel;
        }
        
        public String getNome() {
            return nome;
        }
        
        public int getTicketsObrigatorios() {
            return ticketsObrigatorios;
        }
        
        public int getQuantidadeDisponivel() {
            return quantidadeDisponivel;
        }
        
        public void reduzirQuantidadeDisponivel() {
            quantidadeDisponivel--;
        }
    
}
