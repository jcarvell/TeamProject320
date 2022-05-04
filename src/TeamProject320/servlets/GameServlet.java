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

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Team Project320 : doGet");	
		
		// call JSP to generate empty form
		req.getRequestDispatcher("/view/babyZombies.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Team Project320 : doPost");
		
		// create GuessingGame model - model does not persist between requests
		// must recreate it each time a Post comes in 
		gameModel model = new gameModel();
		String errorMessage = null;
		String response = null;

		// create GuessingGame controller - controller does not persist between requests
		// must recreate it each time a Post comes in
		Game_Controller controller = new Game_Controller();
		
		// assign model reference to controller so that controller can access model
		controller.setModel(model);
		String curInput = req.getParameter("input");
		// check if user is starting a new game and call controller method
		if (req.getParameter("startGame") != null) {
			controller.startGame();
		}
		// otherwise, user is already playing the game - get the old min and max
		// from the posted form
		// without persistence, we must pass the values back and forth between the
		// client and the server every time in order to remember them
		else {
			System.out.println("This is the current input:"+ curInput);
			System.out.println("This is the current response:"+ response);
			// get min and max from the Posted form data
			if (curInput.contains("attack") && model.getEnemy().getHealth() > 0) {
				//String response = controller.enemyCombat();
				response = controller.attack();
			}else if (curInput.contains("attack") && model.getEnemy() == null ){
				response = "There is no enemey to attack. ";
			}
			else if(curInput.contains("run away") && model.getEnemy().getHealth() > 0) {
				response = controller.runAway();
			}
			else if (curInput.contains("run away") && model.getEnemy() == null) {
				response = "There is no enemy to run away from. Duh";
			}
			else if (curInput.contains("look for npc")) {
				response = controller.printNPCinteraction(model.getRoom().getName());
			}
			else if ( curInput.contains("look around")) {
				response = controller.lookAround();
			}
			else if(curInput.contains("pickup weapon")) {
				response = controller.pickupWeapon();
			}
			else if(curInput.contains("pickup potion")) {
				response = controller.pickupPotion();
			}
			else if(curInput.contains("use potion")) {
			response = controller.usePotion();
			}
			else {
				response = "Invalid input";
			}
		}
		System.out.println(controller.lookAround());
		req.setAttribute("response", response);
		
		
		// now call the JSP to render the new page
		req.getRequestDispatcher("/view/babyZombies.jsp").forward(req, resp);
		
	}


}
