package TeamProject320.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import TeamProject320.controller.Game_Controller;
import TeamProject320.model.gameModel;
import teamproject.cs320.*;

public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	gameModel model = new gameModel();
	String errorMessage = null;
	String response = null;
	String curInput = null;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Team Project320 : doGet");	
		String user = (String) req.getSession().getAttribute("user");
		if (user == null) {
			System.out.println("   User: <" + user + "> not logged in or session timed out");
			
			// user is not logged in, or the session expired
			resp.sendRedirect(req.getContextPath() + "/Login");
			return;
		}
		
		Game_Controller controller = new Game_Controller();
		controller.setModel(model);
		response = controller.welcome();
		controller.startGame();
		req.setAttribute("response", response);
		
		// call JSP to generate empty form
		req.getRequestDispatcher("/view/babyZombies.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Team Project320 : doPost");
		
		// create GuessingGame model - model does not persist between requests
		// must recreate it each time a Post comes in 


		// create GuessingGame controller - controller does not persist between requests
		// must recreate it each time a Post comes in
		Game_Controller controller = new Game_Controller();
		
		// assign model reference to controller so that controller can access model
		controller.setModel(model);
		String user = (String) req.getSession().getAttribute("user");
		System.out.println(user);
		
		if(response == null) {
			controller.startGame();
			response = controller.welcome();
			System.out.println("It does go in here.");
		}else {
			curInput = req.getParameter("input");
			if(curInput.contains("save game")){
				response = controller.savePlayer(user);
			}
			else if(curInput.contains("load game")){
				response = controller.loadPlayer(user);
			}
			else {
				response = controller.webActions(curInput);
			}
		}
		
		// otherwise, user is already playing the game - get the old min and max
		// from the posted form
		// without persistence, we must pass the values back and forth between the
		// client and the server every time in order to remember them
		int  health = model.getUser().getHealth();
		int enemyHealth = model.getEnemy().getHealth();
		
		req.setAttribute("response", response);
		req.setAttribute("Health", health);
		req.setAttribute("EnemyHealth", enemyHealth);

		
		// now call the JSP to render the new page
		req.getRequestDispatcher("/view/babyZombies.jsp").forward(req, resp);
		
	}


}
