# Stacks and Queues
<!-- Short summary or background information -->
* This code challenge contains stack and queue classes, and tests for the stack and queue classes.

## Challenge
<!-- Description of the challenge -->
* Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
* Create a Stack class that has a top property. It creates an empty Stack when instantiated.
* This object should be aware of a default empty value assigned to top when the stack is created.
* Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
* Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
* Should raise exception when called on empty stack
* Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
* Should raise exception when called on empty stack
* Define a method called isEmpty that takes no argument, and returns a boolean indicating whether or not the stack is empty.
* Create a Queue class that has a front property. It creates an empty Queue when instantiated.
* This object should be aware of a default empty value assigned to front when the queue is created.
* Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
* Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
* Should raise exception when called on empty queue
* Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
* Should raise exception when called on empty queue
* Define a method called isEmpty that takes no argument, and returns a boolean indicating whether or not the queue is empty.
* Be sure to follow your languages best practices for naming conventions.
* You have access to the Node class and all the properties on the Linked List class.
* Write out tests for the methods.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
First I started by first setting up all of the classes and the methods I needed for this code challenge. Then I wrote out the Node class and its properties. I moved onto the Stack class, and set up the methods. Then I moved onto the Queue class, and wrote the methods out for that. I then wrote out tests for the Stack and Queue classes to test my code. The Big O space/time for this challenge was O(1).

## API
<!-- Description of each method publicly available to your Stack and Queue-->
* In the Stack Class:
  - push method - takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
  - pop method - does not take any argument, removes the node from the top of the stack, and returns the node’s value. Should raise exception when called on empty stack.
  - peek method - does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack. Should raise exception when called on empty stack.
  - isEmpty method - takes no argument, and returns a boolean indicating whether or not the stack is empty.
  * In the Queue Class:
   - enqueue method - takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
   - dequeue method - that does not take any argument, removes the node from the front of the queue, and returns the node’s value. Should raise exception when called on empty queue.
   - peek method - does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue. Should raise exception when called on empty queue.
   - isEmpty method - takes no argument, and returns a boolean indicating whether or not the queue is empty.