package dtu.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import dtu.server.operatoerServer;

/**
 * Entry point classes define <code>onModuleLoad()</code>. // same as entrypoint
 */
public class CreateOpertaoer implements EntryPoint {
	
	private TextBox id;
	private TextBox name;
	private TextBox ini;
	private TextBox cpr;
	private TextBox pwd;
	
	private Label i;
	private Label n;
	private Label in;
	private Label c;
	private Label p;
	
	VerticalPanel vPanel = new VerticalPanel();
	//vPanel.setBorderWidth(1);
	HorizontalPanel hPanel = new HorizontalPanel();
	//hPanel.setBorderWidth(1);		
	
	public void onModuleLoad() {
		//Label
		this.i = new Label("ID");
		this.n = new Label("Name");
		this.in = new Label("INI");
		this.c = new Label("CPR");
		this.p = new Label("Password");
		
		
		
		//Textbox
		this.id = new TextBox();
		this.name = new TextBox();
		this.ini = new TextBox();
		this.cpr = new TextBox();
		this.pwd = new TextBox();

		
		
		//Button
		Button createOpr = new Button("Create");	
		createOpr.addClickHandler(new OprClickHanlder());
		
		
		//Add to Panel
		vPanel.add(i);
		vPanel.add(id);
		vPanel.add(n);
		vPanel.add(name);
		hPanel.add(in);
		hPanel.add(ini);
		hPanel.add(c);
		hPanel.add(cpr);
		hPanel.add(p);
		hPanel.add(pwd);
		hPanel.add(createOpr);
		
		vPanel.add(hPanel);
		
		RootPanel.get().add(vPanel);
		RootPanel.get().add(hPanel);
		
	}
	
private class OprClickHanlder implements ClickHandler {
	
		@Override
		public void onClick(ClickEvent event) {
			
// whatever user enter into the page it should insert the data in the database
			
			//CreateOpertaoer cp = new CreateOpertaoer();
			
			/*int idT =  Integer.parseInt(id.getText()); 
			String nameT = name.getText();
			String iniT = ini.getText();
			String cprT = cpr.getText();
			String pwdT = pwd.getText();
			Window.alert(""+idT);*/
			
			//operatoerServer osr = new operatoerServer();
		    //osr.addOperatoer(idT, nameT, iniT, cprT, pwdT);
			
			vPanel.clear();
			
		
	Label msg = new Label("Data Inserted");
		
			
			}
		}
	}

//ZOhra commit-test
