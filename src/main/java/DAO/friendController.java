package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.vo.Friend;
import model.vo.Users;

public class friendController {

	public List<Friend> findByFriendBirthDate(String friendId) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@13.125.229.23:1521:xe", "shoong",
				"oracle")) {
			String sql = "select u.name, u.birth from user u join friend f on u.id=f.user_id where f.friend_id=? and f.confirmed =1"; // 이러면
																																		// 프렌드vo에
																																		// user객체를
																																		// 추가해야한다.

			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, friendId);

			ResultSet rs = pst.executeQuery();// 현재 여기 리저트셋에는 유저의 있는 컬럼들만 결과값으로 나오는데.
			List<Friend> list = new ArrayList<Friend>();
			if (rs.next()) {
				Friend one = new Friend();
				Users i = new Users();
				i.setName(rs.getString("name"));
				i.setBirth(rs.getDate("birth"));
				one.setUsers(i);

				list.add(one);

				/*
				 * one.setId(rs.getString("id")); one.setPassword(rs.getString("password"));
				 * one.setBirth(rs.getInt("birth")); one.setGender(rs.getString("gender"));
				 * one.setNickname(rs.getString("nickname"));
				 * one.setAvatarId(rs.getString("avatar_Id"));
				 * 
				 * return one;
				 */
			}
			return one;
			

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
