 HINT:
 - Create a HashMap<Integer, Integer>
 - use an int complement to store the difference between target and nums[i] within the loop for use in comparisons
 
 
 
 SOLUTION: 
 - Initialze a new empty HashMap<Integer, Integer>
 - Create a for loop and iterate over the length of the integer array
 - Create an int variable named complement which is set up to calculate the difference between target and nums[i]
 - Create an if statement that, if your hashmap contains a complement to your target (This value will be stored as a Key in your hmap<Key, Value> pair so specify that),
    then return a new int[] array with two values of {the index of the complement stored in your hmap, i};
 - Else, add the value from the nums array that you are currently on, into to your hmap.
 - If no solution found, at end of program, return an empty array.
