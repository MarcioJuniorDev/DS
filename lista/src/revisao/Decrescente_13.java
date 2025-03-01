package revisao;
import javax.swing.JOptionPane;
public class Decrescente_13 
{
    public static void main(String [] args)
    {
        int nValor1, nValor2, nValor3, nPos1, nPos2 = 0, nPos3;
        
        // entrada
        nValor1 = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        nValor2 = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        nValor3 = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor"));
        
        // processamento
        if (nValor1 > nValor2 && nValor1 > nValor3)
        {
            nPos1 = nValor1;
        }
        else
        {
            if (nValor2 > nValor3)
            {
                nPos1 = nValor2;
            }
            else
            {
                nPos1 = nValor3;
            }
        }
        
        if (nValor2 < nValor1 && nValor2 > nValor3 || nValor2 > nValor1 && nValor2 < nValor3)
        {
            nPos2 = nValor2;
        }
        else
        {
            if (nValor1 < nValor2 && nValor1 > nValor3 || nValor1 > nValor2 && nValor1 < nValor3)
            {
                nPos2 = nValor1;
            }
            else
            {
                if (nValor3 < nValor1 && nValor3 > nValor2 || nValor3 > nValor1 && nValor3 < nValor2)
                {
                    nPos2 = nValor3;
                }
            }
        }
        
        if (nValor1 < nValor2 && nValor1 < nValor3)
        {
            nPos3 = nValor1;
        }
        else
        {
            if (nValor2 < nValor3)
            {
                nPos3 = nValor2;
            }
            else
            {
                nPos3 = nValor3;
            }
        }

        JOptionPane.showMessageDialog(null, nPos1 + ", " + nPos2 + ", " + nPos3);
    }
}