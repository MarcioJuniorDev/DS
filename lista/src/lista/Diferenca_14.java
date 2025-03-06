package lista;
import javax.swing.JOptionPane;
public class Diferenca_14 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - decimal do primeiro valor, segundo valor e diferença entre eles
        double dblValor1, dblValor2, dblDiferenca;
        
        // entrada
        // - pergunta quais são os dois valores, converte a string informada para int e atribui à variável
        dblValor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
        dblValor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
        
        // processamento
        // - verifica se o primeiro valor é maior que o segundo, vendo qual numero sera subtraido de qual
         if(dblValor1 > dblValor2)
         {
             dblDiferenca = dblValor1 - dblValor2;
         }
         else
         {
             dblDiferenca = dblValor2 - dblValor1;
         }
         
         //saída
         // - mostra o primeiro valor, o segundo valor e a diferença entre eles
         JOptionPane.showMessageDialog(null, "primeiro valor: " + dblValor1 + "\nsegundo valor: " + dblValor2 + "\nA diferença: " + dblDiferenca);
    }
}
