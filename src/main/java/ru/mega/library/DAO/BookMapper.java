package ru.mega.library.DAO;

import org.springframework.jdbc.core.RowMapper;
import ru.mega.library.models.Book;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();

        book.setTitle(rs.getString("title"));
        book.setAuthor(rs.getString("author"));
        book.setYear(rs.getInt("year"));

        return book;
    }
}
