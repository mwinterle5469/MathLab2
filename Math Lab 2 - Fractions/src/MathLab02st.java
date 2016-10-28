// MathLab02st.java
// The Rational Class Program I
// This is the student, starting version of the MathLab02 assignment.


import javax.swing.JOptionPane;


public class MathLab02st
{
	public static void main (String args[])
	{   
		String strNbr1 = JOptionPane.showInputDialog("Enter Numerator "); 
		String strNbr2 = JOptionPane.showInputDialog("Enter Denominator ");

		int num = Integer.parseInt(strNbr1);
		int den = Integer.parseInt(strNbr2);

		Rational r = new Rational(num,den);
		JOptionPane.showMessageDialog(null,r.getNum()+"/"+r.getDen()+" equals "+r.getDecimal());
          
		System.exit(0);
	}
}

				

class Rational
{
		private int num, den;
//	Rational
	public Rational(int n, int d)
	{
		num = n;
		den = d;
	}
//	getNum
	public int getNum()
	{
		return num;
	}
//	getDen
	public int getDen()
	{
		return den;
	}
//	getDecimal
	public double getDecimal()
	{
		return num/den;
	}
//	getRational 
	public String getRational()
	{
		return num + "/" + den;
	}
	
//	getOriginal
	public int getOriginal()
	{
		
	}
//	reduce

	public Rational(int num, int den) {
		// TODO Auto-generated constructor stub
	}

	public String getDecimal() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDen() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNum() {
		// TODO Auto-generated method stub
		return null;
	}

	private int getGCF(int n1,int n2)
	{
		int rem = 0;
		int gcf = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
		return gcf;
	} 
}



	

 


