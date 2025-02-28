package revisao;
import javax.swing.JOptionPane;
public class Troca_11 
{
    public static void main(String [] args)
    {
        int nValor1, nValor2, nTroca;
        
        // entrada
        nValor1 = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        nValor2 = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        
        // processamento
        nTroca = nValor1;
        nValor1 = nValor2;
        nValor2 = nTroca;
        
        // saída
        JOptionPane.showMessageDialog(null, "Primeiro valor: " + nValor1 + ", segundo valor: " + nValor2);
    }
}
