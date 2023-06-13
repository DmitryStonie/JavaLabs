package minesweeper.view;


import minesweeper.model.game.MinesweeperData;
import minesweeper.model.settings.SettingsData;
import minesweeper.timer.Timer;

public class GameView {


    protected Timer timer = new Timer();

    protected MinesweeperData minesweeperData;
    protected String userName;
    protected int lengthField;
    protected int widthField;
    protected int numOfMines;

    private void setModel(SettingsData settingsData) {
    }
    private void startTimerThread() {
    }
    private void addObservers() {
    }
    public void setData(SettingsData settingsData) {
        setModel(settingsData);
        addObservers();
        startTimerThread();
        initField();
    }
    private void initField() {

    }
}
