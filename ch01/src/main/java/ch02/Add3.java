package ch02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Add3
 */
public class Add3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**											요청								브라우저에출력
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("daGet start...");
		//num의 누적분을 return해주는것이 목표
		String han = request.getParameter("han");
		int num =Integer.parseInt(request.getParameter("num"));
		int sum = 0;
		for(int i = 1; i <=num ; i++) {
			sum += i;
		}
		//borwser에 display 하기위한 방법
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter(); //response.getWriter()을PrintWriter out이걸로받는다
		out.println("<html><body");;
		//out.println("<h1>1부터 "+num+"까지 합계 </h1>");
		out.printf("<h1>han </h1>",han );
		out.printf("<h1>1부터 %d까지 합계</h1>", num);
		out.println(sum);
		out.println("</body></html>");
			out.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
