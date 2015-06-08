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
import dtu.client.ui.WelcomeView;


public class adminView extends Composite {
	KartotekServiceClientImpl clientImpl;
	VerticalPanel adminPanel;

	Button admin = new Button("Administrator");
	Button pharm = new Button("Pharmacist");
	Button vaer = new Button("Vaerkforer");
	Button opr = new Button("Operatoer");
	//BrowseView bv = new BrowseView(clientImpl);
	
	
	public adminView(KartotekServiceClientImpl clientImpl) // pramtriz cnsrctr
	{
		this.clientImpl = clientImpl;

		adminPanel = new VerticalPanel();
		initWidget(this.adminPanel);
		
		HorizontalPanel userPanel = new HorizontalPanel();
		HorizontalPanel pwdPanel = new HorizontalPanel();
		
		
		adminPanel.add(userPanel);
		adminPanel.add(pwdPanel);
		adminPanel.add(admin);
		adminPanel.add(pharm);
		adminPanel.add(vaer);
		adminPanel.add(opr);

	}

}
