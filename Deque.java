public class Deque<T> {

    private DLLNode<T> _front, _end;
    private int _size;

    public Deque()
    {
	//implementation
    }

    public void addFront( T val )
    {
	//implementation
    }

    public void addEnd( T val )
    {
	//implementation
    }

    public T removeFront()
    {
	//implementation
	return "";
    }

    public T removeEnd()
    {
	//implementation
	return "";
    }

    public T peekFront()
    {
	return _front.getValue();
    }

    public T peekEnd()
    {
	return _end.getValue();
    }

    public boolean isEmpty()
    {
	return _front == null;
    }

    public String toString()
    {
	//implementation
	return "";
    }

    public static void main( String[] args )
    {

	System.out.println("test!");
	
    }

}
