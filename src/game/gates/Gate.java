package game.gates;

import game.GameObject;
import game.renderer.SingleImageRenderer;
import physics.BoxColider;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Gate extends GameObject {
    BoxColider boxColider;

    public Gate(){
        BufferedImage image = SpriteUtils.loadImage("E:\\Code Intensive\\ci-begin-master\\out\\production\\Project_cuoi_khoa\\assets\\images\\gates\\gate1.png");
        this.renderer = new SingleImageRenderer(image);

    }

}
