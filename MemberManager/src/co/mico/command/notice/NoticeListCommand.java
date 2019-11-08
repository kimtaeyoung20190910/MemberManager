package co.mico.command.notice;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.command.Command;
import co.micol.dao.NoticeDao;
import co.micol.dto.NoticeDto;

public class NoticeListCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeDao dao = new NoticeDao();
		ArrayList<NoticeDto> list = new ArrayList<NoticeDto>();
		list = dao.select(); // 전체리스트 가져오기

		request.setAttribute("list", list);
		String path = "view/noticeList.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}
}
