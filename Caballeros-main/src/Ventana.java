import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTabbedPane tabbedPane1;
    private JButton registrarButton;
    private JTextField txtID;
    private JTextField txtNombre;
    private JComboBox cmbRango;
    private JComboBox cmbConstelacion;
    private JTextField txtMision;
    private JSpinner spnRecomensa;
    private JSpinner spnNivelD;
    private JSpinner spnNivelP;
    private JTextField txtidModificar;
    private JTextField txtnM;
    private JComboBox cbmrM;
    private JComboBox cbmcM;
    private JSpinner spnpM;
    private JSpinner spndM;
    private JSpinner spnrM;
    private JTextField txtmM;
    private JButton btnModificar;
    private JTextArea txtListar;
    private JButton btnListar;
    private JList lstListar;
    private JButton btnAporteMostrar;
    private JTextField txtIDaporte;
    private JTextArea txtAporte;
    private JSpinner spnMision;
    ReinoDeAtenea reinoDeAtenea = new ReinoDeAtenea();

    public Ventana() {
        SpinnerNumberModel spm=new SpinnerNumberModel(
                1,1,5,1);
        spnNivelD.setModel(spm);
        spndM.setModel(spm);
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int iD = Integer.parseInt(txtID.getText().toString());
                String nombre = txtNombre.getText() ;
                String rango = cmbRango.getSelectedItem().toString();
                String constelacion= cmbConstelacion.getSelectedItem().toString();
                int nivelPoder = (int) spnNivelP.getValue();
                String mision = txtMision.getText();
                int nivelDificultad= (int) spnNivelD.getValue();
                int recompensa= (int) spnRecomensa.getValue();
                Caballero c = new Caballero(iD, nombre, rango ,constelacion,
                        nivelPoder, mision, nivelDificultad, recompensa );
                Aporte aporte = new Aporte(c);
                        reinoDeAtenea.agregar(c,aporte);
                JOptionPane.showMessageDialog(null,"Se agregó el caballero");


            }
        });
        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int iD = Integer.parseInt(txtidModificar.getText().toString());
                String nombre = txtnM.getText() ;
                String rango = cbmrM.getSelectedItem().toString();
                String constelacion= cbmcM.getSelectedItem().toString();
                int nivelPoder = (int) spnpM.getValue();
                String mision = txtmM.getText();
                int nivelDificultad= (int) spnNivelD.getValue();
                int recompensa= (int) spnrM.getValue();
                Caballero c= new Caballero(iD, nombre, rango, constelacion, nivelPoder, mision, nivelDificultad, recompensa);
                Aporte a = new Aporte(c);
                if (reinoDeAtenea.editar(iD, a, c)){
                    JOptionPane.showMessageDialog(null,"Se modificó el caballero");
                }else{
                    JOptionPane.showMessageDialog(null,"No existe ese Caballero");
                }
            }
        });
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtListar.setText(reinoDeAtenea.getCaballeros().toString());
            }
        });
        btnAporteMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int aux = Integer.parseInt(txtIDaporte.getText().toString());

                for(Aporte a : reinoDeAtenea.getAportes()){
                    if(aux == a.getCaballero().getiD() ){
                        txtAporte.setText(a.toString());
                    }

                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
