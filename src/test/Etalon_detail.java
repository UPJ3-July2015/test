package test;

public class Etalon_detail implements Cloneable {
	
	String name;
	int Sostav_metal_percent ;

	public Etalon_detail clone () throws CloneNotSupportedException {
		Etalon_detail clone = (Etalon_detail)super.clone();
		return clone;
}
}