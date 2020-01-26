
package view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Languages;
import model.Players;
import static view.MenuScreen.languages;

/**
 *
 * @author Jackson T.R.
 * https://github.com/JackTorresR/
 * https://www.linkedin.com/in/jackson-torres-ramos-2a8797170/
 * 
 */
public class GameScreen extends javax.swing.JFrame {
    
    public String jogadorAtual = "X";
    
    public String Li1="";
    public String Li2="";
    public String Li3="";
    public String Li4="";
    public String Li5="";
    public String Li6="";
    public String Li7="";
    public String Li8="";
    public String Li9="";
    
    public int jogadas=0;
    public boolean vitoria=false;
    
    MenuScreen menuScreen;
    Languages languages;
    Players players;
    
    public GameScreen(MenuScreen menuscreen, Languages languages, Players players) {
        initComponents();
        this.menuScreen = menuscreen;
        this.languages = languages;
        this.players = players;
        inputPlayersPictures();
        InputPlayersNames();
        setPlayer1Selected();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPicturePlayer1 = new javax.swing.JLabel();
        lblNamePlayer1 = new javax.swing.JLabel();
        lblPicturePlayer2 = new javax.swing.JLabel();
        lblNamePlayer2 = new javax.swing.JLabel();
        L1 = new javax.swing.JButton();
        L2 = new javax.swing.JButton();
        L3 = new javax.swing.JButton();
        L4 = new javax.swing.JButton();
        L5 = new javax.swing.JButton();
        L6 = new javax.swing.JButton();
        L7 = new javax.swing.JButton();
        L8 = new javax.swing.JButton();
        L9 = new javax.swing.JButton();
        jbMini = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        lblPicturePlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblPicturePlayer1);
        lblPicturePlayer1.setBounds(10, 10, 70, 70);

