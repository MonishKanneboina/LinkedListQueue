import java.util.*;
import java.util.List.*;
public abstract class MazeSolver
{
   private Maze m;
   
   
   private boolean s;
   
   public MazeSolver(Maze maze)
   {
     this.m = maze;
     
     makeEmpty();
     
     add(maze.getStart());
   }
   
   
   public abstract void makeEmpty();

   public abstract boolean isEmpty();
 
   public abstract void add(Square s);
 
   public abstract Square next();

   public String getPath()
   {
     if(s == true)
     {
      return "Solved!!";
     }
     if(isEmpty() == true && s == false)
     {
       return "Unsolvable!!";
     }
     return "Not yet solved";
   }
   
   
   public boolean isSolved()
   {
     return s;
   }
   
   
   public void step()
   {
   
     if(isEmpty() == true)
     {
       System.out.println("erroe");
     }
     else
     {
      Square a = next();
      
      a.setStatus(Square.E);
      
      if(a.getType() != Square.EXIT)
      {
      
        List<Square> b = m.getNeighbors(a);
        
        for(int i = 0; i < b.size(); i++)
        {
        
          if(b.get(i).getType() != Square.WALL && b.get(i).getStatus() != Square.E && b.get(i).getStatus() != Square.ONWL)
          {
            add(b.get(i));
            
            b.get(i).setStatus(Square.ONWL);
            
          }
          
        }

      }
      else
      {
        s = true;
      }
      
     }
    }
   public void solve()
   {
     while(s == false)
     {
       step();
     }
   }
}
