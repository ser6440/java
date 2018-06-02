package employeedao;
 
import java.sql.SQLException;
 
public class EmployeeDaoTest {
    public static void main(String[] args) {
        //Dao 테스트 니까.. Dao 객체 필요
         
        
            EmployeeDao dao = new EmployeeDao();
             
            Employee e = new Employee(1,"홍길동",3,100000);
            dao.insertEmployee(e);
             
             
            System.out.println("종료");
         

         
    }
}

