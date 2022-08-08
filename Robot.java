package robot;

    public class Robot {
        int x=0;
        int y=0;
        Direction direction = Direction.UP;


        public Direction getDirection() {
            return direction;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }


        public void turnLeft() {
            System.out.println("Turning left");
            if (direction == Direction.DOWN){
                this.direction = Direction.RIGHT;
                return;
            }

            if (direction == Direction.UP){
                this.direction = Direction.LEFT;
                return;
            }

            if (direction == Direction.LEFT){
                this.direction = Direction.DOWN;
                return;
            }

            if (direction == Direction.RIGHT){
                this.direction = Direction.UP;
            }
        }

        public void turnRight() {
            System.out.println("Turning right");
            if (this.direction == Direction.DOWN){
                System.out.println("Down -> left");
                this.direction = Direction.LEFT;
                return;
            }

            if (this.direction == Direction.UP){
                System.out.println("Up -> right");
                this.direction = Direction.RIGHT;
                return;
            }

            if (this.direction == Direction.LEFT){
                System.out.println("Up -> up");
                this.direction = Direction.UP;
                return;
            }

            if (this.direction == Direction.RIGHT){
                System.out.println("Right -> down");
                this.direction = Direction.DOWN;
            }
        }

        public void stepForward() {
            System.out.println("moving forward");
            if (direction == Direction.DOWN){
                System.out.println("down");
                this.y--;
            }

            if (direction == Direction.UP){
                System.out.println("Up");
                this.y++;
            }

            if (direction == Direction.LEFT){
                System.out.println("Left");
                this.x--;
            }

            if (direction == Direction.RIGHT){
                System.out.println("Right");
                this.x++;
            }
        }
}
