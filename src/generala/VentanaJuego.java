package generala;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Random;

public class VentanaJuego extends javax.swing.JFrame {

    static Random rnd = new Random();

    public VentanaJuego() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblComputadora = new javax.swing.JLabel();
        lblJugador = new javax.swing.JLabel();
        btnTirar = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        lblUsuario1 = new javax.swing.JLabel();
        lblUsuario2 = new javax.swing.JLabel();
        lblUsuario3 = new javax.swing.JLabel();
        lblUsuario4 = new javax.swing.JLabel();
        lblUsuario5 = new javax.swing.JLabel();
        lblUsuario6 = new javax.swing.JLabel();
        lblMaquina1 = new javax.swing.JLabel();
        lblMaquina2 = new javax.swing.JLabel();
        lblMaquina3 = new javax.swing.JLabel();
        lblMaquina4 = new javax.swing.JLabel();
        lblMaquina5 = new javax.swing.JLabel();
        lblMaquina6 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        lblJugadorJug = new javax.swing.JLabel();
        lblMaquinaJug = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generala Da Vinci - Velazquez");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblComputadora.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblComputadora.setForeground(new java.awt.Color(240, 240, 240));
        lblComputadora.setText("Computadora");
        getContentPane().add(lblComputadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        lblJugador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblJugador.setForeground(new java.awt.Color(240, 240, 240));
        lblJugador.setText("Jugador");
        getContentPane().add(lblJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnTirar.setText("Tirar dados");
        btnTirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTirarActionPerformed(evt);
            }
        });
        getContentPane().add(btnTirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 190, 30));

        btnAyuda.setText("Ayuda");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 190, 30));

        lblUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro1.png"))); // NOI18N
        lblUsuario1.setText("jLabel1");
        lblUsuario1.setMaximumSize(new java.awt.Dimension(80, 70));
        lblUsuario1.setMinimumSize(new java.awt.Dimension(80, 70));
        lblUsuario1.setName(""); // NOI18N
        lblUsuario1.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(lblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 70));

        lblUsuario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro1.png"))); // NOI18N
        lblUsuario2.setText("jLabel1");
        lblUsuario2.setMaximumSize(new java.awt.Dimension(80, 70));
        lblUsuario2.setMinimumSize(new java.awt.Dimension(80, 70));
        lblUsuario2.setName(""); // NOI18N
        lblUsuario2.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(lblUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 80, 70));

        lblUsuario3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro1.png"))); // NOI18N
        lblUsuario3.setText("jLabel1");
        lblUsuario3.setMaximumSize(new java.awt.Dimension(80, 70));
        lblUsuario3.setMinimumSize(new java.awt.Dimension(80, 70));
        lblUsuario3.setName(""); // NOI18N
        lblUsuario3.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(lblUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 80, 70));

        lblUsuario4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro1.png"))); // NOI18N
        lblUsuario4.setText("jLabel1");
        lblUsuario4.setMaximumSize(new java.awt.Dimension(80, 70));
        lblUsuario4.setMinimumSize(new java.awt.Dimension(80, 70));
        lblUsuario4.setName(""); // NOI18N
        lblUsuario4.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(lblUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, 70));

        lblUsuario5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro1.png"))); // NOI18N
        lblUsuario5.setText("jLabel1");
        lblUsuario5.setMaximumSize(new java.awt.Dimension(80, 70));
        lblUsuario5.setMinimumSize(new java.awt.Dimension(80, 70));
        lblUsuario5.setName(""); // NOI18N
        lblUsuario5.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(lblUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 80, 70));

        lblUsuario6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro1.png"))); // NOI18N
        lblUsuario6.setText("jLabel1");
        lblUsuario6.setMaximumSize(new java.awt.Dimension(80, 70));
        lblUsuario6.setMinimumSize(new java.awt.Dimension(80, 70));
        lblUsuario6.setName(""); // NOI18N
        lblUsuario6.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(lblUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 80, 70));

        lblMaquina1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro1.png"))); // NOI18N
        lblMaquina1.setText("jLabel1");
        lblMaquina1.setMaximumSize(new java.awt.Dimension(80, 70));
        lblMaquina1.setMinimumSize(new java.awt.Dimension(80, 70));
        lblMaquina1.setName(""); // NOI18N
        lblMaquina1.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(lblMaquina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 80, 70));

        lblMaquina2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro1.png"))); // NOI18N
        lblMaquina2.setText("jLabel1");
        lblMaquina2.setMaximumSize(new java.awt.Dimension(80, 70));
        lblMaquina2.setMinimumSize(new java.awt.Dimension(80, 70));
        lblMaquina2.setName(""); // NOI18N
        lblMaquina2.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(lblMaquina2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 80, 70));

        lblMaquina3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro1.png"))); // NOI18N
        lblMaquina3.setText("jLabel1");
        lblMaquina3.setMaximumSize(new java.awt.Dimension(80, 70));
        lblMaquina3.setMinimumSize(new java.awt.Dimension(80, 70));
        lblMaquina3.setName(""); // NOI18N
        lblMaquina3.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(lblMaquina3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 80, 70));

        lblMaquina4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro1.png"))); // NOI18N
        lblMaquina4.setText("jLabel1");
        lblMaquina4.setMaximumSize(new java.awt.Dimension(80, 70));
        lblMaquina4.setMinimumSize(new java.awt.Dimension(80, 70));
        lblMaquina4.setName(""); // NOI18N
        lblMaquina4.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(lblMaquina4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 80, 70));

        lblMaquina5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro1.png"))); // NOI18N
        lblMaquina5.setText("jLabel1");
        lblMaquina5.setMaximumSize(new java.awt.Dimension(80, 70));
        lblMaquina5.setMinimumSize(new java.awt.Dimension(80, 70));
        lblMaquina5.setName(""); // NOI18N
        lblMaquina5.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(lblMaquina5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 80, 70));

        lblMaquina6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro1.png"))); // NOI18N
        lblMaquina6.setText("jLabel1");
        lblMaquina6.setMaximumSize(new java.awt.Dimension(80, 70));
        lblMaquina6.setMinimumSize(new java.awt.Dimension(80, 70));
        lblMaquina6.setName(""); // NOI18N
        lblMaquina6.setPreferredSize(new java.awt.Dimension(80, 70));
        getContentPane().add(lblMaquina6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 80, 70));

        lblResultado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(240, 240, 240));
        lblResultado.setText("Resultado: ");
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 660, 40));

        lblJugadorJug.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblJugadorJug.setForeground(new java.awt.Color(240, 240, 240));
        lblJugadorJug.setText("Jugada:");
        getContentPane().add(lblJugadorJug, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 190, 20));

        lblMaquinaJug.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblMaquinaJug.setForeground(new java.awt.Color(240, 240, 240));
        lblMaquinaJug.setText("Jugada:");
        getContentPane().add(lblMaquinaJug, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 190, 20));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoMesa.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenes/icono.png"));

        return retValue;
    }

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        VentanaAyuda ayuda = new VentanaAyuda();
        ayuda.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnTirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTirarActionPerformed

        int[] dadosUsuario = new int[6];
        int[] dadosMaquina = new int[6];

        int[] jugadaUsuario = new int[6];
        int[] jugadaMaquina = new int[6];

        for (int i = 0; i < 6; i++) {
            int dadoUsuario = rnd.nextInt(6) + 1;
            int dadoMaquina = rnd.nextInt(6) + 1;

            dadosUsuario[i] = dadoUsuario;
            dadosMaquina[i] = dadoMaquina;

            jugadaUsuario[dadoUsuario - 1]++; 
            jugadaMaquina[dadoMaquina - 1]++;
        }

        System.out.println("Jugada Numeros:" + Arrays.toString(new String[]{"1", "2", "3", "4", "5", "6"}));
        System.out.println("Jugada Usuario:" + Arrays.toString(jugadaUsuario));
        System.out.println("Jugada Maquina:" + Arrays.toString(jugadaMaquina));

        lblUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro" + dadosUsuario[0] + ".png")));
        lblUsuario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro" + dadosUsuario[1] + ".png")));
        lblUsuario3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro" + dadosUsuario[2] + ".png")));
        lblUsuario4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro" + dadosUsuario[3] + ".png")));
        lblUsuario5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro" + dadosUsuario[4] + ".png")));
        lblUsuario6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/negro" + dadosUsuario[5] + ".png")));

        lblMaquina1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rojo" + dadosMaquina[0] + ".png")));
        lblMaquina2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rojo" + dadosMaquina[1] + ".png")));
        lblMaquina3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rojo" + dadosMaquina[2] + ".png")));
        lblMaquina4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rojo" + dadosMaquina[3] + ".png")));
        lblMaquina5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rojo" + dadosMaquina[4] + ".png")));
        lblMaquina6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rojo" + dadosMaquina[5] + ".png")));

        int juegoUsuario = averiguarPuntos(jugadaUsuario);
        int juegoMaquina = averiguarPuntos(jugadaMaquina);

        System.out.println("Puntaje usuario: " + juegoUsuario);
        System.out.println("Puntaje maquina: " + juegoMaquina);
        System.out.println("-----------------------------------");

        resolucionPuntaje(juegoUsuario, juegoMaquina, averiguarJugada(juegoUsuario), averiguarJugada(juegoMaquina));


    }//GEN-LAST:event_btnTirarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnTirar;
    private javax.swing.JLabel lblComputadora;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblJugadorJug;
    private javax.swing.JLabel lblMaquina1;
    private javax.swing.JLabel lblMaquina2;
    private javax.swing.JLabel lblMaquina3;
    private javax.swing.JLabel lblMaquina4;
    private javax.swing.JLabel lblMaquina5;
    private javax.swing.JLabel lblMaquina6;
    private javax.swing.JLabel lblMaquinaJug;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lblUsuario2;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JLabel lblUsuario4;
    private javax.swing.JLabel lblUsuario5;
    private javax.swing.JLabel lblUsuario6;
    // End of variables declaration//GEN-END:variables

    public String averiguarJugada(int puntos) {
        String jugada = "Sin jugada";

        switch (puntos) {
            case 200:
                jugada = "Par";
                break;
            case 300:
                jugada = "Pierna";
                break;
            case 400:
                jugada = "Poker";
                break;
            case 500:
                jugada = "Full";
                break;
            case 600:
                jugada = "Generala";
                break;
            case 1000:
                jugada = "Escalera";
                break;

        }
        return jugada;
    }

    public int averiguarPuntos(int[] dadosMano) {
        int puntaje = 0;

        for (int i = 0; i < 6; i++) {

            switch (dadosMano[i]) {

                case 2:
                    puntaje = 200;
                    break;
                case 3:
                    puntaje = 300;
                    break;
                case 4:
                    puntaje = 400;
                    break;
                case 5:
                    puntaje = 500;
                    break;
                case 6:
                    puntaje = 600;
                    break;
            }

        }
        if (dadosMano[0] == 1 && dadosMano[1] == 1 && dadosMano[2] == 1 && dadosMano[3] == 1 && dadosMano[4] == 1 && dadosMano[5] == 1) {
            puntaje = 1000;
        }
        return puntaje;

    }

    public void resolucionPuntaje(int puntajeUsuario, int puntajeMaquina, String jugadaUsuario, String jugadaMaquina) {
        lblJugadorJug.setText("Jugada: " + jugadaUsuario);
        lblMaquinaJug.setText("Jugada: " + jugadaMaquina);

        if (puntajeMaquina > puntajeUsuario) {
            lblResultado.setText("Gano la Maquina con " + puntajeMaquina + " puntos y " + jugadaMaquina);
        } else if (puntajeMaquina < puntajeUsuario) {
            lblResultado.setText("Gano el Usuario con " + puntajeUsuario + " puntos y " + jugadaUsuario);
        } else if (puntajeMaquina == puntajeUsuario) {
            lblResultado.setText("Empate");
        }
    }

}
