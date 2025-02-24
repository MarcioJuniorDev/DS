package revisao;
import javax.swing.JOptionPane;
public class Combinacao 
{
    public static void main(String[] args)
    {
        int nValor[] = new int[4];
        
        // entrada
        nValor[0] = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        nValor[1] = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        nValor[2] = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor"));
        nValor[3] = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor"));
        
        // processamento e saída
        JOptionPane.showMessageDialog(null, "Somas: " + 
                // somas usando a função Calculo (logo abaixo). Enter apenas para identação
                Calculo(nValor[0], nValor[1], '+') + ", " +
                Calculo(nValor[0], nValor[2], '+') + ", " +
                Calculo(nValor[0], nValor[3], '+') + ", " +
                Calculo(nValor[1], nValor[2], '+') + ", " +
                Calculo(nValor[1], nValor[3], '+') + ", " +
                Calculo(nValor[2], nValor[3], '+') + ", " +
                
                // multiplicações, mesma coisa das somas
                "\n Multiplicações: " + 
                Calculo(nValor[0], nValor[1], '*') + ", " +
                Calculo(nValor[0], nValor[2], '*') + ", " +
                Calculo(nValor[0], nValor[3], '*') + ", " +
                Calculo(nValor[1], nValor[2], '*') + ", " +
                Calculo(nValor[1], nValor[3], '*') + ", " +
                Calculo(nValor[2], nValor[3], '*'));
    }
    
    // função Calculo
    public static int Calculo(int nA, int nB, char cSinal)
    {
        if (cSinal == '+')
        {
            return nA + nB;
        }
        else
        {
            return nA * nB;
        }
    }
}