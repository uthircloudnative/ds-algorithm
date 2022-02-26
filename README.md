# Data Structures And Algorithms

## Data Structures

**Arrays**

 - Array will store items next to each other (sequencialy) when its getting added to it.
 - In an Array to store data we have to specifiy the memory at the time of Array declaration.
 - We can easily find/search an item in an Array using its index value.**Ex In a Array of 10 elements if we want to pick 5th item we can do it by easily with its index of 4**
 - In case of if we want to add more elements in a array than the initial defined size we have to move all the items
   together to new memory which is time consuming operation.
 - Similarly if we delete an item from an Array after the item is deleted we have to move remaining items after specific
   index position item is deleted.
 - Arrays supports Sequential access as well as Random access of its elements.  
   
##Linked List

 - In Linked List each items will hold the address of the next item in the memory. So that these items will be placed radomly in memory
   but each and evey item will be aware of where next item is stored.
 - We can add an item anywhere in memory also we don't have to move the all items.
 - Similarly deletion of item also easy in Linked List as if we want to delete an item after deleting an item we just need to update its previous item address reference.
 - In case of reading a specific item in Linked List is slow compare to Array. **In a list of 8 elements if we want to read 6th item then we need to get the address of it by reading all its previous elements**
 - Linkel List will only support Linear/Sequential access of its elements.
 
  | Operation       |  Array                                       |  Linked List                                                | 
  | --------------- | ------------------                           | ----------------------                                      | 
  | Read            | Easy to read an element as we can access an  | To read an element we need to have its address.So to read   |
  |                 | access an element using its index.O(1)       | an item in middle we have to traverse each of its previous  |
  |                 |                                              | items to gets this address. O(n)                            |
  | Insert          | If we need to add an item in middle we have  | If we want to add an element we just need to modify         |
  |                 | to move all the elements after that item     | last item in the array.O(1)                                 |
  |                 | one index position.O(n)                      |                                                             |
  |                 | If we need to remove an item in middle or    | Deltion on Linkeled list involves only two items.O(1)       |
  |Delete           | at the beginning we need to move all other   |                                                             |
  |                 | items.O(1)                                   |                                                             |
  |                 |                                              |                                                             |


# Algorithms

## Recursion

  Recursion is calling a function by itself until a certain condtion (Base Case) is met. This technicque is really helpful to keep track of entire stack of
  various function calls. This technique will be used in Divde and Conquere Algorithm to solove some problems for which we can't find a straigt forward solutions.
  
  Ex. To find a total of Array of Integers we can use Divid and Conquere Algorithm using Recursive functions.
  ```
      Arr --> {4,6,9,8}
      
      We can find total of this elements using a normal loop easily. But in case of D&C algo we have to
      split this problem into smaller parts and execute a recursive function on it.
      
      Any recursive function 2 possible cases 1. Base Case 2. Recursive Case.
      
      Base Case is logic in which the function call stop/return a result. In this case when given array is empty or only 1 element
      we can easily say its total. So this is Base case for this scenario.
      
      Recursive Case - Recursive case is when a fucntion will call itself multiple times. When Array length is more than one
      we have to recursively call that function to identify its total.
  ```
## Graph

  Graph consist of Nodes and Edges. 
     
     - A Node in graph is data represented by a circle.
     - Edge is connection between two nodes. Represented by arrow connecting two nodes.
     - 2 types of graphs 
       - Directed Graph (One directional --> Edge/Arrow points to one direction)
       - BiDirectional Graph/No directional.
       
### Directed Graph

     -  In a directed graph given node can be travel only one direction, in the direction of Arrow pointing.
     -  In a graph each node and its neighbours are represented as a Map key value pairs.
     -  Given node value will be key its neighbours will be values represented in Array or List.
     -  If a given node don't have any neighbours (no edge pointing to another node) than still it will be represented with its key and empty list.
     
### Undirected Graph

     - In a Undirected graph node can have bidirectional traversel.
     - Connected two nodes will traverse back and forth vise versa.
     
### Breath First Search (Traversal)

     - In BFS given nodes all adjesent nodes are traversed/explored.
     - It uses Stack implementation.(LIFO)
     - There is a possibility not all nodes will be explored in this traversel.
     
### Depth First Search (Traversal)

     - In DFS all the child nodes of a given node is traversed/explored before taking on another node.
     - It uses Queue implementation.(FIFO)
     - All nodes in graph will be traversed.
     
     
           
