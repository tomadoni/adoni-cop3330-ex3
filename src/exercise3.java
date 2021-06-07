import java.util.Scanner;
class Main {

    public static void main(String[] args) {
	    Scanner kb= new Scanner(System.in);
	    String a="";
	    String b="";
		System.out.println("What is the quote?");
		a=kb.nextLine();
		System.out.println("Who said it?");
		b=kb.nextLine();
	    System.out.println(b+" says, '"+a+"'");
    }
}
