public class ProblemS7_1Cartao {
    private int numero;
    private int saldoCredito;
    private int saldoTicket;
    
    public ProblemS7_1Cartao(int numero) {
        this.numero = numero;
        this.saldoCredito = 0;
        this.saldoTicket = 0;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public int getSaldoCredito() {
        return saldoCredito;
    }
    
    public int getSaldoTicket() {
        return saldoTicket;
    }
    
    public void adicionarCredito(int quantidade) {
        saldoCredito += quantidade;
    }
    
    public void adicionarTicket(int quantidade) {
        saldoTicket += quantidade;
    }
    
    public void reduzirCredito(int quantidade) {
        saldoCredito -= quantidade;
    }
    
    public void reduzirTicket(int quantidade) {
        saldoTicket -= quantidade;
    }
}