
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
public class SettingsScreen extends javax.swing.JFrame {
    
    Languages languages;
    MenuScreen menuScreen;
    Players players;
    
    public SettingsScreen(MenuScreen menuScreen, Languages languages, Players players) {
        initComponents();
        this.languages = languages;
        this.menuScreen = menuScreen;
        this.players = players;
        inputLanguage();
        inputPlayersPictures();
        inputPlayersName();
        jcbLanguage.setSelectedItem(Languages.getCurrentlyLanguage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblClickInstructions = new javax.swing.JLabel();
        jbPicturePlayer1 = new javax.swing.JButton();
        jbPicturePlayer2 = new javax.swing.JButton();
        jbNamePlayer1 = new javax.swing.JButton();
        jbNamePlayer2 = new javax.swing.JButton();
        jcbLanguage = new javax.swing.JComboBox();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jbMinimize.setBounds(440, 10, 60, 50);

        jbBack.setBorderPainted(false);
        jbBack.setContentAreaFilled(false);
        jbBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBack.setFocusPainted(false);
        jbBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBackActionPerformed(evt);
            }
        });
        getContentPane().add(jbBack);
        jbBack.setBounds(10, 10, 60, 50);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Tic-Tac-Toe");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(0, 90, 500, 50);

        lblClickInstructions.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblClickInstructions.setForeground(new java.awt.Color(1, 1, 1));
        lblClickInstructions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblClickInstructions);
        lblClickInstructions.setBounds(110, 130, 290, 60);

        jbPicturePlayer1.setBackground(new java.awt.Color(56, 182, 255));
        jbPicturePlayer1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbPicturePlayer1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPicturePlayer1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPicturePlayer1.setFocusPainted(false);
        jbPicturePlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPicturePlayer1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbPicturePlayer1);
        jbPicturePlayer1.setBounds(90, 190, 90, 90);

        jbPicturePlayer2.setBackground(new java.awt.Color(56, 182, 255));
        jbPicturePlayer2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbPicturePlayer2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPicturePlayer2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPicturePlayer2.setFocusPainted(false);
        jbPicturePlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPicturePlayer2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbPicturePlayer2);
        jbPicturePlayer2.setBounds(330, 190, 90, 90);

        jbNamePlayer1.setBackground(new java.awt.Color(56, 182, 255));
        jbNamePlayer1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbNamePlayer1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbNamePlayer1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbNamePlayer1.setFocusPainted(false);
        jbNamePlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNamePlayer1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbNamePlayer1);
        jbNamePlayer1.setBounds(30, 290, 200, 30);

        jbNamePlayer2.setBackground(new java.awt.Color(56, 182, 255));
        jbNamePlayer2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbNamePlayer2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbNamePlayer2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbNamePlayer2.setFocusPainted(false);
        jbNamePlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNamePlayer2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbNamePlayer2);
        jbNamePlayer2.setBounds(270, 290, 200, 30);

        jcbLanguage.setBackground(new java.awt.Color(56, 182, 255));
        jcbLanguage.setForeground(new java.awt.Color(255, 255, 255));
        jcbLanguage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afrikaans", "English", "Español", "Française", "Português-BR" }));
        jcbLanguage.setSelectedIndex(1);
        jcbLanguage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcbLanguage.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbLanguageItemStateChanged(evt);
            }
        });
        getContentPane().add(jcbLanguage);
        jcbLanguage.setBounds(140, 420, 220, 40);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SettingsScreen/settingsLinuxWindows.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 500, 500);

        setSize(new java.awt.Dimension(500, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBackActionPerformed
        menuScreen.languages = languages;
        menuScreen.inputLanguage();
        menuScreen.inputPlayersPictures();
        menuScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbBackActionPerformed

    private void jbMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMinimizeActionPerformed
        this.setState(1);
    }//GEN-LAST:event_jbMinimizeActionPerformed

    private void jcbLanguageItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbLanguageItemStateChanged
        Languages.setCurrentlyLanguage(jcbLanguage.getSelectedItem().toString());
        languages = languages.verifyLanguage();
        inputLanguage();
    }//GEN-LAST:event_jcbLanguageItemStateChanged

    private void jbNamePlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNamePlayer1ActionPerformed
        catchPlayerNewName("Player1");
        inputPlayersName();
    }//GEN-LAST:event_jbNamePlayer1ActionPerformed

    private void jbNamePlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNamePlayer2ActionPerformed
        catchPlayerNewName("Player2");
        inputPlayersName();
    }//GEN-LAST:event_jbNamePlayer2ActionPerformed

    private void jbPicturePlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPicturePlayer2ActionPerformed
        new IconSelectorScreen(this, menuScreen, languages, players, "Player2").setVisible(true);
        dispose();
    }//GEN-LAST:event_jbPicturePlayer2ActionPerformed

    private void jbPicturePlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPicturePlayer1ActionPerformed
        new IconSelectorScreen(this, menuScreen, languages, players, "Player1").setVisible(true);
        dispose();
    }//GEN-LAST:event_jbPicturePlayer1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    public static final javax.swing.JButton jbBack = new javax.swing.JButton();
    public static final javax.swing.JButton jbMinimize = new javax.swing.JButton();
    private javax.swing.JButton jbNamePlayer1;
    private javax.swing.JButton jbNamePlayer2;
    private javax.swing.JButton jbPicturePlayer1;
    private javax.swing.JButton jbPicturePlayer2;
    private javax.swing.JComboBox jcbLanguage;
    private javax.swing.JLabel lblClickInstructions;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    private void inputLanguage() {
        lblTitle.setText(languages.getGameNameText());
        lblClickInstructions.setText(languages.getClickOnTheButtonsText());
    }

    private void inputPlayersName() {
        jbNamePlayer1.setText(Players.getNamePlayer1());
        jbNamePlayer2.setText(Players.getNamePlayer2());
    }

    private void catchPlayerNewName(String player) {
        String playerNewName = "";
            do{
                playerNewName = JOptionPane.showInputDialog(null,languages.getTypeTheNewNameText(), languages.getGameNameText(), JOptionPane.PLAIN_MESSAGE);
            }while(playerNewName.equals("") || playerNewName.equalsIgnoreCase("null"));
        
            if(player.equalsIgnoreCase("Player1")){
                Players.setNamePlayer1(playerNewName);
            }else{
                Players.setNamePlayer2(playerNewName);
            }
    }
    
    public void inputPlayersPictures() {
        String pictureUrlPlayer1 = Players.getPictureUrlPlayer1();
        String pictureUrlPlayer2 = Players.getPictureUrlPlayer2();
        
            try {
                ImageIcon player1 = new ImageIcon(getClass().getResource(pictureUrlPlayer1));
                player1.getImage().getScaledInstance(jbPicturePlayer1.getWidth(), jbPicturePlayer1.getHeight(), Image.SCALE_DEFAULT);
                jbPicturePlayer1.setIcon(player1);
                ImageIcon player2 = new ImageIcon(getClass().getResource(pictureUrlPlayer2));
                player2.getImage().getScaledInstance(jbPicturePlayer2.getWidth(), jbPicturePlayer2.getHeight(), Image.SCALE_DEFAULT);
                jbPicturePlayer2.setIcon(player2);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, languages.getPictureNotFoundText(), languages.getGameNameText(), JOptionPane.WARNING_MESSAGE);
                
                ImageIcon player1 = new ImageIcon(getClass().getResource("../img/Players/tux.png"));
                player1.getImage().getScaledInstance(jbPicturePlayer1.getWidth(), jbPicturePlayer1.getHeight(), Image.SCALE_DEFAULT);
                jbPicturePlayer1.setIcon(player1);
                ImageIcon player2 = new ImageIcon(getClass().getResource("../img/Players/windows.png"));
                player2.getImage().getScaledInstance(jbPicturePlayer2.getWidth(), jbPicturePlayer2.getHeight(), Image.SCALE_DEFAULT);
                jbPicturePlayer2.setIcon(player2);
            }
    }

}
