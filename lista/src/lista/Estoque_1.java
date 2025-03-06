package lista;
import javax.swing.JOptionPane;
public class Estoque_1 
{
    public static void main(String[] args) 
    {
        // declaração de variáveis
        // - decimais da quantidade mínima, quantidade máxima e a quantidade do estoque
        double dblQtdeMin, dblQtdeMax, dblEstoque;
        
        // entrada
        // - pergunta os valores mínimos e máximos, converte a string informada para decimal e atribui às variáveis
        dblQtdeMin = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da quantidade mínima"));        
        dblQtdeMax = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da quantidade máxima"));
        
        // processamento
        // - pega a média dos dois valores
        dblEstoque = (dblQtdeMin + dblQtdeMax) / 2;
        
        //saída
        // - mostra o valor do estoque
        JOptionPane.showMessageDialog(null, "O estoque deve ser: " + dblEstoque);
    }   
}