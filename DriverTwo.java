package mainPackage;
/* Purpose: Data Structure and Algorithms Lab 6 Problem 2
 * Status: Has many errors
 * Last update: 03/03/2016
 * Submitted:  03/03/2016
 * Comment: test suite and sample run attached
 * @author: Tin Buzancic
 * @version: 2016.03.03
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DriverTwo {

    public static void main(String[] args) throws IOException
    {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        Deq<Object> doubleQueue = new Deq<Object>();
        boolean looper = true;
        while(looper)
        {
            System.out.println("Select from the following menu: ");
            System.out.println("		1. Insert item at back of Deq.");
            System.out.println("		2. Insert item at front of Deq.");
            System.out.println("		3. Remove item from front of Deq.");
            System.out.println("		4. Remove item from back of Deq.");
            System.out.println("		5. Display front item of Deq.");
            System.out.println("		6. Display last item of Deq.");
            System.out.println("		7. Clear Deq.");
            System.out.println("		8. Display content of Deq.");
            System.out.println("		9. Exit");
            System.out.print("Make your menu selection now: ");
            String response = bReader.readLine().trim();
            System.out.println(response);
            switch(response)
            {
            case "9":
            	System.out.print("You have exited.");
            	System.exit(0);
            	break;
            case "1":
                System.out.println("You are now inserting an item at the back of the Deq.");
                System.out.print("		Enter Item: ");
                String itemBack = bReader.readLine().trim();
                System.out.println(itemBack);
                doubleQueue.enqueue(itemBack);
                System.out.println("Item inserted at the back of the Deq.\n");
                break;
            case "2":
                System.out.println("You are now inserting an item at the front of the Deq.");
                System.out.print("		Enter Item: ");
                String itemFront = bReader.readLine().trim();
                System.out.println(itemFront);
                doubleQueue.enqueueFirst(itemFront);
                System.out.println("Item inserted at the front of the Deq.\n");
                break;
            case "3":
                if(doubleQueue.isEmpty())
                {
                    System.out.println("The Deq is empty.\n");
                }
                else
                {
                    doubleQueue.dequeue();
                    System.out.println("Item removed from front of the Deq.\n");
                }
                break;
            case "4":
                if(doubleQueue.isEmpty())
                {
                    System.out.println("The Deq is empty.\n");
                }
                else
                {
                    doubleQueue.dequeueLast();
                    System.out.println("Item removed from back of the Deq.\n");
                }
                break;
            case "5":
                if(doubleQueue.isEmpty())
                {
                    System.out.println("The Deq is empty.\n");
                }
                else
                {
                    System.out.println("The first item in the Deq is " + doubleQueue.peek() + ".\n");
                }
                break;
            case "6":
                if(doubleQueue.isEmpty())
                {
                    System.out.println("The Deq is empty.\n");
                }
                else
                {
                    System.out.println("The last item in the Deq is " + doubleQueue.peekLast() + ".\n");
                }
                break;
            case "7":
                if(doubleQueue.isEmpty())
                {
                    System.out.println("The Deq is already empty.\n");
                }
                else
                {
                    doubleQueue.dequeueAll();
                    System.out.println("Queue completely cleared.\n");
                }
                break;
            case "8":
                if(doubleQueue.isEmpty())
                {
                    System.out.println("The Deq is empty.\n");
                }
                else
                {
                    System.out.println("The content of the queue contains: "  + doubleQueue.toString() + "\n");
                }
                break;
            default:
                System.out.println("Not valid. Please enter again.\n");
                break;
            }
        }
    }
}



