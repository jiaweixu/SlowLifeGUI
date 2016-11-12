Skip to content
This repository
Search
Pull requests
Issues
Gist
 @jiaweixu
 Unwatch 1
  Star 0
  Fork 0 jiaweixu/CitySim9002
 Code  Issues 1  Pull requests 0  Projects 0  Wiki  Pulse  Graphs  Settings
CitySim9002/ 
README.md
   or cancel
    
 Edit file    Preview changes
1
# IS2545 DELIVERABLE 2: Unit Testing 
2
## Jiawei XU (jix20)
3
​
4
The challenge in this project is:</br>
5
<ol>
6
<li>Using a appropriate object-oriented design:</br></li>
7
1. I have designed three classes: </br>
8
2. Constant class to store constant variables: 5 constant variables and not methods.</br>
9
3. Visitor class for visitors: 2 attributes, and 5 methods (3 void methods). </br>
10
4. Generator class for random number generation: 3 methods all returning String values.</br>
11
</br>
12
<Li>Design tests to cover all 5 methods with returning values.</br></li>
13
1. I have designed 4 test classes with total 13 tests, which cover all of the 5 methods with returning values.</br>
14
2. I have included test cases of edge case, boundary values, euqivalence, and expected exceptions.</br>
15
3. 8 tests in TestGenerator Class have applied test doubles (faked object of Random class) and stubs (faked method of nextInt(int n)).</br>
16
</br>
17
The jar file of this project is in folder /dist, it can be run as: "java -jar CitySim9002.jar n". </br>
18
The results of running the program and testing is in folder /Results.</br>
19
​
20
1. Running result:</br>
21
![running result](https://github.com/jiaweixu/CitySim9002/blob/master/Results/result_screen_shot.png "Running Results")
22
</br>
23
2. Testing results:</br>
24
![TestVisitor](https://github.com/jiaweixu/CitySim9002/blob/master/Results/TestVisitor.png "Testing Results: TestVisitor")
25
![TestVisitor2](https://github.com/jiaweixu/CitySim9002/blob/master/Results/TestVisitor2.png "Testing Results: TestVisitor2")
26
![TestVisitor3](https://github.com/jiaweixu/CitySim9002/blob/master/Results/TestVisitor3.png "Testing Results: TestVisitor3")
27
![TestGenerator](https://github.com/jiaweixu/CitySim9002/blob/master/Results/TestGenerator.png "Testing Results: TestGenerator")
28
</br>
29
It can be seen that there is one test failed (testGetName3). It is the case that when I give the visitor an illegal name/type (ohter than the 4 types), the visitor object accepted it and return it through object.getName(). It is expected that a visitor do not have an illegal name/type, so the test is failed. However, this will not happen in real run since the design of the program guarantee a legal name/type for a visitor through ranged random generator and constant variables.</br>
30
​
31
​
@jiaweixu
Commit changes

Update 

Add an optional extended description…
  Commit directly to the master branch.
  Create a new branch for this commit and start a pull request. Learn more about pull requests.
Commit changes  Cancel
Contact GitHub API Training Shop Blog About
© 2016 GitHub, Inc. Terms Privacy Security Status Help
