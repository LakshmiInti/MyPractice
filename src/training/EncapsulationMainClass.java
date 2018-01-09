package training;

public class EncapsulationMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationExample ex=new EncapsulationExample();
		ex.setName("Lakshmi");
		ex.setRollNumber(12);
		String name=ex.getName();
		int id=ex.getRollNumber();
		System.out.println(name);
		System.out.println(id);
	}

}
