package game.pacman;

import game.GameObject;
import game.renderer.Renderer;
import game.renderer.SingleImageRenderer;
import tklibs.SpriteUtils;

import java.awt.*;

public class PacmanRenderer extends Renderer {
    Renderer leftRenderer;
    Renderer rightRenderer;
    Renderer upRenderer;
    Renderer downRenderer;
    Renderer currentRenderer;

    public PacmanRenderer() {
        this.leftRenderer = new SingleImageRenderer(SpriteUtils.loadImage("assets/images/pacman/pacman2.png"));
        this.rightRenderer = new SingleImageRenderer(SpriteUtils.loadImage("assets/images/pacman/pacman1.png"));
        this.upRenderer = new SingleImageRenderer(SpriteUtils.loadImage("assets/images/pacman/pacman3.png"));
        this.downRenderer = new SingleImageRenderer(SpriteUtils.loadImage("assets/images/pacman/pacman4.png"));
        this.currentRenderer = this.rightRenderer;
    }

    @Override
    public void render(Graphics g, GameObject master) {
        if(master.velocity.x > 0) {
            this.currentRenderer = this.rightRenderer;
        } else if(master.velocity.x < 0) {
            this.currentRenderer = this.leftRenderer;
        } else if(master.velocity.y > 0) {
            this.currentRenderer = this.downRenderer;
        } else if(master.velocity.y < 0){
            this.currentRenderer = this.upRenderer;
        }
        this.currentRenderer.render(g, master);
    }
}
