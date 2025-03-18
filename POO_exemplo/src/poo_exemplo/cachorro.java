package poo_exemplo;
import javax.swing.JOptionPane;
public class cachorro 
{
    // atributos
    String nome;
    String raca;
    double peso;
    
    // métododos
    public void latir()
    {
        JOptionPane.showMessageDialog(null, "o " + nome + " está latindo");
    }
    
    public void brincar()
    {
        JOptionPane.showMessageDialog(null, "o " + nome + " está brincando");
        peso -= 1;
    }
    
    public void comer()
    {
        JOptionPane.showMessageDialog(null, "o " + nome + " está comendo");
        peso += 1;
    }
    
    public void verAnimal()
    {
        JOptionPane.showMessageDialog(null, "o " + nome + " da raça " + raca + " está pesando " + peso + " quilos");
    }
}
