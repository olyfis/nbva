package com.olympus.nbva;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.apache.poi.ss.formula.functions.FinanceLib;

/***************************************************************************************************************************************/
/*
	Parameters:
	rate - rate
	term - num of periods
	payPeriod - pmt per period
	fv - future value
	type - type (true=pmt at end of period, false=pmt at beginning of period)
*/
/***************************************************************************************************************************************/

public class FinCalcTest {
	// usage: dRtn = roundDouble(dVal, "UP", "0.00");
	public static double roundDouble(double value, String direction, String fmt) {
		
		DecimalFormat df = new DecimalFormat(fmt);
		double dVal = 0.0;
		
		if (direction.equals("DOWN")) {
			df.setRoundingMode(RoundingMode.DOWN);
		} else {
			df.setRoundingMode(RoundingMode.UP);
		}
		String dStr = df.format(value);
		dVal = Double.parseDouble(dStr);
		
		return(dVal);
	}
	
/***************************************************************************************************************************************/
	// type - type (true=pmt at beginning of period, false=pmt at end of period)
public static  double getPV(double rate, double term, double payPeriod, double fv, boolean type) {
	Double dRtn = 0.0;
	Double dVal = FinanceLib.pv(rate, term, payPeriod, fv, type);
	dRtn = roundDouble(dVal, "UP", "0.00");
	return (dRtn);	 
	}	 
	
/***************************************************************************************************************************************/

/***************************************************************************************************************************************/

public static void main(String[] args) {
		
	double pvRtn = 0.0;		 
	double rate = 0.0725;
    double term = 36.0;
    double payPeriod = -26700.74;
    double fv = 460943.00;
    boolean type = false;
         
    pvRtn =  getPV( rate, term, payPeriod, fv, type);
    System.out.println("pvRtn=" + String.format( "%.2f", pvRtn ) + "--");
         
}
/***************************************************************************************************************************************/

}
