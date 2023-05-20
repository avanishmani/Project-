package com.Recursion;

public class StringMultiplication {
	 public static String multiply(String num1, String num2) {
	 String res="";
     int c=0;
     String z="";
     if(num1.equals("0") || num2.equals("0")) return "0";
     if(num1.length()==1 && num2.length()==1) {
         int num = Integer.parseInt(num1)*Integer.parseInt(num2);
         return Integer.toString(num);
     }
     int min = num1.length()<num2.length()?num1.length():num2.length();
     String[] arr = new String[min];
     for(int i=0;i<min;i++) arr[i]="";
     if(min==num1.length()) {
         for(int i=num1.length()-1;i>=0;i--) {
             c=0;
             for(int j=num2.length()-1;j>=0;j--) {
                 int num= c+((num1.charAt(i)-'0') * (num2.charAt(j)-'0'));
                 arr[i] = Integer.toString(num%10)+arr[i];
                 c=num/10;
             }
             if (c!=0) arr[i] = Integer.toString(c)+arr[i];
             arr[i] = arr[i]+z;
             z=z+"0";
         }
     } else if(min==num2.length()) {
         for(int i=num2.length()-1;i>=0;i--) {
             c=0;
             for(int j=num1.length()-1;j>=0;j--) {
                 int num= c+((num2.charAt(i)-'0') * (num1.charAt(j)-'0'));
                 arr[i] = Integer.toString(num%10)+arr[i];
                 c=num/10;
             }
             if (c!=0) arr[i] = Integer.toString(c)+arr[i];
             arr[i] = arr[i]+z;
             z=z+"0";
         }
     }
     int max=0;
     for(String str:arr) if(str.length()>max)max=str.length();
     for(int i=0;i<arr.length;i++) {
         int diff=max-arr[i].length();
         while(diff!=0) {
             arr[i]="0"+arr[i];
             diff--;
         }
     }
     c=0;
     int sum=0;
     for(int i=max-1;i>=0;i--) {
         sum=0;
         for(int j=0;j<arr.length;j++) {
             sum+=(arr[j].charAt(i)-'0');
         }
         sum=sum+c;
         res = Integer.toString((sum)%10)+res;
         c=sum/10;
         sum =sum%10;
     }
     if(c!=0) res = Integer.toString(c)+res;
     for(String i:arr) System.out.println(i);
     return res;
 }

  public static void main(String[] args) {
	System.out.println(multiply("6","6"));
}
}
