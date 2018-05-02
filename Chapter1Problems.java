package Ch1;


import java.util.Arrays;

public class Chapter1Problems {

    /**
     * 1.1
     * Is Unique: Implement an alogrithm to determine if a string has all unique characters.  What if you cannot
     * use additional data structures?
     *
     * I- Create a program that checks that all the characters in a string only appear once in the string.
     * D- I must create a boolean method that can iterate through a string's characters and checking for duplicity
     * EA-
     *  -STEP 1: eg. given "house" program must iterate through each character h-o-u-s-e then return true-
     *           must check if program must return true if string contains an upper case and lower case character
     *              - will assume this should return true as the ascii values for these characters are different..
     *  -STEP 2: sorted word and checked for the values next to it not to be of equal value
     *  -STEP 3: We need to use the Arrays class in java, this might be heavy in memory as the word
     *           must be looked at three times: -split string - sort string - traverse string checking for duplicates
     *           -break and return if a duplicate letter is found or return true if none were found
     *  -STEP 4: in: "bulldog" (SPLIT) b u l l d o g  (SORT) b d g l l o u  (CHECK) b d g l l -break... out: false.
     *  -STEP 5: TRANSLATE TO CODE...
     *  -STEP 6: ALL TEST CASES WORK
     *  -STEP 7:
     * L- I believe there is a better solution that can run in o(n) time rather than O(nlogn) and has better space
     *    complexity.
     * */
    public boolean isUnique(String s){
        char[] arrS = s.toCharArray(); // -------------O(n)
        Arrays.sort(arrS); //-------------------------- O(n log n)
        for(int i = 1; i < arrS.length; i++) { // ---- O(n)
            if (arrS[i] == arrS[i - 1]) {
                return false;
            }
        }
            return true;
    }


    /**
     * 1.2
     * Check Permutation: Given two strings, write a method to decide if one is a permutation of the other
     *
     * I- Create a program which will check if two separate strings are composed of the same characters
     * D- I need a boolean method, a sorting method and a compare method
     * EA-
     *  -STEP 1: input: paco copa  output: true
     *  -STEP 2: combined words and sorted them. Compared two values at a time. given that there are two strings
     *          we know that every two characters compared they must be equal every time.
     *  -STEP 3: This problem will be solved similarly to 1.1 additionally we will need a base case that checks that
     *           both strings are the same length.
     *  -STEP 4: in: "paco" "copa" (LENGTH_CHECK) true   (COMBINE) pacocopa  (SORT) aaccoopp (CHECK)aa-cc-oo-pp return true
     *  -STEP 5:TRANSLATE TO CODE
     *  -STEP 6: error with upper and lower case... must add an ignorecase or to
     *  -STEP 7:
     * L- Method is too long  perhaps there is no need to combine both words
     * */
    public boolean isPermutation(String s1, String s2){
        if(s1.length() != s2.length()){ return true;}
        if(s1.equals(s2)){return true;}
        String s1s2= s1 + s2;
        char[] twoSt= s1s2.toCharArray();
        Arrays.sort(twoSt);

        for(int i = 0; i< twoSt.length; i+=2){
            if(twoSt[i] != twoSt[i+1]){return false; }
        }
        return true;
    }



    /**
     * 1.3
     * URLify: Write a method to replace all spaces in a string with "%20".  You may assume that the string has
     * sufficient space at the end to hold the additional characters, and that you are given the true length of the string
     *
     * I- create a method that replaces all spaces in a string with "%20"
     * D- I need to create two char arrays and move each character into new array replacing spaces with givem string
     * EA-
     *  -STEP 1: input: "john doe  " output: "john%20doe"
     *  -STEP 2: moved a string one character at a time into another empty space the size of the original string.
     *  -STEP 3: this problem is similar to a touring machine with two strips
     *  -STEP 4: in: "john doe  " (NEW ARRAY) "__________" (CHECK FOR SPACES AND REPLACE)  out:"john%20doe"
     *  -STEP 5: TRANSLATE TO CODE
     *  -STEP 6: ...
     *  -STEP 7:
     * L-
     * */
    public static String urlLify(String s){
        char[] urlString = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            int sIndex=0;
            if(s.charAt(sIndex)==' '){
                urlString[i] = '%';
                urlString[i+1] = '2';
                urlString[i+2] = '0';
                sIndex++;
                i+=3;
            }else
                sIndex++;
                i++;
        }
        return String.valueOf(urlString);
    }



    /**
     * 1.4
     * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
     *
     * I- create a method that checks if a given string can be rearranged into a palindrome. does not need
     *      to be a dictionary word.
     * D- must solve this by measuring this array and handling differently for even or odd numbers
     * EA-
     *  -STEP 1: input: "nanhah" output: "hannah"
     *  -STEP 2: sorted string and and arranged equal numbers to either side of array
     *  -STEP 3: sorting this problem is  b
     *  -STEP 4: in: "nanhah" (SORT) "aahhnn"  if even return true if odd arrange and have a counter for single
     *  -STEP 5: TRANSLATE TO CODE
     *  -STEP 6:fixed issues with odd numbered strings
     *  -STEP 7:
     * L-
     * */
/*    public static String permutation(String s){
        char[] arrS = s.toCharArray();
        Arrays.sort(arrS);
        int single= 0;
        char[] temp = new char[arrS.length];
        for(int i = 0; i < s.length(); i++){
            if(i == arrS[(int)arrS.length/2]){
                arrS[(int)arrS.length/2]
            }
            if(arrS[i] != arrS[i-1])
        }

    }*/




    /**
     * 1.5
     * One Away: There are three types of edits that can be performed on strings: insert a character, remove a character
     * or replace a character.  Given two strings, write a function to check if they are one edit(or zero edits) away;
     *
     * I- Write a program in which given two strings, this program can check if by doing one edit or no edits it will
     * create the same word.
     * D-
     * EA-
     *  -STEP 1: input: "cat" "cart"
     *  -STEP 2: took the ASCII total value from each and subtracted it obtained ascii letter equal to result and
     *           tested inserting it before and after every character and comparing it to other string
     *  -STEP 3:this problem is similar to two set sum
     *  -STEP 4:in "cat""cart" (GET VALUE) 312 426 (SUBTRACT) 112 (FINDVAL)114 == 'r' (INSERT&COMPARE) 1
     *  -STEP 5:
     *  -STEP 6:need to add a base case that will compare and return 0 if equal and -1 if >1 edit
     *  -STEP 7:
     * L-
     * */
/*
    public static boolean oneAway(String s1, String s2){
        if(s1.equals(s2)){return true; }
    }
*/



}



