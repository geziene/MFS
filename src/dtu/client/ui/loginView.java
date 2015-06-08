package dtu.client.ui;

import java.util.List;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import dtu.client.service.KartotekServiceClientImpl;
import dtu.shared.FieldVerifier;
import dtu.client.ui.adminView;


public class loginView extends Composite {
	KartotekServiceClientImpl clientImpl;
	VerticalPanel loginPanel;
	FlexTable ft;
	Label usr;
	TextBox usrTxt;
	Label pwd;
	TextBox pwdTxt;

	Button login = new Button("Login");
	//BrowseView bv = new BrowseView(clientImpl);
	
	
	public loginView(KartotekServiceClientImpl clientImpl)
	{
		this.clientImpl = clientImpl;

		loginPanel = new VerticalPanel();
		initWidget(this.loginPanel);
		
		HorizontalPanel userPanel = new HorizontalPanel();
		HorizontalPanel pwdPanel = new HorizontalPanel();

		usr = new Label("Username:");
		usr.setWidth("60px");
		usrTxt = new TextBox();
		usrTxt.setHeight("1em");
		userPanel.add(usr);
		userPanel.add(usrTxt);
		
		pwd = new Label("Password:");
		pwd.setWidth("60px");
		pwdTxt = new TextBox();
		pwdTxt.setHeight("1em");
		pwdPanel.add(pwd);
		pwdPanel.add(pwdTxt);
		
		login.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				check();
			}
		});
		
		loginPanel.add(userPanel);
		loginPanel.add(pwdPanel);
		loginPanel.add(login);

	}
public void check()
{
	PharmacistView pv = new PharmacistView(clientImpl);
	loginPanel.clear();
	loginPanel.add(pv);
}
}
