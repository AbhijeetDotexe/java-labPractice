// A Generic Box with a content
public class GenericBox<E> {
   private E content;  // private variable of generic type E
   public GenericBox(E content) {  // constructor
      this.content = content;
   }
   public E getContent() {  // getter
      return content;
   }
   public void setContent(E content) {  // setter
      this.content = content;
   }
   public String toString() {  // describe itself
      return "GenericBox[content=" + content + "(" + content.getClass() + ")]";
   }
}