
package view;
import java.awt.Image;
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
public class IconSelectorScreen extends javax.swing.JFrame {
    
    Languages languages;
    MenuScreen menuScreen;
    SettingsScreen settingsScreen;
    Players players;
    
    private String currentlyPlayer;
    
    public IconSelectorScreen(SettingsScreen settingsScreen, MenuScreen menuScreen, Languages languages, Players players, String currentlyPlayer) {
        initComponents();
        this.languages = languages;
        this.menuScreen = menuScreen;
        this.settingsScreen = settingsScreen;
        this.players = players;
        this.currentlyPlayer = currentlyPlayer;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jbAndroid = new javax.swing.JButton();
        jbApple = new javax.swing.JButton();
        jbEMule = new javax.swing.JButton();
        jbGIMP = new javax.swing.JButton();
        jbGNU = new javax.swing.JButton();
        jbGithub = new javax.swing.JButton();
        jbGitlab = new javax.swing.JButton();
        jbJava = new javax.swing.JButton();
        jbJS = new javax.swing.JButton();
        jbKonqi = new javax.swing.JButton();
        jbMozilla = new javax.swing.JButton();
        jbMySQL = new javax.swing.JButton();
        jbNodeJS = new javax.swing.JButton();
        jbPhp = new javax.swing.JButton();
        jbPidgin = new javax.swing.JButton();
        jbPython = new javax.swing.JButton();
        jbRails = new javax.swing.JButton();
        jbRichUnclePennyBags = new javax.swing.JButton();
        jbTux = new javax.swing.JButton();
        jbWindows = new javax.swing.JButton();
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
        lblTitle.setBounds(0, 60, 500, 50);

        jbAndroid.setBackground(new java.awt.Color(56, 182, 255));
        jbAndroid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbAndroid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/Android.png"))); // NOI18N
        jbAndroid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAndroid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAndroid.setFocusPainted(false);
        jbAndroid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAndroidActionPerformed(evt);
            }
        });
        getContentPane().add(jbAndroid);
        jbAndroid.setBounds(30, 120, 90, 90);

        jbApple.setBackground(new java.awt.Color(56, 182, 255));
        jbApple.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbApple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/Apple.png"))); // NOI18N
        jbApple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbApple.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbApple.setFocusPainted(false);
        jbApple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAppleActionPerformed(evt);
            }
        });
        getContentPane().add(jbApple);
        jbApple.setBounds(120, 120, 90, 90);

        jbEMule.setBackground(new java.awt.Color(56, 182, 255));
        jbEMule.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbEMule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/Emule.png"))); // NOI18N
        jbEMule.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEMule.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEMule.setFocusPainted(false);
        jbEMule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEMuleActionPerformed(evt);
            }
        });
        getContentPane().add(jbEMule);
        jbEMule.setBounds(210, 120, 90, 90);

        jbGIMP.setBackground(new java.awt.Color(56, 182, 255));
        jbGIMP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbGIMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/GIMP.png"))); // NOI18N
        jbGIMP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGIMP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGIMP.setFocusPainted(false);
        jbGIMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGIMPActionPerformed(evt);
            }
        });
        getContentPane().add(jbGIMP);
        jbGIMP.setBounds(300, 120, 90, 90);

        jbGNU.setBackground(new java.awt.Color(56, 182, 255));
        jbGNU.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbGNU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/GNU.png"))); // NOI18N
        jbGNU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGNU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGNU.setFocusPainted(false);
        jbGNU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGNUActionPerformed(evt);
            }
        });
        getContentPane().add(jbGNU);
        jbGNU.setBounds(390, 120, 90, 90);

        jbGithub.setBackground(new java.awt.Color(56, 182, 255));
        jbGithub.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbGithub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/Github.png"))); // NOI18N
        jbGithub.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGithub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGithub.setFocusPainted(false);
        jbGithub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGithubActionPerformed(evt);
            }
        });
        getContentPane().add(jbGithub);
        jbGithub.setBounds(30, 210, 90, 90);

        jbGitlab.setBackground(new java.awt.Color(56, 182, 255));
        jbGitlab.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbGitlab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/Gitlab.png"))); // NOI18N
        jbGitlab.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGitlab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGitlab.setFocusPainted(false);
        jbGitlab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGitlabActionPerformed(evt);
            }
        });
        getContentPane().add(jbGitlab);
        jbGitlab.setBounds(120, 210, 90, 90);

        jbJava.setBackground(new java.awt.Color(56, 182, 255));
        jbJava.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbJava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/Java.png"))); // NOI18N
        jbJava.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbJava.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbJava.setFocusPainted(false);
        jbJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbJavaActionPerformed(evt);
            }
        });
        getContentPane().add(jbJava);
        jbJava.setBounds(210, 210, 90, 90);

        jbJS.setBackground(new java.awt.Color(56, 182, 255));
        jbJS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbJS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/Javascript.png"))); // NOI18N
        jbJS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbJS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbJS.setFocusPainted(false);
        jbJS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbJSActionPerformed(evt);
            }
        });
        getContentPane().add(jbJS);
        jbJS.setBounds(300, 210, 90, 90);

        jbKonqi.setBackground(new java.awt.Color(56, 182, 255));
        jbKonqi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbKonqi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/Konqi.png"))); // NOI18N
        jbKonqi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbKonqi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbKonqi.setFocusPainted(false);
        jbKonqi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbKonqiActionPerformed(evt);
            }
        });
        getContentPane().add(jbKonqi);
        jbKonqi.setBounds(390, 210, 90, 90);

        jbMozilla.setBackground(new java.awt.Color(56, 182, 255));
        jbMozilla.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbMozilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/Mozilla.png"))); // NOI18N
        jbMozilla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbMozilla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMozilla.setFocusPainted(false);
        jbMozilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMozillaActionPerformed(evt);
            }
        });
        getContentPane().add(jbMozilla);
        jbMozilla.setBounds(30, 300, 90, 90);

        jbMySQL.setBackground(new java.awt.Color(56, 182, 255));
        jbMySQL.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbMySQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/MySQL.png"))); // NOI18N
        jbMySQL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbMySQL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbMySQL.setFocusPainted(false);
        jbMySQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMySQLActionPerformed(evt);
            }
        });
        getContentPane().add(jbMySQL);
        jbMySQL.setBounds(120, 300, 90, 90);

        jbNodeJS.setBackground(new java.awt.Color(56, 182, 255));
        jbNodeJS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbNodeJS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/NodeJS.png"))); // NOI18N
        jbNodeJS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbNodeJS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbNodeJS.setFocusPainted(false);
        jbNodeJS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNodeJSActionPerformed(evt);
            }
        });
        getContentPane().add(jbNodeJS);
        jbNodeJS.setBounds(210, 300, 90, 90);

        jbPhp.setBackground(new java.awt.Color(56, 182, 255));
        jbPhp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbPhp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/PHP.png"))); // NOI18N
        jbPhp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPhp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPhp.setFocusPainted(false);
        jbPhp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPhpActionPerformed(evt);
            }
        });
        getContentPane().add(jbPhp);
        jbPhp.setBounds(300, 300, 90, 90);

        jbPidgin.setBackground(new java.awt.Color(56, 182, 255));
        jbPidgin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbPidgin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/Pidgin.png"))); // NOI18N
        jbPidgin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPidgin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPidgin.setFocusPainted(false);
        jbPidgin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPidginActionPerformed(evt);
            }
        });
        getContentPane().add(jbPidgin);
        jbPidgin.setBounds(390, 300, 90, 90);

        jbPython.setBackground(new java.awt.Color(56, 182, 255));
        jbPython.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbPython.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/Python.png"))); // NOI18N
        jbPython.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPython.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPython.setFocusPainted(false);
        jbPython.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPythonActionPerformed(evt);
            }
        });
        getContentPane().add(jbPython);
        jbPython.setBounds(30, 390, 90, 90);

        jbRails.setBackground(new java.awt.Color(56, 182, 255));
        jbRails.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbRails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/Rails.png"))); // NOI18N
        jbRails.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbRails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRails.setFocusPainted(false);
        jbRails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRailsActionPerformed(evt);
            }
        });
        getContentPane().add(jbRails);
        jbRails.setBounds(120, 390, 90, 90);

        jbRichUnclePennyBags.setBackground(new java.awt.Color(56, 182, 255));
        jbRichUnclePennyBags.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbRichUnclePennyBags.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/RichUnclePennybags.png"))); // NOI18N
        jbRichUnclePennyBags.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbRichUnclePennyBags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbRichUnclePennyBags.setFocusPainted(false);
        jbRichUnclePennyBags.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRichUnclePennyBagsActionPerformed(evt);
            }
        });
        getContentPane().add(jbRichUnclePennyBags);
        jbRichUnclePennyBags.setBounds(210, 390, 90, 90);

        jbTux.setBackground(new java.awt.Color(56, 182, 255));
        jbTux.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbTux.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/Tux.png"))); // NOI18N
        jbTux.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTux.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbTux.setFocusPainted(false);
        jbTux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTuxActionPerformed(evt);
            }
        });
        getContentPane().add(jbTux);
        jbTux.setBounds(300, 390, 90, 90);

        jbWindows.setBackground(new java.awt.Color(56, 182, 255));
        jbWindows.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbWindows.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Players/Windows.png"))); // NOI18N
        jbWindows.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbWindows.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbWindows.setFocusPainted(false);
        jbWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbWindowsActionPerformed(evt);
            }
        });
        getContentPane().add(jbWindows);
        jbWindows.setBounds(390, 390, 90, 90);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SettingsScreen/settingsLinuxWindows.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 500, 500);

        setSize(new java.awt.Dimension(500, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBackActionPerformed
        settingsScreen.inputPlayersPictures();
        settingsScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbBackActionPerformed

    private void jbMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMinimizeActionPerformed
        this.setState(1);
    }//GEN-LAST:event_jbMinimizeActionPerformed

    private void jbAndroidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAndroidActionPerformed
        setPictureUrl("Android");
    }//GEN-LAST:event_jbAndroidActionPerformed

    private void jbAppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAppleActionPerformed
        setPictureUrl("Apple");
    }//GEN-LAST:event_jbAppleActionPerformed

    private void jbEMuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEMuleActionPerformed
        setPictureUrl("Emule");
    }//GEN-LAST:event_jbEMuleActionPerformed

    private void jbGIMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGIMPActionPerformed
        setPictureUrl("GIMP");
    }//GEN-LAST:event_jbGIMPActionPerformed

    private void jbGNUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGNUActionPerformed
        setPictureUrl("GNU");
    }//GEN-LAST:event_jbGNUActionPerformed

    private void jbGithubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGithubActionPerformed
        setPictureUrl("Github");
    }//GEN-LAST:event_jbGithubActionPerformed

    private void jbGitlabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGitlabActionPerformed
        setPictureUrl("Gitlab");
    }//GEN-LAST:event_jbGitlabActionPerformed

    private void jbJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbJavaActionPerformed
        setPictureUrl("Java");
    }//GEN-LAST:event_jbJavaActionPerformed

    private void jbJSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbJSActionPerformed
        setPictureUrl("Javascript");
    }//GEN-LAST:event_jbJSActionPerformed

    private void jbKonqiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbKonqiActionPerformed
        setPictureUrl("Konqi");
    }//GEN-LAST:event_jbKonqiActionPerformed

    private void jbMozillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMozillaActionPerformed
        setPictureUrl("Mozilla");
    }//GEN-LAST:event_jbMozillaActionPerformed

    private void jbMySQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMySQLActionPerformed
        setPictureUrl("MySQL");
    }//GEN-LAST:event_jbMySQLActionPerformed

    private void jbNodeJSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNodeJSActionPerformed
        setPictureUrl("NodeJS");
    }//GEN-LAST:event_jbNodeJSActionPerformed

    private void jbPhpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPhpActionPerformed
        setPictureUrl("PHP");
    }//GEN-LAST:event_jbPhpActionPerformed

    private void jbPidginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPidginActionPerformed
        setPictureUrl("Pidgin");
    }//GEN-LAST:event_jbPidginActionPerformed

    private void jbPythonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPythonActionPerformed
        setPictureUrl("Python");
    }//GEN-LAST:event_jbPythonActionPerformed

    private void jbRailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRailsActionPerformed
        setPictureUrl("Rails");
    }//GEN-LAST:event_jbRailsActionPerformed

    private void jbRichUnclePennyBagsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRichUnclePennyBagsActionPerformed
        setPictureUrl("Rich uncle penny bags");
    }//GEN-LAST:event_jbRichUnclePennyBagsActionPerformed

    private void jbTuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTuxActionPerformed
        setPictureUrl("Tux");
    }//GEN-LAST:event_jbTuxActionPerformed

    private void jbWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbWindowsActionPerformed
        setPictureUrl("Windows");
    }//GEN-LAST:event_jbWindowsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton jbAndroid;
    private javax.swing.JButton jbApple;
    public static final javax.swing.JButton jbBack = new javax.swing.JButton();
    private javax.swing.JButton jbEMule;
    private javax.swing.JButton jbGIMP;
    private javax.swing.JButton jbGNU;
    private javax.swing.JButton jbGithub;
    private javax.swing.JButton jbGitlab;
    private javax.swing.JButton jbJS;
    private javax.swing.JButton jbJava;
    private javax.swing.JButton jbKonqi;
    public static final javax.swing.JButton jbMinimize = new javax.swing.JButton();
    private javax.swing.JButton jbMozilla;
    private javax.swing.JButton jbMySQL;
    private javax.swing.JButton jbNodeJS;
    private javax.swing.JButton jbPhp;
    private javax.swing.JButton jbPidgin;
    private javax.swing.JButton jbPython;
    private javax.swing.JButton jbRails;
    private javax.swing.JButton jbRichUnclePennyBags;
    private javax.swing.JButton jbTux;
    private javax.swing.JButton jbWindows;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    private String catchThePictureUrl(String pictureName){
        boolean error = false;
        String url;
            switch(pictureName){
                case "Android":
                    url = "../img/Players/Android.png";
                    break;
                case "Apple":
                    url = "../img/Players/Apple.png";
                    break;
                case "Emule":
                    url = "../img/Players/Emule.png";
                    break;
                case "GIMP":
                    url = "../img/Players/GIMP.png";
                    break;
                case "Github":
                    url = "../img/Players/Github.png";
                    break;
                case "Gitlab":
                    url = "../img/Players/Gitlab.png";
                    break;
                case "GNU":
                    url = "../img/Players/GNU.png";
                    break;
                case "Java":
                    url = "../img/Players/Java.png";
                    break;
                case "Javascript":
                    url = "../img/Players/Javascript.png";
                    break;
                case "Konqi":
                    url = "../img/Players/Konqi.png";
                    break;
                case "Mozilla":
                    url = "../img/Players/Mozilla.png";
                    break;
                case "MySQL":
                    url = "../img/Players/MySQL.png";
                    break;
                case "NodeJS":
                    url = "../img/Players/NodeJS.png";
                    break;
                case "PHP":
                    url = "../img/Players/PHP.png";
                    break;
                case "Pidgin":
                    url = "../img/Players/Pidgin.png";
                    break;
                case "Python":
                    url = "../img/Players/Python.png";
                    break;
                case "Rails":
                    url = "../img/Players/Rails.png";
                    break;
                case "Rich uncle penny bags":
                    url = "../img/Players/RichUnclePennybags.png";
                    break;
                case "Tux":
                    url = "../img/Players/Tux.png";
                    break;
                case "Windows":
                    url = "../img/Players/Windows.png";
                    break;
                default:
                    error=true;
                    url = "../img/Players/Tux.png";
            }
        if(error){
            JOptionPane.showMessageDialog(null, languages.getErrorToSelectThePictureText(), languages.getGameNameText(), JOptionPane.ERROR_MESSAGE);
            return url;
        }else{
            JOptionPane.showMessageDialog(null, languages.getThePictureSelectedWasText() + " " + pictureName, languages.getGameNameText(), JOptionPane.PLAIN_MESSAGE);
            return url;
        }
    }
    
    private void setPictureUrl(String pictureName){
        if(currentlyPlayer.equalsIgnoreCase("Player1")){
            Players.setPictureUrlPlayer1(catchThePictureUrl(pictureName));
        }else{
            Players.setPictureUrlPlayer2(catchThePictureUrl(pictureName));
        }
    }

}
