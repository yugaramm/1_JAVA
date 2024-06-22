package controller;

import java.util.List;
import java.util.Scanner;

import dao.AnimalDAO;
import dao.ClinicDAO;
import dao.OwnerDAO;
import dto.AnimalDTO;
import vo.AnimalVO;
import vo.ClinicVO;
import vo.OwnerVO;

public class Controller {

   private Scanner sc = new Scanner(System.in);
   private OwnerDAO ownerDAO = new OwnerDAO();
   private AnimalDAO animalDAO = new AnimalDAO();
   private ClinicDAO clinicDAO = new ClinicDAO();
   
   private int loginUserNumber = 0;
   
   public Controller() {
      play();
   }
   
   private void play() {
      int choice = 0;
      
      while(true) {
         System.out.println("☆☆☆☆ 가람동물병원 ☆☆☆☆");
         System.out.println("1. 회원가입\n2. 로그인\n3. 프로그램 종료");
         System.out.print("메뉴 선택 >> ");
         choice = sc.nextInt();
         
         switch(choice) {
         case 1: // 회원가입
            join();
            break;
         case 2: // 로그인 
            login();
            break;
         case 3:
            System.out.println("프로그램 종료");
            System.exit(0);
            break;
         default :
            System.out.println("제대로 입력해주세요!\n");
            break;
         }
      }
   }
   
   private void join() { // 회원가입 로직 실행
      String name = null;
      String phone = null;
      
      System.out.print("Name : ");
      name = sc.next();   
      
      do {
         System.out.print("Phone : ");
         phone = sc.next();   
      }while(!ownerDAO.checkPhone(phone));
      
      ownerDAO.join(name, phone);
      
      System.out.println("회원가입 완료!");
   }
   
   private void login() {
      String name = null;
      String phone = null;
      
      while(true) {
         System.out.print("Name : ");
         name = sc.next();   
         
         System.out.print("Phone : ");
         phone = sc.next();
         
         loginUserNumber = ownerDAO.login(name, phone);
         
         if(name.equals("관리자") && loginUserNumber != 0) {
            System.out.println("관리자님 환영합니다.");
            moveAdminPage();
            break;
         }
         else if(loginUserNumber != 0) {
            System.out.println("마이페이지 이동");
            moveMyPage();
            break;
         }
         else {
            System.out.println("회원 정보를 확인하세요!");
         }
      }
   }
   
   private void moveMyPage() {
      int choice = 0;
      OwnerVO owner = null;
      
      while(true) {
         System.out.println("1. 내 정보 보기\n2. 반려동물 추가\n3. 반려동물 목록 보기\n4. 반려동물 떠나보내기\n5. 진료 기록 추가하기\n6. 로그아웃");
         System.out.println("메뉴 선택 >> ");
         
         choice = sc.nextInt();
         
         if(choice == 6) {
            System.out.println("로그아웃 완료!");
            return;
         }
         
         switch(choice) {
         case 1:
            owner = ownerDAO.selectOne(loginUserNumber);
            printInfo(owner);
            break;
         case 2: // 동물 추가
            addAnimal();
            break;
         case 3: // 동물 리스트 보기
            selectAnimals();
            break;
         case 4: // 동물 떠나보내기
            byeMyLove();
            break;
         case 5:
            insertClinic();
            break;
         default:
            System.out.println("번호 확인!!!!!\n");
            break;
         }
      }
   }
   
//   정보 출력 메소드
   private void printInfo(Object obj) {
      
      if(obj instanceof OwnerVO) {
         OwnerVO owner = (OwnerVO) obj;
         System.out.println("이름 : " + owner.getOwnerName());
         System.out.println("휴대폰 번호 : " + owner.getOwnerPhone());
      }
      
      else if(obj instanceof AnimalVO) {
         AnimalVO animal = (AnimalVO) obj;
         System.out.println("이름 : " + animal.getAnimalName());
         System.out.println("종 : " + animal.getAnimalSpeices());
         System.out.println("==================================");
      }
      
      else if(obj instanceof AnimalDTO) {
         AnimalDTO animal = (AnimalDTO) obj;
         System.out.println("반려인 이름 : " + animal.getOwnerName());
         System.out.println("이름 : " + animal.getAnimalName());
         System.out.println("종 : " + animal.getAnimalSpeices());
         System.out.println("병명 : " + animal.getClinicDisease());
         System.out.println("진료시간 : " + animal.getClinicTime());
         System.out.println("==================================");
      }
      
      else if(obj instanceof ClinicVO) {
         ClinicVO clinicVO = (ClinicVO) obj;
         if(clinicVO.getAnimalNumber() == 0) {
            System.out.println("!!!!데이터 유실!!!!");
            System.out.println("병명 : " + clinicVO.getClinicDisease());
            System.out.println("진료시간 : " + clinicVO.getClinicTime());
         }
         else {
            System.out.println("동물 고유 번호 : " + clinicVO.getAnimalNumber());
            System.out.println("병명 : " + clinicVO.getClinicDisease());
            System.out.println("진료시간 : " + clinicVO.getClinicTime());
         }
      }
      
   }
   
