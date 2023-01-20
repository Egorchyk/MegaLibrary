package ru.mega.library.DAO;

import org.springframework.jdbc.core.RowMapper;
import ru.mega.library.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Person person = new Person();

        person.setFullName(rs.getString("full_name"));
        person.setYearOfBorn(rs.getInt("age"));

        return person;
    }
}
