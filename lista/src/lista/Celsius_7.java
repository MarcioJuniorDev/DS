package lista;
import javax.swing.JOptionPane;
public class Celsius_7 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - variável decimal que é o valor em Fahrenheit que o usuário diz e o valor em °C que será convertido
        double dblFahrenheit, dblCelsius;
        
        //entrada
        // - mostra um dialogo (JOptionPane.ShowInputDialog) pedindo o valor em °F. Em seguida, converte a string da resposta em decimal e atribui esse valor a DblFahrenheit
        dblFahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Informe os graus a serem convertidos"));
        
        // processamento
        // - faz o valor de DblCelsius ser igual ao valor em Fahrenheit convertido
        dblCelsius = (dblFahrenheit - 32) * 5/9;
        
        // saída
        // - mostra um dialogo que mostra o valor informado e o valor convertido
        JOptionPane.showMessageDialog(null, dblFahrenheit + " graus Fahrenheit em Celsius é: " + dblCelsius);
    }
}