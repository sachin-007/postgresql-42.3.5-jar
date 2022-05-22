import java.sql.*;  
class demometadata
{  
public static void main(String args[])
{
    Connection cn=null;
    Statement st=null;
    ResultSet rs=null;
    System.out.println("Started...");
final String dname="org.postgresql.Driver";
final String db_url="jdbc:postgresql:dbtybcsdemo";
    final String uname="postgres";
    final String pw="root";  
try{  
Class.forName(dname);
  System.out.println("Driver Loaded Successfully...");	
cn=DriverManager.getConnection(db_url);
  System.out.println("Connection established Successfully..."); 

DatabaseMetaData dbmd=cn.getMetaData();  
  
System.out.println("Driver Name: "+dbmd.getDriverName());  
System.out.println("Driver Version: "+dbmd.getDriverVersion());  
System.out.println("UserName: "+dbmd.getUserName());  
System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
  
cn.close();  
}
catch(Exception e)
{ 
System.out.println(e);
}    
}
}

