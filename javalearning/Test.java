public class Test{
final int value = 10;
// ����������������ʵ��
public static final int BOXWIDTH = 6;
static final String TITLE = "Manager";
public void getTitle(){
System.out.println("ְλΪ��"+TITLE);}
public void getValue(){
System.out.println("����Ϊ��"+value); //�����value��ֵ
}
 public static void main(String[] args){
 	Test a = new Test();
 	a.getTitle();
 	a.getValue();
 }
}