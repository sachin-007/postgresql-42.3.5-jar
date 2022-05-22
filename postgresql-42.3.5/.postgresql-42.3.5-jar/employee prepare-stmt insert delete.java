import java.sql.*;
import java.io.*;

class JDBCDemoop
{
	
	public static void main(String args[]) throws SQLException
	{

	COnnection con=null; Statement st= null; ResultSet rs=null;
	PreparedStatement ps1=null,ps2=null;
	int eid, esal;
	String ename;
	BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	Class.forName("org.postgresql.Driver");
	con=DriverManager.getCOnnection("jdbc:postgresql:mydb","postgres","");
	st=conn.createStatement();
	ps1=con.prepareStatement("Insert into employee values(?,?,?)";
	ps2=con.prepareStatement("Enter the employee ID, employee name and employee salary to be inserted");
	eid = Integer.parseInt(br.readLine());
	ename=br.readLine();
	esal = Inreger.parseInt(br.readLine());
	ps1.setInt(1,eid);
	ps1.setString(2,ename);
	ps1.setInt(3,esal);
	ps1.executeUpdate();
	System.out.println("Enter the employee id to be delted");
	eid= Integer.parseInt(br.readLine());
	ps2.setInt(1,eid);
	ps2.executeUpdate();
	conn.close();
	}

}