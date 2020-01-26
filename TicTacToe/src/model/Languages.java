
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Jackson T.R.
 * https://github.com/JackTorresR/
 * https://www.linkedin.com/in/jackson-torres-ramos-2a8797170/
 * 
 */
public final class Languages {

    //Every Screens
    private static String currentlyLanguage = "English";
    private String gameNameText;
    
    //Icon Selector Screen
    private String thePictureSelectedWasText;
    private String errorToSelectThePictureText;
    
    //Credits Screen
    private String creditsLabel;
    private String developedByText;
    private String InText;
    private String usingText;
    private String imagesText;
    private String loadingGifText;
    private String backArromIconText;
    
    //Settings Screen
    private String notFoundLanguage;
    private String clickOnTheButtonsText;
    private String typeTheNewNameText;
    private String pictureNotFoundText;
    
    //Menu Screen
    private String startButton;
    private String settingsButton;
    private String creditsButton;
    
    //Game Screen
    private String failText;
    private String winnerText;

    
    //Constructor
    public Languages(String languageChosen) {
        setCurrentlyLanguage(currentlyLanguage);
        verifyLanguage();
    }

    //Verification method
    public Languages verifyLanguage(){
        switch(getCurrentlyLanguage()){
            case "Português-BR":
                inputPortuguese();
                break;
            case "English":
                inputEnglish();
                break;
            case "Español":
                inputSpanish();
                break;
            case "Afrikaans":
                inputAfrikaans();
                break;
            case "Française":
                inputFrench();
                break;
            default:
                JOptionPane.showMessageDialog(null, getNotFoundLanguage(), getGameNameText(), JOptionPane.WARNING_MESSAGE);
        }
        
        return this;
    }
    
    
    //Every screens
    public static String getCurrentlyLanguage() {
        return currentlyLanguage;
    }

    public static void setCurrentlyLanguage(String currentlyLanguage) {
        Languages.currentlyLanguage = currentlyLanguage;
    }

    public String getGameNameText() {
        return gameNameText;
    }

    public void setGameNameText(String gameNameText) {
        this.gameNameText = gameNameText;
    }
    
    //Icon Selector Screen
    public String getThePictureSelectedWasText() {
        return thePictureSelectedWasText;
    }

    public void setThePictureSelectedWasText(String thePictureSelectedWasText) {
        this.thePictureSelectedWasText = thePictureSelectedWasText;
    }

    public String getErrorToSelectThePictureText() {
        return errorToSelectThePictureText;
    }

    public void setErrorToSelectThePictureText(String errorToSelectThePictureText) {
        this.errorToSelectThePictureText = errorToSelectThePictureText;
    }
        
    //Credits screen
    public String getCreditsLabel() {
        return creditsLabel;
    }

    public void setCreditsLabel(String creditsLabel) {
        this.creditsLabel = creditsLabel;
    }

    public String getDevelopedByText() {
        return developedByText;
    }

    public void setDevelopedByText(String developedByText) {
        this.developedByText = developedByText;
    }

    public String getInText() {
        return InText;
    }

    public void setInText(String InText) {
        this.InText = InText;
    }

    public String getUsingText() {
        return usingText;
    }

    public void setUsingText(String usingText) {
        this.usingText = usingText;
    }
    
    public String getImagesText() {
        return imagesText;
    }

    public void setImagesText(String imagesText) {
        this.imagesText = imagesText;
    }

    public String getLoadingGifText() {
        return loadingGifText;
    }

    public void setLoadingGifText(String loadingGifText) {
        this.loadingGifText = loadingGifText;
    }

    public String getBackArromIconText() {
        return backArromIconText;
    }

    public void setBackArromIconText(String backArromIconText) {
        this.backArromIconText = backArromIconText;
    }
        
    
    //Settings screen
    public String getNotFoundLanguage() {
        return notFoundLanguage;
    }

    public void setNotFoundLanguage(String notFoundLanguage) {
        this.notFoundLanguage = notFoundLanguage;
    }

    public String getClickOnTheButtonsText() {
        return clickOnTheButtonsText;
    }

    public void setClickOnTheButtonsText(String clickOnTheButtonsText) {
        this.clickOnTheButtonsText = clickOnTheButtonsText;
    }
    
    public String getTypeTheNewNameText() {
        return typeTheNewNameText;
    }

    public void setTypeTheNewNameText(String typeTheNewNameText) {
        this.typeTheNewNameText = typeTheNewNameText;
    }

    public String getPictureNotFoundText() {
        return pictureNotFoundText;
    }

    public void setPictureNotFoundText(String pictureNotFoundText) {
        this.pictureNotFoundText = pictureNotFoundText;
    }
    
    
    //Menu screen
    public String getStartButton() {
        return startButton;
    }

    public void setStartButton(String startButton) {
        this.startButton = startButton;
    }

    public String getSettingsButton() {
        return settingsButton;
    }

    public void setSettingsButton(String settingsButton) {
        this.settingsButton = settingsButton;
    }

    public String getCreditsButton() {
        return creditsButton;
    }

    public void setCreditsButton(String creditsButton) {
        this.creditsButton = creditsButton;
    }
    
    
    //Game screen
    public String getFailText() {
        return failText;
    }

    public void setFailText(String failText) {
        this.failText = failText;
    }

    public String getWinnerText() {
        return winnerText;
    }

