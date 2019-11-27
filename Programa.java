import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class Programa{
	
	public void toToken(String code) {
		String nome="";
		String anterior="";
		char c ;
		boolean abrechaves = false;
		
		double a;
		double b;
		double r = 0;



		ArrayList<String> list= new ArrayList();
		for(int i=0;i<code.length();i++){
			c=code.charAt(i);
			if  (c=='i'){
				nome+=c;
			}

			if (c=='f' && nome.equals("i")){
				nome+=c;
			}
			if(c=='('){
				list.add(nome);
				nome="";
				anterior="(";
			}

			if(anterior=="(" && c != '(' && c != ')'){
				nome+=c;

			}
			if(c==')'){
				list.add(nome);
				nome="";
				anterior="";
			}
			if(c=='{'){
				list.add(nome);
				nome="";
				anterior="{";
					abrechaves=true;
				
			}
			if(anterior=="{" && c != '{' && c != '}'){
				nome+=c;
			}
			if(c=='}'){
				list.add(nome);
				nome="";
				anterior="";
				abrechaves=true;
			}

			if(c=='e' && nome.equals("")){
				nome+="e";
			}
			if(c=='l' && nome.equals("e")){
				nome+="l";
			}
			if(c=='s'&& nome.equals("el")){
				nome+="s";
			}
			if(c=='e' && nome.equals("els")){
				nome+="e";
			}

			if(anterior.equals("=")){
				nome+=c;

			}
			if(c==';'){
				list.add(nome);
				anterior="";
				nome="";
			}

			if(c=='='){
				list.add(nome);
			 	anterior="=";
				nome="";
			}


			if (anterior.equals("var")){
				nome+=c;
			}
			if(c=='v'){
				nome+="v";
			}


			if(c=='a' && nome.equals("v")){
				nome+="a";
			}
			
			if(c=='r'&& nome.equals("va")){
				nome+="r";
				list.add(nome);
				nome="";
				anterior="var";
			}
			

			if(c=='w'){
				nome+="w";

			}
			
			if(c=='h' && nome.equals("w")){
				nome+="h";

			}
			
			if(c=='i'&& nome.equals("wh")){
				nome+="i";
			}
			
			if(c=='l'&& nome.equals("whi")){
				nome+="l";
			}
			
			if(c=='e'&&nome.equals("whil")){
				nome+="e";
			}


			if(c == '+'){

				a=(double) code.charAt(i-1) - '0';
				b=(double) code.charAt(i+1)- '0';
				r=a+b;
				System.out.println(r);
			}
		 	if(c=='-'){
				a=(double) code.charAt(i-1) - '0';
				b=(double) code.charAt(i+1)- '0';
				r = a-b;
				System.out.println(r);
			}
		 	if(c =='*'){
				a=(double) code.charAt(i-1) - '0';
				b=(double) code.charAt(i+1)- '0';
				r = a*b;
				System.out.println(r);
			}
			if(c =='/'){
				a=(double) code.charAt(i-1) - '0';
				b=(double)code. charAt(i+1)- '0';
				r = a/b;
				System.out.println(r);
			
			}
		 	if(c=='%'){
				a=(double) code.charAt(i-1) - '0';
				b=(double) code.charAt(i+1)- '0';
				r = a%b;
				System.out.println(r);
			}



			
			}


			for (int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
} 