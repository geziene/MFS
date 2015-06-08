package dtu.server.dal;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import dtu.client.service.KartotekService;
import dtu.shared.RaavareDTO;

public class RaavareDAO extends RemoteServiceServlet implements KartotekService  {
	private static int id1 = 0;

	// primary key, autoincrement - not safe!
	private static int id = 0;

	private List<RaavareDTO> pList;

	public RaavareDAO() throws Exception {
		pList = new ArrayList<RaavareDTO>();

		// Indset start data
		saveRaavare(new RaavareDTO(1,"Hans Jensen","aaa"));
		saveRaavare(new RaavareDTO(2,"Ulla Jacobsen","eee"));
		saveRaavare(new RaavareDTO(3,"Peter Hansen","qqq"));
	}

	@Override
	public void saveRaavare(RaavareDTO r) throws Exception {
		// simulate server error
		// throw new RuntimeException(" \"savePerson\" fejlede");

		// add primary key
		r.setRaavareId(id++);
		pList.add(r);
	}

	@Override
	public void updateRaavare(RaavareDTO r) throws Exception {
		// find object with id and update it
		for (int i=0; i<pList.size();i++)
			if (pList.get(i).getRaavareId() == r.getRaavareId())	
				pList.set(i, r);

	}


	@Override
	public List<RaavareDTO> getRaavare() throws Exception {
		return pList;
	}

	@Override
	public int getSize() throws Exception {
		return pList.size();
	}

	@Override
	public void deleteRaavare(int id) throws Exception {

		// find object with id and remove it
		for (int i=0; i<pList.size();i++)
			if (pList.get(i).getRaavareId() == id)	
				pList.remove(i);
	}
}
