public class MyFirstProgramTask3 {
	public static void main(String[] args) {
	MySecondClass obj = new MySecondClass();
	System.out.println("Bit Shift Left");
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

class MySecondClass {
	private int firstNum, secondNum;
	public int getFirstNum() {
        return firstNum;
    }
	public int getSecondNum() {
        return secondNum;
    }
 
    public void setFirstNum(int number) {
        this.firstNum = number;
    }
	public void setSecondNum(int number) {
        this.secondNum = number;
    }
	public MySecondClass() {
		firstNum = 0;
		secondNum = 0;
	}
	public MySecondClass(int fNum, int sNum) {
		this.firstNum = fNum;
		this.secondNum = sNum;
	}
	public int bitShiftLeft() {
		return (firstNum << secondNum);
	}
}