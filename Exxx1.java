public class Exxx1
{ public static void main (String args[])
 {
	 int t[]={1,2,3,4,5};
	 System.out.println("avant de transformer en zero");
	 Util1.affiche(t);
	 System.out.println("apres de transformer");
	 Util1.raz(t);
	 Util1.affiche(t);
	 
 }
}
class Util1
{ static void raz(int t[]){
	for(int i=0 ; i<t.length ; i++){
		t[i]=0;
	}
}
  static void affiche(int t[]){
	  for(int i=0; i<t.length; i++){
		  System.out.println(t[i]);
	  }
  }
}
  int t[]={ 1, 3, 5, 7} ;
 System.out.print ("t avant : ") ;
 Util.raz (t) ;
 Util.affiche (t) ;
 System.out.print ("t avant : ") ;
 Util.afect(t);
 Util.affiche (t) ;
 System.out.print ("\nt apres : ");
 Util.affiche (t) ;
 Util.affiche (t) ;
 }
}
class Util   //ecrire raz quon a utiliser au dessus
{
	static void raz (int t[]){
		 for(int i=0 ; i<t.length ; i++)
			t[i]=0;
	}
	static void affiche (int t[]){
		 for(int i=0 ; i<t.length ; i++)
			System.out.println(t[i]);
	}	
	static void afect (int t[]){
		for(int i=0 ; i<t.length ; i++)
			t[i]=4;
	}
}
	
//

