class test_p48
{
  public static void main(String[] args)
  {
	Car7 car1 = new Car7("1����");
	car1.start();
	
	try
	{
	  car1.join();
	}
	
	catch(InterruptedException e)
	{
		
	}
	
	System.out.println("����main()���B�z�u�@�C");
  }
}

class Car7 extends Thread
{
  private String name;
  
  public Car7(String nm)
  {
	name = nm;
  }
  
  public void run()
  {
	for(int i=0;i<5;i++)
	{
      System.out.println("���b�i��"+name+"���B�z�u�@�C");
	}
  }
}