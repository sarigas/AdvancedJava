package fr.tbr.iam.web.servlets;

import java.io.IOException;
import java.util.Collection;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.tbr.iam.log.IAMLogger;
import fr.tbr.iam.log.impl.IAMLogManager;
import fr.tbr.iamcore.datamodel.Identity;
import fr.tbr.iamcore.exception.DAOSearchException;
import fr.tbr.iamcore.service.dao.IdentityDAOInterface;

/**
 * Servlet implementation class Login
 */

@WebServlet(name="Search", urlPatterns="/Search")
public class Search extends GenericSpringServlet {
	private static final long serialVersionUID = 1L;
	
	IAMLogger logger = IAMLogManager.getIAMLogger(Search.class);
	
	@Inject
	IdentityDAOInterface dao;
	

    /**
     * Default constructor. 
     */
    public Search() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String displayName = request.getParameter("displayName");
		String email = request.getParameter("email");
		logger.info("received this query :  = displayName" + displayName + " email = " + email);
		try {
			Collection<Identity> idList = dao.search(new Identity(displayName, email, null,null,null));
			request.getSession().setAttribute("idList", idList);
		} catch (DAOSearchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("search.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
