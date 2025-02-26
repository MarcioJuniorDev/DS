package revisao;
import javax.swing.JOptionPane;

public class Celsius {
    public static void main(String[] args){
    
    double DblFahrenheit;
        
        //entrada
        DblFahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Informe os graus a serem convertidos"));
        
        //processamento e saída
        JOptionPane.showMessageDialog(null, DblFahrenheit + " Fahrenheit em Celsius é: " + (DblFahrenheit - 32)* 5/9);
    }
}