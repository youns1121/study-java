package java8.javastudy.interface_java;

/**
 * Dao 클래스의 main() 메소드에서 dbWork () 메소드를 호출할 때 OracleDao와 MysqlDao 객체를 매개값으로 주고 호출했습니다. dbWork() 메소드는 두 객체를 모두 메개값으로 받기 위해
 * DataAccessObject 타입의 매개 변수를 가지고 있습니다. 실행 결과를 보고 DataAccessObject 인터페이스와 OracleDao, mysqlDao .구현 클래스를 각각 작성해보세요
 */
public class Interface_Q2_Dao {
    public static void dbWork(DataAccessObject dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MysqlDao());

    }
}
