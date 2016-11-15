package com.cdk.verifalia.mock;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.cdk.verifalia.model.Entry;
import com.cdk.verifalia.model.Progress;
import com.cdk.verifalia.model.Request;
import com.cdk.verifalia.model.RequestEntry;
import com.cdk.verifalia.model.Response;

public class DummyDataGenerator {

	public static String ServerIsCatchAll = "ServerIsCatchAll";
	public static String MailboxTemporarilyUnavailable = "MailboxTemporarilyUnavailable";
	public static String DomainDoesNotExist = "DomainDoesNotExist";
	
	private static Logger LOGGER = Logger.getLogger(DummyDataGenerator.class);
	
	public static Response generateResponse(Request request){
		
		
		int count = 0;
		
		Response response = new Response();
		
		response.setUniqueID("1f977ae169024721869cdadbadc3f754");
		response.setEngineVersion("1.1;2014-07-31");
		response.setSubmittedOn("2014-08-01T12:06:30");
		response.setCompletedOn("2014-08-01T12:06:32");
		
		List<Entry> entries = new ArrayList<Entry>();
		
		for(RequestEntry reqEntry: request.getEntries()){
			count++;
			Entry entry = new Entry();
			entry.setInputData(reqEntry.getInputData());
			entry.setCompletedOn("2014-08-01T12:06:32");
			entry.setEmailAddress(reqEntry.getInputData());
			entry.setAsciiEmailAddressDomainPart("example.com");
			entry.setEmailAddressLocalPart(getLocalPart(reqEntry.getInputData()));
			entry.setEmailAddressDomainPart("example.com");
			entry.setHasInternationalDomainName(false);
			entry.setHasInternationalMailboxName(false);
			entry.setHasInternationalDomainName(false);
			entry.setDisposableEmailAddress(false);
			entry.setRoleAccount(false);

			if(count == 1){
				entry.setStatus(DomainDoesNotExist);
			} else{
				if(count %2 ==0){
					
					entry.setStatus(ServerIsCatchAll);
				} else{
					entry.setStatus(MailboxTemporarilyUnavailable);
				}
			}
			
			
			
			entry.setCatchAllFailure(false);
			entry.setSyntaxFailureIndex(null);
			entry.setSuccess(false);
			entry.setTimeoutFailure(true);
			entry.setNetworkFailure(true);
			entry.setSyntaxFailure(false);
			entry.setDnsFailure(false);
			entry.setSmtpFailure(true);
			entry.setMailboxFailure(false);
			entries.add(entry);
		}
		
		response.setEntries(entries);
		
		Progress progress = new Progress();
		progress.setNoOfCompletedEntries(83);
		progress.setNoOfTotalEntries(97);
		
		response.setProgress(progress);
		
		return response;
		
	}
	
	
	public static String getLocalPart(String email){
		String localPart = null;
		if(email != null && !email.isEmpty() && email.contains("@") ){
			localPart = email.substring(0, email.indexOf("@"));
		}
		return localPart;
	}
	
	public static String getDomainPart(String email){
		String domainPart = null;
		if(email != null && !email.isEmpty()&& email.contains("@")){
			domainPart = email.substring(email.indexOf("@")+1, email.length());
		}
		return domainPart;
	}
	
}
