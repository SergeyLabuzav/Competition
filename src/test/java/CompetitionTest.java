import competition.StepCounter;
import org.junit.Assert;
import org.junit.Test;


public class CompetitionTest {
    @Test
    public void start() {
        StepCounter counter = new StepCounter();

        counter.init(new Integer[]{2,0,7});
        Assert.assertEquals(4, counter.getCount());

        counter.init(new Integer[]{8});
        Assert.assertEquals(0, counter.getCount());

        counter.init(new Integer[]{2,2,1});
        Assert.assertEquals(4, counter.getCount());

        counter.init(new Integer[]{4,2,0,2,3});
        Assert.assertEquals(12, counter.getCount());

        counter.init(new Integer[]{4, 2, 9, 2, 3});
        Assert.assertEquals(12, counter.getCount());

        counter.init(new Integer[]{6, 2, 2, 4, 9, 1, 3});
        Assert.assertEquals(12, counter.getCount());

        counter.init(new Integer[]{6, 9, 5, 9, 9, 6, 1, 7, 7, 5, 5, 9});
        Assert.assertEquals(24, counter.getCount());

        counter.init(new Integer[]{2, 1, 1, 0});
        Assert.assertEquals(-1, counter.getCount());

        counter.init(new Integer[]{2, 3, 4, 5, 6, 7, 8, 9});
        Assert.assertEquals(12, counter.getCount());

        counter.init(new Integer[]{2,4,6,8,8,6,4,2,1,2,5,2,1});
        Assert.assertEquals(24, counter.getCount());
    }
}
