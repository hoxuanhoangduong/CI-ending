package game;


import game.enemy.Enemy;
import game.pacman.Pacman;

import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
    Background background;
    Pacman pacman;
    Enemy enemy;

    public GamePanel() {

    }

    public void gameLoop() {
        long lastLoop = 0L;
        long delay = 16L;

        while(true) {
            long currentTime;
            do {
                currentTime = System.currentTimeMillis();
            } while(currentTime - lastLoop <= delay);

            this.runAll();
            this.renderAll();
            lastLoop = currentTime;
        }
    }

    public void runAll() {
        GameObject.runAll();
    }

    public void renderAll() {
        this.repaint();
    }

    public void paint(Graphics g) {
        GameObject.renderAll(g);
    }
}
