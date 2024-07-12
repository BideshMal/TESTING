package Calculator;

public class Basic implements Calculator {
	int num1,num2;
	public Basic(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	@Override
	public int add() {
		// TODO Auto-generated method stub
		return num1+num2;
	}
	@Override
	public int substract() {
		// TODO Auto-generated method stub
		return num1-num2;
	}
	@Override
	public int multiply() {
		// TODO Auto-generated method stub
		return num1*num2;
	}
	@Override
	public int division() {
		// TODO Auto-generated method stub
		return num1/num2;
	}
	
	

}
