package revisao;
import javax.swing.JOptionPane;
public class Estoque {
    public static void main(String[] args) { // classe principal
        // cria variavel decimal
        double DblQtdeMin, DblQtdeMax, DblEstoque;
        // cria variavel texto
        String strEntrada;
        
        // entrada de dados
        // ler e escrever da quantidade mínima
        strEntrada = JOptionPane.showInputDialog("Digite o valor da quantidade mínima");        
        // atribuir o valor dado à váriavel (string para double)
        DblQtdeMin = Double.parseDouble(strEntrada);
        // ler e escrever da quantidade máxima e atribuição
        strEntrada = JOptionPane.showInputDialog("Digite o valor da quantidade máxima");
        DblQtdeMax = Double.parseDouble(strEntrada);
        
        // processamento
        // usa o cast pra converter pra int. Sintaxe: (int) variavel
        DblEstoque = (DblQtdeMin + DblQtdeMax) / 2;
        
        //saída
        JOptionPane.showMessageDialog(null, "O estoque deve ser: " + DblEstoque);
    }
    
}
