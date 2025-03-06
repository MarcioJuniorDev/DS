package lista;
import javax.swing.JOptionPane;
public class Fahrenheit_6 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - decimal dos graus celsius e dos graus fahrenheit
        double dblCelsius, dblFahrenheit;
        
        // entrada
        // - pergunta o valor que quer converter, converte a string informada para decimal e atribui a variável
        dblCelsius = Double.parseDouble(JOptionPane.showInputDialog("Informe os graus a serem convertidos"));
        
        // processamento
        // - atribui o valor fahrenheit baseado no valor celsius
        dblFahrenheit = (9 * dblCelsius + 160)/5;
        
        // saída
        // - mostra os graus celsius e fahrenheit
        JOptionPane.showMessageDialog(null, dblCelsius + " Graus Celsius em Fahrenheit é: " + dblFahrenheit);
    }
}
