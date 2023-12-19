package view;

public interface PT_RESERVE_CHOICE {

	int LIST = 1; // 전체 PT회원 리스트
	int INSERT = 2; // PT회원 정보 입력 (신규만 우선!)
	int DELETE = 3; // PT회원 정보 삭제 
	int MAIN = 4; 
	
	//추가 PT연장, 연기, 환불 
}
