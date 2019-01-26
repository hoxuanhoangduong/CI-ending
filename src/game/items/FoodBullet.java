package game.items;

import game.renderer.SingleImageRenderer;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class FoodBullet extends Food {
    public FoodBullet() {
        super();
        BufferedImage image = SpriteUtils.loadImage("assets/images/pixel-fruit-cherry-16x16.png");
        this.renderer = new SingleImageRenderer(image);
        this.position.set(100, 150);
    }
}
