package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgres")
public class PersonDataAccessService implements PersonDao {

    private final JdbcTemplate jdbcTemplate;

    public PersonDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertPerson(String id, Person person) {
        return 0;
    }
    @Override
    public List<Person> selectAllPeople() {
        final String sql = "SELECT id, firstname FROM excel";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            String id = resultSet.getString("id");
            String name = resultSet.getString("firstname");
            return new Person(id, name);
        });
    }
}
