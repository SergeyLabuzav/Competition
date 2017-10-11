package competition;


public class DancerAction {

    private Dancer dancer;

    public void createDancer(Integer[] steps) {
        this.dancer = new Dancer();
        this.dancer.setSteps(steps);
    }

    public int move(int position) {
        return dancer.getStep(position);
    }
}
