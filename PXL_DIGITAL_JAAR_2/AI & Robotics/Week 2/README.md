# Week 2: Classical AI techniques

## 1. Trees & Graphs
### Goals
The junior-colleague

* can explain in own words what a tree is and its use cases
* can determine when a tree is a good data structure to use for a given problem 
* can explain in own words what a binary tree is and its use cases
* can implement an arbitrary tree
* can implement pre-order, post-order and in-order tree traversal for arbitrary trees
* can explain in own words the state space of a problem
* can represent the state space of a problem
* can apply the state space procedure for a given problem
* can explain in own words what a graph is and its use cases
* can explain in own words the difference between undirected and directed in the context of graphs
* can explain in own words the difference between unweighted,  weighted in context of graphs.
* can explain in own words the difference between acyclic and cyclic in context of graphs.
* can determine when a graph is a good data structure to use for a given problem 
* can implement and differentiate the different graph representations

**[Presentation](Week%202%20-%201%20Trees%20&amp;%20Graphs.pdf)**

### Clarifications
- [**Graph Neighbourhood**](http://mathworld.wolfram.com/GraphNeighborhood.html)
  
  During the lectures we use the term _neighbours_ in context of graphs 
  but didn't explain it at all. To fill in this void, we added the definition of Graph Neighbourhood below.

   From the super awesome [Mathworld Wolfram](http://mathworld.wolfram.com/GraphNeighborhood.html) website:
   >  The graph neighborhood of a vertex v in a graph is the set of all the vertices adjacent to v including v itself.
   >
   > Note that while "graph neighborhood" generally includes vertices adjacent to v together with the vertex v itself, the term "graph neighbors" generally means vertices adjacent to v excluding v itself (e.g., Brouwer et al. 1989)

### Extra
* [**Binary Trees in Python: Introduction and Traversal Algorithms**](https://www.youtube.com/watch?v=6oL-0TdVy28)

  > In this video, we will go over the binary tree data structure. 
  > We then go over how to implement this data structure in Python. 
  > We then cover the three recursive depth-first search traversal algorithms (preorder, inorder, and postorder) 
  > and implement those recursively in Python.
  
  Big thanks to Wouter for submitting this!

* [**Working with Graph Algorithms in Python**](https://www.pluralsight.com/courses/graph-algorithms-python)

   > This course focuses on how to represent a graph using three common classes of graph algorithms 
   > - the topological sort to sort vertices by precedence relationships, the shortest path algorithm, 
   > and finally the spanning tree algorithms.

   Big thanks to Yarne for submitting this!

## 2. Complexity
### Goals
The junior-colleague

* can explain in own words what Big O notation means
* can explain why only the term with the highest order of magnitude matters
* can derive the term with highest order of magnitude from a given polynomial
* can describe in own words the link between complexity and efficiency
* can explain the two most important parameters to measure efficiency
* can describe in own words the three different atomic step/instruction types of an algorithm
* can evaluate the time complexity of a given algorithm
* can explain the difference between worst-, average- and best-case time complexity
* can understand the implications of complexity growth w.r.t. input for different mathematical functions (constant, linear, logarithmic, quadratic, cubic, exponential and factorial)
* can evaluate the space complexity of data structures and algorithms
* can describe the complexity (space and time) for graph representations


**[Presentation](Week%202%20-%202%20Complexity.pdf)**

### Extra
- TBA

## 3. Blind Search
### Goals
The junior-colleague

* can describe and transform a graph with a start and end node into a partial paths tree representation
* can explain and implement depth-first search
* can analyze the completeness of depth-first search
* can evaluate the time complexity of depth-first search
* can evaluate the space complexity of depth-first search
* can explain and implement breadth-first search
* can analyze the completeness of breadth-first search
* can evaluate the time complexity of breadth-first search
* can evaluate the space complexity of breadth-first search
* can explain and implement iterative deepening search
* can analyze the completeness of iterative deepening search
* can evaluate the time complexity of iterative deepening search
* can evaluate the space complexity of iterative deepening search
* can compare the different blind search techniques


**[Presentation](Week%202%20-%203%20Blind%20Search.pdf)**

### Extra
- TBA

### 4. Optimal Search: The road to A*

### Goals
The junior-colleague

* can explain uniform cost search in own words
* can implement uniform cost search
* can describe the link between UCS and breadth-first search
* can explain in own words what accumulated cost means
* can explain how UCS selects the next node
* can explain using an example why UCS does not always find the most optimal path
* can explain in own words and using an example the branch-and-bound principle
* can explain using an example why UCS with branch-and-bound finds the most optimal path
* can implement optimal UCS (using branch-and-bound)
* can describe the time and space complexity of optimal UCS (using branch-and-bound)
* can explain the link and difference with Dijkstra’s algorithm
* can explain in own words what a heuristic is
* can use a given heuristic for a state space
* can explain the heuristics used in the 8-puzzle problem
* can describe in own words what path deletion is and how it works
* can implement path deletion
* can explain A* search in own words
* can implement A* search
* can describe the heuristic function used in A*
* can explain the straight line distance using an example
* can explain the importance of underestimation in the context of heuristics using an example
* can describe completeness, time and space complexity of A*

**[Presentation](Week%202%20-%204%20Optimal%20Search.pdf)**

### Clarification
Further extensions of A* and advanced techniques for path finding are part of the Research Project course. 

### Extra
- [**Compare A* with Dijkstra algorithm**](https://www.youtube.com/watch?v=g024lzsknDo)

   From [YouTube](https://www.youtube.com/watch?v=g024lzsknDo):
   > The project contains the Java implementation of the A* and Dijkstra path
   > search algorithms, which can be used alone in any application. A GUI demo
   > is provided for the visualization that animates the search progress, 
   > also shows the cost of the path and the number of nodes visited during 
   > the search, so the difference between the two algorithm could not be 
   > more clear.
   
- [**State Space Representation and Search**](http://www.cs.ukzn.ac.za/~hughm/ai/notes/searches.pdf)

## Exercises
The PDF file with all the exercises can be found **[here](Exercises/Week%202.pdf)**.
