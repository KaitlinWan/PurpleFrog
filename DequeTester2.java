//Notes to PurpleFrog from DragonFruit

/* We noticed that you forgot to decrement the size in pollLast()
as well as that, there is also a nullpointer exception in the main */


public class DequeTester2{

  public static void main(String[] args){
  QQKachoo<String> rohan = new QQKachoo<String>();
	rohan.addFirst("cat");
	rohan.addFirst("dog");
  rohan.addFirst("monkey");
  rohan.addFirst("penguin");
  rohan.addLast("walrus");
  rohan.addLast("frog");
	rohan.addLast("duck");
	rohan.addLast("cow");

	System.out.println("current Deque: " + rohan);
	System.out.println("Expected Value: 8");
	System.out.println(rohan.size());

  System.out.println("PeekFirst: penguin");
	System.out.println(rohan.peekFirst());
  System.out.println("PollFirst: penguin");
  System.out.println(rohan.pollFirst());

  System.out.println("Expected: 7");
	System.out.println(rohan.size());

  System.out.println("Current State: " + rohan);
  System.out.println("PeekLast: cow");
  System.out.println(rohan.peekLast());
  System.out.println("PollLast: cow");
  System.out.println(rohan.pollLast());

  System.out.println("Expected: 6");
	System.out.println(rohan.size());

	System.out.println("current Deque: " + rohan);
  System.out.println("PeekFirst: monkey");
	System.out.println(rohan.peekFirst());
  System.out.println("PollFirst: monkey");
  System.out.println(rohan.getFirst());

  System.out.println("Expected: 5");
	System.out.println(rohan.size());

  System.out.println("Current State: " + rohan);
  System.out.println("PeekLast: duck");
  System.out.println(rohan.peekLast());
  System.out.println("PollLast: duck");
  System.out.println(rohan.getLast());

  System.out.println("Expected: 4");
	System.out.println(rohan.size());


}
}
