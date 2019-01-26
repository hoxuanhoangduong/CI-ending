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
        this.boxColider = new BoxColider(this,20,20);

    }

    public Wall(int width,int height) {
        super();
        this.boxColider = new BoxColider(this,width, height);
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

            case 3: {
                isType = 3;
                BufferedImage image = SpriteUtils.loadImage("wall1.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 4: {
                isType = 4;
                BufferedImage image = SpriteUtils.loadImage("wall3.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 5: {
                isType = 5;
                BufferedImage image = SpriteUtils.loadImage("wall_hori.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 6: {
                isType = 6;
                BufferedImage image = SpriteUtils.loadImage("wall2.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 7: {
                isType = 7;
                BufferedImage image = SpriteUtils.loadImage("wall4.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 8: {
                isType = 8;
                BufferedImage image = SpriteUtils.loadImage("wall5.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 9: {
                isType = 9;
                BufferedImage image = SpriteUtils.loadImage("wall8.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 10: {
                isType = 10;
                BufferedImage image = SpriteUtils.loadImage("wall6.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 11: {
                isType = 11;
                BufferedImage image = SpriteUtils.loadImage("wall7.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 12: {
                isType = 12;
                BufferedImage image = SpriteUtils.loadImage("wall9.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }

            case 13: {
                isType = 13;
                BufferedImage image = SpriteUtils.loadImage("wall8.tsx");
                this.renderer = new SingleImageRenderer(image);
                break;
            }
        }
    }
}
