package lista;
import javax.swing.JOptionPane;
public class Modulo_12 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - inteiro que guarda o valor informado pelo usuário
        int nValor;
        
        // entrada
        // - pergunta o valor, converte a string informada para inteiro e atribui a variavel
        nValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        
        // processamento
        // - se o valor for menor que 0, ele se torna positivo
        if (nValor < 0)
        {
            nValor = nValor * (-1);
        }
        
        // saída
        // - mostra o valor modular
        JOptionPane.showMessageDialog(null, nValor);
    }
}
