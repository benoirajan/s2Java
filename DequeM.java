import java.util.*;

public class DequeM {
    public static void main(String args[]) {
        // Declare Deque object
        Deque<String> deque = new LinkedList<String>();
        // add elements to the queue using various methods
        deque.add("Apple"); // add ()
        deque.addFirst("Fruit"); // addFirst ()
        deque.addLast("is"); // addLast ()
        System.out.print("Initial Deque : ");
        System.out.print(deque);

        deque.push("A"); // push ()
        deque.offer("Good"); // offer ()
        deque.offerFirst("Daily"); // offerFirst ()
        deque.offerLast("for Health"); // offerLast ()
        System.out.print("\n\nDeque : ");
        System.out.print(deque);

        // Iterate using standard iterator
        System.out.print("\n\nDeque contents using Standard Iterator : ");
        Iterator iterator = deque.iterator();
        while (iterator.hasNext())
            System.out.print(" " + iterator.next());

        // Iterate using Reverse order iterator
        Iterator reverse = deque.descendingIterator();
        System.out.print("\n\nDeque contents using Reverse Iterator : ");
        while (reverse.hasNext())
            System.out.print(" " + reverse.next());

        // Peek () method
        System.out.println("\n\nDeque Peek : " + deque.peek());
        System.out.println("\nDeque,After peek : " + deque);

        // Pop () method
        System.out.println("\nDeque Pop : " + deque.pop());
        System.out.println("\nDeque,After pop : " + deque);

        // contains () method
        System.out.println("\nDeque Contains Three : " + deque.contains("Three"));

        deque.removeFirst(); // removeFirst ()
        deque.removeLast(); // removeLast ()
        System.out.println("\nDeque, after removing first and last elements : " + deque);
    }
}

/*
Deque : [Daily, A, Fruit, Apple, is, Good, for Health]

Deque contents using Standard Iterator :  Daily A Fruit Apple is Good for Health

Deque contents using Reverse Iterator :  for Health Good is Apple Fruit A Daily

Deque Peek : Daily

Deque,After peek : [Daily, A, Fruit, Apple, is, Good, for Health]

Deque Pop : Daily

Deque,After pop : [A, Fruit, Apple, is, Good, for Health]

Deque Contains Three : false

Deque, after removing first and last elements : [Fruit, Apple, is, Good]
*/ 