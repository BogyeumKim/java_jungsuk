import java.io.File;

public class Ex8_10 {

	public static void main(String[] args) {
		
	try {
		File f = createFile("");
//		File f = createFile("test.txt");
		System.out.println(f.getName()+"파일 생성완료");
	}catch (Exception e) {
		System.out.println(e.getMessage()+"다시 입력해주세요");
	}
		
		
	}
	
	static File createFile(String fileName) throws Exception{
		if(fileName == null || fileName.equals(""))
			throw new Exception("파일 이름이 유효하지 않습니다."); // 여기서 try - catch를 안하고 위로 떠넘김(예외선언)
		
		File f =new File(fileName);
		
		f.createNewFile();
		return f;
	}

 
}
