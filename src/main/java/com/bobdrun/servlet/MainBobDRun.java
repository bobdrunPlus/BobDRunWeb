package com.bobdrun.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainBobDRun
 */
@WebServlet("/MainBobDRun")
public class MainBobDRun extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainBobDRun() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 파라미터 가져오기
		String userName = request.getParameter("userName");

        // 2. 응답 Content-Type 설정
        response.setContentType("text/html; charset=UTF-8");

        // 3. 동적 HTML 출력
        response.getWriter().println("<html><body>");
        if(userName == null || userName.trim().isEmpty()) {
            response.getWriter().println("<h2>Hello, visitor!</h2>");
        } else {
            response.getWriter().println("<h2>Hello, " + userName + "!</h2>");
        }
        response.getWriter().println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
//push test
	//mastet plus
	//master test
}
