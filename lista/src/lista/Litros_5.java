package lista;
import javax.swing.JOptionPane;
public class Litros_5 
{
    public static void main(String[] args)
    {
        // declaração de variáveis
        // - decimais da distância percorrida, tempo da viagem, velocidade média da viagem e litros gastos
        double dblDistancia, dblTempo, dblVelocidade, dblLitros;
        
        // entrada
        // - pergunta o tempo da viagem e a velocidade média, a string informada é convertida para decimal e atribuida
        dblTempo = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo da viagem"));
        dblVelocidade = Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade média"));
        
        // processamento
        // - descobre a distância percorrida
        dblDistancia = dblTempo * dblVelocidade;
        // - como sabemos que o carro gasta 12L/km, descobrimos quanto foi gasto
        dblLitros = dblDistancia / 12;
        
        // saída
        // - mostra os litros gastos
        JOptionPane.showMessageDialog(null, "Você gastou " + dblLitros + " litros");
    }
}
