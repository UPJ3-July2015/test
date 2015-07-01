package test;

public class Tokar extends Managers implements
Work, Tokar_works {
//	public void delegateTo(Employees emp) {
//		emp.setDelegate(this);
//	IamSlesar.delegateTo(IamTokar);
//	System.out.println("I can not work like Slesar");

//	}
	protected Slesar_works delegate = null;
	
	
	public void Cleaningterritory() {
		super.Cleaningterritory();
		System.out.println("Tokar cleaning floor ");
	}

	@Override
	public void delegateTo(Slesar s1) {
		s1.delegate= this;
		
	}
	public void Slesar_work_in_company_with_different_wooden_materials() {
		if (delegate!= null) {
			delegate.Slesar_work_in_company_with_different_wooden_materials();
		}
	}

	@Override
	public void Tokar_work_in_company_with_different_metal_materials() {
		// TODO Auto-generated method stub
	
		
	}


		
	

}
