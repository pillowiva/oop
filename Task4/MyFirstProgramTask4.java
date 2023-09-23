import myfirstpackage.MyFirstPackage;
public class MyFirstProgramTask4 {
	public static void main(String[] args) {
		MyFirstPackage obj = new MyFirstPackage();
		System.out.println("Побитовый сдвиг влево");
        	for (int i = 0; i <=8; ++i) {
			for (int j = 0; j <= 8; ++j) {
				obj.setFirstNum(i);
				obj.setSecondNum(j);
				System.out.println(obj.bitShiftLeft());
				System.out.println(" ");
			}
		}
    	}
}