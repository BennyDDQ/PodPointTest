
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import setUp.TestSetup;
import setUp.TestSteps;


public class PP_Test extends TestSetup {
    @BeforeSuite
    @Override
    public void beforeSuite() {
        super.beforeSuite();
    }

    @AfterSuite
    @Override
    public void afterSuite() {
        super.afterSuite();
    }

    public static void main(String[] args) throws InterruptedException {

        TestSetup beforeTest = new TestSetup();
        beforeTest.beforeSuite();

        TestSteps testFlow = new TestSteps();
        testFlow.checkoutTest();

        TestSetup afterTest = new TestSetup();
        afterTest.afterSuite();
    }
}
