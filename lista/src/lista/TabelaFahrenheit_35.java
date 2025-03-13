package lista;
import javax.swing.JOptionPane;
public class TabelaFahrenheit_35 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - inteiro para separar a mensagem
        int nSeparar = 0;
        // - string da mensagem
        String strMensagem = "";
        
        // processamento
        // - for que vai de 1 a 100 um por um
        for (double Celsius = 1; Celsius < 101; Celsius++)
        {
            if (nSeparar < 2)
            {
                strMensagem += Double.toString(Celsius) + "°C em fahrenheit é: " + Double.toString(Celsius * 1.8 + 32) + ",          ";
                nSeparar++;
            }
            else
            {
                strMensagem += Double.toString(Celsius) + "°C em fahrenheit é: " + Double.toString(Celsius * 1.8 + 32) + "\n";
                nSeparar = 0; 
            }
        }
        
        // saída
        // - mostra a mensagem
        JOptionPane.showMessageDialog(null, strMensagem);
    }
}
