
public class enumdemo {
	enum weekday{sun,mon,tue,wed,thur,fri,sat};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		weekday[] w=weekday.values();
		for(weekday w1:w)
			System.out.println(w1);
		//directly print
		System.out.println(weekday.tue);
		

	}

}
