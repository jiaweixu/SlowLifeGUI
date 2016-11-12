
# IS2545 DELIVERABLE 4: Performance Testing 
## Jiawei XU (jix20)

In this project I profiled a Conway's Game of Life simulation. I found three major performance issues in three methods: Cell.toString(), MainPanel.convertToInt(), and MainPanel.runContinuous() by sampling CPU through VisualVM (V1.3.9). </br>
I modified these three methods to improve the performance as while as keep the program to work exactly the same as before. I also created unit test for method Cell.toString(), and did manual tests for the other methods, MainPanel.convertToInt() and MainPanel.runContinuous(). The reason to do manual tests instead of unit tests for these two methods will be explained.</br>

1.  Profiling (before) to determine which method is the most CPU-intensive</br>
![Profilingbefore](https://github.com/jiaweixu/SlowLifeGUI/blob/master/material/Time_Before_Mod.png "Profiling before")
</br>
2.  Adding pinning tests (in the form of manual and/or unit tests) to show that
    the functionality is unchanged by your modifications

3.  Refactoring the method to be more performant

4.  Profiling (after) showing that your rewrite helped make your method more
    performant
1. Profiling (before) to deter:</br>
![running result](https://github.com/jiaweixu/CitySim9002/blob/master/Results/result_screen_shot.png "Running Results")
</br>
2. Testing results:</br>
![TestVisitor](https://github.com/jiaweixu/CitySim9002/blob/master/Results/TestVisitor.png "Testing Results: TestVisitor")
![TestVisitor2](https://github.com/jiaweixu/CitySim9002/blob/master/Results/TestVisitor2.png "Testing Results: TestVisitor2")
![TestVisitor3](https://github.com/jiaweixu/CitySim9002/blob/master/Results/TestVisitor3.png "Testing Results: TestVisitor3")
![TestGenerator](https://github.com/jiaweixu/CitySim9002/blob/master/Results/TestGenerator.png "Testing Results: TestGenerator")
</br>
It can be seen that there is one test failed (testGetName3). It is the case that when I give the visitor an illegal name/type (ohter than the 4 types), the visitor object accepted it and return it through object.getName(). It is expected that a visitor do not have an illegal name/type, so the test is failed. However, this will not happen in real run since the design of the program guarantee a legal name/type for a visitor through ranged random generator and constant variables.</br>
