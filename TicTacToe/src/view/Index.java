
package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Languages;
import model.Players;

/**
 *
 * @author Jackson T.R.
 * https://github.com/JackTorresR/
 * https://www.linkedin.com/in/jackson-torres-ramos-2a8797170/
 * 
 */
public class Index {

    public static void main(String[] args) {
        LoadingScreen opening = new LoadingScreen();
        opening.setVisible(true);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            }
        opening.dispose();
        String namePlayer1 = "Linux";
        String namePlayer2 = "Windows";
        String pictureUrlPlayer1 = "../img/Players/Tux.png";
        String pictureUrlPlayer2 = "../img/Players/Windows.png";
        int pointsPlayer1 = 0;
        int pointsPlayer2 = 0;
        
        MenuScreen menuScreen = new MenuScreen(new Languages("English"), new Players(namePlayer1, namePlayer2, pictureUrlPlayer1, pictureUrlPlayer2, pointsPlayer1, pointsPlayer2));
        menuScreen.setVisible(true);
    }
    
}
