import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class JDBC {
    public static void main(String args[]) {
        Connection conn = null;
    	//1단계: DB연결을 위한 커넥션 인터페이스
        try {
        //try ~ catch 문에서 DB연결중에 예외가 발생하는지를 검사.
            Class.forName("com.mysql.jdbc.Driver");
            //2단계: JDBC드라이버를 로드한다.
            conn = DriverManager.getConnection(
            //3단계: 드라이버매니저 클래스는 getConnecrion메소드로 DB를 연결한다.
               "jdbc:mysql://localhost:3307/mysql", "root", "12345");
            System.out.println("데이터베이스에 접속했습니다.");
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