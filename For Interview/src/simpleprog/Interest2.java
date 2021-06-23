package simpleprog;

public class Interest2 {
public static void main(String[] args) {
	float emi=12*2000;
	int year =3;
	float roi=10;
	
	float z=emi+emi*roi/100;
	System.out.println(z);
	
	float y=emi+z;
	float x=y*10/100;
	float w=y+x;
	System.out.println(w);
	
	float p=emi+w;
	float q=p*10/100;
	float m=p+q;
	System.out.println(m);
	
	/*for(int i=1;i<=year;i++) {
	
		 float z=(emi+roi)*i;
		 System.out.println(z);
			
	}*/
}
}
