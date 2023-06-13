package minesweeper.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import minesweeper.App;
import minesweeper.model.settings.SettingsData;

import java.io.IOException;

public class MainMenuController {

    private Parent root;

    private static final String NEW_GAME_VIEW = "minesweeper/game.fxml";
    private static final String SCORE_TABLE_VIEW = "minesweeper/scoreTable.fxml";
    private static final String SETTINGS_VIEW = "minesweeper/settingsForNewGame.fxml";
    private static final String EXIT_HEADER = "Are you sure you want to exit?";
    private static final String EXIT_LABEL_CONTENT = "://///";

    private SettingsData settingsData = new SettingsData();
    @FXML
    private AnchorPane pane = new AnchorPane();

    @FXML
    private ImageView startImage = new ImageView();

    @FXML
    void createNewGame(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(NEW_GAME_VIEW));
        try {
            settingsData = SettingsController.downloadSettingFile();
            root = loader.load();
            GameController gameController = loader.getController();
            gameController.setData(settingsData);

            App.setNewScene(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void exitFromGame(MouseEvent event) {
    }

    @FXML
    void showScoreTable(MouseEvent event) {
    }

    @FXML
    void showSettings(MouseEvent event) {
    }

    public void initialize() {
        startImage.fitWidthProperty().bind(pane.widthProperty());
        startImage.fitHeightProperty().bind(pane.heightProperty());
    }


}