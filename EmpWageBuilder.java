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

//usecase4
class EMPWageBuilderUC4 {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			int empHrs=0;
			int empWage=0;
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck) {
			case IS_PART_TIME:
				empHrs=4;
				break;
			case IS_FULL_TIME:
				empHrs=8;
			default:
				empHrs=0;
			}
			empWage=empHrs*EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage "+empWage);
		}
	}
}

//usecase5
class EMPWageBuilderUC5 {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			int empHrs=0;
			int empWage=0;
			int totalEmpWage=0;
			for(int day =0;day<NUM_OF_WORKING_DAYS;day++) {
				int empCheck=(int) Math.floor(Math.random())*10 % 3;
				switch(empCheck) {
				case IS_PART_TIME:
					empHrs=4;
					System.out.println("Employee is Part time employee");
					break;
				case IS_FULL_TIME:
					empHrs=8;
					System.out.println("Employee is Full time employee");
					break;
				default:
					empHrs=0;	
					
				}
				empWage= empHrs*EMP_RATE_PER_HOUR;
				totalEmpWage+=empWage;
				System.out.println("Emp Wage "+empWage);
			}
			System.out.println("Total Emp Wage: "+totalEmpWage);
		}
	}
}

//usecase6
class EMPWageBuilderUC6 {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println("Employee: "+i);
			int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
			while(totalEmpHrs<= MAX_HRS_IN_MONTH && totalWorkingDays< NUM_OF_WORKING_DAYS) {
				totalWorkingDays++;
				int empCheck=(int) Math.floor(Math.random()*10)%3;
				switch(empCheck) {
				case IS_PART_TIME:
					empHrs=4;
					break;
				case IS_FULL_TIME:
					empHrs=8;
					break;
				default:
					empHrs=0;
				}
				totalEmpHrs+=empHrs;
				System.out.println("Day#: "+totalWorkingDays +"Emp Hr: "+empHrs);
			}
			int totalEmpWage= totalEmpHrs * EMP_RATE_PER_HOUR;
			System.out.println("Total Emp Wage: "+totalEmpWage);
		}
	}
}

