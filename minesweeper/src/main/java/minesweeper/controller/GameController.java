package minesweeper.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import minesweeper.App;
import minesweeper.view.GameView;

import java.io.IOException;

public class GameController extends GameView {
    private static final String MAIN_MENU_VIEW = "/primary.fxml";
    @FXML
    public void restartGame(MouseEvent event) {
        timer.restartTimer();
        minesweeperData.restartGame();
    }
    @FXML
    public void mainMenu(MouseEvent event) {
        timer.restartTimer();
        minesweeperData.restartGame();
        FXMLLoader loader = new FXMLLoader(getClass().getResource(MAIN_MENU_VIEW));
        try {
            Parent root = loader.load();
            App.setNewScene(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void clickInGameField(MouseEvent event) {
        if(event.getButton().equals(MouseButton.PRIMARY)) {
            handleLeftClick(event);
        }
        if(event.getButton().equals(MouseButton.SECONDARY)) {
            handleRightClick(event);
        }
    }
    private void handleRightClick(MouseEvent event) {
        // right mouse button - change user note to the next one in the list
        int cellIndex = getCellIndex(event);
        minesweeperData.changeUserNote(cellIndex);
    }

    private void handleLeftClick(MouseEvent event) {
        // open cell
        int cellIndex = getCellIndex(event);
        minesweeperData.openCell(cellIndex);
    }
    private int getCellIndex(MouseEvent event) {
        Node node = (Node) event.getTarget();
        int row = GridPane.getRowIndex(node);
        int column = GridPane.getColumnIndex(node);
        return row * widthField + column;
    }
}
