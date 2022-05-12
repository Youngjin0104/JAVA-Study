package ch07;

public class MainTest {
	
	public static void main(String[] args) {
		
		Computer computer = new DestTop();
		computer.turnOn();
		computer.display();
		computer.turnoff();
		
		System.out.println("----------------");
		
		NoteBook notebook = new MyNoteBook();
		
		notebook.turnOn();
		notebook.display();
		notebook.turnoff();
		
	}

}
