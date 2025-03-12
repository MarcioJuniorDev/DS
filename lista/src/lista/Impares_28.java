package lista;
import javax.swing.JOptionPane;
public class Impares_28 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - string que recebe os números
        String strMensagem = "";
        
        // processamento
        // - for que o i começa em 101 (primeiro impar no intervalo), vai até ser maior ou igual a 201 e soma 2 (para pegar números impares, ja que impar+2 é impar)
        for (int i = 101; i < 201; i += 2) 
        {
            strMensagem += Integer.toString(i) + ", ";
        }
        
        // saída
        // - mostra o strMensagem
        JOptionPane.showMessageDialog(null, strMensagem);
    }
}
