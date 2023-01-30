# simple-java-test-project

- simple java se question : 

##### Question 1 (10 minutes)
- Write a java program to create the power function by using ``only plus(+) operation``.

```
 Example:

Input base=2, pow=2 
 => Output 4
Input base=2, pow=4 
 => Output 16
Input base=10, pow=3 
 => Output 10
```
___

##### Question 2 (20 minutes)
- Write a java program to create HTML script table with specific list of data and number of columns

```
 Example:

Input [a, b, c], column=2 
 => Output <table><tr><td>a</td><td>b</td></tr><tr><td>c</td><td></td></tr></table>
Input [a, b, c], column=3
 => Output <table><tr><td>a</td><td>b</td><td>c</td></tr></table>
```
___

##### Question 3 (30 minutes)
- Apple falls down every day from the Apple tree. First day=1
- Given the total of Apple and speed of falling. 
- The amount of Apple that being fallen = speed * fallen amount of previous day
 
- How many Apple left from Apple tree with specific day?

```
 Example:

Input 10, speed=2, day=1 
 => Output Apple left=9
 day1 => fallen amount=1 => Apple left = 10-1 = 9

Input 10, speed=2, day=2 
 => Output Apple left=7
- day1 => fallen amount=1 => Apple left = 10-1 = 9
- day2 => fallen amount=2*1 =2 => Apple left = 9-2 = 7

Input 10, speed=2, day=5 
 => Output Apple left=0
- day1 => fallen amount=1 => Apple left = 10-1 = 9
- day2 => fallen amount=2*1 =2 => Apple left = 9-2 = 7
- day3 => fallen amount=2*2 =4 => Apple left = 7-4 = 3
- day4 => fallen amount=2*4 =8, but only 3 left from the tree =3 => Apple left = 3-3 = 0
- day5 => fallen amount=no apple from the tree => Apple left = 0

Input 20, speed=3, day=3 
 => Output Apple left=7
- day1 => fallen amount=1 => Apple left = 20-1 = 19
- day2 => fallen amount=3*1 =3 => Apple left = 19-3 = 16
- day3 => fallen amount=3*3 =9 => Apple left = 16-9 = 7
```

