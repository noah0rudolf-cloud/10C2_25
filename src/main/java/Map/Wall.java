package Map;

import Physics2D.PhysicsObject2D;
import java.awt.Image;

public class Wall extends PhysicsObject2D {
    public Wall(int PosX, int PosY, float Velocity, int[] Direction, Image img, int hitbox_height, int hitbox_width) {
        super(PosX, PosY, Velocity, Direction, img, hitbox_height, hitbox_width);
    }
}
