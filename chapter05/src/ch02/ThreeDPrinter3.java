package ch02;

public class ThreeDPrinter3 {
	
	private Object material;
	
	public Object getMaterial() {
		return material;
	}
	
	public void setMaterial(Object material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "안녕하세요 toString 정의 했어요";
	}

}
