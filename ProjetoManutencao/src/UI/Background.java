package UI;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
public class Background extends JDesktopPane
{
    private Image foto;
    // string imagem é o caminho da imagem
    public Background(String imagem)
    {
        // ImageIcon transforma o caminho e transforma em um icone. o getImage transforma o icone na imagem
        this.foto = new ImageIcon(imagem).getImage();
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        g.drawImage(foto, 0, 0, getWidth(), getHeight(), this);
    }
}
