public class MazeSolverQueue extends MazeSolver
{
  private MyQueue queue;
  public MazeSolverQueue(Maze maze)
  {
    super(maze);
  }
   @Override
   public void makeEmpty()
   {
     queue = new MyQueue();
   }
   @Override
   public boolean isEmpty()
   {
     return queue.isEmpty();
   }
   @Override
   public void add(Square s)
   {
     queue.offer(s);
   }
   @Override
   public Square next()
   {
     return queue.poll();
   }
}

