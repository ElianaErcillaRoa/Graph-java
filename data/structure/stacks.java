package data.structure;
public class stacks {
    class Node {
      Object elem;
      Node Next;

      public Node(Object o) {
        elem = o;
        Next = null;
      }
    }
    Node end;
    int size;
    public stacks() {
      end = null;
      size = 0;
    }
    public void push(Object o) {
      Node newnode = new Node(o);
      if (end == null){
        end = newnode;
       } else {
        newnode.Next = end;
        end = newnode;
      }
      size++;
    }
     // inserts an object onto the stack
    public Object pop() {
      if (end == null)
        return null;
      
      Object o = end.elem;
      end = end.Next;
      size--;
      return o;
    }// Gets the object from the stack
    public boolean isEmpty() {

      return (size == 0);
    }
    public int size() {

      return size;
    }
    public Object end() {

      if (end == null)
        return null;
      else
        return end.elem;
    }
}