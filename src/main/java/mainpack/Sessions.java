package mainpack;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.*;
//import org.json.*;


//import org.json.*;

public class Sessions {
	
	
	private String user = "";
	private String type;
	private String eventid = "";
	
	private long epoch = Instant.now().toEpochMilli();
	String myepoch = Objects.toString(epoch, null);


	

		
	
public JsonObject getJson() {

	
	
	
		JsonObject data = new JsonObject();
		data.addProperty("user_id", user);
		data.addProperty("timestamp", myepoch);
		
	    JsonObject json = new JsonObject();
//		JSONObject json = new JSONObject().put("data", dataf);
	
		
		//type
		json.addProperty("type", type);
		
		//JsonObject item1 = new JsonObject();
	
		
		   
		//data tag
		Gson gson = new Gson();
		//String[] strings = null ;//{user, myepoch}
		List<String> list = new ArrayList<String>();
		
		if (type.equals("event_details")) { 
			list.add(user);
			list.add(myepoch);
			list.add(eventid);
		} else
		{
			list.add(user);
			list.add(myepoch);
		}
		
		//Conversion
		String strings = new Gson().toJson(list);
		
		
		
		JsonElement finaldata = new JsonParser().parse(strings);
		
		//Create json and do the magic
		JsonArray properties = new JsonArray();
		properties.add(finaldata);
		json.addProperty("type", type);
		json.add("data", data);
		   
		//System.out.println("json:"+json);
		
		//json.addProperty("data", myepoch);
		/*
		if (!eventid.equals("")) {
			json.add("data", finaldata);
			
		}
		else
		{}
		*/

		return json;
		
		
	}

	
	
	public void setUser(String value)
	{
	     //include more logic
	     this.user = value;
	}
	
	public String getUser()
	{
	     //include validation, logic, logging or whatever you like here
	    return this.user;
	}
	
	
	public void setType(String value)
	{
	     //include more logic
	     this.type = value;
	}
	
	public String getType()
	{
	     //include validation, logic, logging or whatever you like here
	    return this.type;
	}

	
	
	
	public void setEventid(String value)
	{
	     //include more logic
	     this.eventid = value;
	}
	
	public String getEventid()
	{
	     //include validation, logic, logging or whatever you like here
	    return this.eventid;
	}


}
		
		
		
		
		