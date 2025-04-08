package poo_exemplo;
import javax.swing.JOptionPane;
public class cachorro extends Dono
{
    // atributos
    String nomeCachorro;
    String raca;
    double peso;
    
    // construtor
    cachorro(String nomeCachorro, String raca, double peso, String nomeDono, int idade, String telefone)
    {
        super(nomeCachorro, idade, telefone);
        this.nomeCachorro = nomeCachorro;
        this.raca = raca;
        this.peso = peso;
    }
    // métododos
    public void latir()
    {
        JOptionPane.showMessageDialog(null, "o " + nomeCachorro + " está latindo");
    }
    
    public void brincar()
    {
        JOptionPane.showMessageDialog(null, "o " + nomeCachorro + " está brincando");
        peso -= 1;
    }
    
    public void comer()
    {
        JOptionPane.showMessageDialog(null, "o " + nomeCachorro + " está comendo");
        peso += 1;
    }
    
    public void verAnimal()
    {
        JOptionPane.showMessageDialog(null, "o " + nomeCachorro + " da raça " + raca + " está pesando " + peso + " quilos");
    }
}
