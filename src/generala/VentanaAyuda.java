package generala;

import java.awt.Image;
import java.awt.Toolkit;

public class VentanaAyuda extends javax.swing.JFrame {

    public VentanaAyuda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAyuda = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generala Da Vinci - Velazquez");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAyuda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAyuda.setForeground(new java.awt.Color(240, 240, 240));
        lblAyuda.setText("<html><h1>Tabla de Puntajes</h1> <br> \t\n<br>\n<br> <strong>Par:</strong> es cuando 2 dados son iguales y equivale a 200 puntos. \n<br> <strong>Pierna:</strong> es cuando 3 dados son iguales y equivale a 300 puntos.\n<br> <strong>Poker:</strong>  es cuando 4 dados son iguales y equivale a 400 puntos\n<br> <strong>Full:</strong>  es cuando 5 dados son iguales y equivale a 500 puntos.\n<br> <strong>Generala:</strong> es cuando todos los dados son iguales y equivale a 600 puntos.\n<br> <strong>Escalera:</strong> es cuando todos los dados que salen son distintos formando una escalera y equivale a 1000 puntos  <br>    </html> ");
        getContentPane().add(lblAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 590, 240));

        btnVolver.setText("Volver ");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 110, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAyuda.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

 public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenes/icono.png"));


        return retValue;
    }    
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       VentanaJuego juego = new VentanaJuego();
               juego.setVisible(true);
               this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAyuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblAyuda;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
