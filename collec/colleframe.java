package collec;

/*--------COLLECTION FRAMEWORK----------
 * collection  is a of group of objects in a single entity.
 * collection is a single entity representing multiple objects.
 * collection framework-- in java to represnt  group of objects into single entity we need classes and interfaces.
 * collection framework will provide those classes and interfaces by which we can represent group of objects into collection. 
 * 
 * To overcome some limitations of the array concept collection framework came into picture.
 * 1. array is fixed (not growable in nature, we cannot increase or decrease size of the array oncce iits declared during the runtime.)
 * 2. Homogenous(same type of datatypes should be present)
 * 
 * insted of create int , string, array we can create object[]
 *  object array it will accept multiple data types

 * object a[]=new object[5];
 * though we use the object type array its size is limited.
 * Array dont use any underlaying data structure(ready made methods) means we dont have any predefined methods
 *to read the particular data form the array

 TO OVERCOME THE CONCEPT OF ARRAY COLLECTION FRAMEWORK COME INTO PICTURE.

 ---------COLLECTION (INTERFACE)
  --collection interface is a root interface across all the interfaces.
 --collection interface is used to group of objects into single entity and which contains common methods required for other collection.
 --the methods inside the collection interface are common across all the colletion classse
 --we can do multiple operations on collection to check wheather object is present,deletd,existing a object,etc...
 --to do those operatoins in collection we need some methods that are present collection(interface)
 --- are common across all the  collection classes.

 ----------------COLLECTIONS(class)-------------
--it a class that is present in java.utils package
--it also contains some methods we can use it to do some actions on collection objects also
-- collections.sort(objet reference name ar[]) this methods in collections cls will sort the data in array, like sort there are 
n number of methods are present in collections cls.

        --------------------COLLECTION (INTERFACE .PARENT)
        ----------1.LIST(I) 2.SET(I) 3.QUEUE(I) -CHILD INTERFACES OF COLLECTION
        
        
        1.LIST interface can be used to insert the elements or objects in a sorted way inside, duplicates are allowed.
 --- these are different classes that implemented list interface(array list, linked list, (vector,stack are  legacy calss means old one)
----------the methods that are present in collection (i) are also present in list(i)

-                       ------METHODS-------
1.add (object0)
2.add all (collection c)
3.remove(object 0)
4.remove all(collection c)
5.retain all(collection c) except this group remaining all are removed
6.clear()7.is empty() 8.size() 9.contains(object) 10.contains all(collection c) 10.to array(collection c)


 */

public class colleframe {

	public static void main(String[] args) {
	
	}

}
