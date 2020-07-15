package hibernate_dynamic_practice;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Query query=session.createQuery("from UserFile");
		List  info=query.getResultList();
		Iterator itr=info.iterator();
		while (itr.hasNext()) {
			UserFile u1 = (UserFile) itr.next();
			System.out.println(u1.getId());
			System.out.println(u1.getPassword());
			System.out.println(u1.getUsername());
	}

}}
