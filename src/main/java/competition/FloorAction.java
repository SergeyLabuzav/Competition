package competition;


public class FloorAction {

    private Floor floor;

    public void createFloor(int length) {
        floor = new Floor(length);

        init();
    }

    private void init() {
        floor.visitCell(0);
    }

    public void move(int step) {
        if (Utils.isOdd(step)) {
            stepBack(step);
        } else {
            stepForward(step);
        }
        checkCycle(floor.getCurrentPosition());
    }

    private void stepBack(int step) {
        if (floor.getCurrentPosition() - step < 0 || step == 0) {
            floor.setIsStop(true);
            floor.setStepChange(0);
        } else {
            floor.setCurrentPosition(floor.getCurrentPosition() - step);
            floor.setStepChange(step);
        }
    }

    private void stepForward(int step) {
        if (floor.getCurrentPosition() + step >= floor.getLength() || step == 0) {
            floor.setIsStop(true);
            floor.setStepChange(0);
        } else {
            floor.setCurrentPosition(floor.getCurrentPosition() + step);
            floor.setStepChange(step);
        }
    }

    public boolean isStop() {
        return floor.isStop();
    }

    public boolean isCycle() {
        return floor.isCycle();
    }

    public int getStepChange() {
        return floor.getStepChange();
    }

    public int getPosition() {
        return floor.getCurrentPosition();
    }

    public void backToStart() {
        floor.setStepChange(getPosition());
        floor.setIsStop(true);
    }

    private void checkCycle(int position) {
        if (floor.cellValue(position) == 2 && !floor.isStop()) {
            floor.setIsStop(true);
            floor.setIsCycle(true);
        } else {
            floor.visitCell(position);
        }
    }
}