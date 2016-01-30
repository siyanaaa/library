import java.io.*;
import java.util.*;

public class data_parser{

    private static void agent() throws Exception{
	File file_in = new File("data.csv");
	FileInputStream fis = new FileInputStream(file_in);
	InputStreamReader isr = new InputStreamReader(fis);
	BufferedReader br = new BufferedReader(isr);

	//String[][] data;
	String line;

	System.out.println("INSERT INTO `jtform_agent`(`id`, `division`, `division_name`, `unit`, `agent_code`, `producer_name`, `tiers`, `sex`, `num_of_guest_contest`, `num_of_guest_barcelona`, `guest_total`, `hotel`, `airline`, `airline_class`, `cx`, `cx_econ`, `cx_bis`, `swiss_air`, `lx_econ`, `lx_bis`) VALUES ");
       
	for (;;) {
	    
	    line = br.readLine();
	    if (line == null) {  break; }
	    
	    String[] lineArray = line.split(",", -1);	   

	    if (lineArray[1].length() > 0 ){

		System.out.print("\n( ");

	
		for (int i = 0; i < lineArray.length; i++){
		    System.out.print("'" + lineArray[i] + "'" );
		    if ( i < 19 ) { System.out.print(", " ); }
		}

		System.out.print(") , \n");
	    }
	}
	br.close();
	fis.close();
	//System.out.println("close stream");
    }

    private static void companion() throws Exception{
	File file_in = new File("data.csv");
	FileInputStream fis = new FileInputStream(file_in);
	InputStreamReader isr = new InputStreamReader(fis);
	BufferedReader br = new BufferedReader(isr);

	String line;

	System.out.println("INSERT INTO `jtform_agent_companion`( `id`, `tiers`, `sex`, `cx`, `cx_econ`, `cx_bis`, `swiss_air`, `lx_econ`, `lx_bis`) VALUES ");
       
	for (;;) {
	    
	    line = br.readLine();
	    if (line == null) {  break; }
	    
	    String[] lineArray = line.split(",", -1);	   

	    if (lineArray[1].length() > 0 ){

		System.out.print("\n( ");

	
		for (int i = 0; i < lineArray.length; i++){
		    System.out.print("'" + lineArray[i] + "'" );
		    if ( i < 19 ) { System.out.print(", " ); }
		}

		System.out.print(") , \n");
	    }
	}
	br.close();
	fis.close();
	//System.out.println("close stream");
    }
    
    public static void main(String[] args) throws Exception {
	//agent();
	companion();
	
    }
}
