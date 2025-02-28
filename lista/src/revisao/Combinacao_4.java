package revisao;
import javax.swing.JOptionPane;
public class Combinacao_4 {
    public static void main(String[] args)
    {
        int nValor[] = new int[4], nTotal;
        
        // entrada
        nValor[0] = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        nValor[1] = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        nValor[2] = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor"));
        nValor[3] = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor"));
        
        // processamento
        nTotal = nValor[0] * nValor[1] + nValor[0] * nValor[2] + nValor[0] * nValor[3];
        nTotal += nValor[1] * nValor[0] + nValor[1] * nValor[2] + nValor[1] * nValor[3];
        nTotal += nValor[2] * nValor[0] + nValor[2] * nValor[1] + nValor[2] * nValor[3];
        nTotal += nValor[3] * nValor[0] + nValor[3] * nValor[1] + nValor[3] * nValor[2];
         
        // saída
        JOptionPane.showMessageDialog(null, nTotal);
    }
}