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
}
