package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericPrinterTest {
	
	public static void main(String[] args) {
		
		// 재료
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// 사용할 떄 자료형을 넣어 주면 된다.
		// 사용방법 : T 대신에 사용할 떄 어떤 자료형을 사용할지 지정해주면 된다.
		GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<>();
		
		// 재료넣기
		genericPrinter1.setMaterial(powder);
		
		// 재료꺼내기
		Powder tempPowder = genericPrinter1.getMaterial();
		System.out.println(tempPowder);
		
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<Plastic>();
		genericPrinter2.setMaterial(plastic);
		Plastic tempPlastic1 = genericPrinter2.getMaterial();
		System.out.println(tempPlastic1);
		
		
	}

}
