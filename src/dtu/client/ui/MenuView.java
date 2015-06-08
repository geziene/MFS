package dtu.client.ui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;

import dtu.client.controller.MainView;

public class MenuView extends Composite {
	private VerticalPanel vPanel = new VerticalPanel();
	
	// receive reference to MainView for call back
	public MenuView(final MainView main) {
		initWidget(this.vPanel);
		
		Anchor login = new Anchor("Login");
		vPanel.add(login);
		// call back the controller
		login.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event){				
				main.Login();
			}
		});
		
		/*Anchor showRaavare = new Anchor("Vis Raavare");
		vPanel.add(showRaavare);
		// call back the controller
		showRaavare.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event){				
				main.showRaavare();
			}
		});
	
		// use unicode escape sequence \u00F8 for 'ø'
		Anchor add = new Anchor("Tilf\u00F8j Raavare");
		vPanel.add(add);
		add.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event){				
				main.addRaavare();
			}
		});
		
		Anchor edit = new Anchor("Ret Raavare");
		vPanel.add(edit);
		edit.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event){				
				main.editRaavare();
			}
		});
		
		Anchor delete = new Anchor("Slet Raavare");
		delete.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event){				
				main.deleteRaavare();
			}
		});
		vPanel.add(delete);*/
	}
}
