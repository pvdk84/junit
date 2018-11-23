package pvdk84.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Different tests can be added to one TestSuite
 * TestSuite can also be run with @RunWith
 * (TestSuite is not needed for junit maven project,
 * because then you can just run "maven test")
 */

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CalculatorTest.class,
        MessageTest.class
})

public class TestSuite {
}
