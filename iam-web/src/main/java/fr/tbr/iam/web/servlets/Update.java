package fr.tbr.iam.web.servlets;

import java.io.IOException;
import java.util.Collection;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.tbr.iam.log.IAMLogger;
import fr.tbr.iam.log.impl.IAMLogManager;
import fr.tbr.iamcore.datamodel.Identity;
import fr.tbr.iamcore.exception.DAOSaveException;
import fr.tbr.iamcore.exception.DAOSearchException;
import fr.tbr.iamcore.exception.DAOUpdateException;
import fr.tbr.iamcore.service.dao.DAODeleteException;
import fr.tbr.iamcore.service.dao.IdentityDAOInterface;

@WebServlet(name="Update", urlPatterns = "/Update")
public class Update extends GenericSpringServlet {
	
private static final long serialVersionUID = 1L;
	
	IAMLogger logger = IAMLogManager.getIAMLogger(Update.class);
	
	@Inject
	IdentityDAOInterface dao;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int identityId=  Integer.parseInt(request.getParameter("id"));
		Collection<Identity> idList=null;
		try {
			idList = dao.getIden(identityId);
		} catch (DAOSearchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession session = request.getSession();
		for(Identity identity : idList){
			session.setAttribute("identity", identity);
			response.sendRedirect("update.jsp");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession();
		Identity identity = (Identity) session.getAttribute("identity");
		identity.setDisplayName(request.getParameter("displayName"));
		identity.setUid(request.getParameter("uid"));
		identity.setUsername(request.getParameter("username"));
		identity.setEmail(request.getParameter("email"));
		/**
		 * To update an identity.
		 */
		try {
			dao.update(identity);
		} catch (DAOUpdateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		response.sendRedirect("welcome.jsp");
}
}
