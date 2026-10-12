import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cronometro extends JFrame {
    
    private int horas = 0, minutos = 0, segundos = 0;
    private JLabel lblTiempo;
    private JButton btnInicio, btnPausa, btnParar;
    private Timer timer;
    private boolean pausado = false;

    public Cronometro() {
        setTitle("Cronometro");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        lblTiempo = new JLabel("00:00:00", SwingConstants.CENTER);
        lblTiempo.setFont(new Font("Monospaced", Font.BOLD, 50));
        add(lblTiempo, BorderLayout.CENTER);

        
        JPanel panelBotones = new JPanel();
        btnInicio = new JButton("Inicio");
        btnPausa = new JButton("Pausar");
        btnParar = new JButton("Parar");
        
        panelBotones.add(btnInicio);
        panelBotones.add(btnPausa);
        panelBotones.add(btnParar);
        add(panelBotones, BorderLayout.SOUTH);

        
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundos++;
                if (segundos == 60) { segundos = 0; minutos++; }
                if (minutos == 60) { minutos = 0; horas++; }
                actualizarLabel();
            }
        });

        // Evento Botón Inicio jaja
        btnInicio.addActionListener(e -> {
            timer.start();
            btnPausa.setText("Pausar");
            pausado = false;
        });

        
        btnPausa.addActionListener(e -> {
            if (!pausado) {
                timer.stop();
                btnPausa.setText("Reanudar");
                pausado = true;
            } else {
                timer.start();
                btnPausa.setText("Pausar");
                pausado = false;
            }
        });

        
        btnParar.addActionListener(e -> {
            timer.stop();
            horas = 0; minutos = 0; segundos = 0;
            actualizarLabel();
            btnPausa.setText("Pausar");
        });
    }

    private void actualizarLabel() {
        lblTiempo.setText(String.format("%02d:%02d:%02d", horas, minutos, segundos));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Cronometro().setVisible(true));
    }
}
