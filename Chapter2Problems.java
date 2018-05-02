package Ch2;

public class Chapter2Problems {
    /**
     * 2.1
     * Remove Dups: Write code to remove duplicates from an unsorted linked list
     * FOLLOWUP: How would you solve this problem if a temporary buffer is not allowed?
     *
     * I-  remove duplicates from a linked list
     * D- this problem can be solved by using a Hashset
     * EA-
     *  -STEP 1: input: fa, la, ta, la, so output: fa, la, ta, so
     *  -STEP 2: implemented a hashlist and inserted each only if the list was empty
     *  -STEP 3:this problem is solved using a hashset
     *  -STEP 4:in:fa, la,ta, la, so (HASHSET) fa, la ta,so (OUT) fa, la, ta, so
     *  -STEP 5:TRANSLATE TO CODE
     *  -STEP 6:
     *  -STEP 7:
     * L-
     * */
   // public boolean isUnique(String s){

   // }


    /**
     * 2.2
     * Return Kth to Last: implement an algorithm to find the kth to last element of a singly linked list
     * I- on a linked list return any kth to last number by traversing list once
     * D-  this problem can be solved by keeping two pointers
     * EA-
     *  -STEP 1: return 2nd to last from a->b->c->d->=  output: c
     *  -STEP 2: began 2nd pointer moving two moves in
     *  -STEP 3: we can do this using two pointers one that advances only the distance from the last
     *  -STEP 4: need a pointer that begins after a counter hits zero
     *  -STEP 5:TRANSLATE TO CODE
     *  -STEP 6:
     *  -STEP 7:
     * L-
     * */



    /**
     * 2.3
     * Delete Middle Node: Implement an algorithm to delete a node in the middle(i.e. any node but the first and
     * last node, not necessarily the exact middle) of a singly linked list, given only access to that node
     *
     * I-
     * D- this can be solved by copying the information inside the node and moving it recursively until the last node is reached
     *      then deleting it.
     * EA-
     *  -STEP 1:delete any middle node no access to any other node
     *  -STEP 2: copied information from next node and moved it back... deleted last node
     *  -STEP 3: this can be done with the methods that come in a linked list
     *  -STEP 4:
     *  -STEP 5:
     *  -STEP 6:
     *  -STEP 7:
     * L-
     * */



    /**
     * 2.4
     * WRite code to partition a linked list around a value x, such that all nodes less than x come before all nodes
     * greater than or equal to x.  if x is contained within the list, the values of x only need to be after the
     * elements less than x (see below).  The partition element x can appear anywhere in the "right partition"
     * it does not need to appear between the left and right partitions
     *
     * I- create a method that partitions a linked list that separates values lower and higher than a given number
     * D- we can solve this by creating a separate linked list and moving smallest elements from existing while keeping
     *    largest.
     * EA-
     *  -STEP 1: separate a list into two separate ones dividing by smallest and largest of a given x
     *  -STEP 2: created a new list which receives all numbers smaller than x and left in old list numbers larger than x
     *  -STEP 3: this problem can be solved by creating a new list
     *  -STEP 4:need to traverse and compare every digit
     *  -STEP 5:
     *  -STEP 6:
     *  -STEP 7:
     * L-
     * */


    /**
     * 2.5
     * Sum Lists:  You have two numbers represented by a linked list, where each node contains a single
     * digit.  The digits are stored in reverse order, such that the 1's digit is at the head of the list.  Write a
     * function that adds the two numbers and returns the sum as the linked list.
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


}
