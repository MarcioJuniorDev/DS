package revisao;
import javax.swing.JOptionPane;
public class Modulo_12 
{
    public static void main(String[] args)
    {
        int nValor;
        
        // entrada
        nValor = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
        
        // processamento
        if (nValor < 0)
        {
            nValor = nValor * (-1);
        }
        
        JOptionPane.showMessageDialog(null, nValor);
    }
}
