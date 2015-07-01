package test;

public class Ourwork {

	public static void main(String[] args) {
		Work w1 = new Tokar();
		w1.Cleaningterritory();
		Work w3 = new Slesar();
		w3.Cleaningterritory();
	   Slesar w4 = new Slesar ();
	   Tokar w5 = new Tokar ();
	 //  w4.delegateTo(w5);
	 //  w5.Slesar_work_in_company_with_different_wooden_materials();
	   w5.delegateTo(w4);
	   w5.Tokar_work_in_company_with_different_metal_materials();
	   
		  Etalon_detail d1 = new Etalon_detail();
		   d1.name = "bolt";
		   d1.Sostav_metal_percent = 75;

}}
