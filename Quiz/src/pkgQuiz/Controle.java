package pkgQuiz;

import javax.swing.JOptionPane;

public class Controle 
{
    // variavel estatica faz ela se tornar 
    private static int nAcertos;                   

    // getters e setters
    public int getnAcertos() 
    {
        return nAcertos;
    }

    public void setnAcertos(int nAcertos) 
    {
        this.nAcertos = nAcertos;
    }
    
    // métodos
    public void fnResultado()
    {
        JOptionPane.showMessageDialog(null, "você obteve " + this.nAcertos + " acertos");
    }
}
