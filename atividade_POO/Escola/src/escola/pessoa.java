package escola;
// classe pai
import javax.swing.JOptionPane;
public class pessoa 
{
    // atributos
    String strNome;
    int nAnoNascimento;
    String strTelefone;
    
    // métodos
    public void ImprimeDados()
    {
        JOptionPane.showMessageDialog(null,
                "nome: " + this.strNome + 
                "\n Ano de nascimento: " + this.nAnoNascimento + 
                "\n Telefone: " + this.strTelefone);
    }
    
    public void CalcularIdade(int nAnoAtual)
    {
        JOptionPane.showMessageDialog(null, nAnoAtual - this.nAnoNascimento + " anos.");
    }
    
    // construtor
    public pessoa(String strNome, int nAnoNascimento, String strTelefone)
    {
        this.strNome = strNome;
        this.nAnoNascimento = nAnoNascimento;
        this.strTelefone = strTelefone;
    }
}
