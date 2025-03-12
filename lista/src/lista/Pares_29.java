package lista;
import javax.swing.JOptionPane;
public class Pares_29 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - string que recebe os números
        String strMensagem = "";
        
        // processamento
        // - for que o i começa em 100 (primeiro par do intervalo), vai até 201(entre 100 e 200) e soma 2 (para pegar números pares, ja que par+2 é par)
        for (int i = 100; i < 201; i += 2) 
        {
            strMensagem += Integer.toString(i) + ", ";
        }
        
        // saída
        // - mostra o strMensagem
        JOptionPane.showMessageDialog(null, strMensagem);
    }
}
