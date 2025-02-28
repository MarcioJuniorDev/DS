package revisao;
import javax.swing.JOptionPane;
public class Estoque_1 {
    public static void main(String[] args) {
        double DblQtdeMin, DblQtdeMax, DblEstoque;
        String strEntrada;
        
        // entrada de dados
        strEntrada = JOptionPane.showInputDialog("Digite o valor da quantidade mínima");        
        DblQtdeMin = Double.parseDouble(strEntrada);
        strEntrada = JOptionPane.showInputDialog("Digite o valor da quantidade máxima");
        DblQtdeMax = Double.parseDouble(strEntrada);
        
        // processamento
        DblEstoque = (DblQtdeMin + DblQtdeMax) / 2;
        
        //saída
        JOptionPane.showMessageDialog(null, "O estoque deve ser: " + DblEstoque);
    }   
}