package lista;
import javax.swing.JOptionPane;
public class Codigo_18 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - inteiro que recebe o valor que o usuário irá informar
        int nCodigo;
        // - string que vai receber o valor por extenso ou inválido
        String strMensagem;
        
        // entrada
        // - pergunta o valor, converte a string informada para inteiro e atribui ao nCodigo
        nCodigo = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
        
        // processamento
        // - usa um switch case para definir o número por extenso ou inválido na strMensagem
        strMensagem = switch (nCodigo) 
        {
            case 1 -> "Um";
            case 2 -> "Dois";
            case 3 -> "Três";
            default -> "Código Inválido";
        };
        
        // saída
        // - mostra a mensagem
        JOptionPane.showMessageDialog(null, strMensagem);
    }
}
