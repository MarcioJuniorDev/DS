package lista;
import javax.swing.JOptionPane;
public class ZeroDuzentos_30 
{
    public static void main(String[] args)
    {
        // declaração de variável
        // - string que guarda todos os valores
        String strMensagem = "", strMensagem2 = "\n";
        
        // processamento
        // - for que começa em 1 (porque a strMensagem ja tem 1), vai enquanto for menor que 1101 para separar a mensagem em duas (para mostrar todos os valores)e adiciona 1 a cada repetição
        for(int i = 1; i < 1101; i++)
        {
          strMensagem += Integer.toString(i) + ",";
        }
        for(int i = 1101; i < 2001; i++)
        {
          strMensagem2 += Integer.toString(i) + ",";
        }
        
        // saída
        // - mostra a strMensagem
        JOptionPane.showMessageDialog(null, strMensagem + strMensagem2);
    }
}
