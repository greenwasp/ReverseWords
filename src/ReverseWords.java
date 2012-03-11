import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class ReverseWords {
	private String fName;
	
	ReverseWords(){
		
		
	}
	private void SetFileName(String name){
		fName = name;
	}
	private Scanner readFromFile(){
		Scanner scanner=null;
		try
		{
			FileReader fReader = new FileReader(fName);//this.fileName contains the name of file passed as command line argument
	        scanner= new Scanner (fReader);
		
		}
		catch(FileNotFoundException ex){
			System.out.println("File " + fName + " not Found. Program will exit.");
			System.out.println("Execute again and provide proper file name with entire path.");
			System.exit(0);
			return null;
		}
	    return scanner;
	}
	
	private void ProcessLines(){
		Scanner fScanner = readFromFile();
		
		while(fScanner.hasNextLine()){
			if(fScanner.hasNext()){
				
				String first = fScanner.next();
				String second = fScanner.next();
				if(first != " " || first != null){
					System.out.print(second + " "+first);
					System.out.println();
				}
				
			
				
			}
			
			if(fScanner.hasNextLine()){
				fScanner.nextLine();
			}
			
		}
		
	}
	public static void main(String[] args){
		
		ReverseWords rw = new ReverseWords();
		
		String fileName = null;
		//System.out.println("the value of args[0] is "+args[0]);
		//fileName = "E:\\input.txt";
		fileName = args[0];
		rw.SetFileName(fileName);
		//rw.readFromFile();
		rw.ProcessLines();
	    
	}

}
