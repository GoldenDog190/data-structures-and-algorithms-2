# Graph Implementation
<!-- Short summary or background information -->
* Implement your own Graph.

## Challenge
<!-- Description of the challenge -->
* The graph should be represented as an adjacency list, and should include the following methods:
* AddNode()
  - Adds a new node to the graph
  - Takes in the value of that node
  - Returns the added node
* AddEdge()
  - Adds a new edge between two nodes in the graph
  - Include the ability to have a “weight”
  - Takes in the two nodes to be connected by the edge
  - Both nodes should already be in the Graph
* GetNodes()
  - Returns all of the nodes in the graph as a collection (set, list, or similar)
* GetNeighbors()
  - Returns a collection of edges connected to the given node
  - Takes in a given node
  - Include the weight of the connection in the returned collection
* Size()
  - Returns the total number of nodes in the graph
* Write tests to prove the following functionality:
  - Node can be successfully added to the graph
  - An edge can be successfully added to the graph
  - A collection of all nodes can be properly retrieved from the graph
  - All appropriate neighbors can be retrieved from the graph
  - Neighbors are returned with the weight between nodes included
  - The proper size is returned, representing the number of nodes in the graph
  - A graph with only one node and edge can be properly returned
  - An empty graph properly returns null

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
* I set up the folder and file for this code challenge. Worked together with James, Ed, and Matthew on this code challenge. Then I went over the demo, and compared it to other examples I found. Then I wrote out the code, and then wrote out the tests. The Big O space is O(n^2), and the time is O(1). 

## API
<!-- Description of each method publicly available in each of your hashtable -->
* Methods
  * AddNode()
    - Adds a new node to the graph
    - Takes in the value of that node
    - Returns the added node
  * AddEdge()
    - Adds a new edge between two nodes in the graph
    - Include the ability to have a “weight”
    - Takes in the two nodes to be connected by the edge
    - Both nodes should already be in the Graph
  * GetNodes()
    - Returns all of the nodes in the graph as a collection (set, list, or similar)
  * GetNeighbors()
    - Returns a collection of edges connected to the given node
    - Takes in a given node
    - Include the weight of the connection in the returned collection
  * Size()
    - Returns the total number of nodes in the graph