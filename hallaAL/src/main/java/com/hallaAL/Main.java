package com.hallaAL;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Queue Test" );
        Queue queue=new Queue(5);
        queue.insert('H');
        queue.insert('A');
        queue.insert('L');
        queue.insert('L');
        queue.insert('A');
        queue.show();
        System.out.println(queue.remove()+ " 삭제");
        System.out.println(queue.remove()+ " 삭제");
        System.out.println(queue.remove()+ " 삭제");
        queue.show();
      
        System.out.println("LinkedList Queue Test");
        LinkedListQueue linkQueue=new LinkedListQueue();
        linkQueue.insert('H');
        linkQueue.insert('A');
        linkQueue.insert('L');
        linkQueue.insert('L');
        linkQueue.insert('A');
        System.out.println("첫번째 데이터 "+linkQueue.peek());
        linkQueue.show();
        System.out.println("\""+linkQueue.remove()+"\" 삭제 ");
        linkQueue.show();
        linkQueue.insert('P');
        System.out.println("\"P\" 데이터 삽입");
        linkQueue.show();
        System.out.println("\""+linkQueue.remove()+"\" 삭제 ");
        System.out.println("\""+linkQueue.remove()+"\" 삭제 ");
        System.out.println("\""+linkQueue.remove()+"\" 삭제 ");
        System.out.println("\""+linkQueue.remove()+"\" 삭제 ");
        System.out.println("\""+linkQueue.remove()+"\" 삭제 ");
        linkQueue.show();
        
        System.out.println("ArrayStack Test");
        ArrayStack arrayStack=new ArrayStack(5);
        arrayStack.push('H');
        arrayStack.push('A');
        arrayStack.push('L');
        arrayStack.push('L');
        arrayStack.push('A');
        arrayStack.show();
        System.out.println(arrayStack.pop()+" 삭제");
        System.out.println(arrayStack.pop()+" 삭제");
        System.out.println(arrayStack.pop()+" 삭제");
        arrayStack.show();
        
        System.out.println("LinkedListStack Test");
        LinkedListStack linkStack=new LinkedListStack();
        linkStack.push('H');
        linkStack.push('A');
        linkStack.push('L');
        linkStack.push('L');
        linkStack.push('A');
        linkStack.show();
        System.out.println(linkStack.pop()+" 삭제");
        System.out.println(linkStack.pop()+" 삭제");
        System.out.println(linkStack.pop()+" 삭제");
        System.out.println(linkStack.pop()+" 삭제");
        linkStack.show();
        linkStack.push('I');
        linkStack.show();
        
    }
}
