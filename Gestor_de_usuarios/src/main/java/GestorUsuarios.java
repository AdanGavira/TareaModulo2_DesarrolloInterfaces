import javax.swing.*;
import java.awt.*;

public class GestorUsuarios {
    private JLabel GestionUsuarios;
    private JLabel icono;
    private JButton dashboardButton;
    private JButton ayudaButton;
    private JButton usuariosButton;
    private JButton ajustesButton;
    private JButton informesButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel VentaanaPrincipal;
    private JTabbedPane tabbedPane1;
    private JButton cancelarButton;
    private JButton limpiarButton;
    private JButton guardarButton;
    private JCheckBox mostrarNotasCheckBox;
    private JTextField textField4;


    public static void main(String[] args) {
        JFrame frame = new JFrame("GestorUsuarios");
        frame.setContentPane(new GestorUsuarios().VentaanaPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1000, 500);
        frame.setLocationRelativeTo(null);


    }
}
