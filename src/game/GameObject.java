package game;

import physics.BoxColider;
import game.renderer.Renderer;
import physics.Physics;

import java.awt.*;
import java.util.ArrayList;

public class GameObject {
    // static: quan li
    public static ArrayList<GameObject> gameObjects = new ArrayList<>();

    public static void addNew(GameObject object) {
        gameObjects.add(object);
    }

    /**
     * dung lai gameObject
     *
     * @param cls
     * @param <E>
     * @return
     */
    public static <E extends GameObject> E recycle(Class<E> cls) {
        E object = findInactive(cls);
        if (object != null) {
            object.reset();
            return object;
        } else {
            try {
                return cls.getConstructor().newInstance();
            } catch (Exception ex) {
                return null;
            }
        }
    }

    public static <E extends GameObject> E findInactive(Class<E> cls) {
        for (int i = 0; i < gameObjects.size(); i++) {
            GameObject object = gameObjects.get(i);
            if (!object.isActive
                    && cls.isAssignableFrom(object.getClass())) {
                return (E) object;
            }
        }
        return null;
    }

    public static void clearAll() {
        gameObjects.clear();
    }

    public static void runAll() {
        for (int i = 0; i < gameObjects.size(); i++) {
            GameObject object = gameObjects.get(i); // GameObject, Player, Background
            if (object.isActive) {
                object.run(); // GameObject.run() || Player.run() || Background.run()
            }
        }
        System.out.println(gameObjects.size());
    }

    public static void renderAll(Graphics g) {
        for (int i = 0; i < gameObjects.size(); i++) {
            GameObject object = gameObjects.get(i);
            if (object.isActive) {
                object.render(g);
            }
        }
    }

    public static <E extends GameObject> E findIntersected(Class<E> cls, BoxColider boxColider) {
        for (int i = 0; i < gameObjects.size(); i++) {
            GameObject object = gameObjects.get(i);
            if (cls.isAssignableFrom(object.getClass())
                    && object instanceof Physics
                    && ((Physics) object).getBoxColider().intersected(boxColider)
                    && object.isActive) {
                return (E) object;
            }
        }
        return null;
    }

    // dinh nghia doi tuong
    public Renderer renderer;
    public Vector2D position;
    public Vector2D velocity;
    public boolean isActive;
    public Vector2D anchor;

    public GameObject() { //ham tao rong
        this.position = new Vector2D();
        this.velocity = new Vector2D();
        this.anchor = new Vector2D(0.5f, 0.5f);
        isActive = true;
        addNew(this); // cho gameObject vao mang quan li
    }

    public void run() {
        this.position.add(this.velocity);
    }

    public void render(Graphics g) {
        if (this.renderer != null) {
            this.renderer.render(g, this);
        }
    }

    public void deActive() {
        this.isActive = false;
    }

    public void reset() {
        this.isActive = true;
        // index = 0
        // dua thuoc tinh ve trang thai vua khoi tao
    }
}
