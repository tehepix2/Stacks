Use a stack to solve the balanced parentheses problem. It involves checking if a given string of text has properly matched and 
nested parentheses, brackets, and braces. Look at the sample input and output below to better understand the problem. 

SAMPLE INPUT: (hello)(()){[{[goodbye]}]} 		

SAMPLE OUTPUT: Valid 

SAMPLE INPUT 2: (([is this balanced?))]{}{[]}{} 

SAMPLE OUTPUT 2: Invalid 

EXPLANATION: The first input has appropriately balanced parentheses, brackets, and braces. Although the second input 
contains the same number of opening and closing parenthetical symbols, the first bracket is incorrectly closed outside 
the first two nested parentheses.


 EXTRA IDEAS: 
1. Your code can check for angled brackets (chevrons <>). 
2. Your code can output the longest enclosed string of characters in a valid string. 
3. Your code can output the index and which character makes the string invalid. 
4. Your code can output the swaps needed to validate a string.
