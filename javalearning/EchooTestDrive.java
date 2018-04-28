public class EchooTestDrive{
	public static void main(String[] args){
		Echoo e1 = new Echoo();
		Echoo e2 = e1;
		int x=0;
		System.out.println("e1.count = "+e1.count);
		System.out.println("e2.count = "+e2.count);
		while (x<4){
			e1.hello();
			e1.count=e1.count+1;
			if(x==3){
				e2.count=e2.count+1;
			}
			if(x>0){
				e2.count=e2.count+e1.count;
			}
			System.out.println("x= "+x);
			System.out.println("e1.count = "+e1.count);
			System.out.println("e2.count = "+e2.count);
			x=x+1;
			System.out.println("x+1= "+x);
			System.out.println("==============");
		}
	 System.out.println("Final e2.count= "+e2.count);
	}
}