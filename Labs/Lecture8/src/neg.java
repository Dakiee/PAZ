public class neg
{  
static boolean isPerfectNumber(int num)  
{  
int sum = 1;  
for (int i = 2; i * i <= num; i++)  
{  
if (num % i==0)  
{  
if(i * i != num)  
sum = sum + i + num / i;  
else    
sum = sum + i;  
} 
} 
if (sum == num && num != 1)  
return true;  
return false;  
}   
public static void main (String args[])  
{  
System.out.println("1s 9999 hurtelh tugs too ni ");  
for (int n = 1; n < 9999; n++)  
if (isPerfectNumber(n))  
System.out.println(n +" bol tugs too");  
}  
} 