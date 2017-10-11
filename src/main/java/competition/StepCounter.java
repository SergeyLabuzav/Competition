package competition;


public class StepCounter {

    private DancerAction dancerAction;
    private FloorAction floorAction;

    private int count = 0;

    public StepCounter() {
        dancerAction = new DancerAction();
        floorAction = new FloorAction();
    }

    public void init(Integer[] steps) {
        dancerAction.createDancer(steps);
        floorAction.createFloor(steps.length);

        start();
    }

    private void start() {
        count = 0;
        move();
    }

    private void move() {
        while (!floorAction.isStop()) {
            int position = floorAction.getPosition();
            int step = dancerAction.move(position);

            floorAction.move(step);
            count += floorAction.getStepChange();
        }
        floorAction.backToStart();
        count += floorAction.getStepChange();

        finish(floorAction.isCycle());
    }

    private void finish(boolean isCycle) {
        if (isCycle) {
            count = -1;
        }
    }

    public int getCount() {
        return count;
    }
}
