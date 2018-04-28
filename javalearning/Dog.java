class Dog{
	int size;
	String name;
	
	void bark(int numberOfBarks)
	{
		while(numberOfBarks>0){
		if (size>60){
			System.out.println("Wooof! Wooof!");		
			}
		else if (size>14){
			System.out.println("Ruff! Ruff!");
		}
		else {
			System.out.println("Yip! Yip!");
			}
		numberOfBarks=numberOfBarks-1;
	  }
  } 
}
