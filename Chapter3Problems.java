package Ch3;

public class Chapter3Problems {
    /**
     * 3.1
     * Three in One: Describe how you could use a single array to implement three stacks
     *
     * I-
     * D-
     * EA-
     *  -STEP 1:
     *  -STEP 2:
     *  -STEP 3:
     *  -STEP 4:
     *  -STEP 5:
     *  -STEP 6:
     *  -STEP 7:
     * L-
     * */
    //public boolean (String s){

    //}


    /**
     * 3.2
     * Stack Min: How would you design a stack which in addition to push and pop has a function min which
     * returns the minimum element?  Push, pop, and min should all operate in O(1) time.
     *
     * I-  create  a stack that contains a function called min which in o(1) returns the min
     * D-  I must beging by redisigning the stack to push and pop items in a sorted manner
     * EA-
     *  -STEP 1: eg. given a stack of ints the numbers must be inserted in order
     *  -STEP 2: every push, checked if number before was smaller if so poped number pushed new one and pushed old after
     *  -STEP 3: must manipulate push to check before inserting
     *  -STEP 4: CURR: 1 (PUSH)2 (PEEK) 1 (POP)1 (PUSH)2 (PUSH)1  (MIN) 1
     *  -STEP 5: TRANSLATE TO CODE
     *  -STEP 6:
     *  -STEP 7:
     * L-
     * */



    /**
     * 3.3
     * Imagine a (literal) stack of plates.  If the stack gets too high, it might topple.  Therefore, in real life,
     * we would likely start a new stack when the previous stack exceeds some threshold.  Implement a data structure
     * SetOfStacks that mimics this.SetOfStacks should be composed of several stacks and should create a new stack
     * once the previous one exceeds capacity.  SetOfStacks.push() an SetOfStacks.pop() should behave identically to
     * a single stack (that is pop() should return the same values as it would if there were just a single stack).
     * FOLLOW UP : Implement a function popAt(int index) which performs a pop operation on a specific sub-stack
     *
     * I-  Create a method which creates a new stack anytime the old stack gets too full however all stacks must act
     *      as one.
     * D- i must create a stack which creates a new one once its full and calls the previous when its  last one
     *      was popped
     * EA-
     *  -STEP 1: as one stack becomes "full" a new one must be created
     *  -STEP 2:
     *  -STEP 3:
     *  -STEP 4:
     *  -STEP 5:TRANSLATE TO CODE
     *  -STEP 6:
     *  -STEP 7:
     * L-
     * */



    /**
     * 3.4
     * Queue via Stacks: Implement a MyQueue class which implements a queue using two stacks.
     * I-
     * D-
     * EA-
     *  -STEP 1:
     *  -STEP 2:
     *  -STEP 3:
     *  -STEP 4:
     *  -STEP 5:
     *  -STEP 6:
     *  -STEP 7:
     * L-
     * */


    /**
     * 3.5
     * Sort Stack:  Write a program to sort a stack such that the smalles items are on the top.  You can use an additional
     * temporary stack, but you may not copy the elements into any other data structure(such as an array).  The stack
     * supports the following operations: push, pop, peek, and isEmpty.
     * I-
     * D-
     * EA-
     *  -STEP 1:
     *  -STEP 2:
     *  -STEP 3:
     *  -STEP 4:
     *  -STEP 5:
     *  -STEP 6:
     *  -STEP 7:
     * L-
     * */


}
