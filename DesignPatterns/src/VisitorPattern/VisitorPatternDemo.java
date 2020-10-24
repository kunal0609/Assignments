package VisitorPattern;

public class VisitorPatternDemo {

	public static void main(String[] args) {

	      ComputerPart computer = (ComputerPart) new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	   }
	
}
