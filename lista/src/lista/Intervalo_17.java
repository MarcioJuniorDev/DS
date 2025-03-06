package lista;
import javax.swing.JOptionPane;
public class Intervalo_17 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - inteiro do valor que o usuário informa
        int nValor;
        // - string que recebe se é válido ou não
        String strMensagem;
        
        // entrada
        // - pergunta o valor, converte a string informada para inteiro e atribui a nValor
        nValor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        
        // processamento
        // - se o valor estiver entre 0 e 9, ele é válido e salvo na strMensagem
        if(nValor >= 0 && nValor <= 9)
        {
            strMensagem = "Valor Válido";
        }
        // - se o valor não estiver entre 0 e 9, ele é inválido e é salvo na strMensagem
        else
        {
            strMensagem = "Valor Inválido";
        }
        
        // saída
        // - mostra a mensagem
        JOptionPane.showMessageDialog(null, strMensagem);
    }
}
