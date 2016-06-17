package mainPackage;

/* Purpose: Data Structure and Algorithms Lab 6 Problem 1
 * Status: Complete and tested, contains logical errors
 * Last update: 3/8/2016
 * Submitted:  3/9/2016
 * Comment: test suite and sample run attached
 * @author: Tin Buzancic
 * @version: 2016.03.09
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver
{
    public static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException
    {
        Queue<Object> queue = new Queue<Object>();
        while(true)
        {
            System.out.print("Select from the following menu: \n"
                             +		"		1. Insert item at back of queue.\n"
                             +		"		2. Remove item from front of queue.\n"
                             +		"		3. Display front item of queue.\n"
                             +		"		4. Clear queue.\n"
                             +		"		5. Display content of queue.\n"
                             +		"		6. Exit\n"
                             +		"Make your menu selection now: ");
            String response = bReader.readLine().trim();
            System.out.println(response);
            switch(response)
            {
            case "6":
                System.out.println("You have exited the program.\n");
                System.exit(0);
                break;
            case "1":
                System.out.println("You are now inserting an item at the back of the queue.");
                System.out.print("		Enter Item: ");
                String item = bReader.readLine().trim();
                System.out.println(item);
                queue.enqueue(item);
                System.out.println("Item enqueued.\n");
                break;
            case "2":
                if(queue.isEmpty())
                {
                    System.out.println("The list is empty List.\n");
                }
                else
                {
                    queue.dequeue();
                    System.out.println("Item dequeued.\n");
                }
                break;
            case "3":
                if(queue.isEmpty())
                {
                    System.out.println("The list is empty.\n");
                }
                else
                {
                    System.out.println("The front item of the queue is "  + queue.peek() + "\n");
                }
                break;
            case "4":
                if(queue.isEmpty())
                {
                    System.out.println("The list already is empty.\n");
                }
                else
                {
                    queue.dequeueAll();
                    System.out.println("Queue completely cleared.\n");
                }
                break;
            case "5":
                if(queue.isEmpty())
                {
                    System.out.println("The list is empty.\n");
                }
                else
                {
                    System.out.println("The content of the queue contains: "  + queue.toString() + "\n");
                }
                break;
            default:
                System.out.println("Not valid. Please enter again.\n");
                break;
            }
        }
    }
}

