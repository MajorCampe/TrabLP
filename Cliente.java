public class Cliente {
    
    private int numeroDaConta;
    private double saldoDaConta;
    private String nomeDoCliente;
    private String dataNascimento;
    private String numeroCPF;
    private char sexo;
    
    public Cliente(int numeroDaConta, String nomeDoCliente, String dataNascimento, double saldoDaConta, String numeroCPF, char sexo){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCliente = nomeDoCliente;
        this.dataNascimento = dataNascimento;
        this.saldoDaConta = saldoDaConta;
        this.numeroCPF = numeroCPF;
        this.sexo = sexo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    
     public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getSaldoDaConta() {
        return dataNascimento;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }
    
    public String getNumeroCPF() {
        return dataNascimento;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }   
}