    public void setWinnerText(String winnerText) {
        this.winnerText = winnerText;
    }

    
    //Languages methods
    private void inputPortuguese() {
        //Every Screens
        setGameNameText("Jogo da velha");

        //Credits screen
        setCreditsLabel("Créditos");
        setDevelopedByText("Desenvolvido por");
        setInText("Desenvoldido em");
        setUsingText("usando");
        setImagesText("Imagens");
        setLoadingGifText("Gif da tela de carregamento");
        setBackArromIconText("Imagem do botão de voltar");

        //Icon Selector Screen
        setThePictureSelectedWasText("A foto selecionada foi");
        setErrorToSelectThePictureText("Não foi possível selecionar essa foto");
        
        //Settings screen
        setNotFoundLanguage("Língua não encontrada.");
        setClickOnTheButtonsText("Clíque abaixo para modificar:");
        setTypeTheNewNameText("Digite o novo nome");
        setPictureNotFoundText("Foto não encontrada");

        //Menu Screen
        setStartButton("Começar");
        setSettingsButton("Configurações");
        setCreditsButton("Créditos");

        //Game Screen
        setFailText("Empate.");
        setWinnerText("O ganhor é, ");
    }

    private void inputEnglish() {
        //Every Screens
        setGameNameText("Tic-Tac-Toe");

        //Credits screen
        setCreditsLabel("Credits");
        setDevelopedByText("Developed by");
        setInText("Developed in");
        setUsingText("using");
        setImagesText("Images");
        setLoadingGifText("Gif from loading screen");
        setBackArromIconText("Image from the back button");

        //Icon Selector Screen
        setThePictureSelectedWasText("The picture selected was");
        setErrorToSelectThePictureText("Error to select the picture");
        
        //Settings screen
        setNotFoundLanguage("Not found language.");
        setClickOnTheButtonsText("Click below to modify:");
        setTypeTheNewNameText("Type the new name");
        setPictureNotFoundText("Picture not found");

        //Menu Screen
        setStartButton("Start");
        setSettingsButton("Settings");
        setCreditsButton("Credits");

        //Game Screen
        setFailText("Tie.");
        setWinnerText("The winner is, ");
    }

    private void inputSpanish() {
        //Every Screens
        setGameNameText("Juego de tres en raya");

        //Credits screen
        setCreditsLabel("Créditos");
        setDevelopedByText("Desarrollado por");
        setInText("Desarrollado en");
        setUsingText("utilizando");
        setImagesText("Imágenes");
        setLoadingGifText("Gif desde la pantalla de carga");
        setBackArromIconText("Imagen del botón de retroceso");

        //Icon Selector Screen
        setThePictureSelectedWasText("La imagen seleccionada fue");
        setErrorToSelectThePictureText("Error al seleccionar la imagen");
        
        //Settings screen
        setNotFoundLanguage("Idioma no encontrado.");
        setClickOnTheButtonsText("Haga clic para modificar:");
        setTypeTheNewNameText("Escribe el nuevo nombre");
        setPictureNotFoundText("Imagen no encontrada");

        //Menu Screen
        setStartButton("Comienzo");
        setSettingsButton("Configuraciones");
        setCreditsButton("Créditos");

        //Game Screen
        setFailText("Corbata.");
        setWinnerText("El ganador es, ");
    }

    private void inputAfrikaans() {
        //Every Screens
        setGameNameText("Kringetjies en kruisies");

        //Credits screen
        setCreditsLabel("Krediete");
        setDevelopedByText("Ontwikkel deur");
        setInText("Ontwikkel in");
        setUsingText("die gebruik van");
        setImagesText("Beelde");
        setLoadingGifText("Geskenk vanaf die laai skerm");
        setBackArromIconText("Beeld vanaf die agterste knoppie");

        //Icon Selector Screen
        setThePictureSelectedWasText("Die foto wat gekies is, was");
        setErrorToSelectThePictureText("Fout om die prent te kies");
        
        //Settings screen
        setNotFoundLanguage("Nie taal gevind nie.");
        setClickOnTheButtonsText("Klik hieronder om te wysig:");
        setTypeTheNewNameText("Tik die nuwe naam in");
        setPictureNotFoundText("Prent nie gevind nie");

        //Menu Screen
        setStartButton("Begin");
        setSettingsButton("Instellings");
        setCreditsButton("Krediete");

        //Game Screen
        setFailText("Das");
        setWinnerText("Die wenner is, ");
    }

    private void inputFrench() {
        //Every Screens
        setGameNameText("Tic-Tac-Toe");

        //Credits screen
        setCreditsLabel("Crédits");
        setDevelopedByText("Développé par");
        setInText("Développé en");
        setUsingText("en utilisant");
        setImagesText("Images");
        setLoadingGifText("Gif de l'écran de chargement");
        setBackArromIconText("Image du bouton de retour");

        //Icon Selector Screen
        setThePictureSelectedWasText("L'image sélectionnée était");
        setErrorToSelectThePictureText("Erreur de sélection de l'image");
        
        //Settings screen
        setNotFoundLanguage("Langue introuvable.");
        setClickOnTheButtonsText("Cliquez ci-dessous pour modifier:");
        setTypeTheNewNameText("Tapez le nouveau nom");
        setPictureNotFoundText("Image non trouvée");

        //Menu Screen
        setStartButton("Début");
        setSettingsButton("Réglages");
        setCreditsButton("Crédits");

        //Game Screen
        setFailText("Attacher.");
        setWinnerText("Le gagnant est, ");
    }
    
}
