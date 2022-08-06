package LinkedList;

public interface IList<T> extends Iterable<T> {

	
	long length();
	boolean isEmpty();
	T getFirst();
	boolean addFirst(T element);
	T getLast();
	boolean addLast(T element);
	boolean contains(T element);
	T removeFirst();
	T removeLast();
	boolean remove(T element);
	void clear();
	
	
}
