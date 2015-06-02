package jscicalc.pobject;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BlackBoxCubeTest.class, BlackBoxFactorialTest.class,
		BlackBoxInverseTest.class, BlackBoxSquareTest.class })
public class BlackBoxTests {

}
