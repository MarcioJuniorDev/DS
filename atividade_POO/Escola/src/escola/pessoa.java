package escola;
// classe pai e abstrata
import javax.swing.JOptionPane;
public abstract class pessoa 
{
    // atributos
    private String strNome;
    private int nAnoNascimento;
    private String strTelefone;
    
    // métodos
    public void ImprimeDados()
    {
        JOptionPane.showMessageDialog(null,
                "nome: " + this.getStrNome() + 
                "\n Ano de nascimento: " + this.getnAnoNascimento() + 
                "\n Telefone: " + this.getStrTelefone());
    }
    
    public void CalcularIdade(int nAnoAtual)
    {
        JOptionPane.showMessageDialog(null, nAnoAtual - this.getnAnoNascimento() + " anos.");
    }
    
    // construtor
    public pessoa(String strNome, int nAnoNascimento, String strTelefone)
    {
        this.strNome = strNome;
        this.nAnoNascimento = nAnoNascimento;
        this.strTelefone = strTelefone;
    }
    
    // encapsulamento
    public String getStrNome() {
        return strNome;
    }

    public void setStrNome(String strNome) {
        this.strNome = strNome;
    }

    public int getnAnoNascimento() {
        return nAnoNascimento;
    }

    public void setnAnoNascimento(int nAnoNascimento) {
        this.nAnoNascimento = nAnoNascimento;
    }

    public String getStrTelefone() {
        return strTelefone;
    }

    public void setStrTelefone(String strTelefone) {
        this.strTelefone = strTelefone;
    }
}
