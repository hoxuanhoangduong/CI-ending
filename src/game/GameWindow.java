package game;

import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class GameWindow extends JFrame {
    public static boolean isUpPress;
    public static boolean isDownPress;
    public static boolean isLeftPress;
    public static boolean isRightPress;
    public static boolean isEffectPress;
    public GamePanel gamePanel;

    public GameWindow() {
        this.setupWindow();
        this.createGamePanel();
        this.setupListener();
        this.setVisible(true);
    }

    private void setupListener() {
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 87) {
                    GameWindow.isUpPress = true;
                }

                if (e.getKeyCode() == 83) {
                    GameWindow.isDownPress = true;
                }

                if (e.getKeyCode() == 65) {
                    GameWindow.isLeftPress = true;
                }

                if (e.getKeyCode() == 68) {
                    GameWindow.isRightPress = true;
                }

                if (e.getKeyCode() == 32) {
                    GameWindow.isEffectPress = true;
                }

            }

            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == 87) {
                    GameWindow.isUpPress = false;
                }

                if (e.getKeyCode() == 83) {
                    GameWindow.isDownPress = false;
                }

                if (e.getKeyCode() == 65) {
                    GameWindow.isLeftPress = false;
                }

                if (e.getKeyCode() == 68) {
                    GameWindow.isRightPress = false;
                }

                if (e.getKeyCode() == 32) {
                    GameWindow.isEffectPress = false;
                }

            }
        });
    }

    private void createGamePanel() {
        this.gamePanel = new GamePanel();
        this.gamePanel.setPreferredSize(new Dimension(400, 400));
        this.add(this.gamePanel);
        this.pack();
    }

    private void setupWindow() {
        this.setTitle("Pacman");
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
    }
}