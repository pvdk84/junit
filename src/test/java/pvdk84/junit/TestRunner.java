package pvdk84.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * TestRunner can run various tests separately,
 * by adding various classes in the runClasses()
 * or it can run the the whole TestSuite in one go
 * (TestRunner is not needed for junit maven project,
 * because then you can just run "maven test")
 */

public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuite.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
