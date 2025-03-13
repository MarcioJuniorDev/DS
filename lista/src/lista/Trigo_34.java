package lista;
import javax.swing.JOptionPane;
import java.math.BigInteger;
public class Trigo_34 
{
   public static void main(String[] args)
   {
       // declaração de variáveis
       // - numero total de grãos e dos graos atuais na casa 
       BigInteger nValor = BigInteger.ONE;
       
       // processamento
       // - for que começa em 1 (ja foi colocado no nValor) e vai até 63 (numero de casas do tabuleiro - 1 pq o primeiro ja foi contabilizado)
       for (int i = 0; i < 64; i++)
       {
           // -- adiciona o nValor nele mesmo (dobrando)
           nValor = nValor.add(nValor);
       }
       
       // saída
       // - mostra o nValor
       JOptionPane.showMessageDialog(null, "o monge receberá " + nValor + " grãos de trigo");
   }
}
