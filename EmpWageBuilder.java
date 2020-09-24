package WageBuilder;

class EmpWageBuilder {
	public static void main(String[] args) {
		System.out.println("Helloworld");
	}
}
//usecase1
class empcheck {
	public static void main(String[] args) {
		int isfulltime=1;
		double empcheck= Math.floor(Math.random()*10)%2; 
		if(empcheck==isfulltime) {
			System.out.println("Employee present");
		}
		else {
			System.out.println("Employee absent");
		}
	}

}
//usecase2
class EmpWageBuilderUC2 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		int empHrs=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck== IS_FULL_TIME) {
			empHrs=8;
		}
		else {
			empHrs=0;
		}
		empWage= empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage for "+i+"th employee "+empWage);
	}}
}

//usecase3
class EmpWageBuilderUC3 {
	public static void main(String[] args) {
		
	
	for(int i=0;i<10;i++) {
		int IS_PART_TIME=1;
		int IS_FULL_TIME=2;
		int EMP_RATE_PER_HOUR=20;
		int empHrs=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random()*10)%3;
		if(empCheck==IS_PART_TIME) {
			empHrs=4;
			System.out.println("Employee "+i+" is Part time employee");
		}
		else if(empCheck==IS_FULL_TIME) {
			empHrs=8;
			System.out.println("Employee "+i+" is Full time employee");
		}
		else {
			empHrs=0;
		}
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: "+empWage);
	}
}
}
