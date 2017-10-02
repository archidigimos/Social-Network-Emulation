import java.util.*;

public class user{

	private HashMap<String, user> friend = new HashMap<String, user>();
	private HashMap<String, Object> userDetails = new HashMap<String, Object>();
	private int countFriends = 0;
	private String userName = "";

	user(String name){
		this.userName = name;
	}
	public void addUserData(String type, String data){
		this.userDetails.put(type,data);
	}
	public void removeUserData(String type){
		this.userDetails.remove(type);
	}
	public void addFriend(user userAdd){
		if(new String(this.userName).equals(userAdd.userName)==false){
			if(this.friend.containsKey(userAdd.userName)==false){
				this.countFriends = this.countFriends +1;
				this.friend.put(userAdd.userName,userAdd);
				userAdd.countFriends = userAdd.countFriends+1;
				userAdd.friend.put(this.userName,this);
				System.out.println("User: "+userAdd.userName+" is NOW friends with "+this.userName);
			}
			else{
				System.out.println("User: "+userAdd.userName+" is already friends with "+this.userName);
			}
		}
	}
	public void removeFriend(user userRemove){
		if(new String(this.userName).equals(userRemove.userName)==false){
			if(this.friend.containsKey(userRemove.userName)==true){
				this.countFriends = this.countFriends -1;
				this.friend.remove(userRemove.userName);
				userRemove.countFriends = userRemove.countFriends-1;
				userRemove.friend.put(this.userName,this);
				System.out.println("User: "+userRemove.userName+" is NO MORE friends with "+this.userName);
			}
			else{
				System.out.println("User: "+userRemove.userName+" was never friends with "+this.userName);
			}
		}
	}
	public void showFriends(){
		System.out.println("User: "+this.userName+" has: "+this.countFriends+" friends!");
		for(String key: this.friend.keySet()){
			System.out.println(this.friend.get(key).userName);
		}
	}
	public void showFriendDetails(user userAccess){
		if(this.friend.containsKey(userAccess.userName)==true){
			System.out.println("Showing details of user: "+userAccess.userName+" as requested by user: "+this.userName);
			for(String key : userAccess.userDetails.keySet()){
				System.out.println(key+" : "+userAccess.userDetails.get(key));
			}
		}
		else{
			if(new String(this.userName).equals(userAccess.userName)){
				System.out.println("Showing details of user: "+userAccess.userName);
				for(String key : userAccess.userDetails.keySet()){
					System.out.println(key+" : "+userAccess.userDetails.get(key));
				}
			}
			else{
				System.out.println("User: "+userAccess.userName+" doesn't give details viewing permission to "+this.userName);
			}
		}
	}
}