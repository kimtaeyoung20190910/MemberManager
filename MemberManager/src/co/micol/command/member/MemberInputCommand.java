package co.micol.command.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.command.Command;

public class MemberInputCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path="view/memberInput.jsp";
		RequestDispatcher dispathcher = request.getRequestDispatcher(path);
		dispathcher.forward(request, response);

	}

}
