package generala;

import java.awt.Image;
import java.awt.Toolkit;

public class VentanaPrincipal extends javax.swing.JFrame {
   
    public VentanaPrincipal() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEmpezar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generala Da Vinci - Velazquez");
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpezar.setText("Empezar a jugar");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 160, 50));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoInicio.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenes/icono.png"));


        return retValue;
    }
    
    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
       VentanaJuego juego = new VentanaJuego();
               juego.setVisible(true);
               this.dispose();
    }//GEN-LAST:event_btnEmpezarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
