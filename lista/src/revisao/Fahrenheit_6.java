package revisao;
import javax.swing.JOptionPane;

public class Fahrenheit_6 
{
    public static void main(String[] args)
    {
        double DblCelsius;
        
        //entrada
        DblCelsius = Double.parseDouble(JOptionPane.showInputDialog("Informe os graus a serem convertidos"));
        
        //processamento e saída
        JOptionPane.showMessageDialog(null, DblCelsius + " Graus Celsius em Fahrenheit é: " + (9 * DblCelsius + 160)/5);
    }
}
