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
