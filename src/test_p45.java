class test_p45
{
  public static void main(String[] agrs)
  {
	Car4 car1 = new Car4("1����");
	car1.start();
	
	Car4 car2 = new Car4("2����");
	car2.start();
	
	for(int i=0;i<5;i++)
	{
	  System.out.println("���b�i��main()���B�z�u�@");
	}
  }
}

class Car4 extends Thread
{
  private String name;
  
  public Car4(String nm)
  {
	name = nm;
  }
  
  public void run()
  {
	for(int i=0;i<5;i++)
	{
      System.out.println("���b�i��"+name+"���B�z�u�@");
	}
  }
}