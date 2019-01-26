package game;

import game.renderer.SingleImageRenderer;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Background extends GameObject {
    public Background(){
        super();
        BufferedImage image = SpriteUtils.loadImage("assets/images/background/background.png");
        this.renderer = new SingleImageRenderer(image);
        this.position.set(0,0);
    }
}
