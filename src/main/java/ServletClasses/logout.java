package ServletClasses;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class logout extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
//		HttpSession hs=req.getSession(false);
		//hs.invalidate();
		
		Cookie cookie=new Cookie("emailId","email");
		resp.addCookie(cookie);
		
		RequestDispatcher rd=req.getRequestDispatcher("thankyou.jsp"); 
		System.out.println("By deleting the cookie we can give don't access to the all our functions");
		rd.forward(req, resp);
	}
}
