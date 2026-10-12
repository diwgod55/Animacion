import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Animacion extends JFrame {
    private int xImagen = 0;
    private int xBackground = 0;
    private Timer timer;
    private Image fondo, personaje;
    private PanelAnimacion panelAnimacion;

    public Animacion() {
        setTitle("Animacion de Personaje");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        fondo = new ImageIcon("background.jpg").getImage();
        personaje = new ImageIcon("_CrouchWalk.png").getImage();

        panelAnimacion = new PanelAnimacion();
        add(panelAnimacion, BorderLayout.CENTER);

        JButton inicio = new JButton("Inicio");
        add(inicio, BorderLayout.SOUTH);

        timer = new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (xImagen < 1920 - 100) {
                    xImagen += 5;
                    xBackground -= 2;
                    panelAnimacion.repaint();
                } else {
                    timer.stop();
                }
            }
        });

        inicio.addActionListener(e -> timer.start());
    }

    class PanelAnimacion extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            if (fondo != null) {
                g.drawImage(fondo, xBackground, 0, null);
            }
            
            if (personaje != null) {
                g.drawImage(personaje, 
                    xImagen, 150, xImagen + 100, 250, 
                    0, 0, 100, 100, 
                    null);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Animacion().setVisible(true));
    }
}
