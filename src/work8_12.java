
import java.util.*;

public class work8_12 {
	public static void main(String[] args) {
	     //六种税率： 10%，  15%，   25%，    28%，   33%，  35%。
	double[] rates= {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
	
	int[][] backets= {
			{8350, 33950, 82250, 171550, 372950},//Single
			{16700, 67900, 137050, 208850, 372950},//Married Joint
			{8350, 33950, 68525, 104425, 186475},//Married Separate
			{11950, 45500, 117450, 190200, 372950}//Head of a House
	};

	Scanner input = new Scanner(System.in);
	System.out.print("(0-single filer, 1-Married Joint or qualifying widow(er), "
			+ "2-Married Separately, 3-Head of a household)\n"
			+ "Enter the filong status:");
	
	int status=input.nextInt();
	
	System.out.print("Enter the taxable intcome: ");
	double taxableIncome=input.nextDouble();
	
	double tax=0;
	
	//status为0、1、2、3针对每一种身份
			if(status==0) {
				if(taxableIncome<=8350)
					tax=backets[0][0] * rates[0];
				else if(taxableIncome<=33950)
					tax=backets[0][0] * rates[0]+
							(backets[0][1] - backets[0][0]) * rates[1];
				else if(taxableIncome<=82250)
					tax=backets[0][0] * rates[0]+
							(backets[0][1] - backets[0][0]) * rates[1] +
							(backets[0][2] - backets[0][1]) * rates[2];
				else if(taxableIncome<=171550)
					tax=backets[0][0] * rates[0]+
							(backets[0][1] - backets[0][0]) * rates[1] +
							(backets[0][2] - backets[0][1]) * rates[2] +
							(backets[0][3] - backets[0][2]) * rates[3]; 
				else if(taxableIncome<=372950)
					tax=backets[1][0] * rates[0]+
							(backets[1][1] - backets[1][0]) * rates[1] +
							(backets[1][2] - backets[1][1]) * rates[2] +
							(backets[1][3] - backets[1][2]) * rates[3] +
							(backets[1][4] - backets[1][3]) * rates[4];
				else
					tax=backets[0][0] * rates[0]+
							(backets[0][1] - backets[0][0]) * rates[1] +
							(backets[0][2] - backets[0][1]) * rates[2] +
							(backets[0][3] - backets[0][2]) * rates[3] +
							(backets[0][4] - backets[0][3]) * rates[4] +
							(taxableIncome - backets[0][4]) * rates[5];   
			}
			else if(status==1) {
				if(taxableIncome<=16700)
					tax=backets[1][0] * rates[0];
				else if(taxableIncome<=67900)
					tax=backets[1][0] * rates[0]+
							(backets[1][1] - backets[1][0]) * rates[1];
				else if(taxableIncome<=137050)
					tax=backets[1][0] * rates[0]+
							(backets[1][1] - backets[1][0]) * rates[1] +
							(backets[1][2] - backets[1][1]) * rates[2];
				else if(taxableIncome<=208850)
					tax=backets[1][0] * rates[0]+
							(backets[1][1] - backets[1][0]) * rates[1] +
							(backets[1][2] - backets[1][1]) * rates[2] +
							(backets[1][3] - backets[1][2]) * rates[3];
				else if(taxableIncome<=372950)
					tax=backets[1][0] * rates[0]+
							(backets[1][1] - backets[1][0]) * rates[1] +
							(backets[1][2] - backets[1][1]) * rates[2] +
							(backets[1][3] - backets[1][2]) * rates[3] +
							(backets[1][4] - backets[1][3]) * rates[4];
				else
					tax=backets[1][0] * rates[0]+
							(backets[1][1] - backets[1][0]) * rates[1] +
							(backets[1][2] - backets[1][1]) * rates[2] +
							(backets[1][3] - backets[1][2]) * rates[3] +
							(backets[1][4] - backets[1][3]) * rates[4] +
							(taxableIncome - backets[1][4]) * rates[5];  
		
			}
			else if(status==2) {
				if(taxableIncome<=8350)
					tax=backets[2][0] * rates[0];
				else if(taxableIncome<=33950)
					tax=backets[2][0] * rates[0]+
							(backets[2][1] - backets[2][0]) * rates[1];
				else if(taxableIncome<=68525)
					tax=backets[2][0] * rates[0]+
							(backets[2][1] - backets[2][0]) * rates[1] +
							(backets[2][2] - backets[2][1]) * rates[2];
				else if(taxableIncome<=104425)
					tax=backets[2][0] * rates[0]+
							(backets[2][1] - backets[2][0]) * rates[1] +
							(backets[2][2] - backets[2][1]) * rates[2] +
							(backets[2][3] - backets[2][2]) * rates[3];
				else if(taxableIncome<=186475)
					tax=backets[2][0] * rates[0]+
							(backets[2][1] - backets[2][0]) * rates[1] +
							(backets[2][2] - backets[2][1]) * rates[2] +
							(backets[2][3] - backets[2][2]) * rates[3] +
							(backets[2][4] - backets[2][3]) * rates[4] ;
				else 
					tax=backets[2][0] * rates[0]+
							(backets[2][1] - backets[2][0]) * rates[1] +
							(backets[2][2] - backets[2][1]) * rates[2] +
							(backets[2][3] - backets[2][2]) * rates[3] +
							(backets[2][4] - backets[2][3]) * rates[4] +
							(taxableIncome - backets[2][4]) * rates[5] ;
					
			}
			else if(status==3) {
				if(taxableIncome<=11950)
					tax=backets[3][0] * rates[0];
				else if(taxableIncome<=45500)
					tax=11950*0.1+(taxableIncome-11950)*0.15;
				else if(taxableIncome<=117450)
					tax=11950*0.1+(45500-11950)*0.15+(taxableIncome-45500)*0.25;
				else if(taxableIncome<=190200)
					tax=11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(taxableIncome-117450)*0.28;
				else if(taxableIncome<=372950)
					tax=11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(190200-117450)*0.28+(taxableIncome-190200)*0.33;
				else
					tax=backets[3][0] * rates[0]+
							(backets[3][1] - backets[3][0]) * rates[1] +
							(backets[3][2] - backets[3][1]) * rates[2] +
							(backets[3][3] - backets[3][2]) * rates[3] +
							(backets[3][4] - backets[3][3]) * rates[4] +
							(taxableIncome - backets[3][4]) * rates[5];
			}
			else {
				System.out.println("Error: invalid status");
				System.exit(1);
			}
			
			System.out.println("Tax is "+(int)(tax * 100) / 100.0);	
	
		input.close();
	}

}
