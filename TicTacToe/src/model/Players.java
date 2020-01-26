
package model;

/**
 *
 * @author Jackson T.R.
 * https://github.com/JackTorresR/
 * https://www.linkedin.com/in/jackson-torres-ramos-2a8797170/
 * 
 */
public final class Players {

    private static String namePlayer1;
    private static String pictureUrlPlayer1;
    private static int pointsPlayer1;
    private static String namePlayer2;
    private static String pictureUrlPlayer2;
    private static int pointsPlayer2;

    Players(){}
    
    public Players(String namePlayer1, String namePlayer2, String pictureUrlPlayer1, String pictureUrlPlayer2, int points1, int points2){
        this.namePlayer1=namePlayer1;
        this.namePlayer2=namePlayer2;
        this.pictureUrlPlayer1 = pictureUrlPlayer1;
        this.pictureUrlPlayer2 = pictureUrlPlayer2;
        this.pointsPlayer1 = points1;
        this.pointsPlayer2 = points2;
    }

    public static String getNamePlayer1() {
        return namePlayer1;
    }

    public static void setNamePlayer1(String namePlayer1) {
        Players.namePlayer1 = namePlayer1;
    }

    public static String getPictureUrlPlayer1() {
        return pictureUrlPlayer1;
    }

    public static void setPictureUrlPlayer1(String pictureUrlPlayer1) {
        Players.pictureUrlPlayer1 = pictureUrlPlayer1;
    }

    public static String getPictureUrlPlayer2() {
        return pictureUrlPlayer2;
    }

    public static void setPictureUrlPlayer2(String pictureUrlPlayer2) {
        Players.pictureUrlPlayer2 = pictureUrlPlayer2;
    }
    
    public static int getPointsPlayer1() {
        return pointsPlayer1;
    }

    public static void setPointsPlayer1(int pointsPlayer1) {
        Players.pointsPlayer1 = pointsPlayer1;
    }

    public static String getNamePlayer2() {
        return namePlayer2;
    }

    public static void setNamePlayer2(String namePlayer2) {
        Players.namePlayer2 = namePlayer2;
    }

    public static int getPointsPlayer2() {
        return pointsPlayer2;
    }

    public static void setPointsPlayer2(int pointsPlayer2) {
        Players.pointsPlayer2 = pointsPlayer2;
    }
    
}
