package ch02;

public class MainTest1 {
	
	public static void main(String[] args) {

		// 재료
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		// 1 ThreeDPrinter 1 -> 객체 생성
		// setter 메서드 사용할 떄 Powder
		ThreeDPrinter1 printer1 = new ThreeDPrinter1();
		printer1.setMaterial(powder);
		System.out.println(printer1.getMaterial());
		
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();
		printer2.setMaterial(plastic);
		System.out.println(printer2.getMaterial());
		
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		// 1. 재료셋팅
		printer3.setMaterial(powder);
		System.out.println(printer3.getMaterial());
		
		Powder temp1 = (Powder) printer3.getMaterial();
		
		System.out.println(printer3);
	}

}
