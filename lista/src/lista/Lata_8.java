package lista;
import javax.swing.JOptionPane;
public class Lata_8 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - decimal do volume da lata, raio e altura dela para calcular o volume
        double dblVolume, dblRaio, dblAltura;
        
        // entrada
        // - pergunta o raio e altura da lata, converte a string informada para decimal e atribui a variável
        dblRaio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio da lata"));
        dblAltura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura da lata"));
        
        // processamento
        // - descobre o volume da lata a partir do raio e altura dela
        dblVolume = 3.14159 * dblRaio * dblRaio * dblAltura;
        
        // saída
        // - mostra o volume da lata
        JOptionPane.showMessageDialog(null," O volume da lata de óleo é: " + dblVolume);
    }
    
}
