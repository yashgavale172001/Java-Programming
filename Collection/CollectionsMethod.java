package Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections; 
/*
 * The Collections class in Java provides various methods to manipulate and operate on collections. Here are some of the most commonly used methods:

1. Sorting:
    - sort(List<T> list): Sorts the list in ascending order.
    - sort(List<T> list, Comparator<? super T> c): Sorts the list according to the specified comparator.

2. Searching:
    - binarySearch(List<? extends Comparable<? super T>> list, T key): Searches for the specified key in the sorted list.
    - binarySearch(List<? extends T> list, T key, Comparator<? super T> c): Searches for the specified key in the sorted list according to the specified comparator.

3. Reversing:
    - reverse(List<?> list): Reverses the order of elements in the list.

4. Shuffling:
    - shuffle(List<?> list): Randomly shuffles the elements in the list.
    - shuffle(List<?> list, Random rnd): Randomly shuffles the elements in the list using the specified random number generator.

5. Swapping:
    - swap(List<?> list, int i, int j): Swaps the elements at the specified positions in the list.

6. Filling:
    - fill(List<? super T> list, T obj): Replaces all elements in the list with the specified object.

7. Copying:
    - copy(List<? super T> dest, List<? extends T> src): Copies all elements from the source list to the destination list.

8. Min and Max:
    - min(Collection<? extends T> coll): Returns the minimum element in the collection.
    - max(Collection<? extends T> coll): Returns the maximum element in the collection.

9. Frequency:
    - frequency(Collection<?> c, Object o): Returns the number of occurrences of the specified element in the collection.

10. Disjoint:
    - disjoint(Collection<?> c1, Collection<?> c2): Returns true if the two collections have no elements in common.

11. Union and Intersection:
    - addAll(Collection<? super T> c, T... elements): Adds all elements from the specified array to the collection.
    - retainAll(Collection<?> c, Collection<?> coll): Retains only the elements in the collection that are contained in the specified collection.

12. Miscellaneous:
    - unmodifiableCollection(Collection<? extends T> c): Returns an unmodifiable view of the specified collection.
    - synchronizedCollection(Collection<T> c): Returns a synchronized view of the specified collection.

Note: These methods are static methods in the Collections class, so you don't need to create an instance of the class to use them.
 */
import java.util.Scanner;
public class CollectionsMethod 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter input size of arraylist");
	  int n=sc.nextInt();
	  List l=new ArrayList();
	  for(int i=0;i<n;i++)
	  {
		  l.add(sc.nextInt());
	  }
	  //System.out.println(Collections.max(l));
	  Collections.sort(l);
	  System.out.println(l);
	  
	  List a=new ArrayList();
	  a.add(5);
	  a.add(9);
	  a.add(54);
	  //Collections.reverse(a);
	 // Collections.addAll(l, a);
	  System.out.println("Frequency of "+5+" is "+Collections.frequency(l,5));
	  Collections.copy(l, a);
	  System.out.println(l);
	  System.out.println(a);
	  //Collections.remove();
	  
	 
	  
  }
}
