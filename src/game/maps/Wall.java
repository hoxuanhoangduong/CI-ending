package game.maps;

import game.GameObject;
import game.renderer.SingleImageRenderer;
import physics.BoxColider;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Wall extends GameObject {
    BoxColider boxColider;

    public int isType;

    public Wall(String url) {
        super();
        if(url != null){
            BufferedImage image = SpriteUtils.loadImage(url);
            this.renderer = new SingleImageRenderer(image);
        };
        this.boxColider = new BoxColider(this.position,20,20);

    }

    public void addImage(int dataImage) {
        switch (dataImage){
            case 1: {
                isType = 1;
                BufferedImage image = SpriteUtils.loadImage("wall_colum.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 2: {
                isType = 2;
                BufferedImage image = SpriteUtils.loadImage("space.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 1: {
                isType = 1;
                BufferedImage image = SpriteUtils.loadImage("wall_colum.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 1: {
                isType = 1;
                BufferedImage image = SpriteUtils.loadImage("wall_colum.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 1: {
                isType = 1;
                BufferedImage image = SpriteUtils.loadImage("wall_colum.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 1: {
                isType = 1;
                BufferedImage image = SpriteUtils.loadImage("wall_colum.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 1: {
                isType = 1;
                BufferedImage image = SpriteUtils.loadImage("wall_colum.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 1: {
                isType = 1;
                BufferedImage image = SpriteUtils.loadImage("wall_colum.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 1: {
                isType = 1;
                BufferedImage image = SpriteUtils.loadImage("wall_colum.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 1: {
                isType = 1;
                BufferedImage image = SpriteUtils.loadImage("wall_colum.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }
        }
    }
}
