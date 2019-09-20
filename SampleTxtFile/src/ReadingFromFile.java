import java.io.*;
import java.util.Scanner;
public class ReadingFromFile {

    static String fileName = "HereItIs.txt";	
	static String line = null;
	static String wordList[] = new String [10];
	static boolean readingSynonyms = true;
	static boolean readingCommands = false;
	static String tempCommand = "";
	static String theCommand = "";
	
	public static void FindNextSlot(){
		
		Scanner StringInput = new Scanner(System.in);

		System.out.println("Input test:");
		
		String theInput = StringInput.nextLine();
	
        // The name of the file to open.


        // This will reference one line at a time


        try 
        	{
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while(((line = bufferedReader.readLine()) != null)) 
            	{
                wordList = line.split(", ");
                tempCommand = wordList[0];
                if(line.equals("Commands:"))
                		{
                	readingSynonyms = false;
                	readingCommands = true;
                			
                		}
                
                for(String s: wordList) {
                	
                	if(s.equals(theInput)) {
                		theCommand = wordList[0];
                		
                	}
                	
                	
                	
                }
                
                if(readingCommands)
                
                for(String s: wordList) {
                	
                	if(s.equals(theCommand)) {
                		 System.out.println(wordList[1]);
                		
                	}
                	
                	
                	
                }

	
	
	
                
                
                
                
            	}	
            
            
            
            
            readingSynonyms = true;
            readingCommands = false;
            

            // Always close files.
            bufferedReader.close();			
        	}
        catch(FileNotFoundException ex) 
        	{
            System.out.println(
                "Unable to open file '" + fileName + "'");				
        	}
        catch(IOException ex) 
        	{
            System.out.println(
                "Error reading file '" + fileName + "'");					
            // Or we could just do this: ex.printStackTrace();
        	}
		
	}
	
}
