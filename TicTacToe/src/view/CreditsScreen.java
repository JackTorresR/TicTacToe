
package view;

import java.util.Locale;
import model.Languages;
import model.Players;

/**
 *
 * @author Jackson T.R.
 * https://github.com/JackTorresR/
 * https://www.linkedin.com/in/jackson-torres-ramos-2a8797170/
 * 
 */
public class CreditsScreen extends javax.swing.JFrame {
    
    Languages languages;
    MenuScreen menuScreen;
    Players players;
    
    public CreditsScreen(MenuScreen menuScreen, Languages languages, Players players) {
        initComponents();
        this.languages = languages;
        this.menuScreen = menuScreen;
        this.players = players;
        inputLanguage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPanelCredits = new javax.swing.JScrollPane();
        jTextAreaCredits = new javax.swing.JTextArea();
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
        jbBack.setBounds(10, 10, 50, 50);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTitle);
        lblTitle.setBounds(60, 80, 360, 40);

        jScrollPanelCredits.setBorder(null);
        jScrollPanelCredits.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPanelCredits.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jScrollPanelCredits.setOpaque(false);
        jScrollPanelCredits.setRequestFocusEnabled(false);

        jTextAreaCredits.setEditable(false);
        jTextAreaCredits.setBackground(new java.awt.Color(56, 182, 255));
        jTextAreaCredits.setColumns(20);
        jTextAreaCredits.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextAreaCredits.setLineWrap(true);
        jTextAreaCredits.setRows(5);
        jTextAreaCredits.setBorder(null);
        jTextAreaCredits.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPanelCredits.setViewportView(jTextAreaCredits);

        getContentPane().add(jScrollPanelCredits);
        jScrollPanelCredits.setBounds(70, 130, 360, 280);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CreditsScreen/creditsScreen.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 500, 500);

        setSize(new java.awt.Dimension(500, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBackActionPerformed
        menuScreen.languages = languages;
        menuScreen.inputLanguage();
        menuScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbBackActionPerformed

    private void jbMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMinimizeActionPerformed
        this.setState(1);
    }//GEN-LAST:event_jbMinimizeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JScrollPane jScrollPanelCredits;
    private javax.swing.JTextArea jTextAreaCredits;
    public static final javax.swing.JButton jbBack = new javax.swing.JButton();
    public static final javax.swing.JButton jbMinimize = new javax.swing.JButton();
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables

    private void inputLanguage() {
        lblTitle.setText(languages.getCreditsLabel());
        addText();
    }

    private void addText() {
        jTextAreaCredits.setText(languages.getDevelopedByText()+": Jackson Torres Ramos.\n" +
                                 languages.getInText() + " Java SE, " + languages.getUsingText() + " Netbeans 8.1. (ORACLE)\n\n" +
                                 "***   " + languages.getImagesText() + "   ***\n" +
                                 languages.getLoadingGifText() + ": @imnotthedoctor (IMGUR)\n" +
                                 languages.getBackArromIconText() + ": Messenger 1.0 (FACEBOOK)\n" +
                                 "WINDOWS" + ": Pixel Bazaar (ICON FINDER)\n" +
                                 "TUX" + ": Sergio Sánchez López (ICON FINDER)\n" +
                                 "GIMP" + ": Oliver Scholtz (ICON FINDER)\n" +
                                 "GNU" + ": Icon Finder (ICON FINDER)\n" +
                                 "Konqi" + ": Tyson Tan (TYSON TAN)\n" +
                                 "Pidgin" + ": Frank Souza (ICON FINDER)\n" +
                                 "Android" + ": Round icons (ICON FINDER)\n" +
                                 "Rich Uncle Pennybags" + ": Vectto (ICON FINDER)\n" +
                                 "Java" + ": Aha-Soft (ICON FINDER)\n" +
                                 "Javascript" + ": Erik Ragnar Eliasson (ICON FINDER)\n" +
                                 "Github" + ": Alpár-Etele Méder (ICON FINDER)\n" +
                                 "Gitlab" + ": Flatart (ICON FINDER)\n" +
                                 "Python" + ": Flatart (ICON FINDER)\n" +
                                 "MySQL" + ": Samat Odedara (ICON FINDER)\n" +
                                 "Node JS" + ": Abhishek Pipalva (ICON FINDER)\n" +
                                 "Rails" + ": Martin Leblanc (ICON FINDER)\n" + 
                                 "Mozilla" + ": Shepard Fairey (MOZILLA CORPORATION)\n" +
                                 "eMule" + ": Helix84 (EMULE TEAM)\n" +
                                 "Blinky" + ": Bas Snabilie (FREEDOS PROJECT)\n");
        jTextAreaCredits.setSelectionStart(0);
        jTextAreaCredits.setSelectionEnd(5);
    }

}
