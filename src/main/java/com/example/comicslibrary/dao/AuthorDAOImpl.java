package com.example.comicslibrary.dao;

import com.example.comicslibrary.SpringJdbcConfig;
import com.example.comicslibrary.model.Author;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class AuthorDAOImpl implements AuthorDAO {


    @Override
    public List<Author> getAll() {
        List<Author> authors = null; // = new List<>();
        try(Connection connection = SpringJdbcConfig.getConnection())
        {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM authors");
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                authors.add(new Author(rs.getInt("id"),
                        rs.getString("nickname"), rs.getString("name"),rs.getString("country"),rs.getString("description")));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return authors;
    }

    @Override
    public void add(Author author) {
        try(Connection connection = SpringJdbcConfig.getConnection())
        {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO authors(nickname) VALUES(?)");
            String nickname = Objects.requireNonNull(author.getName(), "Unknown author");
            ps.setString(1,nickname);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Author author) {
        try(Connection connection = SpringJdbcConfig.getConnection())
        {
            PreparedStatement ps = connection.prepareStatement("UPDATE authors SET nickname = ? WHERE id = ?");
            String nickname = Objects.requireNonNull(author.getNickname(), "Empty nickname");
            ps.setString(1, nickname);
            ps.setLong(2, author.getId());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try(Connection connection = SpringJdbcConfig.getConnection())
        {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM authors WHERE id = ?");
            ps.setLong(1, id);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<Author> getOne(int id) {
        Optional<Author> maybeBrand = Optional.empty();
        try (Connection connection = SpringJdbcConfig.getConnection())
        {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM authors WHERE id = ?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
                maybeBrand = Optional.of(new Author(rs.getInt("id"),
                        rs.getString("nickname"),rs.getString("name"),rs.getString("country"), rs.getString("description")));
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return maybeBrand;
    }
}
