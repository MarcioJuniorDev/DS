package lista;
import javax.swing.JOptionPane;
public class Sinal_21 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - inteiro que guarda o valor do usuario
        int nValor;
        // - string que guarda se é positivo ou negativo
       String strMensagem, strConfirma;
        
        // entrada
        // - pergunta um valor pro usuario, converte a string para int e guarda no nValor
        nValor = Integer.parseInt(JOptionPane.showInputDialog("informe um valor inteiro"));
        
        // processamento
        // - verifica se o usuário quer continuar ou não
        strConfirma = JOptionPane.showInputDialog("deseja continuar? s/n");
        
        if ("s".equals(strConfirma)) 
        {
            // - verifica se é positivo ou não. Se for, guarda que é na strMensagem
            if (nValor >= 0)
            {
                strMensagem = "positivo";
            }
            // se não, guarda na strMensagem que é negativo
            else
            {
                strMensagem = "negativo";
            }
            
        // saída
        // - mostra a mensagem
        JOptionPane.showMessageDialog(null, "seu número é " + strMensagem);
        } 
        // - se o usuario cancelou, mostra q parou
        else 
        {
            JOptionPane.showMessageDialog(null, "cancelado");
        }
    }
}
