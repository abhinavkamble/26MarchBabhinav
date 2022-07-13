package StringClassStudy;

public class StringUse1 
{

	public static void main(String[] args) 
	{
		System.out.println("Using Length() method");
		//1.Constant Pool Area-Without using new Keyword
		String State = "Maharashtra";
		
		//Length() method use ---this gives int in return
		System.out.println(State.length());	                        //to read the execution 
	    int result = State.length();                                //to store in referance veriable
	    System.out.println("The length of Maharashtra is --"+result); //to reuse the referance variable
				
		//2.Non-Constant Pool Area-With using new Keyword
		String City = new String("Latur");
		
		//length() method use
		System.out.println(City.length());                           //to read the execution
		int result1 = City.length();                                 //to store in referance veriable
		System.out.println("The length of Maharashtra is --" +result1); //to reuse the referance variable
		
		System.out.println("***************************************");
		System.out.println("Using UpperCase() method");
		
		//2.touppercase() method use----this gives string in return
		
		String p ="International";
		System.out.println(p);	                                 //to read the execution	
		System.out.println(p.toUpperCase());                     //to read the execution
		String Name = p.toUpperCase();                           //to store in reference variable
		System.out.println("Using to UpperCase Method --"+Name); //to reuse the reference variable
		
		System.out.println("***************************************");
		System.out.println("Using LowerCase() method");
		
		//3.toLowerCase() method use----this gives string in return
		
		String q ="Pakistan";
		System.out.println(q);                                    //to read the execution
		System.out.println(q.toLowerCase());                      //to read the execution
		String name1 = q.toLowerCase();                           //to store in referance veriable
		System.out.println("Using to LowerCase Method --"+name1); //to reuse the referance variable
		
		System.out.println("***************************************");
		System.out.println("Using Equals() method");
		
		//4.equals() method use ----this gives
		
		String P1 ="Afganistan";
		String P2 ="Afganistan";
		String P3 =new String("Afganistan");
		String P4 =new String("Afganistan");
		String P5 =new String("afganistan");
				
		// "==" it will compare the memory location 
		System.out.println(P1==P2);  //true bcz both have same memory location
		System.out.println(P3==P4);  //false bcz due to use of new keyword both have different memory location
		System.out.println(P4==P5);  //false bcz due to use of new keyword both have different memory location
		System.out.println(P1==P3);  //false bcz due to use of new keyword both have different memory location
		System.out.println(P2==P4);  //false bcz due to use of new keyword both have different memory location
		
		System.out.println("***************************************");
		// "equal" it will compare the Content of String
		System.out.println(P1.equals(P2));  //true bcz name(Content) is same in both methods
		System.out.println(P2.equals(P3));  //true bcz name(Content) is same in both methods
		System.out.println(P3.equals(P4));  //true bcz name(Content) is same in both methods
		System.out.println(P4.equals(P5));  //false bcz name(Content) is not same in both methods
		System.out.println(P4.equalsIgnoreCase(P5));  //true bcz only cosideration of length and charactors
		
		System.out.println("***************************************");
		System.out.println("Using contains() method");
		
		//5.contains() method use-- sequence of charactors is imp //it return boolean
		
		String b= "Shrilanka";
		System.out.println(b.contains("la"));  //it is true bcz here la is present in content with same sequence
		System.out.println(b.contains("Sa"));  //it is false bcz here la is present in content but not with same sequence
		boolean state = b.contains("la");      //to store in referance veriable 
		System.out.println("charactors are used in Shrilanka --"+state); //to reuse the referance variable
		
		System.out.println("***************************************");
		System.out.println("Using IsEmpty() method");
		
		// is Empty() method use ---it returns boolean value
		// is Blank() method use ---it returns boolean value
		
		String x="Abhinav";
		String y="  ";
		String z="";
		//String w=null;
		
		System.out.println(x.isEmpty());            //false bcoz charactors are present
		System.out.println(y.isEmpty());            //false bcoz space consder as smething is there
		System.out.println(z.isEmpty());            //true bcoz it is fully empty
		//System.out.println(w.isEmpty());          //when u declear as null then it show null pointer exception
		System.out.println("Using IsBlank() method");
		
		System.out.println(x.isBlank());            //false bcoz charactors are present
		System.out.println(y.isBlank());            //true bcoz charactors are not present
		System.out.println(z.isBlank());            //true bcoz it is fully empty
		System.out.println("Using Length() method");
		
		System.out.println(x.length());             //shows charactors length 
		System.out.println(y.length());             //space consder as smething is there 
		System.out.println(z.length());             //zero bcoz it is fully empty
		
		System.out.println("***************************************");
		System.out.println("Using CharAt() method");
		
		//charAt() method use---return the Char--shows position of charactors by number
		 String F="Africa";
		 
		 System.out.println(F.charAt(3));                            //to read the execution
		 char digit =F.charAt(3);                                    //to store in referance veriable
		 System.out.println("charactor at 3 rd place is  --"+digit); //to reuse the referance variable
		// System.out.println(F.charAt(6));   // it is beyound limit so it shows StringIndexOutOfBoundsException
		 System.out.println(F.charAt(0));
		 
		 System.out.println("***************************************");
		 System.out.println("Using endsWith() method");
		 
		 //EndsWith() method Use-----when shows end letters then it is true else false--case sensative
		 String h="Gujrat";
		 System.out.println(h.endsWith("at"));
		 System.out.println(h.endsWith("jr"));
		 
		 //StartWith() metod use 
		 
		 System.out.println(h.startsWith("Gu"));
		 System.out.println(h.startsWith("jr"));
		 
		 
		 System.out.println("***************************************");
		 System.out.println("Using SubString() method");
		 
		 //substring() method use---it will print remaining line from decleared index
		 
		 String i="Board of Cricket Council India";
		 
		 System.out.println(i.substring(6));
		 System.out.println(i.substring(6,15));  //use to print from index to to index
		 
		 System.out.println("***************************************");
		 System.out.println("Using ConCat() method");
		 
		 //ConCat() method use ---it will use to combine two or more than two string objects
		 
		 String u= "Mumbai";
		 String v="Indians";
		 
		 System.out.println(u.concat(" ").concat(v));
		 
		 System.out.println("***************************************");
		 System.out.println("Using indexOf() method");
		 
		 //indexOf Method Use ---it Will show index using declearation of charactor
		 
		 String w="Concatination";
		 System.out.println(w.indexOf('c'));      //execution starts from start ,which letter comes 1st execute that
		 System.out.println(w.indexOf('n',5));    //same charactor are present ,insert boundry index 
		 System.out.println(w.lastIndexOf('t'));  //execution starts from last ,which letter comes 1st execute that 
		 
		 System.out.println("***************************************");
		 System.out.println("Using Replace() method");
		 
		 //replace() method use --- it replaces the charactors or group of charactors 
		 
		 String  o= "Gujrat Titans";
		 
		 System.out.println(o.replace("ra", "  "));
		 
		 
		 
		 
		 
		
		
		
		
		
		
		

	}

}
