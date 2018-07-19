
public class Testcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1=new car();
		car c2=new car();
		car c3=new car();
		car c4=new car();
		car c5=new car();
		c1.setcardetails("bmw", 21.5, 450000,true);
		c2.setcardetails("lambouurgini",40.6 ,50000 ,true );
		c3.setcardetails("xyz", 44.8, 354376,true);
		c4.setcardetails("abc", 32.9, 65474,false);
		c5.setcardetails("pqr", 45.8, 90987,true);
		c1.printcardetails();
        c2.printcardetails();
        c3.printcardetails();
        c4.printcardetails();
        c5.printcardetails();
        double arr[]= {c1.price,c2.price,c3.price,c4.price,c5.price};
        car cars[]= {c1,c2,c3,c4,c5};
        double x=0;
        String costlyCar="";
        
        for(int i=0;i<cars.length;i++) {
        	if(cars[i].price>x) {
        		x=cars[i].price;
        		costlyCar=cars[i].carname;
        		
        	}
        
        } 
        System.out.println("Costlier price of car"+x);
        System.out.println("Costlier name of car"+costlyCar);
       
       //System.out.println("Costlier car : "+c1.carname);
  
	}
	

}