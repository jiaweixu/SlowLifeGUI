
# IS2545 DELIVERABLE 4: Performance Testing 
## Jiawei XU (jix20)

In this project I profiled a Conway's Game of Life simulation. I found three major performance issues in three methods: Cell.toString(), MainPanel.convertToInt(), and MainPanel.runContinuous() by sampling CPU through VisualVM (V1.3.9). </br>
I modified these three methods to improve the performance as while as keep the program to work exactly the same as before. I also created unit test for method Cell.toString(), and did manual tests for the other methods, MainPanel.convertToInt() and MainPanel.runContinuous(). The reason to do manual tests instead of unit tests for these two methods will be explained.</br>

### 1.  Profiling (before) to determine which method is the most CPU-intensive</br>
The following figure shows the result of sampling CPU through VisualVM:</br>
![Profilingbefore](https://github.com/jiaweixu/SlowLifeGUI/blob/master/material/Time_Before_Mod.png "Profiling before")
</br>
It can be seen that  Cell.toString(), MainPanel.convertToInt(), and MainPanel.runContinuous() are most time consuming.</br>
### 2. Modify Cell.toString()</br>
The folowing code shows how this method was modified. The loops with 10000 iterations was deleted since only the first character was returned.
![CodeM1](https://github.com/jiaweixu/SlowLifeGUI/blob/master/material/Code_M1.png "Code M1")</br></br>
Then three unit tests were created and passed to make sure the method to work as expected. 
![TestM1](https://github.com/jiaweixu/SlowLifeGUI/blob/master/material/TestM1.png "Test M1")</br></br>
CPU sampling was ran again to prove the improvement of the performance with the modification. It can be seen that this method is not in the list of most time consuming methods any more.
![TimeAfterM1](https://github.com/jiaweixu/SlowLifeGUI/blob/master/material/Time_After_M1.png "Time After M1")</br></br>
