package poo_exemplo;
public class executavel 
{
    public static void main(String[] args)
    {
        // instanciar objeto
        cachorro cao1 = new cachorro();
        cachorro cao2 = new cachorro();
        cachorro cao3 = new cachorro();
        
        // atribuir atributos 
        cao1.nome = "toby";
        cao1.raca = "pug";
        cao1.peso = 8;
        
        cao2.nome = "tor";
        cao2.raca = "pastor alemão";
        cao2.peso = 40;
        
        cao3.nome = "leon";
        cao3.raca = "dobberman";
        cao3.peso = 45;
        
        // ações
        cao1.latir();
        cao1.comer();
        cao1.verAnimal();
        cao1.brincar();
        cao1.verAnimal();
        
        cao2.latir();
        cao2.comer();
        cao2.verAnimal();
        cao2.brincar();
        cao2.verAnimal();
        
        cao3.latir();
        cao3.comer();
        cao3.verAnimal();
        cao3.brincar();
        cao3.verAnimal();
    }
}
