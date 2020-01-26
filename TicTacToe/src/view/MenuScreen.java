
package view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Languages;
import model.Players;

/**
 *
 * @author Jackson T.R.
 * https://github.com/JackTorresR/
 * https://www.linkedin.com/in/jackson-torres-ramos-2a8797170/
 * 
 */
public class MenuScreen extends javax.swing.JFrame {
    
    static public Languages languages;
    static public Players players;
    
    public MenuScreen(Languages languages, Players players) {
        initComponents();
        this.languages = languages;
        this.players = players;
        inputLanguage();
        inputPlayersPictures();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblPicturePlayer1 = new javax.swing.JLabel();
        lblPicturePlayer2 = new javax.swing.JLabel();
        lblPointsPlayer1 = new javax.swing.JLabel();
        lblPointsPlayer2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jbMinimize.setBorderPainted(false);
        jbMinimize.setContentAreaFilled(false);
        jbMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMinimize.setFocusPainted(false);
        jbMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMinimizeActionPerformed(evt);
            }
        });
        getContentPane().add(jbMinimize);
        jbMinimize.setBounds(370, 10, 50, 50);

        jbClose.setBorderPainted(false);
        jbClose.setContentAreaFilled(false);
        jbClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbClose.setFocusPainted(false);
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });
        getContentPane().add(jbClose);
        jbClose.setBounds(440, 10, 50, 50);

        jbStart.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbStart.setText("Start");
        jbStart.setBorderPainted(false);
        jbStart.setContentAreaFilled(false);
        jbStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbStart.setFocusPainted(false);
        jbStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStartActionPerformed(evt);
            }
        });
        getContentPane().add(jbStart);
        jbStart.setBounds(80, 160, 330, 90);

        jbSettings.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbSettings.setText("Settings");
        jbSettings.setBorderPainted(false);
        jbSettings.setContentAreaFilled(false);
        jbSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSettings.setFocusPainted(false);
        jbSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSettingsActionPerformed(evt);
            }
        });
        getContentPane().add(jbSettings);
        jbSettings.setBounds(120, 260, 250, 60);

        jbCredits.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbCredits.setText("Credits");
        jbCredits.setBorderPainted(false);
        jbCredits.setContentAreaFilled(false);
        jbCredits.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCredits.setFocusPainted(false);
        jbCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCreditsActionPerformed(evt);
            }
        });
        getContentPane().add(jbCredits);
        jbCredits.setBounds(150, 340, 190, 50);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Tic-Tac-Toe");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(0, 60, 500, 70);

        lblPicturePlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblPicturePlayer1);
        lblPicturePlayer1.setBounds(40, 400, 70, 70);

        lblPicturePlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblPicturePlayer2);
        lblPicturePlayer2.setBounds(380, 400, 70, 70);

        lblPointsPlayer1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblPointsPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPointsPlayer1.setText("0");
        lblPointsPlayer1.setMaximumSize(new java.awt.Dimension(25, 44));
        lblPointsPlayer1.setMinimumSize(new java.awt.Dimension(25, 44));
        lblPointsPlayer1.setPreferredSize(new java.awt.Dimension(30, 44));
        getContentPane().add(lblPointsPlayer1);
        lblPointsPlayer1.setBounds(120, 410, 110, 60);

        lblPointsPlayer2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblPointsPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPointsPlayer2.setText("0");
        getContentPane().add(lblPointsPlayer2);
        lblPointsPlayer2.setBounds(270, 410, 100, 60);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MenuScreen/menuLinuxWindows.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 500, 500);

        setSize(new java.awt.Dimension(500, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbCloseActionPerformed

    private void jbMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMinimizeActionPerformed
        this.setState(1);
    }//GEN-LAST:event_jbMinimizeActionPerformed

    private void jbStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStartActionPerformed
        new GameScreen(this, languages, players).setVisible(true);
        dispose();
    }//GEN-LAST:event_jbStartActionPerformed

    private void jbSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSettingsActionPerformed
        new SettingsScreen(this, languages, players).setVisible(true);
        dispose();
    }//GEN-LAST:event_jbSettingsActionPerformed

    private void jbCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCreditsActionPerformed
        new CreditsScreen(this, languages, players).setVisible(true);
        dispose();
    }//GEN-LAST:event_jbCreditsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    public static final javax.swing.JButton jbClose = new javax.swing.JButton();
    public static final javax.swing.JButton jbCredits = new javax.swing.JButton();
    public static final javax.swing.JButton jbMinimize = new javax.swing.JButton();
    public static final javax.swing.JButton jbSettings = new javax.swing.JButton();
    public static final javax.swing.JButton jbStart = new javax.swing.JButton();
    private javax.swing.JLabel lblPicturePlayer1;
    private javax.swing.JLabel lblPicturePlayer2;
    private javax.swing.JLabel lblPointsPlayer1;
    private javax.swing.JLabel lblPointsPlayer2;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    public void updatePoints() {
        lblPointsPlayer1.setText(""+Players.getPointsPlayer1());
        lblPointsPlayer2.setText(""+Players.getPointsPlayer2());
    }

    public void inputLanguage() {
        lblTitle.setText(languages.getGameNameText());
        jbStart.setText(languages.getStartButton());
        jbSettings.setText(languages.getSettingsButton());
        jbCredits.setText(languages.getCreditsButton());
    }
    
    public void inputPlayersPictures() {
        String pictureUrlPlayer1 = Players.getPictureUrlPlayer1();
        String pictureUrlPlayer2 = Players.getPictureUrlPlayer2();
        
            try {
                ImageIcon player1 = new ImageIcon(getClass().getResource(pictureUrlPlayer1));
                player1.getImage().getScaledInstance(lblPicturePlayer1.getWidth(), lblPicturePlayer1.getHeight(), Image.SCALE_DEFAULT);
                lblPicturePlayer1.setIcon(player1);
                ImageIcon player2 = new ImageIcon(getClass().getResource(pictureUrlPlayer2));
                player2.getImage().getScaledInstance(lblPicturePlayer2.getWidth(), lblPicturePlayer2.getHeight(), Image.SCALE_DEFAULT);
                lblPicturePlayer2.setIcon(player2);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, languages.getPictureNotFoundText(), languages.getGameNameText(), JOptionPane.WARNING_MESSAGE);
                
                ImageIcon player1 = new ImageIcon(getClass().getResource("../img/Players/Tsux.png"));
                player1.getImage().getScaledInstance(lblPicturePlayer1.getWidth(), lblPicturePlayer1.getHeight(), Image.SCALE_DEFAULT);
                lblPicturePlayer1.setIcon(player1);
                ImageIcon player2 = new ImageIcon(getClass().getResource("../img/Players/Windows.png"));
                player2.getImage().getScaledInstance(lblPicturePlayer2.getWidth(), lblPicturePlayer2.getHeight(), Image.SCALE_DEFAULT);
                lblPicturePlayer2.setIcon(player2);
            }
    }
    
}
