package co.micol.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.command.Command;
import co.micol.command.IndexCommand;
import co.micol.command.member.LoginCommand;
import co.micol.command.member.LoginOkCommand;
import co.micol.command.member.LogoutCommand;


@WebServlet("/NewFrontController")
public class NewFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// hashmap <k,v>
     HashMap<String, Command> cont = new HashMap<String, Command>();
   
    public NewFrontController() {
        super();
    }


	public void init(ServletConfig config) throws ServletException {
		// 해쉬맵 구조를 put()에 넣어준다.
		cont.put("/index.do", new IndexCommand()); //홈페이지 호출
		cont.put("/login.do", new LoginCommand());
		cont.put("/loginOk.do", new LoginOkCommand());
		cont.put("/logout.do", new LogoutCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 실행할 class객체 찾아주는 부분get()
		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		String context = request.getContextPath();
		String path = uri.substring(context.length());
		
		Command commandImpl = cont.get(path);
		commandImpl.excute(request, response);
		
	}
}
