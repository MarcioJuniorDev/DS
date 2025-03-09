package lista;
import javax.swing.JOptionPane;
public class PesoIdeal_25 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - decimal da altura da pessoa
        double dblAltura;
        // - caracter do sexo da pessoa
        char cSexo;
        
        // entrada
        // - pergunta o sexo da pessoa
        cSexo = JOptionPane.showInputDialog("Qual é o seu sexo? (m/f)").charAt(0);
        dblAltura = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua altura?"));
        
        // processamento e saída
        // - verifica qual o sexo da pessoa e mostra o peso ideal
        switch (cSexo)
        {
            case 'm' ->
            {
                JOptionPane.showMessageDialog(null, (72.7 * dblAltura) - 58);
            }
            case 'f' ->
            {
                JOptionPane.showMessageDialog(null, (62.1 * dblAltura) - 44.7);
            }
        } 
    }
}
