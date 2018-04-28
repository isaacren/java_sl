class GDogTestDrive{
	public static void main(String[] args){
		GDog one = new GDog();
		one.setSize(70);
		GDog two = new GDog();
		two.setSize(8);
		
		System.out.println("Dog one: "+one.getSize());
		one.bark();
		System.out.println("Dog two: "+two.getSize());
		two.bark();
	}
}