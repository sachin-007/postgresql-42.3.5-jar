import java.sql.*;
import java.io.*;
class JDBCMenu
{
  public static void main(String[] args) throws Exception
  {
     
    Statement stmt =  null;
    ResultSet rs = null;
    PreparedStatement ps1 = null, ps2=null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name;
    int r,choice;
    float per;
    Class.forName("org.postgresql.Driver");
    Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/stud","postgres","password");
    stmt = conn.createStatement();
         
    if(conn!=null)
        System.out.println("Connection successful..");
    do
    {
    System.out.println("1: View Records");
    System.out.println("2: Insert Record");
    System.out.println("3: Delete Record");
    System.out.println("4: Modify Record");
    System.out.println("5: Search Record");
    System.out.println("6: Exit");
    System.out.println("\nEnter your choice : ");
    choice = Integer.parseInt(br.readLine());
    switch(choice)
    {
        case 1: 
        rs = stmt.executeQuery("Select * from student");
        while(rs.next())  
        {
         System.out.print("Roll Number = " + rs.getInt(1));
         System.out.println("Name = " + rs.getString(2));
         }
        break;
        case 2: 
        System.out.println("Enter the roll number");
        r = Integer.parseInt(br.readLine());
        System.out.println("Enter Name:");
        name = br.readLine();
        System.out.println("Enter Percentage:");
        per = Float.parseFloat(br.readLine());
        ps1 = conn.prepareStatement("Insert into student values(?,?,?)");
        ps1.setInt(1,r); 
        ps1.setString(2,name);
        ps1.setFloat(3, per);
        ps1.executeUpdate();
        System.out.println("record inserted successfully");
        break;  
        case 3: 
        System.out.println("Enter the roll number to be deleted ");
        r = Integer.parseInt(br.readLine());
        stmt.executeUpdate("Delete from student where rollno = " + r);
        System.out.println("record deleted successfully");
        break;
        case 4: 
        System.out.println("Enter the roll number to be modified ");
        r = Integer.parseInt(br.readLine());
        System.out.println("Enter new name");
        name = br.readLine();
        System.out.println("Enter new perctentage");
        per = Float.parseFloat(br.readLine());
        ps2 = conn.prepareStatement("Update student set name = ?,percentage=? where rollno = ?");
        ps2.setString(1,name);
        ps2.setFloat(2,per);
        ps2.setInt(3,r);                
        ps2.executeUpdate();
        System.out.println("record modified successfully");
        break;
    case 5: 
        System.out.println("Enter the roll number to be searched ");
        r = Integer.parseInt(br.readLine());
        rs = stmt.executeQuery("Select * from student where rollno = " + r);
        if(rs.next())
        {
            System.out.print("Roll Number = " + rs.getInt(1));
                System.out.println("Name = " + rs.getString(2));
                        System.out.println("Percentage = " + rs.getFloat(3));
        }
        else
            System.out.println("Student not found");    
        break;  
     }
   } while(choice != 6);
   }                    
 }