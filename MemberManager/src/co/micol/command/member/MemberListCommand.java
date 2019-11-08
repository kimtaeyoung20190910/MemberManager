package co.micol.command.member;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.command.Command;
import co.micol.dao.MemberDao;
import co.micol.dto.MemberDto;

public class MemberListCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		list = dao.select();
		
		request.setAttribute("list", list);
		String path="view/memberlist.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
		
		
		
	}

}
