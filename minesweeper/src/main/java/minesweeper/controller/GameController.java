package minesweeper.controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import minesweeper.view.GameView;

public class GameController extends GameView {
    @FXML
    public void restartGame(MouseEvent event) {
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
