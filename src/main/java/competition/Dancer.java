package competition;


import java.util.Arrays;
import java.util.List;

public class Dancer {
    private List<Integer> steps;

    public void setSteps(Integer[] steps) {
        if (isNegative(steps) || isOutRange(steps)) {
            steps = new Integer[]{0};
        }
        this.steps = Arrays.asList(steps);
    }

    public int getStep(int position) {
        return steps.get(position);
    }

    private boolean isNegative(Integer[] steps) {
        for (int step : steps) {
            if (step < 0) {
                return true;
            }
        }
        return false;
    }

    private boolean isOutRange(Integer[] steps) {
        return (steps.length < 1 || steps.length > 50);
    }
}
