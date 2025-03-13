package lista;
import javax.swing.JOptionPane;
public class Hexagono_36 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - decimal do lado do hexagono
        double dblLado;
        
        // entrada
        // - pergunta o lado do hexagono, converte para double e atribui ao dblLado
        dblLado = Double.parseDouble(JOptionPane.showInputDialog("informe o lado do hexagono regular"));
        
        // processamento e saída
        // - calcula e exibe as informações pedidas 
        JOptionPane.showMessageDialog(null, 
                // -- √3 = 1.732
                "Área: " + (3 * (dblLado * dblLado))*1.732 / 2 +
                "\n Perímetro: " + dblLado * 6 +
                "\n Apótema: " + (dblLado*1.732) / 2 +
                "\n Raio da circunferência inscrita: " + (dblLado*1.732) / 2 +
                "\n Raio da circunferência circunscrita: " + dblLado
        );
    }
}
