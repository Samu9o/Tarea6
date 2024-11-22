package co.edu.uniandes.graphics.gui;

import javax.swing.*;

public class InterfazPrincipal extends JFrame {

    public InterfazPrincipal() {
        // Configuración básica de la ventana
        setTitle("Interfaz Principal");
        setSize(700, 700); // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Finaliza el programa al cerrar la ventana
        setLocationRelativeTo(null); // Centra la ventana

        // Añadir el panel de dibujo
        add(new PanelLienzo());

        setVisible(true); // Muestra la ventana
    }

    public static void main(String[] args) {
        // Ejecutar la ventana principal
        new InterfazPrincipal();
        SwingUtilities.invokeLater(() -> {
        	PanelLienzo applet = new PanelLienzo();
            applet.setVisible(true);
        });
    }
}
