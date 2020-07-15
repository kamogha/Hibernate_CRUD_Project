package hibernate_dynamic_practice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int idmodiy= Integer.parseInt(request.getParameter("idmodify"));
	String namemodify=request.getParameter("namemodify");
	String passwordmodify=request.getParameter("passwordmodify");
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		UserFile user=(UserFile)session.get(UserFile.class, idmodiy);
		user.setUsername(namemodify);
		user.setPassword(passwordmodify);
		session.getTransaction().commit();
		session.close();
		
	}

}
