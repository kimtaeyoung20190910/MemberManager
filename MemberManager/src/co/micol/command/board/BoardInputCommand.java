package co.micol.command.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.command.Command;
import co.micol.dao.BoardDao;
import co.micol.dao.MemberDao;
import co.micol.dto.BoardDto;
import co.micol.dto.MemberDto;

public class BoardInputCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDao dao = new BoardDao();
		BoardDto dto = new BoardDto();

		String name = request.getParameter("writer");
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		String userid = request.getParameter("userid");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}
	

}