   private void addAnimal() {
      String name = null;
      String species = null;
      
      System.out.print("동물 이름 : ");
      name = sc.next();
      
      System.out.print("동물 종 : ");
      species = sc.next();
      
      animalDAO.insert(name, species, loginUserNumber);
      System.out.println("추가 완료!\n");
      
   }
   
   private void selectAnimals() {
      
      List<AnimalVO> animals = null;
      animals = animalDAO.selectAll(loginUserNumber);
      int i = 0;
      
      for (AnimalVO animalVO : animals) {
         System.out.println(++i + "번 동물");
         printInfo(animalVO);
         System.out.println();
      }
   }
   
   private void byeMyLove() {
      String name = null;
      int deleteAnimalNumber = 0;
      int updatedRow = 0;
      
      selectAnimals();
      
      System.out.print("떠나보낼 친구의 이름 : ");
      
      // 이름 중복 검사도 만들어놓을 필요는 있겠다.
      // 이름 중복 검사 메소드는 매개변수 이름, 로그인유저넘버 
      name = sc.next();
      deleteAnimalNumber = animalDAO.selectOne(name, loginUserNumber);
      
      updatedRow = clinicDAO.updateFk(deleteAnimalNumber);
      animalDAO.delete(deleteAnimalNumber);
      
      if(updatedRow != 0) {
         System.out.println(updatedRow + "개의 진료기록이 수정되었습니다.");
      }
      
      System.out.println(name + "... 안녕 ㅠㅠ");
      System.out.println();
   }
   
   private void insertClinic() {
      String name = null;
      String disease = null;
      
      selectAnimals();
      
      System.out.print("진료 기록을 추가할 친구의 이름 : ");
      name = sc.next();
      
      System.out.print("병명 : ");
      disease = sc.next();
      
      clinicDAO.insert(animalDAO.selectOne(name, loginUserNumber), disease);
      System.out.println("추가 완료\n");
   }
   
   private void moveAdminPage() {
      
      int choice = 0;
      while(true) {
         System.out.println("1. 오늘 진료 기록 보기\n2. 전체 진료 기록 보기\n3. 로그아웃");
         choice = sc.nextInt();
         
         if(choice == 3) {
            System.out.println("로그아웃 완료");
            return;
         }
         
         switch(choice) {
         case 1:
            printClinic();
            break;
         case 2:
            printAllClinic();
            break;
            
         default:
            System.out.println("번호 확인!");
            break;
         }
      }
      
   }
   
   private void printClinic() {
      
      List<AnimalDTO> clinics = animalDAO.printClinic();
      int i = 0;
      
      for (AnimalDTO animalDTO : clinics) {
         System.out.println(++i + "번");
         printInfo(animalDTO);
      }
   }
   
   private void printAllClinic() {
      
      List<AnimalDTO> clinics = clinicDAO.printClinic();
      int i = 0;
      
      for (AnimalDTO animalDTO : clinics) {
         System.out.println(++i + "번");
         printInfo(animalDTO);
      }
      
      System.out.println("\n=====================================\n");
      
      List<ClinicVO> deletedClinics = clinicDAO.selectDeletedClinc();
      i = 0;
      
      for (ClinicVO clinicVO : deletedClinics) {
         System.out.println(++i + "번");
         printInfo(clinicVO);
      }
      
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}