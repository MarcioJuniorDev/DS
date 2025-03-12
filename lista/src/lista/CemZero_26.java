package lista;
import javax.swing.JOptionPane;
public class CemZero_26 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - string que mostrará todos os números
        String strMensagem = "";
        
        // processamento
        // - for que atribui os numeros de 100 a 1 para a string com a vírgula
        for (int i = 100; i > 0; i--) {
            strMensagem += Integer.toString(i) + ", ";
        }
        
        // saída
        // - mostra o strMensagem
        JOptionPane.showMessageDialog(null, strMensagem);
    }
}
