enum Days{
	SUN, MON, TUES, WED, THURS;
}

/// WHY DO WE NEED ENUMS????
/// 
/// 


public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Days d: Days.values()) {
			System.out.println(d.name());
		}
	}

}
