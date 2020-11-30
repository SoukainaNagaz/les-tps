import java.util.Scanner;
class Exx1{
  public static void main(String[] args){
int t[]=new int[3] ;
Scanner pu=new Scanner(System.in);
for (int i=0 ; i<3 ; i++){
	int a=pu.nextInt();
	int t[i]=a;
}
System.out.println(" "+t[i]);
}
}
int t2[]=new int[2] ;
for (int j =0 ; j<2 ; j++) t2[j]=10 + j;{
System.out.println(" "+t2[j]);
}
public class Exxx1
{ public static void main (String args[])
 { Point tp[];
 tp=new Point[3];
 tp[0]=new Point (1, 2);
 tp[1]=new Point (4,3);
 tp[2]=new Point (6,8);
 for(int i=0 ; i<tp.length ; i++)
 tp[i].affiche() ;
 }
}

class Exx1{
  public static void main(String[] args){
  int a[]={1,2,053,4};
  int b[][]={{1,2,4},{2,2,1},{0,43,2},{45,7,8}};
  System.out.println(a[1]==b[2][2]);
  System.out.println(" "+b[2][1]);
}
}
class Point
{
	public Point(int x, int y)
 {
	 this.x=x ; this.y=y ;
 }
 public void affiche ()
 { 
 System.out.println ("Point : " + x + ", " + y) ;
 }
 private int x, y ;
}