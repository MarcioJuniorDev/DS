package lista;
import javax.swing.JOptionPane;
public class MultiploDeDez_33 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - string que mostrará as mensagens
        String strMensagem = "";
        
        // processamento
        // - for que vai de 1 a 100 um por um
        for (int i = 1; i < 101; i++)
        {
            if (i%10 == 0)
            {
                strMensagem += Integer.toString(i) + "(Múltiplo de 10) \n";
            }
            else
            {
                strMensagem += Integer.toString(i) + ", ";
            }
        }
        
        // saída
        // - mostra a strMensagem
        JOptionPane.showMessageDialog(null, strMensagem);
    }
}
