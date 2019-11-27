import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main{
	public static void main (String[]args){
		String vara="";
		Programa prog = new Programa();
		try{
			Scanner ler=new Scanner(new FileInputStream("test.txt"));
			while(ler.hasNextLine()){
				String linha =ler.nextLine();
				vara+=linha;
			}
			ler.close();
		}catch(FileNotFoundException e){
			System.out.println("arquivo não encontrado");
		}
		prog.toToken(vara);
	}

}