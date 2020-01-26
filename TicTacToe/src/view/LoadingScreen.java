
package view;

/**
 *
 * @author Jackson T.R.
 * https://github.com/JackTorresR/
 * https://www.linkedin.com/in/jackson-torres-ramos-2a8797170/
 * 
 */
public class LoadingScreen extends javax.swing.JFrame {

    public LoadingScreen() {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LoadingScreen/Loading.gif"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 500, 500);

        setSize(new java.awt.Dimension(500, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    // End of variables declaration//GEN-END:variables

}
