package app.components;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CustomerModelBean {
    private String id;

    public final String getId() {
        return id;
    }

   public boolean authenticate(String custId , String password) {
    try(var con = ShopDb.pool.getConnection()) {
        var stmt = con.prepareStatement("select count(cust_id) from customers where cust_id=? and pwd=?");
        stmt.setString(1, custId);
        stmt.setString(2 , password);
        var rs = stmt.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        rs.close();
        stmt.close();
        if(count == 1){
            id = custId;
            return true;
        }
        id = null;
        return false;
    }catch(Exception e){
        throw new RuntimeException(e);
    }
   }
}