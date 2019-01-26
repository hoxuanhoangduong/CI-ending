package game.items;

import game.GameObject;
import game.pacman.Pacman;
import physics.BoxColider;
import physics.Physics;

import javax.swing.*;

public class Food extends GameObject implements Physics {
    BoxColider boxColider;

    public Food(){
        this.boxColider = new BoxColider(this,16,16);
    }

    public void powerUp(Pacman pacman){
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public BoxColider getBoxColider() {
        return this.boxColider;
    }
}
