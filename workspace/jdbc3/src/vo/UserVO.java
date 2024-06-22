package vo;


public class UserVO {
   private int userNumber;
   private String userId;
   private String userPw;
   private String userName;
   private String userPhone;
   private String userBirth;
   private int userRecommenderNumber;
   
   public UserVO() {;}
   
   public UserVO(int userNumber, String userId, String userPw, String userName, String userPhone, String userBirth,
         int userRecommenderNumber) {
      this.userNumber = userNumber;
      this.userId = userId;
      this.userPw = userPw;
      this.userName = userName;
      this.userPhone = userPhone;
      this.userBirth = userBirth;
      this.userRecommenderNumber = userRecommenderNumber;
   }

    
    public int getUserNumber() {
	return userNumber;
	}
	
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPw() {
		return userPw;
	}
	
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPhone() {
		return userPhone;
	}
	
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	
	public String getUserBirth() {
		return userBirth;
	}
	
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	
	public int getUserRecommenderNumber() {
		return userRecommenderNumber;
	}
	
	public void setUserRecommenderNumber(int userRecommenderNumber) {
		this.userRecommenderNumber = userRecommenderNumber;
	}
	
	

	@Override
	public String toString() {
		return "UserVO [userNumber=" + userNumber + ", userId=" + userId + ", userPw=" + userPw + ", userName="
				+ userName + ", userPhone=" + userPhone + ", userBirth=" + userBirth + ", userRecommenderNumber="
				+ userRecommenderNumber + "]";
	}

	@Override
    public boolean equals(Object obj) {
      
      if(this == obj) {
         return true;
      }
      
      if(obj instanceof UserVO) {
         if(this.userNumber == ((UserVO)obj).userNumber) {
            return true;
         }
      }
      
      return false;
   }
   
}
