import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class addcookie textend HttpServlet
{

public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
{
	
	Cookie c1=new Cookie("Cookie1","1");
	res.addCookie(c1);
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.print("Cookie added with value 1");
	Cookie c2=new Cookie("Cookie2","2");
	res.addCookie(c2);
	out.print("Cookie added with value 2");
	out.close();
	}

}



import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class getcookie textend HttpServlet

{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException

{
		Cookie[] c=req.getCookies();
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		for(int i=0;i<c.length;i++)
			out.println("Cookie Name"K+c[i].getName());
			pw.close();
			}

		
}

