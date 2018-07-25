import java.util.*;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
al.add("saran");
al.add("padhu");
al.add("madhu");  
al.add("priyanka");
al.add(2);
System.out.println("size "+al.size());
System.out.println("before");
for(int i=0;1<al.size();i++)
{
	if(al.get(i).equals("priyanka"))
	{
		al.remove(i);
	
	System.out.println(al.get(i));
}
System.out.println("after");
al.remove("madhu");
for(int x=0;x<al.size();x++)
{
	
System.out.println(al.get(x));
}
//stu s=new stu();                                                                   
//a1.add(s);     
	}
}
}


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                