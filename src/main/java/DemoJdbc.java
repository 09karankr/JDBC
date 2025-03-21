import  java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
            seven steps--

            import package
            load and register
            create connection
            create statement
            execute statement
            process and results
            close
         */
        int sid = 101;
        String sname = "Gautam";
        int marks = 54;

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "Karan@123";
        String sql = "insert into student values (?,?,?)";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname,pass);
       // System.out.println("Connection Established");
        //Statement st = con.createStatement();
        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);
        st.execute();
        //System.out.println(status);
        //ResultSet rs = st.executeQuery(sql);
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("Name of the student is " + name);

//        while (rs.next()){
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getString(2) + " - ");
//            System.out.println(rs.getInt(3));
//        }

        con.close();
        //System.out.println("Connection closed");



    }
}
