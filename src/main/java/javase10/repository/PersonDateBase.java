package javase10.repository;


import javase10.entity.Person;

import java.sql.*;

public class PersonDateBase implements Repository<Person , Integer>{
    private String url="jdbc:oracle:thin:@localhost:1521:XE";
    private String user="mobina";
    private String password="java123";



    @Override
    public void save(Person person) throws Exception {
        Connection conn = DriverManager.getConnection(url,user,password);
        String sql="insert into person(id,name,family,birth_date,role,statuse)values(?,?,?,?,?,?)";
        PreparedStatement preparedStatement=conn.prepareStatement(sql);
        preparedStatement.setInt(1,person.getId());
        preparedStatement.setString(2,person.getName());
        preparedStatement.setString(3,person.getFamily());
        preparedStatement.setDate(4,Date.valueOf(person.getBirthDate()));
        preparedStatement.setString(5,person.getRole().name());
        preparedStatement.setBoolean(6, person.isStatus());
        preparedStatement.execute();
        System.out.println("save success");
        preparedStatement.close();
        conn.close();
    }

    @Override
    public void edit(Person person) throws Exception {
        Connection conn = DriverManager.getConnection(url,user,password);
        String sql="UPDATE person set name=?,family=?,birth_date=?,role=?,statuse=? where id=?";
        PreparedStatement preparedStatement=conn.prepareStatement(sql);
        preparedStatement.setString(1,person.getName());
        preparedStatement.setString(2,person.getFamily());
        preparedStatement.setDate(3,Date.valueOf(person.getBirthDate()));
        preparedStatement.setString(4,person.getRole().name());
        preparedStatement.setBoolean(5, person.isStatus());
        preparedStatement.setInt(6, person.getId());
        preparedStatement.execute();
        System.out.println("edite success");
        preparedStatement.close();
        conn.close();

    }

    @Override
    public void delete(Integer id) throws Exception {
        Connection conn = DriverManager.getConnection(url,user,password);
        String sql="delete from person where id=?";
        PreparedStatement preparedStatement=conn.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        preparedStatement.execute();
        System.out.println("delete success");
        preparedStatement.close();
        conn.close();

    }
}

