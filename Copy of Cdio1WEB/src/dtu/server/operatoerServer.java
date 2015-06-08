package dtu.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import daoimpl01917.MySQLOperatoerDAO;
import daointerfaces01917.DALException;
import dto01917.OperatoerDTO;

import java.sql.*;

public class operatoerServer extends RemoteServiceServlet {
	
	public OperatoerDTO opr;
	public MySQLOperatoerDAO dao;
	
	public void addOperatoer(int i, String n, String in, String c, String p)
		{
		
  opr = new OperatoerDTO(i, n, in, c, p);
		try {
			opr.setCpr(c);
			opr.setOprId(i);
			opr.setOprNavn(n);
			opr.setPassword(p);
			opr.setIni(in);
			
			dao.createOperatoer(opr);
			
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
// to run the database code on the server side!