import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import com.cdk.verifalia.mock.DummyDataGenerator;
import com.cdk.verifalia.model.Request;
import com.cdk.verifalia.model.RequestEntry;
import com.cdk.verifalia.model.Response;
import com.thetransactioncompany.json.pretty.PrettyJson;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class DummyDataGeneratorTest {
	
	
	private Logger LOGGER = Logger.getLogger(DummyDataGeneratorTest.class);
	
	@Test
	public void testGetEmailLocal(){
		assertEquals("pertti.heiskanen", DummyDataGenerator.getLocalPart("pertti.heiskanen@gmail.com"));
		
		assertEquals("gmail.com", DummyDataGenerator.getDomainPart("pertti.heiskanen@gmail.com"));
		
		
				
	}
	
	@Test
	public void testGetResponse(){
		
		Request req = new Request();
		List<RequestEntry> entries = new ArrayList<RequestEntry>();
		entries.add(new RequestEntry("pertti.heiskanen@gmail.com"));
		entries.add(new RequestEntry("kalevi.heiskanen@gmail.com"));
		entries.add(new RequestEntry("kalervo.heiskanen@gmail.com"));
		req.setEntries(entries);
		
		Response response = DummyDataGenerator.generateResponse(req);
		
		assertEquals(3, response.getEntries().size());
		
		assertEquals(DummyDataGenerator.MailboxTemporarilyUnavailable, response.getEntries().get(0).getStatus());
		assertEquals(DummyDataGenerator.ServerIsCatchAll, response.getEntries().get(1).getStatus());
		assertEquals(DummyDataGenerator.MailboxTemporarilyUnavailable, response.getEntries().get(2).getStatus());
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			LOGGER.debug(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response));
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
