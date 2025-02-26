package revisao;
import javax.swing.JOptionPane;
public class Combinacao {
    public static void main(String[] args)
    {
        int NValor1, NValor2, NValor3, NValor4;
        
        // entrada
        NValor1 = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        NValor2 = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        NValor3 = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor"));
        NValor4 = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor"));
        
        // processamento e saída
        JOptionPane.showMessageDialog(null, "Somas: " + (NValor1 + NValor2) + "\n" + (NValor1 + NValor3) + "\n" + (NValor1 + NValor4) + "\n" + (NValor2 + NValor3) + "\n" + (NValor2 + NValor4) + "\n" + (NValor3 + NValor4));
        JOptionPane.showMessageDialog(null, "Multiplicações: " + (NValor1 * NValor2) + "\n" + (NValor1 * NValor3) + "\n" + (NValor1 * NValor4) + "\n" + (NValor2 * NValor3) + "\n" + (NValor2 * NValor4) + "\n" + (NValor3 * NValor4));
    }
}