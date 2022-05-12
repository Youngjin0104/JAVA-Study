package ch04;

public class UserInfo {
	
	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String phoneNumber;
	
	
	
	public UserInfo(String userId) {
		this.userId = userId;
	}
	public UserInfo(String userId, String userPassWord) {
		this.userId = userId;
		this.userPassWord = userPassWord;
	}
	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}

	
	
	
	
	// 생성자 오버로딩 (같은 이름의 생성자를 여러가 만드는것)
	// 중요! 생성자는 객체가 생성될 때 처음 실행되는 코드입니다.
	// 1. 기본 생성자를 만들어 주세요.
//	public UserInfo() {
//		
//	}
//	// 2. userId 만 받는 생성자를 만들어 주세요.
//	public UserInfo(String userId) {
//		this.userId = userId;
//	}
//	// 3. userId, userPassword만 받는 생성자
//	public UserInfo(String userId, String userPassWord) {
//		this.userId = userId;
//		this.userPassWord = userPassWord;
//	}
//	// 4. userId, userPassWord, userName 만 받는 생성자
//	public UserInfo(String userId, String userPassWord, String userName) {
//		this.userId = userId;
//		this.userPassWord = userPassWord;
//		this.userName = userName;
//	}
//	public UserInfo(String userId, String userPassWord, String userName, String userAddress) {
//		this.userId = userId;
//		this.userPassWord = userPassWord;
//		this.userName = userName;
//		this.userAddress = userAddress;
//	}
//	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber) {
//		this.userId = userId;
//		this.userPassWord = userPassWord;
//		this.userName = userName;
//		this.userAddress = userAddress;
//		this.phoneNumber = phoneNumber;
//	}
//
}
