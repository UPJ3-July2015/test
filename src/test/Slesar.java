package test;

public class Slesar extends Employees implements
Work, Slesar_works {
	protected Tokar_works delegate = null;
	
	
	public void Cleaningterritory() {
		
		System.out.println("Slesar repairs different kind of problems with doors, windows ");
	}

	@Override
	public void delegateTo(Tokar t1) {
		t1.delegate= this;
		
	}
	public void Tokar_work_in_company_with_different_metal_materials() {
		if (delegate!= null) {
			delegate.Tokar_work_in_company_with_different_metal_materials();
		}}

	@Override
	public void Slesar_work_in_company_with_different_wooden_materials() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delegateTo(Employees emp) {
		// TODO Auto-generated method stub
		
	}
	
	
		
	}


		
	


