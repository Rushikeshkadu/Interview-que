package simpleprog;

public class Interest {
	public static void main(String[] args) {
		
	int emi=2000;
	int year =3;
	float roi=10;
	int ele=0;
	
	for(int i=1;i<=year;i++) {
		 
		int x=(12*emi)*i;
		int y=x*10/100;
		int z=x+y;
		System.out.println(z);
	}
	
}
}	

