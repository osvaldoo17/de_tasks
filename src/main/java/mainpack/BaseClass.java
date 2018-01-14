package mainpack;

import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

public class BaseClass {

	public static void main(String[] args) {
		
		//chaos control
		Random rand = new Random(); 
		int value = rand.nextInt(100); 

		//user
		String uniqueID = UUID.randomUUID().toString();
		List<String> users = Arrays.asList();
		
		//store sessions
		users.add(uniqueID);
		
		
		String [] available_event_ids = {
		 "59b7e9d4e204516892b4acc9",
		 "59d509bfe20451673bd05502",
		 "55f97360e648c0021b00e779",
		 "5a14bdcca7934d215cbd4c8d",
		 "5a17ffd8e2045113678eea57",
		 "596336bd2325b4471cddaf98",
		 "5963b06e2325b411805856fb",
		 "59f76ea1a7934d5bd1eb52c5",
		 "59dcd935e204510c803206d9",
		 "5668230263051f141a6d6251",
		 "5a1fdd9a0e0d4e56f851671f",
		 "5971b3e220058915a73efe5f",
		 "582ca0002325b41dbf102543",
		 "564209392325b407e566e636",
		 "58cbf26163051f5b6eb25662",
		 "595266fb63051f41d95de233",
		 "573096b063051f318269edaf",
		 "53f37fb263051f3828001012",
		 "5570817563051f66f7003a9b",
		 "55071a582325b4331400811f"};
		
		String [] action_stream = {"app_launched","event_details","app_terminated"};
		
		Sessions ses = new Sessions();
		

		
		//ses.setEventid(uniqueID);
		ses.setUser(uniqueID);
		ses.setType("app_launched");
		
		System.out.println(ses.getJson().toString());
		;
		

		
		}
	
	public static int getRandom(int[] available_event_ids) {
	    int rnd = new Random().nextInt(available_event_ids.length);
	    return available_event_ids[rnd];

}
	public static int getRandomAction(int[] action_stream) {
	    int rnd = new Random().nextInt(action_stream.length);
	    return action_stream[rnd];
	
	
		
	}

}
