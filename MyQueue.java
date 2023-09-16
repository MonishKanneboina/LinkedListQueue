import java.util.*;
import java.util.Arrays;
import java.util.EmptyStackException;
public class MyQueue implements QueueADT<Square>
{
  private MyGenericLinkedList<Square> queue;
  private int size;
  public MyQueue()
  {
    this.queue = new MyGenericLinkedList();
    this.size = queue.size();
  }
   
  public MyQueue(Square... vals)
  {
    for(Square i : vals)
    {
      queue.add(i);
    }
    this.size = queue.size();

  }
  @Override
  public boolean isEmpty()
  {
    return queue.isEmpty();
  }
  @Override
  public void offer(Square item)
  {
    queue.add(item);
    this.size = queue.size();

  }
  @Override
  public Square poll()
  {
    Square e = queue.get(0);
    queue.remove(0);
    this.size = queue.size();

    return e;
  }
  @Override
  public Square peek()
  {
    Square e = queue.get(0);
    return e;
  }
  @Override
  public int size()
  {
    return queue.size();
  }
  @Override
  public void clear()
  {
    size = 0;
  }
}