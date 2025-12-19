package app;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Program {
    
    public static void main(String[] args) throws Exception {
        String CustId = args[0].toUpperCase();
        int productNo = Integer.parseInt(args[1]);
        int quantity = Integer.parseInt(args[2]);

        var c = DriverManager.getConnection("jdbc:oracle:thin:@//metiitdac.met.edu/xepdb1", "dac4", "metiit");

        var cstmt = c.prepareCall("call place_order(?,?,?,?)");

        cstmt.setString(1 , CustId);
        cstmt.setInt(2 , productNo);
        cstmt.setInt(3 , quantity);
        cstmt.registerOutParameter(4 , Types.INTEGER);

        try {
            cstmt.execute();
            System.out.printf("New order no is  : %d%n", cstmt.getInt(4));
        } catch(Exception e) {
            System.out.printf("Order failed", e.getMessage());
        }
        c.close();
        cstmt.close();
    }

}

