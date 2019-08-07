


public class Equations {
	
	// p1(t)
	// t=2,t=3,t=4,t=5
	public double equ_1(double a,double b,double c,double d,double aa,double bb,double cc,double dd,int t2){
		double p=-(a+b+c+d+aa+bb+cc+dd)*t2;
		double p_1=Math.exp(p);
		
		 double total= p_1;
		
			
		 return total;
		 
	}
	//Equations e=new Equations();
		 
//e.equ_1(0.10, 0.20, 0.30, 0.40, 0.015, 0.025, 0.035, 0.045);
	//p2(t)
public double equ_2(double a,double b,double c,double d,double aa,double bb,double cc,double dd,int t){
		
	double p=-(a+b+c+d+aa+bb+cc+dd)*t;
		
		double p_1=Math.exp(p);
		double p_2=Math.exp(p);
		
		
		 double total=-p_1+p_2;
			
			return total;
		 
	}
//p4(t)
public double equ_3(double a,double b,double c,double d,double aa,double bb,double cc,double dd,int t){
	
	double p=-(a+b+c+d+aa+bb+cc+dd)*t;
	
	double pi=-(a+b+d+aa+bb+dd)*t;
		
		double p_1=Math.exp(p);
		double p_2=Math.exp(pi);
		
		
		double total=-p_1+p_2;
		
		return total;
	}
	//p5(t)
public double equ_4(double a,double b,double c,double d,double aa,double bb,double cc,double dd,int t){
	
	double p=-(a+b+c+d+aa+bb+cc+dd)*t;
	
	double pi=-(a+b+c+aa+bb+cc)*t;
		
		double p_1=Math.exp(p);
		double p_2=Math.exp(pi);
		
		
		double total= -p_1+p_2;
	
		return total;
		
	}
	//p6(t)
public double equ_5(double a,double b,double c,double d,double aa,double bb,double cc,double dd,int t){
	//
	
	double div=b*bb;
	double div1=a*aa+b*bb;
	double div3=div/div1;
	
	
	double p=-(a+b+c+d+aa+bb+cc+dd)*t;
double pi=-(a+b+c+aa+bb+cc)*t;
	double div2=a*aa;
	double div4=a*aa+b*bb;
	double div5=div2/div4;
	
	double piii=-(c+d+cc+dd)*t;
 double  p_1=Math.exp(p);
 double p_2=Math.exp(pi);
 double p_3=Math.exp(piii);
 
 double total=div3*p_1+p_2+div5*p_3;
 System.out.println(total);
/*System.out.println("p6"+" " +total);
	System.out.println("t3"+" " +total);
	System.out.println("t4"+" " +total);
	System.out.println("t5"+" " +total);*/
 return total;
	

	}
//p7(t)
public double equ_6(double a,double b,double c,double d,double aa,double bb,double cc,double dd,int t){
	//

	double div=c*cc;
	double div1=b*bb+c*cc;
	double div3=div/div1;
	//

	
	double p=-(a+b+c+d+aa+bb+cc+dd)*t;
	
double pi=-(a+c+d+aa+cc+dd)*t;
	double div2=b*bb;
	double div4=b*bb+c*cc;
	double div5=div2/div4;
	
	double piii=-(a+d+aa+dd)*t;
 double  p_1=Math.exp(p);
 double p_2=Math.exp(pi);
 double p_3=Math.exp(piii);
 
 double total=div3*p_1-p_2+div5*p_3;

	/*System.out.println("p7"+" " +total);
	System.out.println("t3"+" " +total);
	System.out.println("t4"+" " +total);
	System.out.println("t5"+" " +total);*/
 return total;
	
	
}
//p8(t)
public  double equ_7(double a,double b,double c,double d,double aa,double bb,double cc,double dd,int t){
	//

	double div=d*dd;
	double div1=c*cc+d*dd;
	double div3=div/div1;
	//

	
	double p=-(a+b+c+d+aa+bb+cc+dd)*t;
	
double pi=-(a+b+d+aa+bb+dd)*t;
	double div2=c*cc;
	double div4=c*cc+d*dd;
	double div5=div2/div4;
	
	double piii=-(a+b+aa+bb)*t;
double  p_1=Math.exp(p);
double p_2=Math.exp(pi);
double p_3=Math.exp(piii);

double total=div3*p_1-p_2+div5*p_3;
/*System.out.println("p8"+" " +total);
System.out.println("t3"+" " +total);
System.out.println("t4"+" " +total);
System.out.println("t5"+" " +total);*/
return total;
	
	
}
//p9(t)
public double equ_8(double a,double b,double c,double d,double aa,double bb,double cc,double dd,int t){
	//

	double div=a*aa;
	double div1=a*aa+c*cc;
	double div3=div/div1;
	//

	
	double p=-(a+b+c+d+aa+bb+cc+dd)*t;
	
double pi=-(a+b+c+aa+bb+cc)*t;
	double div2=c*cc;
	double div4=a*aa+b*bb;
	double div5=div2/div4;
	
	double piii=-(b+c+bb+cc)*t;
double  p_1=Math.exp(p);
double p_2=Math.exp(pi);
double p_3=Math.exp(piii);

double total=div3*p_1-p_2+div5*p_3;

/*System.out.println("p9"+total);
System.out.println("p9"+total);
System.out.println("p9"+total);
System.out.println("p9"+total);*/
return total;
	
	
}
//p10(t)
public double equ_9(double a,double b,double c,double d,double aa,double bb,double cc,double dd,int t){
double div=b*c*bb*cc;
double div1=a+b+aa+bb;
double div2=a+b+c+aa+bb+cc;
double div3=div/div1*div2;

double p=-(a+b+c+d+aa+bb+cc+dd)*t;
double p1=Math.exp(p);



double div4=c*cc;
double div5=b+bb+c+cc;
double div6=div4/div5;
double p2=-(b+c+d+bb+cc+dd)*t;
double p3=Math.exp(p2);


double div7=a*aa*d*dd;
double div8=b+bb+c+cc;
double div9=div7/div8;

double p4=-(b+c+bb+cc)*t;
double p5=Math.exp(p4);


double div10=b*bb*c*cc;
double div11=a+b+aa+bb;
double div12=a+b+c+aa+bb+cc;
double result=div10/div11*div12;




double div13=c*cc;
double div14=b+c+bb+cc;
double result1=div13/div14;

double div15=a*aa*c*cc;
double div16=c+cc;
double div17=b+c+bb+cc;
 double result2=div15/div16*div17;
 
 
 
 double p6=-(d+dd)*t;
 double p7=Math.exp(p6);
 
 double total=-div3*p1+div6*p3+div9*p5-(result-result1+result2)*p7;

 /*System.out.println("p10"+total);
 System.out.println("p10"+total);
 System.out.println("p10"+total);
 System.out.println("p10"+total);*/
return total;
	

}

//p11(t)
public double equ_10(double a,double b,double c,double d,double aa,double bb,double cc,double dd,int t){
	//first

	double div=c*d*cc*dd;
	double div1=(b+c+bb+cc)*(b+c+d+bb+cc+dd);
	double div3=div/div1;
	//
	
	
	double p=-(a+b+c+d+aa+bb+cc+dd)*t;
	
	double expo=Math.exp(p);
	
	//second
	double div4=d*dd;;
	double div5=c+cc+d+dd;
	
	double div6=div4/div5;
	double pi=-(a+c+d+aa+cc+dd)*t;
 double ex=Math.exp(pi);
 
	//thrid
	double div7=b*bb*d*dd;
	double divs=d+dd;
	double div8=b+bb+c+cc;
	double div9=div7/divs*div8;
	
	double piii=-(a+d+aa+dd)*t;
	 double expo1=Math.exp(piii);
	 
	//fourth
	 
	 double div10=b*bb*c*cc;
	double div11=(a+b+aa+bb);
	double div12=(a+b+c+aa+bb+cc);
	double result=div10/div11*div12;
	//
	double div13=c*cc;
	double div14=b+c+bb+cc;
	double result1=div13/div14;
	//
	double div15=a*aa*d*dd;
	double div16=d+dd;
	double div17=b+c+bb+cc;
	double result2=div15/div16 *div17;
	//
	double value=-(d+dd)*t;
	double exp=Math.exp(value);
	
	//final
	double total=-div3*expo+div6*ex-div9*expo1-(result-result1+result2)*exp;	
;
	/*System.out.println("p11"+total);
	 System.out.println("p11"+total);
	 System.out.println("p11"+total);
	 System.out.println("p11"+total);*/
return total;
	

}
//p12(t)
public double equ_11(double a,double b,double c,double d,double aa,double bb,double cc,double dd,int t){
	//first

	double div=c*d*cc*dd;
	double div1=(b+c+bb+cc)*(b+c+d+bb+cc+dd);
	double div3=div/div1;
	//
	
	double p=-(a+b+c+d+aa+bb+cc+dd)*t;
	
	double expo=Math.exp(p);
	
	//second
	double div4=d*dd;;
	double div5=c+cc+d+dd;
	
	double div6=div4/div5;
	double pi=-(a+c+d+aa+cc+dd)*t;
double ex=Math.exp(pi);

	//thrid
	double div7=b*bb*d*dd;
	double divs=d+dd;
	double div8=b+bb+c+cc;
	double div9=div7/divs*div8;
	
	double piii=-(a+d+aa+dd)*t;
	 double expo1=Math.exp(piii);
	 
	//fourth
	 
	 double div10=b*bb*c*cc;
	double div11=(a+b+aa+bb);
	double div12=(a+b+c+aa+bb+cc);
	double result=div10/div11*div12;
	//
	double div13=c*cc;
	double div14=b+c+bb+cc;
	double result1=div13/div14;
	//
	double div15=a*aa*d*dd;
	double div16=d+dd;
	double div17=b+c+bb+cc;
	double result2=div15/div16 *div17;
	//
	double value=-(d+dd)*t;
	double exp=Math.exp(value);
	
	//final
	double total=-div3*expo+div6*ex-div9*expo1-(result-result1+result2)*exp;

	/*System.out.println("p12"+total);
	 System.out.println("p12"+total);
	 System.out.println("p12"+total);
	 System.out.println("p12"+total);*/
return total;
	

}
//p13(t)
public double equ_12(double a,double b,double c,double d,double aa,double bb,double cc,double dd,int t){
	//first

	double div=c*d*cc*dd;
	double div1=(c+d+cc+dd)*(a+c+d+aa+cc+dd);
	double div3=div/div1;
	//
	
	
	double p=-(a+b+c+d+aa+bb+cc+dd)*t;
	
	double expo=Math.exp(p);
	
	//second
	double div4=a*aa;
	double div5=a+aa+d+dd;
	
	double div6=div4/div5;
	double pi=-(a+b+d+aa+bb+dd)*t;
double ex=Math.exp(pi);

	//third
	double div7=a*aa*c*cc;
	double divs=a+aa;
	double div8=c+cc+d+dd;
	double div9=div7/divs*div8;
	
	double piii=-(a+d+aa+dd)*t;
	 double expo1=Math.exp(piii);
	 
	//fourth
	 
	 double div10=a*aa*c*cc;
	double div11=(c+d+cc+dd);
	double div12=(a+c+d+aa+cc+dd);
	double result=div10/div11*div12;
	//
	double div13=a*aa;
	double div14=a+d+aa+dd;
	double result1=div13/div14;
	//
	double div15=a*aa*c*cc;
	double div16=a+aa;
	double div17=c+d+cc+dd;
	double result2=div15/div16 *div17;
	//
	double value=-(b+bb)*t;
	double exp=Math.exp(value);
	
	//final
	double total=-div3*expo+div6*ex+div9*expo1-(result-result1+result2)*exp;
	/*System.out.println("p13"+" " +total);
	System.out.println("t3"+" " +total);
	System.out.println("t4"+" " +total);
	System.out.println("t5"+" " +total);*/
return total;
	

}
//p3(t)
public double equ_14(double a,double b,double c,double d,double aa,double bb,double cc,double dd,int t){
	
double p=-(a+b+c+d+aa+bb+cc+dd)*t;
	
	double pi=-(a+c+d+aa+bb+cc+dd)*t;
		
		double p_1=Math.exp(p);
		double p_2=Math.exp(pi);
		
		
		double total=-p_1+p_2;
		
		
	return total;

}
	}


