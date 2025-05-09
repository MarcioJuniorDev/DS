package escola;

import javax.swing.JOptionPane;

public class aluno extends pessoa
{
    // atributos
    private String strRm;
    private String strSerie;
    private String strPeriodo;
    
    // métodos
    public void RecebeAlimentacao()
    {
        if (this.getStrPeriodo() == "ETIM")
        {
            JOptionPane.showMessageDialog(null, "O aluno TEM direito à alimentação.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O aluno NÃO TEM direito à alimentação.");
        }
    }
    
    // método polimorfo
    @Override
    public void ImprimeDados()
    {
        super.ImprimeDados();
        JOptionPane.showMessageDialog(null,
                "\n RM: " + this.getStrRm() +
                "\n Série: " + this.getStrSerie() +
                "\n Período: " + this.getStrPeriodo()
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
    
    // encapsulamento
    public String getStrRm() 
    {
        return strRm;
    }

    public void setStrRm(String strRm) 
    {
        this.strRm = strRm;
    }

    public String getStrSerie() 
    {
        return strSerie;
    }

    public void setStrSerie(String strSerie) 
    {
        this.strSerie = strSerie;
    }

    public String getStrPeriodo() 
    {
        return strPeriodo;
    }

    public void setStrPeriodo(String strPeriodo) 
    {
        this.strPeriodo = strPeriodo;
    }
}
