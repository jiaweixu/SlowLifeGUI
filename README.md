
# IS2545 DELIVERABLE 4: Performance Testing 
## Jiawei XU (jix20)

In this project I profiled a Conway's Game of Life simulation. I found three major performance issues in three methods: Cell.toString(), MainPanel.convertToInt(), and MainPanel.runContinuous() by sampling CPU through VisualVM (V1.3.9). I modified these three methods to improve the performance as while as keep the program to work exactly the same as before. I also created unit test for method Cell.toString(), and did manual tests for the other methods, MainPanel.convertToInt() and MainPanel.runContinuous(). The reason to do manual tests instead of unit tests for these two methods will be explained.</br>
<ol>
<li>Using a appropriate object-oriented design:</br></li>
1. I have designed three classes: </br>
2. Constant class to store constant variables: 5 constant variables and not methods.</br>
3. Visitor class for visitors: 2 attributes, and 5 methods (3 void methods). </br>
4. Generator class for random number generation: 3 methods all returning String values.</br>
</br>
<Li>Design tests to cover all 5 methods with returning values.</br></li>
1. I have designed 4 test classes with total 13 tests, which cover all of the 5 methods with returning values.</br>
2. I have included test cases of edge case, boundary values, euqivalence, and expected exceptions.</br>
3. 8 tests in TestGenerator Class have applied test doubles (faked object of Random class) and stubs (faked method of nextInt(int n)).</br>
</br>
The jar file of this project is in folder /dist, it can be run as: "java -jar CitySim9002.jar n". </br>
The results of running the program and testing is in folder /Results.</br>

1. Running result:</br>
![running result](https://github.com/jiaweixu/CitySim9002/blob/master/Results/result_screen_shot.png "Running Results")
</br>
2. Testing results:</br>
![TestVisitor](https://github.com/jiaweixu/CitySim9002/blob/master/Results/TestVisitor.png "Testing Results: TestVisitor")
![TestVisitor2](https://github.com/jiaweixu/CitySim9002/blob/master/Results/TestVisitor2.png "Testing Results: TestVisitor2")
![TestVisitor3](https://github.com/jiaweixu/CitySim9002/blob/master/Results/TestVisitor3.png "Testing Results: TestVisitor3")
![TestGenerator](https://github.com/jiaweixu/CitySim9002/blob/master/Results/TestGenerator.png "Testing Results: TestGenerator")
</br>
It can be seen that there is one test failed (testGetName3). It is the case that when I give the visitor an illegal name/type (ohter than the 4 types), the visitor object accepted it and return it through object.getName(). It is expected that a visitor do not have an illegal name/type, so the test is failed. However, this will not happen in real run since the design of the program guarantee a legal name/type for a visitor through ranged random generator and constant variables.</br>
