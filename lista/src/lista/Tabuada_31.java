package lista;
import javax.swing.JOptionPane;
public class Tabuada_31 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - inteiro que o usuario vai informar o numero inicial e até onde ele vai
        int nMultiplicador, nMultiplicando;
        // - string que vai guardar todos os valores, string para atribuir o i, nMultiplicador e multiplicação deles como string
        String strMensagem = "", strI = "", strMultiplicador = "", strResultado = "";

        // entrada
        // - pergunta o numero, converte para inteiro e atribui ao nValor
        nMultiplicador = Integer.parseInt(JOptionPane.showInputDialog("informe o multiplicador"));
        nMultiplicando = Integer.parseInt(JOptionPane.showInputDialog("informe o multiplicando"));
        
        // processamento
        // - for que começa em 0 e vai até ser maior que o multiplicando
        for (int i = 0; i <= nMultiplicando; i++)
        {
            // -- converte os numeros para string porque se não, eles não poderiam ser colocados na strMensagem
            strI = Integer.toString(i);
            strMultiplicador = Integer.toString(nMultiplicador);
            strResultado = Integer.toString(i*nMultiplicador);
            
            // atribui a linha toda à strMensagem e adiciona a partir da segunda iteração
            strMensagem += "\n" + strI + " x " + strMultiplicador + " = " + strResultado;
            
        }
        
        // saída
        // - mostra a strMensagem
        JOptionPane.showMessageDialog(null, strMensagem);
    }
}
