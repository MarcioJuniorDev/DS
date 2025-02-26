package revisao;
import javax.swing.JOptionPane;

public class Lata {
    public static void main(String[] args)
    {
        double Volume, Raio, Altura;
        
        //entrada
        Raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio da lata"));
        Altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura da lata"));
        
        //processamento
        Volume = 3.14159 * Raio * Raio * Altura;
        
        //saída
        JOptionPane.showMessageDialog(null," O volume da lata de óleo é: " + Volume);
    }
    
}