        lblNamePlayer1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNamePlayer1.setForeground(new java.awt.Color(1, 1, 1));
        lblNamePlayer1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lblNamePlayer1);
        lblNamePlayer1.setBounds(80, 10, 300, 30);

        lblPicturePlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblPicturePlayer2);
        lblPicturePlayer2.setBounds(420, 420, 70, 70);

        lblNamePlayer2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNamePlayer2.setForeground(new java.awt.Color(1, 1, 1));
        lblNamePlayer2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblNamePlayer2);
        lblNamePlayer2.setBounds(20, 467, 380, 30);

        L1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        L1.setToolTipText("");
        L1.setBorderPainted(false);
        L1.setContentAreaFilled(false);
        L1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L1.setFocusPainted(false);
        L1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L1ActionPerformed(evt);
            }
        });
        getContentPane().add(L1);
        L1.setBounds(50, 70, 120, 110);

        L2.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        L2.setToolTipText("");
        L2.setBorderPainted(false);
        L2.setContentAreaFilled(false);
        L2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L2.setFocusPainted(false);
        L2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L2ActionPerformed(evt);
            }
        });
        getContentPane().add(L2);
        L2.setBounds(190, 70, 130, 110);

        L3.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        L3.setToolTipText("");
        L3.setBorderPainted(false);
        L3.setContentAreaFilled(false);
        L3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L3.setFocusPainted(false);
        L3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L3ActionPerformed(evt);
            }
        });
        getContentPane().add(L3);
        L3.setBounds(340, 70, 110, 110);

        L4.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        L4.setToolTipText("");
        L4.setBorderPainted(false);
        L4.setContentAreaFilled(false);
        L4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L4.setFocusPainted(false);
        L4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L4ActionPerformed(evt);
            }
        });
        getContentPane().add(L4);
        L4.setBounds(50, 200, 120, 120);

        L5.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        L5.setToolTipText("");
        L5.setBorderPainted(false);
        L5.setContentAreaFilled(false);
        L5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L5.setFocusPainted(false);
        L5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L5ActionPerformed(evt);
            }
        });
        getContentPane().add(L5);
        L5.setBounds(190, 200, 130, 120);

        L6.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        L6.setToolTipText("");
        L6.setBorderPainted(false);
        L6.setContentAreaFilled(false);
        L6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L6.setFocusPainted(false);
        L6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L6ActionPerformed(evt);
            }
        });
        getContentPane().add(L6);
        L6.setBounds(340, 200, 110, 120);

        L7.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        L7.setToolTipText("");
        L7.setBorderPainted(false);
        L7.setContentAreaFilled(false);
        L7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L7.setFocusPainted(false);
        L7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L7ActionPerformed(evt);
            }
        });
        getContentPane().add(L7);
        L7.setBounds(50, 340, 120, 120);

        L8.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        L8.setToolTipText("");
        L8.setBorderPainted(false);
        L8.setContentAreaFilled(false);
        L8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L8.setFocusPainted(false);
        L8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L8ActionPerformed(evt);
            }
        });
        getContentPane().add(L8);
        L8.setBounds(190, 340, 130, 120);

        L9.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        L9.setToolTipText("");
        L9.setBorderPainted(false);
        L9.setContentAreaFilled(false);
        L9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L9.setFocusPainted(false);
        L9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L9ActionPerformed(evt);
            }
        });
        getContentPane().add(L9);
        L9.setBounds(340, 340, 110, 120);

        jbMini.setBorderPainted(false);
        jbMini.setContentAreaFilled(false);
        jbMini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMini.setFocusPainted(false);
        jbMini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMiniActionPerformed(evt);
            }
        });
        getContentPane().add(jbMini);
        jbMini.setBounds(380, 0, 50, 60);

        jbFechar.setBorderPainted(false);
        jbFechar.setContentAreaFilled(false);
        jbFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbFechar.setFocusPainted(false);
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jbFechar);
        jbFechar.setBounds(433, 0, 60, 60);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GameScreen/gameLinuxWindows.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 500, 500);

        setSize(new java.awt.Dimension(500, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbMiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMiniActionPerformed
        this.setState(1);
    }//GEN-LAST:event_jbMiniActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbFecharActionPerformed

    private void L1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L1ActionPerformed
        Li1=jogadorAtual;
        L1.setText(Li1);
        L1.setEnabled(false);
        verificarJogoDaVelha();
    }//GEN-LAST:event_L1ActionPerformed

    private void L2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L2ActionPerformed
        Li2=jogadorAtual;
        L2.setText(Li2);
        L2.setEnabled(false);
        verificarJogoDaVelha();
    }//GEN-LAST:event_L2ActionPerformed

    private void L3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L3ActionPerformed
        Li3=jogadorAtual;
        L3.setText(Li3);
        L3.setEnabled(false);
        verificarJogoDaVelha();
    }//GEN-LAST:event_L3ActionPerformed

    private void L4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L4ActionPerformed
        Li4=jogadorAtual;
        L4.setText(Li4);
        L4.setEnabled(false);
        verificarJogoDaVelha();
    }//GEN-LAST:event_L4ActionPerformed

    private void L5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L5ActionPerformed
        Li5=jogadorAtual;
        L5.setText(Li5);
        L5.setEnabled(false);
        verificarJogoDaVelha();
    }//GEN-LAST:event_L5ActionPerformed

    private void L6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L6ActionPerformed
        Li6=jogadorAtual;
        L6.setText(Li6);
        L6.setEnabled(false);
        verificarJogoDaVelha();
    }//GEN-LAST:event_L6ActionPerformed

    private void L8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L8ActionPerformed
        Li8=jogadorAtual;
        L8.setText(Li8);
        L8.setEnabled(false);
        verificarJogoDaVelha();
    }//GEN-LAST:event_L8ActionPerformed

    private void L9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L9ActionPerformed
        Li9=jogadorAtual;
        L9.setText(Li9);
        L9.setEnabled(false);
        verificarJogoDaVelha();
    }//GEN-LAST:event_L9ActionPerformed

    private void L7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L7ActionPerformed
        Li7=jogadorAtual;
        L7.setText(Li7);
        L7.setEnabled(false);
        verificarJogoDaVelha();
    }//GEN-LAST:event_L7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton L1;
    private javax.swing.JButton L2;
    private javax.swing.JButton L3;
    private javax.swing.JButton L4;
    private javax.swing.JButton L5;
    private javax.swing.JButton L6;
    private javax.swing.JButton L7;
    private javax.swing.JButton L8;
    private javax.swing.JButton L9;
    private javax.swing.JLabel bg;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbMini;
    private javax.swing.JLabel lblNamePlayer1;
    private javax.swing.JLabel lblNamePlayer2;
    private javax.swing.JLabel lblPicturePlayer1;
    private javax.swing.JLabel lblPicturePlayer2;
    // End of variables declaration//GEN-END:variables

    private void verificarJogoDaVelha() {
        jogadas++;
        if(Li1.equalsIgnoreCase("X") && Li2.equalsIgnoreCase("X") && Li3.equalsIgnoreCase("X")){
            ganhou();
        }else if(Li4.equalsIgnoreCase("X") && Li5.equalsIgnoreCase("X") && Li6.equalsIgnoreCase("X")){
            ganhou();
        }else if(Li7.equalsIgnoreCase("X") && Li8.equalsIgnoreCase("X") && Li9.equalsIgnoreCase("X")){
            ganhou();
        }else if(Li1.equalsIgnoreCase("X") && Li5.equalsIgnoreCase("X") && Li9.equalsIgnoreCase("X")){
            ganhou();
        }else if(Li3.equalsIgnoreCase("X") && Li5.equalsIgnoreCase("X") && Li7.equalsIgnoreCase("X")){
            ganhou();
        }else if(Li1.equalsIgnoreCase("X") && Li4.equalsIgnoreCase("X") && Li7.equalsIgnoreCase("X")){
            ganhou();
        }else if(Li2.equalsIgnoreCase("X") && Li5.equalsIgnoreCase("X") && Li8.equalsIgnoreCase("X")){
            ganhou();
        }else if(Li3.equalsIgnoreCase("X") && Li6.equalsIgnoreCase("X") && Li9.equalsIgnoreCase("X")){
            ganhou();
        
        
        }else if(Li1.equalsIgnoreCase("O") && Li2.equalsIgnoreCase("O") && Li3.equalsIgnoreCase("O")){
            ganhou();
        }else if(Li4.equalsIgnoreCase("O") && Li5.equalsIgnoreCase("O") && Li6.equalsIgnoreCase("O")){
            ganhou();
        }else if(Li7.equalsIgnoreCase("O") && Li8.equalsIgnoreCase("O") && Li9.equalsIgnoreCase("O")){
            ganhou();
        }else if(Li1.equalsIgnoreCase("O") && Li5.equalsIgnoreCase("O") && Li9.equalsIgnoreCase("O")){
            ganhou();
        }else if(Li3.equalsIgnoreCase("O") && Li5.equalsIgnoreCase("O") && Li7.equalsIgnoreCase("O")){
            ganhou();
        }else if(Li1.equalsIgnoreCase("O") && Li4.equalsIgnoreCase("O") && Li7.equalsIgnoreCase("O")){
            ganhou();
        }else if(Li2.equalsIgnoreCase("O") && Li5.equalsIgnoreCase("O") && Li8.equalsIgnoreCase("O")){
            ganhou();
        }else if(Li3.equalsIgnoreCase("O") && Li6.equalsIgnoreCase("O") && Li9.equalsIgnoreCase("O")){
            ganhou();
        
        }else if(this.jogadas>8){
            if(this.vitoria==false){
                languages = MenuScreen.languages;
                JOptionPane.showMessageDialog(null, languages.getFailText(), languages.getGameNameText(), JOptionPane.INFORMATION_MESSAGE);
                menuScreen.setVisible(true);
                menuScreen.updatePoints();
                dispose();
            }
        }else{    
            if(jogadorAtual.equalsIgnoreCase("X")){
                jogadorAtual="O";
                setPlayer2Selected();
            }else{
                jogadorAtual="X";
                setPlayer1Selected();
            }
        }
        
    }

    private void ganhou() {
        String txt = languages.getWinnerText();
        languages = MenuScreen.languages;
            if(jogadorAtual.equalsIgnoreCase("X")){
                txt+=Players.getNamePlayer1();
                players.setPointsPlayer1(Players.getPointsPlayer1()+1);
            }else{
                txt+=Players.getNamePlayer2();
                players.setPointsPlayer2(Players.getPointsPlayer2()+1);
            }
        JOptionPane.showMessageDialog(null, txt, languages.getGameNameText(), JOptionPane.INFORMATION_MESSAGE);
        menuScreen.setVisible(true);
        menuScreen.updatePoints();
        dispose();
    }

    private void setPlayer1Selected() {
        lblNamePlayer1.setVisible(true);
        lblPicturePlayer1.setVisible(true);
        lblNamePlayer2.setVisible(false);
        lblPicturePlayer2.setVisible(false);
    }

    private void setPlayer2Selected() {
        lblNamePlayer1.setVisible(false);
        lblPicturePlayer1.setVisible(false);
        lblNamePlayer2.setVisible(true);
        lblPicturePlayer2.setVisible(true);
    }

    private void InputPlayersNames() {
        lblNamePlayer1.setText(Players.getNamePlayer1());
        lblNamePlayer2.setText(Players.getNamePlayer2());
    }

    private void inputPlayersPictures() {
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
                
                ImageIcon player1 = new ImageIcon(getClass().getResource("../img/Players/tux.png"));
                player1.getImage().getScaledInstance(lblPicturePlayer1.getWidth(), lblPicturePlayer1.getHeight(), Image.SCALE_DEFAULT);
                lblPicturePlayer1.setIcon(player1);
                ImageIcon player2 = new ImageIcon(getClass().getResource("../img/Players/windows.png"));
                player2.getImage().getScaledInstance(lblPicturePlayer2.getWidth(), lblPicturePlayer2.getHeight(), Image.SCALE_DEFAULT);
                lblPicturePlayer2.setIcon(player2);
            }
    }

    
}
