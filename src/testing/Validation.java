package testing;

public class Validation {
public boolean verifdiv(int b)
{
return b!=0;
// if(b!=0) return true else return false;


}
public boolean conversible(String a)
{
	try
	{
		Integer.parseInt(a);
		return true;
	}
	catch(Exception ex)
	{
		return false;
	}
	

}
public boolean verifsup(int a,int b)
{
if(a>b)
	return true;
else 
	return false;
}
public boolean verifdiff(int a, int b)
{
return a!=b;	
}
public boolean verifparite(int p)
{
if(p%2==0)
	return true;
else return false;

}
public boolean verifEmpty(String chaine)
{
return 	chaine.isEmpty();

}
public double factoriel(int f)
{
double fact=1;
for(int i=2;i<=f;i++)
{
fact*=i;	

}
return fact;
}



}
