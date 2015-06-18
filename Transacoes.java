import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class Transacao {

    private int numeroDaConta;
    private char tipo;
    private String dado1, dado2;

    public Transacao(int numeroDaConta, char tipo, String dado1, String dado2){
        this.numeroDaConta = numeroDaConta;
        this.tipo = tipo;
        this.dado1 = dado1;
        this.dado2 = dado2;
    }

    public Transacao(int numeroDaConta, char tipo){
        this(numeroDaConta, tipo, null, null);
    }

    public Transacao(DataInputStream in) throws IOException{
        numeroDaConta = in.readInt();
        tipo = in.readChar();
        if(tipo != 'E'){
            dado1 = in.readUTF();
            dado2 = in.readUTF();
        }
    }

    public void salva(DataOutputStream out) throws IOException{
        out.writeInt(numeroDaConta);
        out.writeChar(tipo);
        if(tipo != 'E'){
            out.writeUTF(dado1);
            out.writeUTF(dado2);
        }
    }

    @Override
    public String toString(){
        String resp = numeroDaConta + " " + tipo;
        if(tipo != 'E')
            resp += " " + dado1 + " " + dado2;
        return resp;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getDado1() {
        return dado1;
    }

    public void setDado1(String dado1) {
        this.dado1 = dado1;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getDado2() {
        return dado2;
    }

    public void setDado2(String dado2) {
        this.dado2 = dado2;
    }

}
