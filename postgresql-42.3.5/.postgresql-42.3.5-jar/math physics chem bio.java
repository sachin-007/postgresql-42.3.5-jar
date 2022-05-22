 




import javax.servlet.*; 
import javax.servlet.http.*; 
import java.io.*;  
 public class submit extends HttpServlet { 
    public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException 
        {          resp.setContentType("text/html");
                  PrintWriter out = resp.getWriter();     
                       String s=req.getParameter("subject");    

                                        Cookie c=new Cookie("subject",s);    
                                               out.println("You have selected:"+c.getValue()); 
          } 

      public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException   
            {          resp.setContentType("text/html");          PrintWriter out = resp.getWriter();         
             String s=req.getParameter("subject");                     Cookie c=new Cookie("subject",null);         
               out.println("Reset....");                } } 

                 //HTML File: <html>   <head>     <title> HTML FILE SUBJECT SELECTION</title>   </head>   <body>   
                 <form method="post" action="http://localhost:8080/hobby/submit"> 
                 <input type="radio" name="subject" value="Maths"> Maths <br> 
                 <input type="radio" name=" subject" value="Physics"> Physics <br>     
                 <input type="radio" name=" subject" value="Chemistry"> Chemistry <br> 
                 <input type="radio" name=" subject" value="Biology"> Biology <br> 
                 <input type="submit" value="Submit">     </form>            
                 <form method="get" action="http://localhost:8080/hobby/submit">     
                 <input type="submit" value="Reset">     </form>          
                 </body> </html> 


                  

                 <servlet-class>AddSubjectServlet</servlet-class> </servlet> 
                 <servlet-mapping> <servlet-name>Add</servlet-name> 
                 <url-pattern>/add</url-pattern> </servlet-mapping> <servlet> 
                 <servlet-name>View</servlet-name> <servlet-class>ViewHobbyServlet</servlet-class> </servlet> 
                 <servlet-mapping> <servlet-name>View</servlet-name> <url-pattern>/view</url-pattern> 
            </servlet-mapping> 