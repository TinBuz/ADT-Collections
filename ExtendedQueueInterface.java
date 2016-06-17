/* Purpose: Data Structure and Algorithms Lab 6 Problem 2
 * Status: Complete and tested, contains logical errors
 * Last update: 3/8/2016
 * Submitted:  3/9/2016
 * Comment: test suite and sample run attached
 * @author: Tin Buzancic
 * @version: 2016.03.09
 */
package mainPackage;

public interface ExtendedQueueInterface<T>
{
    public void enqueueFirst(T newItem) throws ExtendedQueueException;
	public T dequeueLast() throws ExtendedQueueException;
	public T peekLast() throws ExtendedQueueException;
}  // end ExtendedQueueInterface