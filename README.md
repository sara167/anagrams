# anagrams

Two words are said to be anagrams if one can be formed by permuting the letters of the other. 
For example: "pots", and "stop" are anagrams. An anagram chain is a list of words that are all anagrams to each other. 
The shortest anagram chain has length two. We are interested in calculating the length of the longest anagram chain in a given list of words. 
For example, the following nine words: rates, pots, tops, along, aster, stop, stare, tears, and long has two anagram chains where the longest includes the four words: rates, aster, stare, and tears.


**Input**
Your program will be tested on a number of test cases. The first line of the input file ("anagram.in") contains an integer D representing the number of test cases in the input file.
Each test case contains one or more words, but no more than 20000 words, with no duplicates. Each word appears on a separate line. All words are in small letters, and in no particular order. No word will be longer than 10 characters. Each test case ends with a string made of one or more '-' characters.


**Output**
For each test case, write, on a separate line, the length (number of words) of the longest anagram chain found in the given list of words. 
The output should be printed to the screen.


Sample Input 									
```
2
rates																
pots
tops																
along
aster
stop
stare
tears
long
------
north
fresher
refresh
thorn
bye
--
```

Sample Output
```
4

2
```
