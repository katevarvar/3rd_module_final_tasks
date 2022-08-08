package robot;

public class MoveRobot {
    public static void main(String[] args) {
      Robot robot = new Robot();
      moveRobot(robot, 9, 8);
    }
    public static void moveRobot(Robot robot, int toX, int toY) {
        StringBuilder sb = new StringBuilder();
        sb.append("Desired position is X: ").append(toX).append(", Y: ").append(toY);
        if (robot.getX() != toX) {
            if (robot.getX() < toX) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            }
            else {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnRight();
                }
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getY() != toY) {
            if (robot.getY() < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            }
            else {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
        System.out.println(sb.toString());
        System.out.println("Robot is on the position X: " + robot.getX() + " Y: "+robot.getY());
        }
    }
