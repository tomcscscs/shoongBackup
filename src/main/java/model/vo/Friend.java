package model.vo;

import java.sql.Date;

public class Friend {
	private int id;
	private String userId;
	private String friendId;
	private int confirmed;
	private Date confirmAt;

	private Users users;

	public Friend() {
		super();
	}

	public Friend(int id, String userId, String friendId, int confirmed, Date confirmAt, Users users) {
		super();
		this.id = id;
		this.userId = userId;
		this.friendId = friendId;
		this.confirmed = confirmed;
		this.confirmAt = confirmAt;
		this.users = users;
	}

	public Friend(int id, String userId, String friendId, int confirmed, Date confirmAt) {
		super();
		this.id = id;
		this.userId = userId;
		this.friendId = friendId;
		this.confirmed = confirmed;
		this.confirmAt = confirmAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFriendId() {
		return friendId;
	}

	public void setFriendId(String friendId) {
		this.friendId = friendId;
	}

	public int getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}

	public Date getConfirmAt() {
		return confirmAt;
	}

	public void setConfirmAt(Date confirmAt) {
		this.confirmAt = confirmAt;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

}