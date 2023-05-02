package com.java.signup;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SignupServlet() {
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname=request.getParameter("fname");
		
		String lname=request.getParameter("lname");
		
		String email=request.getParameter("email");

		String password=request.getParameter("password");
		
		String [] date=request.getParameterValues("date");
		
		String [] gender=request.getParameterValues("gender");
		
		String finalDate =  String.join(",", date);
		
		String finalGender = String.join(",", gender);
		
		SignUp signup=new SignUp(fname,lname,email,password,finalDate,finalGender);
		int res = SignUpDao.saveData(signup);
		if(res==1)
		{	RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
			dispatcher.forward(request, response);
		}
		else
		{	RequestDispatcher dispatcher = request.getRequestDispatcher("signupfail.jsp");
			dispatcher.include(request, response);
		}
	}

}
