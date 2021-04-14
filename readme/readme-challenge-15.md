# Code Challenge: Class 15: Binary Tree and BST Implementation

# Challenge Summary
<!-- Short summary or background information -->
* Using the binary search tree to traverse. 

## Challenge Description
<!-- Description of the challenge -->
* Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
* Create a BinaryTree class
* Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.
* Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.
* Create a BinarySearchTree class
* Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
* Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.
* Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. * You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
* Worked together with Edward Hou, James Mansour, and Cristian Robles on this challenge. First drew out a white board to figure the code out, and figure out what approach we would be taking. Then we set up the classes, and started working on the code. Then I wrote up the tests last. The Big O for time and space is O(n). 

## API
<!-- Description of each method publicly available in each of your trees -->
* preOrder method - traverses the tree from the top left and then down.
* inOrder method - traverses the tree from the bottom up going left to right.
* postOrder method - traverses alphabetically
* add method - accepts a value, and adds a new node with that value in the correct location in the binary search tree.
* contains method - accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

![CCE904CA-664D-40F7-8067-3AAD8BDE2048_1_105_c](https://user-images.githubusercontent.com/65562053/114319434-7447d980-9ac6-11eb-891b-c4566019b42f.jpeg)
