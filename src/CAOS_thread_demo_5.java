public class CAOS_thread_demo_5 extends Thread
{
	public static int counter = 0;
	public static int counter2 = 0;
	private String myBla;

   	public static void main(String[] args)
   	{

    	CAOS_thread_demo_5 humhum1 = new CAOS_thread_demo_5("Sverige er et dejligt land, og flaggan är vacker med blå og gula färger.");
    	CAOS_thread_demo_5 humhum2 = new CAOS_thread_demo_5("Vi er røde vi er hvide, vi er røde vi er hvide, vi er røde vi er hvide.");
    	CAOS_thread_demo_5 humhum3 = new CAOS_thread_demo_5("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
    	CAOS_thread_demo_5 humhum4 = new CAOS_thread_demo_5("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
    	CAOS_thread_demo_5 humhum5 = new CAOS_thread_demo_5("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
    	CAOS_thread_demo_5 humhum6 = new CAOS_thread_demo_5("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
    	CAOS_thread_demo_5 humhum7 = new CAOS_thread_demo_5("God save the queen. Hello old chap, how are you doing in this terrible heat?");
    	CAOS_thread_demo_5 humhum8 = new CAOS_thread_demo_5("I'm a Texas cowboy shooting my gun all day, chasing caos, and drinking crappy coffe.");
      	humhum1.start();
      	humhum2.start();
      	humhum3.start();
      	humhum4.start();
      	humhum5.start();
      	humhum6.start();
      	humhum7.start();
      	humhum8.start();

		try
		{
	      	humhum1.join();
    	  	humhum2.join();
      		humhum3.join();
	      	humhum4.join();
    	  	humhum5.join();
      		humhum6.join();
	      	humhum7.join();
    	  	humhum8.join();
		}
		catch(Exception e)
		{}
      	
      	System.out.println();
      	System.out.println("*** the end ***");
      	System.out.println("#### counter: " + counter);
      	System.out.println("#### counter2: " + counter2);
      	     	
   	}

	public CAOS_thread_demo_5(String s)
	{
		myBla = s;
	}

    public void myStupidPrint(char c)
    {
    	System.out.print(c);
    	counter = counter + 1;
	}

   	public void run()
  	{
  		char c;
  		int stop = myBla.length();
  		for (int i = 0; i < stop ; i++)
  		{  			
  			myStupidPrint(myBla.charAt(i));
  		}
  		  		
   	}
   	
}
