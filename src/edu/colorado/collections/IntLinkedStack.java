<<<<<<< HEAD
// File: IntLinkedStack.java from the package edu.colorado.collections
// Complete documentation is available from the IntLinkedStack link in:
//   http://www.cs.colorado.edu/~main/docs/

package edu.colorado.collections;
import java.util.EmptyStackException;
import edu.colorado.nodes.IntNode;

/******************************************************************************
* A <CODE>IntLinkedStack</CODE> is a stack of references to objects.
*
* <b>Limitations:</b>
*   Beyond <CODE>Int.MAX_VALUE</CODE> items, <CODE>size</CODE> is wrong. 
*
* <b>Java Source Code for this class:</b>
*   <A HREF="../../../../edu/colorado/collections/IntLinkedStack.java">
*   http://www.cs.colorado.edu/~main/edu/colorado/collections/IntLinkedStack.java
*   </A>
*
* @author Michael Main 
*   <A HREF="mailto:main@colorado.edu"> (main@colorado.edu) </A>
*
* @version Feb 10, 2016
*
* @see IntStack
* @see ObjectLinkedStack
* @see BooleanLinkedStack
* @see ByteLinkedStack
* @see CharLinkedStack
* @see DoubleLinkedStack
* @see FloatLinkedStack
* @see LongLinkedStack
* @see ShortLinkedStack
******************************************************************************/
public class IntLinkedStack implements Cloneable
{
   // Invariant of the IntLinkedStack class:
   //   1. The items in the stack are stored in a linked list, with the top of
   //      the stack stored at the head node, down to the bottom of the stack
   //      at the final node.
   //   2. The instance variable top is the head reference of the linked list
   //      of items.
   private IntNode top; 

   /**
   * Initialize an empty stack.
   * <b>Postcondition:</b>
   *   This stack is empty.
   **/   
   public IntLinkedStack( )
   {
      top = null;
   }

   
   /**
   * Generate a copy of this stack.
   * @return
   *   The return value is a copy of this stack. Subsequent changes to the
   *   copy will not affect the original, nor vice versa. Note that the return
   *   value must be type cast to a <CODE>IntLinkedStack</CODE> before it can be used.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for creating the clone.
   **/ 
   public Object clone( )       
   {  // Clone a IntLinkedStack.
      IntLinkedStack answer;
      
      try
      {
         answer = (IntLinkedStack) super.clone( );
      }
      catch (CloneNotSupportedException e)
      { 
         // This exception should not occur. But if it does, it would probably indicate a
         // programming error that made super.clone unavailable. The most comon error
         // The most common error would be forgetting the "Implements Cloneable"
         // clause at the start of this class.
         throw new RuntimeException
         ("This class does not implement Cloneable");
     }
      
      answer.top = IntNode.listCopy(top);
      
      return answer;
   }        
 
   
   /**
   * Determine whether this stack is empty.
   * @return
   *   <CODE>true</CODE> if this stack is empty;
   *   <CODE>false</CODE> otherwise. 
   **/
   public boolean isEmpty( )
   {
      return (top == null);
   }
   

   /**
   * Get the top item of this stack, without removing the item.
   * <b>Precondition:</b>
   *   This stack is not empty.
   * @return
   *   the top item of the stack
   * @exception EmptyStackException
   *   Indicates that this stack is empty.
   **/   
   public int peek( )   
   {
      if (top == null)
         // EmptyStackException is from java.util and its constructor has no argument.
         throw new EmptyStackException( );
      return top.getData( );
   }

   
   /**
   * Get the top item, removing it from this stack.
   * <b>Precondition:</b>
   *   This stack is not empty.
   * @return
   *   The return value is the top item of this stack, and the item has
   *   been removed.
   * @exception EmptyStackException
   *   Indicates that this stack is empty.
   **/    
   public int pop( )
   {
      int answer;
      
      if (top == null)
         // EmptyStackException is from java.util and its constructor has no argument.
         throw new EmptyStackException( );
      
      answer = top.getData( );
      top = top.getLink( );
      return answer;
   }    


   /**
   * Push a new item onto this stack. The new item may be the null
   * reference.
   * @param item
   *   the item to be pushed onto this stack 
   * <b>Postcondition:</b>
   *   The item has been pushed onto this stack.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for increasing the stack's capacity.
   **/    
   public void push(int item)
   {
      top = new IntNode(item, top);
   }
              

   /**
   * Accessor method to determine the number of items in this stack.
   * @return
   *   the number of items in this stack
   **/ 
   public int size( )   
   {
      return IntNode.listLength(top);
   }
 
}
=======
// File: IntLinkedStack.java from the package edu.colorado.collections
// Complete documentation is available from the IntLinkedStack link in:
//   http://www.cs.colorado.edu/~main/docs/

