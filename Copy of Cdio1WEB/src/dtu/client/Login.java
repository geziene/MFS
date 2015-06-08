package dtu.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Login implements EntryPoint {
	
	private TextBox txt1;
	private TextBox txt2;
	private Label Username;
	private Label Password;
	VerticalPanel vPanel = new VerticalPanel();
	//vPanel.setBorderWidth(1);
	HorizontalPanel hPanel = new HorizontalPanel();
	//hPanel.setBorderWidth(1);		
	
	public void onModuleLoad() {
		
		
		//Label
		this.Username = new Label("Username");
		this.Password = new Label("Password");
		
		
		//Textbox
		this.txt1 = new TextBox();
		this.txt2 = new TextBox();
		
		
		//Button
		Button Login = new Button("Login");
		Login.addClickHandler(new ButtonClickHanlder());
		
		
		//Add to Panel
		vPanel.add(Username);
		vPanel.add(txt1);
		vPanel.add(Password);
		vPanel.add(txt2);
		hPanel.add(Login);
		vPanel.add(hPanel);
		
		RootPanel.get().add(vPanel);
		RootPanel.get().add(hPanel);
		
	}
	private class ButtonClickHanlder implements ClickHandler {
		@Override
		public void onClick(ClickEvent event) {
		String theText1 = txt1.getText();
		String theText2 = txt2.getText();
			if((theText1.equals("10")) && (theText2.equals("02324it!"))) {
				Menu ShowMenu = new Menu();
				vPanel.clear();
				hPanel.clear();
				ShowMenu.MenuView();
			}
		}
	}
}
//ZOhra commit-test
