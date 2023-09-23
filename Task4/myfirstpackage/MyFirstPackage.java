package myfirstpackage;
public class MyFirstPackage {
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
	public MyFirstPackage() {
		firstNum = 0;
		secondNum = 0;
	}
	public MyFirstPackage(int fNum, int sNum) {
		this.firstNum = fNum;
		this.secondNum = sNum;
	}
	public int bitShiftLeft() {
		return (firstNum << secondNum);
	}
}