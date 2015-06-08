package dtu.client.ui;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.util.List;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
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
	import dtu.shared.DALException;
	import dtu.shared.FieldVerifier;
	import dtu.client.ui.WelcomeView;
	import dtu.shared.RaavareDTO;
	import dtu.shared.DALException;
	
	public class VaerkfView extends Composite{
		KartotekServiceClientImpl clientImpl;
		VerticalPanel phPanel;
		
		/*private static final String URL = "jdbc:mysql://localhost:3306/Raavaredb";
		private static final String USERNAME = "root";
		private static final String PASSWORD = "root";
		
		private Connection connection = null; // manages connection

		private PreparedStatement saveRaavareStmt = null;*/

		Button addRaavarebatches = new Button("Create Raavarebatches");
		Button showRaavarebatches = new Button("Show Raavarebatches");
		//Button updateRaavare = new Button("Update Raavare");
		
		//BrowseView bv = new BrowseView(clientImpl);
		
		
		public VaerkfView(KartotekServiceClientImpl clientImpl) // pramtriz cnsrctr
		{
			this.clientImpl = clientImpl;

			phPanel = new VerticalPanel();
			initWidget(this.phPanel);
			
			addRaavarebatches.addClickHandler(new ClickHandler() {

				@Override
				public void onClick(ClickEvent event) {
					RaavarebatchesFields();
				}
			});
			
			phPanel.add(addRaavarebatches);
			
			phPanel.add(showRaavarebatches);
			//phPanel.add(updateRaavare);
			
			

		}

		public void RaavarebatchesFields() 
		{
			phPanel.clear();
			
			Label idLbl;
			final TextBox idTxt;
			Label maengdeLbl;
			final TextBox maengdeTxt;
			
			Button save = new Button("Create");
			
			
			
		

			// total height of widget. Components are distributed evenly
			phPanel.setHeight("120px");	

			HorizontalPanel maengdePanel = new HorizontalPanel();
			HorizontalPanel idPanel = new HorizontalPanel();
			

			idLbl = new Label("ID:");
			idLbl.setWidth("100px");
			idTxt = new TextBox();
			idTxt.setHeight("1em");
			idPanel.add(idLbl);
			idPanel.add(idTxt);
			
			maengdeLbl = new Label("Maengde:");
			maengdeLbl.setWidth("100px");
			maengdeTxt = new TextBox();
			maengdeTxt.setHeight("1em");
			maengdePanel.add(maengdeLbl);
			maengdePanel.add(maengdeTxt);
			

			save.addClickHandler(new ClickHandler()  {

				@Override
				public void onClick(ClickEvent event)   {
					 try
				        {
						 /*RaavareDTO r = new RaavareDTO( Integer.parseInt(idTxt.getText()), nameTxt.getText(), levTxt.getText());
						 connection = 
									DriverManager.getConnection( URL, USERNAME, PASSWORD );

							// create query that add/create a raavare to kartotek
							saveRaavareStmt = 
									connection.prepareStatement( "INSERT INTO raavare " + 
											"( raavare_id, raavare_navn, leverandoer ) " + 
											"VALUES (?, ?, ? )" );
							saveRaavareStmt.setInt(1, r.getRaavareId());
							saveRaavareStmt.setString(2, r.getRaavareNavn());
							saveRaavareStmt.setString(3, r.getLeverandoer());

							saveRaavareStmt.executeUpdate();*/
				        }
				        catch (Exception e) {
				            e.printStackTrace();
				        }
				        }		
			} );
			
			phPanel.add(idPanel);
			phPanel.add(maengdePanel);
			
			phPanel.add(save);

		}
		
		
	}



