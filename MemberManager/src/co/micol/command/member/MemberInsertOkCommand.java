package co.micol.command.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.command.Command;
import co.micol.dao.MemberDao;
import co.micol.dto.MemberDto;

public class MemberInsertOkCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDao dao = new MemberDao();
		MemberDto dto = new MemberDto();
		
		dto.setId(request.getParameter("id"));
		dto.setName(request.getParameter("name"));
		dto.setPw(request.getParameter("pw"));
		dto.setAddr(request.getParameter("addr"));
		dto.setTel(request.getParameter("tel"));
		int n = dao.insert(dto);
		
		String path = "view/memberInsertOk.jsp";
		request.setAttribute("n", n);
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
		
		

	}

}
