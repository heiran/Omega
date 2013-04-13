package com.appspot.omega;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthServlet extends HttpServlet{
	private static final long serialVersionUID = -9059699120089647216L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("https://accounts.google.com/o/oauth2/auth?" +
				"scope=https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.profile&" +
				"response_type=code&" +
				"state=TESTING&" +
				//"redirect_uri=http://www.omega-vl.appspot.com/AuthResponse&" +
				"redirect_uri=http://localhost:8888/AuthResponse&" +
				//"client_id=215240851949.apps.googleusercontent.com&" +
				"client_id=215240851949-4767gcfso0aj09bpdto19bgk9ujg6p2s.apps.googleusercontent.com&" +
				"approval_prompt=force"
				);
	}
}