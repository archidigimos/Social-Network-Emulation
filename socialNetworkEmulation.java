public class socialNetworkEmulation{
	
	public static void main(String []args){
		user a = new user("a");
		user b = new user("b");
		user c = new user("c");
		user d = new user("d");
		user e = new user("e");

		a.addUserData("Name","Archisman Sarkar 1");
		a.addUserData("DOB","09 March 1995");
		a.addUserData("Work","B.Tech Student");
		a.addUserData("Place","IIT Kharagpur");

		b.addUserData("Name","Archisman Sarkar 2");
		b.addUserData("DOB","08 March 1994");
		b.addUserData("Work","M.Tech Student");
		b.addUserData("Place","IIT Kharagpur");

		c.addUserData("Name","Archisman Sarkar 3");
		c.addUserData("DOB","07 March 1993");
		c.addUserData("Work","PHD. Student");
		c.addUserData("Place","IIT Kharagpur");

		d.addUserData("Name","Archisman Sarkar 4");
		d.addUserData("DOB","06 March 1992");
		d.addUserData("Work","Research Scholar");
		d.addUserData("Place","IIT Kharagpur");

		e.addUserData("Name","Archisman Sarkar 5");
		e.addUserData("DOB","05 March 1991");
		e.addUserData("Work","Professor");
		e.addUserData("Place","IIT Kharagpur");

		a.addFriend(a);
		a.addFriend(b);
		a.addFriend(c);
		a.addFriend(d);
		a.addFriend(e);
/*
		b.addFriend(a);
		b.addFriend(b);
		b.addFriend(c);
		b.addFriend(d);
		b.addFriend(e);

		c.addFriend(a);
		c.addFriend(b);
		c.addFriend(c);
		c.addFriend(d);
		c.addFriend(e);

		d.addFriend(a);
		d.addFriend(b);
		d.addFriend(c);
		d.addFriend(d);
		d.addFriend(e);

		e.addFriend(a);
		e.addFriend(b);
		e.addFriend(c);
		e.addFriend(d);
		e.addFriend(e);

		a.showFriends();
		b.showFriends();
		c.showFriends();
		d.showFriends();
		e.showFriends();
*/
		a.showFriendDetails(b);
		a.showFriendDetails(c);
		a.showFriendDetails(d);
		a.showFriendDetails(e);
		
		b.showFriendDetails(b);
		c.showFriendDetails(b);
		d.showFriendDetails(b);
		e.showFriendDetails(b);

		c.addFriend(b);
		d.addFriend(b);
		e.addFriend(b);

		b.showFriendDetails(b);
		c.showFriendDetails(b);
		d.showFriendDetails(b);
		e.showFriendDetails(b);
		
	}
}