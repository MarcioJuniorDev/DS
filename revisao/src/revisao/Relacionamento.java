package revisao;
import javax.swing.JOptionPane;
public class Relacionamento 
{
    public static void main(String [] args)
    {
        int nValor1, nValor2;
        String StrRel = "";
        
        nValor1 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
        nValor2 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));
        
        if (nValor1 >= nValor2)
        {
            StrRel += "Maior ou igual, ";
        }
        else
        {
            if (nValor1 <= nValor2)
            {
                StrRel += "Menor ou igual, ";
            }
        }
        
        if (nValor1 == nValor2)
        {
            StrRel += "igual, ";
        }
        else
        {
            StrRel += "não igual, ";
        }
        
        if (nValor1 > nValor2 && nValor1 != nValor2)
        {
            StrRel += "maior";
        }
        else
        {
            if (nValor1 < nValor2 && nValor1 != nValor2)
            {
                StrRel += "menor";
            }
        }
        
        JOptionPane.showMessageDialog(null, StrRel);
    }
    
}
