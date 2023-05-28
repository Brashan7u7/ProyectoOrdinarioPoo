package InterfazG;
import javax.swing.*;
import java.awt.*;


public class Logueo extends JFrame {
    private JTextField Usuario;
    private JTextField Contrasena;

    public Logueo() {



        super("Logueo");

        JLabel etiquetaNombre = new JLabel("Nombre: ", JLabel.RIGHT);
        Usuario = new JTextField(30);


        JPasswordField etiquetaContra = new JPasswordField("Contraseña: ", JPasswordField.RIGHT);
        Contrasena = new JTextField(30);

        add(etiquetaNombre);
        add(Usuario);
        add(etiquetaContra);
        add(Contrasena);




        setBounds(0,0,400,550);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        setVisible(true);
        this.setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}
