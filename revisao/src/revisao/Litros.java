package revisao;
import javax.swing.JOptionPane;

public class Litros 
{
    public static void main(String[] args)
    {
        double DblDistancia, DblTempo, DblVelocidade, DblLitros;
        
        //entrada
        DblTempo = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo da viagem"));
        DblVelocidade = Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade média"));
        
        //processamento
        DblDistancia = DblTempo * DblVelocidade;
        DblLitros = DblDistancia / 12;
        
        // saída
        JOptionPane.showMessageDialog(null, "Você gastou " + DblLitros + " litros");
    }
}
