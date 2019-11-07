package co.micol.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.command.Command;
import co.micol.command.IndexCommand;

@WebServlet(description = "메인컨트롤러", urlPatterns = { "/FrontController" })
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    HashMap<String, Command> cont = new HashMap<String, Command>(); // key,value
   
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO cont에 url과 실행 Class 정의하는 부분.
		cont.put("/index.do", new IndexCommand()); //홈페이지 호출
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
		// 요청하는 url를 분석하여 실행하는 부분.
		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		String context = request.getContextPath();
		String path = uri.substring(context.length());
		
		Command commandImpl = cont.get(path);
		commandImpl.excute(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
