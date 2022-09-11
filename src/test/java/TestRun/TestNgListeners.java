package TestRun;
import com.clxMT.Base.TestBase;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.IOException;

public class TestNgListeners extends TestBase implements ITestListener {

    @Override
    public void onStart(ITestContext context)
    {
        System.out.println("On Start");
    }
    @Override
    public void onFinish(ITestContext context)
    {
        System.out.println("On Finish");
    }
    @Override
    public void onTestStart(ITestResult result)
    {
        System.out.println("On Test Start");
    }
    @Override
    public void onTestSuccess(ITestResult result)
    {
        System.out.println("On Test Finish");
    }
    @Override
    public void onTestSkipped(ITestResult result)
    {
        System.out.println("On Test Skipped");
    }
    @Override
    public void onTestFailure(ITestResult result)
    {
        try
        {
            screenshot(driver, "Failed"+"_"+System.currentTimeMillis());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("On Test Failure");
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result)
    {
        System.out.println("On Test Failure with Success Percentage");
    }

}
