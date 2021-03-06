package game.maps;

import game.GameObject;

import java.util.List;

public class Layer {
   private  List<Integer> data;
   private int height;
   private int width;

   @Override
   public String toString(){
      return   "Layer{" +
              "data=" + data +
              ", height=" + height +
              ", width=" + width +
              '}';
   }

   public void generate() {
      for (int titleY = 0; titleY < height; titleY ++) {
         for (int titleX = 0; titleX <width; titleX ++) {
            int mapData = data.get(titleY + width + titleX);
            if(mapData != 0) {
                  Wall wall = new Wall();
                  wall.position.set(titleX * 20, titleY * 20);
               GameObject.addNew(wall);
            }
         }
      }
   }
}
