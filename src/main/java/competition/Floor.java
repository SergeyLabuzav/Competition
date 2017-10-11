package competition;


public class Floor {
    private int length;
    private int currentPosition = 0;
    private int [] cells;

    private boolean isCycle = false;
    private boolean isStop = false;
    private int stepChange = 0;

    public Floor(int length) {
        this.length = length;

        isCycle = false;
        isStop = false;
        stepChange = 0;

        cells = new int[length];
        for (int cell : cells) {
            cell = 0;
        }
    }

    public boolean isCycle() {
        return isCycle;
    }

    public void setIsCycle(boolean isCycle) {
        this.isCycle = isCycle;
    }

    public boolean isStop() {
        return isStop;
    }

    public void setIsStop(boolean isStop) {
        this.isStop = isStop;
    }

    public int getStepChange() {
        return stepChange;
    }

    public void setStepChange(int stepChange) {
        this.stepChange = stepChange;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int position) {
        this.currentPosition = position;
    }

    public int getLength() {
        return length;
    }

    public int cellValue(int position) {
        return cells[position];
    }

    public void visitCell(int position) {
        cells[position] += 1;
    }
}
