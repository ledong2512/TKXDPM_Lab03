package controller;

import javax.swing.JPanel;

public class OMSAdminController {
	private CartController cartController;
	
	public OMSAdminController() {
		cartController = new CartController();
	}
	
	public JPanel getCartPane() {
		return cartController.getCartPane();
	}
	
	public JPanel getBookPage() {
		AdminBookPageController controller = new AdminBookPageController();
		
		return controller.getDataPagePane();
	}
}
