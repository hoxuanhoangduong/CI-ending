package game.key;

import game.GameObject;
import game.renderer.Animation;
import physics.BoxColider;
import physics.Physics;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Key extends GameObject implements Physics {
    BoxColider boxColider;

    public Key(){
        ArrayList<BufferedImage> images = new ArrayList<>();
        images.add(SpriteUtils.loadImage("assets/images/keys/key.png"));
        this.renderer = new Animation(images);
        this.boxColider = new BoxColider(this,30,30);
    }

    @Override
    public void run(){
        super.run();
    }

    @Override
    public BoxColider getBoxColider(){
        return this.boxColider;
    }

    @Override
    public void deActive(){
        super.deActive();

    }
}
