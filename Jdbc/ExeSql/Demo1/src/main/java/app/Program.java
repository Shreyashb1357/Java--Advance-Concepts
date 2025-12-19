package app;

import java.sql.DriverManager;

public class Program {
    
    public static void main(String[] args) throws Exception {
        var c = DriverManager.getConnection("jdbc:mysql://192.168.1.41/sales", "root", "password");
        var stmt = c.createStatement();
        if(args.length == 0) {
            var rs = stmt.executeQuery("Select pno , price , stock from products");
            while(rs.next()) {
                System.out.printf("%d\t%.2f\t%d%n", rs.getInt("pno"), rs.getDouble(2), rs.getInt(3));
            }
            rs.close();
        } else {
            int id = Integer.parseInt(args[0]);
            int n = stmt.executeUpdate("Update products set stock = stock + 5 where pno = " +id);
            if(n==0) {
                System.out.println("No such Product");
            }
        }
        stmt.close();
        c.close();
    }

}

