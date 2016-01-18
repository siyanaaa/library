import java.io.*;
import java.util.*;

public class data_parser {

    public static void main(String args[]){
	try {
	    File file_in = new File("data.csv");
	    FileInputStream fis = new FileInputStream(file_in);
	    InputStreamReader isr = new InputStreamReader(fis);
	    BufferedReader br = new BufferedReader(isr);

	    String line;
	    
	    String num;
	    String division;
	    String division_name;
	    String unit;
	    String agent_code;
	    String producer_name;
	    String tiers;
	    String sex;
	    String guest_contest;
	    String guest_barcelona;
	    String empty1;
	    String guest;
	    String hotel;
	    String airline;
	    String air_class;
	    String empty2;
	    String cx;
	    String cx_econ;
	    String cx_bis;
	    String swiss_air;
	    String lx_econ;
	    String lx_bis;

	    for (;;) {
		line = br.readLine();
		if (line == null) {
		    break;
		    
		}

		String[] lineArray = line.split(",", -1);
		//System.out.println(lineArray.length+" "+lineArray[lineArray.length-1] );
		if (lineArray[0] != null){ num = lineArray[0]; }
		division = lineArray[1];
		division_name = lineArray[2];
		unit = lineArray[3];
		agent_code = lineArray[4];
		producer_name = lineArray[5];
		tiers = lineArray[6];
		sex = lineArray[7];
		guest_contest = lineArray[8];
		guest_barcelona = lineArray[9];
		empty1 = lineArray[10];
		guest = lineArray[11];
		hotel = lineArray[12];
		airline = lineArray[13];
		air_class = lineArray[14];
		empty2 = lineArray[15];
		cx = lineArray[16];
		cx_econ = lineArray[17];
		cx_bis = lineArray[18];
		swiss_air = lineArray[19];
		lx_econ = lineArray[20];
		lx_bis = lineArray[21];
		
		System.out.println(num+" "+division+" "+division_name+" "+unit);

	    }

	    br.close();
	    fis.close();
	    System.out.println("close stream");
	} catch (IOException ex){
	    System.err.println("Problem doing I/O");
	    System.err.println(ex.getMessage());
	    System.exit(1);
	}

    }
}
