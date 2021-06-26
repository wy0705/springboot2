import com.easy.archiecture.Application;
import com.easy.archiecture.entity.DemoProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class TestBootBase {

    @Autowired
    private DemoProperties demoProperties;


    @Test
    public void testRandom() {
        System.out.println(demoProperties.getValue1());
        System.out.println(demoProperties.getValue2());
        System.out.println(demoProperties.getValue3());
    }


    @Test
    public void testProperties() {
        Assert.assertEquals("111", demoProperties.getId());
        Assert.assertEquals("aaa", demoProperties.getName());
    }
}
