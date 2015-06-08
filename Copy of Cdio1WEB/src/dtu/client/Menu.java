package dtu.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Menu  {
		
	VerticalPanel vPanel = new VerticalPanel();
	
	public void MenuView(){
		
	
		//Buttons
			Button CreateOperator = new Button("Create Operator");
			CreateOperator.addClickHandler(new ButtonClickHanlder());
			Button UdpateOperator = new Button("Udpate Operator");
			UdpateOperator.addClickHandler(new ButtonClickHanlder2());
			Button DeleteOperator = new Button("Delete Operator");
			DeleteOperator.addClickHandler(new ButtonClickHanlder3());
			Button Exit = new Button("Exit");
			Exit.addClickHandler(new ButtonClickHanlder4());
		
		//Add to Panel
		vPanel.add(CreateOperator);
		vPanel.add(UdpateOperator);
		vPanel.add(DeleteOperator);
		vPanel.add(Exit);
		
		RootPanel.get().add(vPanel);
	
	}
	
	private class ButtonClickHanlder implements ClickHandler {
		@Override
		public void onClick(ClickEvent event) {
			CreateOpertaoer copr = new CreateOpertaoer();
			vPanel.clear();
			copr.onModuleLoad();
		
		}	
	}	
	
	// this is code to show the box on the web
	private class ButtonClickHanlder2 implements ClickHandler { 
		@Override
		public void onClick(ClickEvent event) {
			UpdateOperatoer uopr = new UpdateOperatoer();
			vPanel.clear();
			uopr.onModuleLoad();
		}
	}
	// code for Delte in not finished!!!!!!!!!
	private class ButtonClickHanlder3 implements ClickHandler {
		@Override
		public void onClick(ClickEvent event) {
			
		
		}
	}
	// for Exit code
	private class ButtonClickHanlder4 implements ClickHandler {
		@Override
		public void onClick(ClickEvent event) {
			Login ShowLogin = new Login();
			vPanel.clear();
			ShowLogin.onModuleLoad();
		}
	}
}