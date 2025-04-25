package escola;

import javax.swing.JOptionPane;

public class aluno extends pessoa
{
    // atributos
    String strRm;
    String strSerie;
    String strPeriodo;
    
    // métodos
    public void RecebeAlimentacao()
    {
        if (this.strPeriodo == "ETIM")
        {
            JOptionPane.showMessageDialog(null, "O aluno TEM direito à alimentação.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O aluno NÃO TEM direito à alimentação.");
        }
    }
    
    @Override
    public void ImprimeDados()
    {
        super.ImprimeDados();
        JOptionPane.showMessageDialog(null,
                "\n RM: " + this.strRm +
                "\n Série: " + this.strSerie +
                "\n Período: " + this.strPeriodo
        );
    }
    
    // construtor
    public aluno(String strRm, String strSerie, String strPeriodo, String strNome, int nAnoNascimento, String strTelefone)
    {
        super(strNome, nAnoNascimento, strTelefone);
        this.strRm = strRm;
        this.strSerie = strSerie;
        this.strPeriodo = strPeriodo;
    }
}
