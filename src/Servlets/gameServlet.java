package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Game_Controller.Game_Controller;
import Model.gameModel;
import teamproject.cs320.*;

public class gameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Team Project320 : doGet");

		// call JSP to generate empty form
		req.getRequestDispatcher("/_view/babyZombies.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Team Project320 : doPost");
		String errorMessage = null;
		String response = null;

		// create GuessingGame model - model does not persist between requests
		// must recreate it each time a Post comes in
		gameModel model = new gameModel();

		// create GuessingGame controller - controller does not persist between requests
		// must recreate it each time a Post comes in
		Game_Controller controller = new Game_Controller();

		// assign model reference to controller so that controller can access model
		controller.setModel(model);

		// check if user is starting a new game and call controller method
		if (req.getParameter("startGame") != null) {
			controller.startGame();
		}
		// otherwise, user is already playing the game - get the old min and max
		// from the posted form
		// without persistence, we must pass the values back and forth between the
		// client and the server every time in order to remember them
		else {
			// get min and max from the Posted form data
			String curInput = req.getParameter("input");
			if ( curInput == "attack" && model.getEnemy().getHealth() > 0) {
				//String response = controller.enemyCombat();
			}else {
				errorMessage = "There is no enemey to attack. ";
			}
			if (curInput == "next room") {
				response = controller.printNPCinteraction(model.getRoom().getName());
			}
			
			// initialize model with the old min, max values
			// since the data does not persist between posts, we need to
			// recreate and re-initialize the model each time
			// model.setMin(curMin);
			// model.setMax(curMax);
			// now check to see which button the user pressed
			// and adjust min, max, and guess accordingly
			// must call controller methods to do this since the
			// view only reads the model data, it never changes
			// the model - only the controller can change the model
			/*
			 * if (req.getParameter("gotIt") != null) { controller.setNumberFound(); } else
			 * if (req.getParameter("less") != null) {
			 * controller.setNumberIsLessThanGuess(); } else if (req.getParameter("more") !=
			 * null) { controller.setNumberIsGreaterThanGuess(); } else { throw new
			 * ServletException("Unknown command"); } }
			 */
		
		}
		// set "game" attribute to the model reference
		// the JSP will reference the model elements through "game"
		// Most likley we don't need this. 
		req.setAttribute("game", model);
		
		req.setAttribute("response" , response);
		req.setAttribute("errorMessage", errorMessage);

		// now call the JSP to render the new page
		req.getRequestDispatcher("/_view/babyZombies.jsp").forward(req, resp);
		
	}

	// gets an Integer from the Posted form data, for the given attribute name
	private int getInteger(HttpServletRequest req, String name) {
		return Integer.parseInt(req.getParameter(name));
	}
}
