package co.micol.command.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.command.Command;
import co.micol.dao.MemberDao;

public class IdCheckCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDao dao = new MemberDao();
		String id = request.getParameter("id");
		boolean b = dao.isIdCheck(id);
		
		System.out.println("idcheckcommand:" + id );
		System.out.println("boolean b: "+ b);
		
		String path="view/idCheck.jsp";
		request.setAttribute("idcheck", b);
		request.setAttribute("id", id);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
		
		
		

	}

}
