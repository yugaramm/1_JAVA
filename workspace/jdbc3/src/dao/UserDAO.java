package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.UserDTO;
import util.DBConnection;
import vo.UserVO;

public class UserDAO {
	
	   private Connection con;
	   private PreparedStatement pstm;
	   private ResultSet rs;
	   
//	   selectAll
	   public List<UserVO> selectAll(){
		   String sql = "select * from tbl_user";
		   
		   List<UserVO> userList = new ArrayList<>();
		   
		   try {
			   con = DBConnection.getConnection();
			   pstm = con.prepareStatement(sql);
			   rs = pstm.executeQuery();
			   
			   while(rs.next()){
				   UserVO user = new UserVO();
				   
				   user.setUserNumber(rs.getInt(1));
				   user.setUserId(rs.getString(2));
				   user.setUserPw(rs.getString(3));
				   user.setUserName(rs.getString(4));
				   user.setUserPhone(rs.getString(5));
				   user.setUserBirth(rs.getString(6));
				   user.setUserRecommenderNumber(rs.getInt(7));
//				   SQL에서 NUMBER 타입에 NULL이 넘어오면, 자바에선 0
				   
				   userList.add(user);
			   }
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("selectAll() 도중 에러");
		} finally {
			try {
				DBConnection.close(con, pstm, rs);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("selectAll() 닫는 도중 에러");
			}
		}
		   
		   return userList;
		   
	   }
	   
//	   selectOne
	   public UserVO selectOne(int pk){
		   String sql = "SELECT * FROM TBL_USER WHERE USER_NUMBER = ?";
		   
		   UserVO user = new UserVO();
		   
		   try {
			   con = DBConnection.getConnection();
			   pstm = con.prepareStatement(sql);
			   pstm.setInt(1, pk);
			   rs = pstm.executeQuery();
			   
			   rs.next();
				   
			   user.setUserNumber(rs.getInt(1));
			   user.setUserId(rs.getString(2));
			   user.setUserPw(rs.getString(3));
			   user.setUserName(rs.getString(4));
			   user.setUserPhone(rs.getString(5));
			   user.setUserBirth(rs.getString(6));
			   user.setUserRecommenderNumber(rs.getInt(7));
			   
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("selectAll() 도중 에러");
		} finally {
			try {
				DBConnection.close(con, pstm, rs);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("selectAll() 닫는 도중 에러");
			}
		}
		   
		   return user;
		   
	   }
	   
//	   insert, 회원가입
	   public void insert(UserVO userVO) {
		   String sql = "INSERT INTO TBL_USER\r\n"
		   		+ "(USER_NUMBER, USER_ID, USER_PW, USER_NAME, USER_PHONE, USER_BIRTH, USER_RECOMMENDERNUMBER)\r\n"
		   		+ "VALUES(SEQ_PRO.NEXTVAL, ?, ?, ?, ?, ?, ?)";
		   try {
			   con = DBConnection.getConnection();
			   pstm = con.prepareStatement(sql);
			   pstm.setString(1, userVO.getUserId());
			   pstm.setString(2, userVO.getUserPw());
			   pstm.setString(3, userVO.getUserName());
			   pstm.setString(4, userVO.getUserPhone());
			   pstm.setString(5, userVO.getUserBirth());
			   pstm.setInt(6, userVO.getUserRecommenderNumber());
			   
			   pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insert() 도중 에러");
		} finally {
			try {
				DBConnection.close(con, pstm);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("insert() 닫는 중 에러");
			}
		}
	   }
	   
	   
//	   update
//	   public void update(UserVO userVO) {
//		   String sql = "UPDATE TBL_USER SET USER_ID=?, USER_PW=?, USER_NAME=?, USER_PHONE=?, USER_BIRTH=?\r\n"
//		   				+ "WHERE USER_NUMBER=?";
//		   try {
//			   con = DBConnection.getConnection();
//			   pstm = con.prepareStatement(sql);
//			   pstm.setString(1, userVO.getUserId());
//			   pstm.setString(2, userVO.getUserPw());
//			   pstm.setString(3, userVO.getUserName());
//			   pstm.setString(4, userVO.getUserPhone());
//			   pstm.setString(5, userVO.getUserBirth());
//			   pstm.setInt(6, userVO.getUserNumber());
//			   
//			   pstm.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("update() 도중 에러");
//		} finally {
//			try {
//				DBConnection.close(con, pstm);
//			} catch (SQLException e) {
//				e.printStackTrace();
//				System.out.println("update() 닫는 중 에러");
//			}
//		}
//	   }
	   
//	   휴대폰 번호를 이용해서 비밀번호를 바꾸는 함수를 만들자
	   public void update(String phone, String pw) {
		   String sql = "UPDATE TBL_USER SET USER_PW = ? WHERE USER_PHONE = ?";
		   try {
			   con = DBConnection.getConnection();
			   pstm = con.prepareStatement(sql);
			   pstm.setString(1, pw);
			   pstm.setString(2, phone);
			   
			   pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("update() 도중 에러");
		} finally {
			try {
				DBConnection.close(con, pstm);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("update() 닫는 중 에러");
			}
		}
	   }
	   
//	   delete 탈퇴
	   public void delete(int pk) {
		   String sql = "DELETE FROM TBL_USER WHERE USER_NUMBER=?";
		   try {
			   con = DBConnection.getConnection();
			   pstm = con.prepareStatement(sql);
			   pstm.setInt(1, pk);
			   
			   pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("delete() 도중 에러");
		} finally {
			try {
				DBConnection.close(con, pstm);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("delete() 닫는 중 에러");
			}
		}
	   }
	   
	   
//	   아이디 중복검사
	   public boolean checkId(String id) {
		   String sql = "SELECT COUNT(USER_ID)  FROM TBL_USER WHERE USER_ID = ?";
		   boolean check = false;
		   
		   try {
			   con = DBConnection.getConnection();
			   pstm = con.prepareStatement(sql);
			   pstm.setString(1, id);
			   rs = pstm.executeQuery();
			   
//			   결과행 하나 가져오기
			   rs.next();
			   
//			   id를 만들 수 있으면 true
//			   중복이 없다면 true
			   check = rs.getInt(1) == 0;
			   
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("checkId() 실행 중 에러");
		} finally {
			try {
				DBConnection.close(con, pstm, rs);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("checkId() 닫는 중 에러");
			}
		}
		   
		   
		   return check;
	   }
	   
//		내가 추천한 사람의 아이디와 이름을 확인해보자.
//		내 정보 + 내가 추천한 사람의 아이디, 이름을 한 번에 들고와보자.
		public UserDTO userInfo(int pk) {
			
			String sql = "SELECT T2.*, T1.USER_ID, T1.USER_NAME \r\n"
					+ "FROM TBL_USER T2 JOIN TBL_USER T1\r\n"
					+ "ON T1.USER_NUMBER = T2.USER_RECOMMENDERNUMBER\r\n"
					+ "WHERE T2.USER_NUMBER = ?";
			
			UserDTO user = new UserDTO();
			
			try {
				con = DBConnection.getConnection();
				pstm = con.prepareStatement(sql);
				pstm.setInt(1, pk);
				rs = pstm.executeQuery();
				
				rs.next();
				
				user.setUserNumber(rs.getInt(1));
				user.setUserId(rs.getString(2));
				user.setUserPw(rs.getString(3));
				user.setUserName(rs.getString(4));
				user.setUserPhone(rs.getString(5));
				user.setUserBirth(rs.getString(6));
				user.setUserRecommenderNumber(rs.getInt(7));
				user.setRecommenderId(rs.getString(8));
				user.setRecommenderName(rs.getString(9));
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("userInfo() 도중 에러");
			} finally {
				try {
					DBConnection.close(con, pstm, rs);
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("userInfo() 닫는 도중 에러");
				}
			}
			return user;
		}
		
//		나를 추천한 사람이 몇 명인지 확인하는 함수
//		매개변수 -> pk, 결과 : int
		public int countRecommender(int pk) {
			
			String sql = "SELECT COUNT(*)\r\n"
					+ "FROM TBL_USER\r\n"
					+ "WHERE USER_RECOMMENDERNUMBER = ?";
			
			int count = 0;
			
			try {
				con = DBConnection.getConnection();
				pstm = con.prepareStatement(sql);
				pstm.setInt(1, pk);
				rs = pstm.executeQuery();
				
				rs.next();
				
				count = rs.getInt(1);
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("countRecommender() 도중 에러");
			} finally {
				try {
					DBConnection.close(con, pstm, rs);
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("countRecommender() 닫는 도중 에러");
				}
			}
			
			return count;
		}
		

}
