package co.micol.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.mico.command.notice.NoticeListCommand;
import co.micol.command.Command;
import co.micol.command.IndexCommand;
import co.micol.command.board.BoardInputCommand;
import co.micol.command.board.BoardListCommand;
import co.micol.command.board.BoardReadCommand;
import co.micol.command.board.BoardWriteCommand;
import co.micol.command.member.IdCheckCommand;
import co.micol.command.member.LoginCommand;
import co.micol.command.member.LoginOkCommand;
import co.micol.command.member.LogoutCommand;
import co.micol.command.member.MemberInputCommand;
import co.micol.command.member.MemberInsertOkCommand;
import co.micol.command.member.MemberListCommand;

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
		cont.put("/memberInput.do", new MemberInputCommand()); 
		cont.put("/idCheck.do", new IdCheckCommand());
		cont.put("/memberInsertOk.do", new MemberInsertOkCommand());
		cont.put("/memberlist.do", new MemberListCommand());
		cont.put("/noticeList.do", new NoticeListCommand()); //공지사항 목록
		cont.put("/boardlist.do", new BoardListCommand()); //자유게시판 목록
		cont.put("/boardWrite.do", new BoardWriteCommand()); //자유게시판 글쓰기
		cont.put("/boardInput.do", new BoardInputCommand()); //자유게시판 글쓰기
		cont.put("/boardRead.do", new BoardReadCommand()); //자유게시판 글 읽기 
		//cont.put("/boardRead.do", new BoardReadCommand()); //자유게시판 글 읽기
		//cont.put("/boardRead.do", new BoardReadCommand()); //자유게시판 글 읽기
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
