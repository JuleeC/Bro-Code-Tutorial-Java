Tree traversal is the process of visiting all the nodes in a tree
We dont have random access, so we need to traverse through the tree.
There are 3 types of navigating through a tree:
1) In-Order
2) post-order
3) pre-order

We are working with a binary Tree, not a binary Search Tree because the nodes are not values in order

in-Order:
We go as far to the left as we can, then we go to root and after it we switch to right branch
![img_5.png](img_5.png)

post-Order:
It is used to delete leafs from a tree
We go as far to the left as we can, then we go to the right branch and after it we switch to root
![img_6.png](img_6.png)

pre-Order:
It is used to create a copy from a tree
We go to root, then we go to the left branch and after it we switch to the right branch
![img_7.png](img_7.png)