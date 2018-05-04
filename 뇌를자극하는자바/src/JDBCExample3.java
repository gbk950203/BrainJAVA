import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCExample3 {
    public static void main(String args[]) {
        Connection conn = null;
        //1단계: DB연결을 위한 커넥션 인터페이스
        Statement stmt = null;
        //Statement 인터페이스 - SQL 실행
    	ResultSet rs = null;
    	//ResultSet 인터페이스 - SQL 결과를 저장
        
        try {
        //try ~ catch 문에서 DB연결중에 예외가 발생하는지를 검사.
            Class.forName("com.mysql.jdbc.Driver");
            //2단계: JDBC드라이버를 로드한다.
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysql", "root", "12345");
            //3단계: 드라이버매니저 클래스는 getConnecrion메소드로 DB를 연결한다.
            System.out.println("데이터베이스에 접속했습니다.");
            
            stmt = conn.createStatement();
            //커넥션 객체가 Statement객체를 생성
            
            rs = stmt.executeQuery("SELECT StudentID, StudentsName, Address, Gender, Score FROM students");
            //DML SQL 쿼리 실행 후 결과를 저장
            
            System.out.println("학생ID 학생명    주소   성별 점수");
            System.out.println("------------------------------------------------");
            
            while (rs.next()) {
            
            	String StudentID = rs.getString(1); 
            	String StudentsName = rs.getString(2); 
            	String Address = rs.getString(3); 
            	String Gender = rs.getString(4); 
            	int Score = rs.getInt(5); 
            	
            	System.out.println(StudentID + "---" + StudentsName + "---" + Address + "---" + Gender + "---" + Score);
            }
            
            conn.close();
            //4단계: DB연결을 종료한다.
        }
        catch (ClassNotFoundException cnfe) {
            System.out.println("해당 클래스를 찾을 수 없습니다." + 
                               cnfe.getMessage());
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}