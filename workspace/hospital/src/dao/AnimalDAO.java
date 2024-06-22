package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.AnimalDTO;
import util.DBConnection;
import vo.AnimalVO;

public class AnimalDAO {
	
	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;
	
	public void insert(String name, String species, int loginUserNumber) {
		String sql = "INSERT INTO TBL_ANIMAL\r\n"
				+ "(ANIMAL_NUMBER, ANIMAL_NAME, ANIMAL_SPECIES, OWNER_NUMBER)\r\n"
				+ "VALUES(SEQ_PRO.NEXTVAL, ?, ?, ?)";
		
		try {
			con = DBConnection.getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, name);
			pstm.setString(2, species);
			pstm.setInt(3, loginUserNumber);
			pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("animalDAO.insert() 도중 에러");
		} finally {
			try {
				DBConnection.close(con, pstm);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("insert() 닫는 도중 에러");
			}
		}
	}
	
	public List<AnimalVO> selectAll(int loginUserNumber){
		
		List<AnimalVO> animals = new ArrayList<>();
		
		String sql = "select * from tbl_animal where owner_number = ?";
		
		try {
			con = DBConnection.getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, loginUserNumber);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				AnimalVO animalVO = new AnimalVO();
				animalVO.setAnimalNumber(rs.getInt(1));
				animalVO.setAnimalName(rs.getString(2));
				animalVO.setAnimalSpeices(rs.getString(3));
				animalVO.setOwnerNumber(rs.getInt(4));
				
				animals.add(animalVO);
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
		return animals;
	}
	
//	이름과 주인 pk 를 전달 받아, 반려동물의 코드를 리턴해주는 함수
//	삭제 구현에 사용할 예정
	public int selectOne(String name, int loginUserNumber) {
		
		String sql = "select animal_number from tbl_animal\r\n"
				+ "where animal_name = ? and owner_number = ?";
		
		int animalNumber = 0;
		
		try {
			con = DBConnection.getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, name);
			pstm.setInt(2, loginUserNumber);
			rs = pstm.executeQuery();
			
			rs.next();
			
			animalNumber = rs.getInt(1);
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("selectOne() 도중 에러");
		} finally {
			try {
				DBConnection.close(con, pstm, rs);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("selectOne() 닫는 도중 에러");
			}
		}
		return animalNumber;
	}
	
	public void delete(int animalNumber) {
		
		String sql = "delete from tbl_animal where animal_number = ?";
		
		try {
			con = DBConnection.getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, animalNumber);
			pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("delete() 도중 에러");
		} finally {
			try {
				DBConnection.close(con, pstm);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("delete() 닫는 도중 에러");
			}
		}
		
	}
	
	public List<AnimalDTO> printClinic(){
		
		String sql = "SELECT OWNER_NAME, T2.ANIMAL_NAME, ANIMAL_SPECIES, CLINIC_DISEASE, CLINIC_TIME FROM\r\n"
				+ "TBL_OWNER T1 JOIN\r\n"
				+ "	(SELECT ANIMAL_NAME, ANIMAL_SPECIES, CLINIC_DISEASE, OWNER_NUMBER, CLINIC_TIME  \r\n"
				+ "	FROM TBL_ANIMAL a JOIN TBL_CLINIC b\r\n"
				+ "	ON a.ANIMAL_NUMBER = b.ANIMAL_NUMBER\r\n"
				+ "	WHERE TO_CHAR(CLINIC_TIME, 'YYYYMMDD') = TO_CHAR(sysdate, 'YYYYMMDD')) T2\r\n"
				+ "ON T1.OWNER_NUMBER = T2.OWNER_NUMBER";
		
		List<AnimalDTO> clinics = new ArrayList<>();
		
		
		try {
			con = DBConnection.getConnection();
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