package edu.colorado.collections;
import java.util.EmptyStackException;
import edu.colorado.nodes.IntNode;

/******************************************************************************
* A <CODE>IntLinkedStack</CODE> is a stack of references to objects.
*
* <b>Limitations:</b>
*   Beyond <CODE>Int.MAX_VALUE</CODE> items, <CODE>size</CODE> is wrong. 
*
* <b>Java Source Code for this class:</b>
*   <A HREF="../../../../edu/colorado/collections/IntLinkedStack.java">
*   http://www.cs.colorado.edu/~main/edu/colorado/collections/IntLinkedStack.java
*   </A>
*
* @author Michael Main 
*   <A HREF="mailto:main@colorado.edu"> (main@colorado.edu) </A>
*
* @version Feb 10, 2016
*
* @see IntStack
* @see ObjectLinkedStack
* @see BooleanLinkedStack
* @see ByteLinkedStack
* @see CharLinkedStack
* @see DoubleLinkedStack
* @see FloatLinkedStack
* @see LongLinkedStack
* @see ShortLinkedStack
******************************************************************************/
public class IntLinkedStack implements Cloneable
{
   // Invariant of the IntLinkedStack class:
   //   1. The items in the stack are stored in a linked list, with the top of
   //      the stack stored at the head node, down to the bottom of the stack
   //      at the final node.
   //   2. The instance variable top is the head reference of the linked list
   //      of items.
   private IntNode top; 

   /**
   * Initialize an empty stack.
   * <b>Postcondition:</b>
   *   This stack is empty.
   **/   
   public IntLinkedStack( )
   {
      top = null;
   }

   
   /**
   * Generate a copy of this stack.
   * @return
   *   The return value is a copy of this stack. Subsequent changes to the
   *   copy will not affect the original, nor vice versa. Note that the return
   *   value must be type cast to a <CODE>IntLinkedStack</CODE> before it can be used.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for creating the clone.
   **/ 
   public Object clone( )       
   {  // Clone a IntLinkedStack.
      IntLinkedStack answer;
      
      try
      {
         answer = (IntLinkedStack) super.clone( );
      }
      catch (CloneNotSupportedException e)
      { 
         // This exception should not occur. But if it does, it would probably indicate a
         // programming error that made super.clone unavailable. The most comon error
         // The most common error would be forgetting the "Implements Cloneable"
         // clause at the start of this class.
         throw new RuntimeException
         ("This class does not implement Cloneable");
     }
      
      answer.top = IntNode.listCopy(top);
      
      return answer;
   }        
 
   
   /**
   * Determine whether this stack is empty.
   * @return
   *   <CODE>true</CODE> if this stack is empty;
   *   <CODE>false</CODE> otherwise. 
   **/
   public boolean isEmpty( )
   {
      return (top == null);
   }
   

   /**
   * Get the top item of this stack, without removing the item.
   * <b>Precondition:</b>
   *   This stack is not empty.
   * @return
   *   the top item of the stack
   * @exception EmptyStackException
   *   Indicates that this stack is empty.
   **/   
   public int peek( )   
   {
      if (top == null)
         // EmptyStackException is from java.util and its constructor has no argument.
         throw new EmptyStackException( );
      return top.getData( );
   }

   
   /**
   * Get the top item, removing it from this stack.
   * <b>Precondition:</b>
   *   This stack is not empty.
   * @return
   *   The return value is the top item of this stack, and the item has
   *   been removed.
   * @exception EmptyStackException
   *   Indicates that this stack is empty.
   **/    
   public int pop( )
   {
      int answer;
      
      if (top == null)
         // EmptyStackException is from java.util and its constructor has no argument.
         throw new EmptyStackException( );
      
      answer = top.getData( );
      top = top.getLink( );
      return answer;
   }    


   /**
   * Push a new item onto this stack. The new item may be the null
   * reference.
   * @param item
   *   the item to be pushed onto this stack 
   * <b>Postcondition:</b>
   *   The item has been pushed onto this stack.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for increasing the stack's capacity.
   **/    
   public void push(int item)
   {
      top = new IntNode(item, top);
   }
              

   /**
   * Accessor method to determine the number of items in this stack.
   * @return
   *   the number of items in this stack
   **/ 
   public int size( )   
   {
      return IntNode.listLength(top);
   }
 
}
>>>>>>> 729a8515ee0d2a684401ee3be05dc5bce509cb3e
