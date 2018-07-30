
public class VDemo {
		public static void main(String args[]) {
			Vechicle vehicle[]=new Vechicle[3];
			vehicle[0]= new TwoWheeler();
			vehicle[1]=new ThreeWheeler();
			vehicle[2]= new FourWheller();
		for(int i=0;i<3;i++) {
			if(i==1) {
				vehicle[i].start();
			}
		}
		}
}
