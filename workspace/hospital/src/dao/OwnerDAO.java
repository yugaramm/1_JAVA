package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBConnection;
import vo.OwnerVO;

public class OwnerDAO {
   
   private Connection con;
   private PreparedStatement pstm;
   private ResultSet rs;

   public boolean checkPhone(String phone) {
      String sql = "SELECT COUNT(OWNER_PHONE) FROM TBL_OWNER\r\n"
            + "WHERE OWNER_PHONE = ?";
      boolean check = false;
      
      try {
         con = DBConnection.getConnection();
         pstm = con.prepareStatement(sql);
         pstm.setString(1, phone);
         rs = pstm.executeQuery();
         
//         결과행 하나 가져오기.
         rs.next();
         
//         id 를 만들 수 있으면 true
//         중복이 없다면 true
         check = rs.getInt(1) == 0;
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("checkPhone() 실행 중 에러");
      } finally {
         try {
            DBConnection.close(con, pstm, rs);
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("checkPhone() 닫는 도중 에러");
         }
      }
      return check;
   }
   
//   회원가입
   public void join(String name, String phone) {
      String sql = "INSERT INTO TBL_OWNER\r\n"
            + "(OWNER_NUMBER, OWNER_NAME, OWNER_PHONE)\r\n"
            + "VALUES(SEQ_PRO.NEXTVAL, ?, ?)";
      
      try {
         con = DBConnection.getConnection();
         pstm = con.prepareStatement(sql);
         pstm.setString(1, name);
         pstm.setString(2, phone);
         pstm.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("join() 도중 에러");
      } finally {
         try {
            DBConnection.close(con, pstm);
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("join() 닫는 도중 에러");
         }
      }
   }
   
   public int login(String name, String phone) {
      
      String sql = "SELECT OWNER_NUMBER FROM TBL_OWNER\r\n"
            + "WHERE OWNER_name = ? AND OWNER_PHONE = ?";
      
      int loginUserNumber = 0;
      
      try {
         con = DBConnection.getConnection();
         pstm = con.prepareStatement(sql);
         pstm.setString(1, name);
         pstm.setString(2, phone);
         rs = pstm.executeQuery();
         
//         결과행 하나 가져오기.
         if(rs.next()) {
            loginUserNumber = rs.getInt(1);
         }
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("checkPhone() 실행 중 에러");
      } finally {
         try {
            DBConnection.close(con, pstm, rs);
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("checkPhone() 닫는 도중 에러");
         }
      }
      return loginUserNumber;
   }
   
//   
   public OwnerVO selectOne(int loginUserNumber) {
      OwnerVO owner = new OwnerVO();
      
      String sql = "select * from tbl_owner where owner_number = ?";
      
      try {
         con = DBConnection.getConnection();
         pstm = con.prepareStatement(sql);
         pstm.setInt(1, loginUserNumber);
         rs = pstm.executeQuery();
         
         rs.next();
         
         owner.setOwnerNumber(rs.getInt(1));
         owner.setOwnerName(rs.getString(2));
         owner.setOwnerPhone(rs.getString(3));
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("selectOne() 실행 중 에러");
      } finally {
         try {
            DBConnection.close(con, pstm, rs);
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("selectOne() 닫는 도중 에러");
         }
      }
      return owner;
   }
   
   
   
   
   
   
   
   
   
   
   
}
