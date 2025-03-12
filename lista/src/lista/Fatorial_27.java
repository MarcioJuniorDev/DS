package lista;
import javax.swing.JOptionPane;
public class Fatorial_27 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - inteiro do número que o usuário vai informar e seu fatorial
        int nValor, nFatorial = 1;
        
        // entrada
        // - pergunta o numero ao usuario, converte para decimal e atribui a nValor
        nValor = Integer.parseInt(JOptionPane.showInputDialog("informe um número"));
        
        // processamento
        // - for que o i começa em 1 e, enquanto ele for menor que o número, adiciona no fatorial e soma um no i
        for (int i = 1; i <= nValor; i++) 
        {
            nFatorial *= i;
        }
        
        // saída
        // - mostra o número digitado e seu fatorial
        JOptionPane.showMessageDialog(null, "o fatorial de " + nValor + " é " + nFatorial);
    }
}
