package lista;
import javax.swing.JOptionPane;
public class Combinacao_4 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - cria um vetor com 4 posições e uma variável inteira que guardará o valor dos vetores multiplicados e somados
        int nValor[] = new int[4], nTotal;
        
        // entrada
        // - cria um dialógo que pergunta o valor. Em seguida converte a string informada para int ( Integer.parseInt() ) e atribui o valor para a posição respectiva do vetor
        nValor[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        nValor[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        nValor[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor"));
        nValor[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor"));
        
        // processamento
        // - multiplica os vetores com eles mesmos, somando as distributivas (n0 (n1 + n2 + n3), e atribui esse valor a nTotal
        nTotal = nValor[0] * nValor[1] + nValor[0] * nValor[2] + nValor[0] * nValor[3];
        // -- continua fazendo a mesma lógica anterior, adicionando ao nTotal a cada vez.
        nTotal += nValor[1] * nValor[0] + nValor[1] * nValor[2] + nValor[1] * nValor[3];
        nTotal += nValor[2] * nValor[0] + nValor[2] * nValor[1] + nValor[2] * nValor[3];
        nTotal += nValor[3] * nValor[0] + nValor[3] * nValor[1] + nValor[3] * nValor[2];
         
        // saída
        // - mostra o nTotal
        JOptionPane.showMessageDialog(null, nTotal);
    }
}