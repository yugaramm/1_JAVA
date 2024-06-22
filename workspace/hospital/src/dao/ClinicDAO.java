package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.AnimalDTO;
import util.DBConnection;
import vo.ClinicVO;

public class ClinicDAO {

   private Connection con;
   private PreparedStatement pstm;
   private ResultSet rs;

   public void insert(int animalNumber, String disease) {
      String sql = "INSERT INTO TBL_CLINIC\r\n" + "(CLINIC_NUMBER, ANIMAL_NUMBER, CLINIC_DISEASE, CLINIC_TIME)\r\n"
            + "VALUES(SEQ_PRO.NEXTVAL, ?, ?, SYSDATE)";

      try {
         con = DBConnection.getConnection();
         pstm = con.prepareStatement(sql);
         pstm.setInt(1, animalNumber);
         pstm.setString(2, disease);
         pstm.executeUpdate();

      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("clinicDAO.insert() 도중 에러");
      } finally {
         try {
            DBConnection.close(con, pstm);
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("insert() 닫는 도중 에러");
         }
      }
   }

   // 동물을 삭제하기 전에, 동물의 pk를 참조하는 진료기록의 fk를 전부 null로 수정한다.
   public int updateFk(int deleteAnimalNumber) {
      int updatedRow = 0;

      String sql = "UPDATE TBL_CLINIC \r\n" + "SET ANIMAL_NUMBER = NULL\r\n" + "WHERE ANIMAL_NUMBER = ?";

      try {
         con = DBConnection.getConnection();
         pstm = con.prepareStatement(sql);
         pstm.setInt(1, deleteAnimalNumber);
         updatedRow = pstm.executeUpdate();

      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("updateFk() 도중 에러");
      } finally {
         try {
            DBConnection.close(con, pstm);
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("updateFk() 닫는 도중 에러");
         }
      }
      return updatedRow;
   }

   public List<AnimalDTO> printClinic() {

      String sql = "SELECT OWNER_NAME, T2.ANIMAL_NAME, ANIMAL_SPECIES, CLINIC_DISEASE, CLINIC_TIME FROM\r\n"
            + "TBL_OWNER T1 JOIN\r\n"
            + "   (SELECT ANIMAL_NAME, ANIMAL_SPECIES, CLINIC_DISEASE, OWNER_NUMBER, CLINIC_TIME  \r\n"
            + "   FROM TBL_ANIMAL a JOIN TBL_CLINIC b\r\n"
            + "   ON a.ANIMAL_NUMBER = b.ANIMAL_NUMBER) T2\r\n"
            + "ON T1.OWNER_NUMBER = T2.OWNER_NUMBER";

      List<AnimalDTO> clinics = new ArrayList<>();

      try {
         con = DBConnection.getConnection();
         pstm = con.prepareStatement(sql);
         rs = pstm.executeQuery();

         while (rs.next()) {
            AnimalDTO animalDTO = new AnimalDTO();
            animalDTO.setOwnerName(rs.getString(1));
            animalDTO.setAnimalName(rs.getString(2));
            animalDTO.setAnimalSpeices(rs.getString(3));
            animalDTO.setClinicDisease(rs.getString(4));
            animalDTO.setClinicTime(rs.getString(5));

            clinics.add(animalDTO);
         }

      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("printClinic() 도중 에러");
      } finally {
         try {
            DBConnection.close(con, pstm, rs);
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("printClinic() 닫는 도중 에러");
         }
      }
      return clinics;
   }

   public List<ClinicVO> selectDeletedClinc() {

      String sql = "SELECT * FROM TBL_CLINIC WHERE ANIMAL_NUMBER IS NULL";

      List<ClinicVO> clinics = new ArrayList<>();

      try {
         con = DBConnection.getConnection();
         pstm = con.prepareStatement(sql);
         rs = pstm.executeQuery();

         while (rs.next()) {
            ClinicVO clinicVO = new ClinicVO();
            clinicVO.setClinicNumber(rs.getInt(1));
            clinicVO.setAnimalNumber(rs.getInt(2));
            clinicVO.setClinicDisease(rs.getString(3));
            clinicVO.setClinicTime(rs.getString(4));
            clinics.add(clinicVO);
         }

      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("selectAllClinc() 도중 에러");
      } finally {
         try {
            DBConnection.close(con, pstm, rs);
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("selectAllClinc() 닫는 도중 에러");
         }
      }
      return clinics;
   }

}