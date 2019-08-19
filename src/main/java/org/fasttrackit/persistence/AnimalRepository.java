package org.fasttrackit.persistence;

import org.fasttrackit.Pet;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {
    public void createAnimalItem(String name, int starving, int happiness, int health) throws SQLException, IOException, ClassNotFoundException {

        String insertSql = "INSERT INTO animal(name,starving,happiness,health) VALUES(?,?,?,?)";

        try (Connection connection = DatabaseConfiguration.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertSql)
        ) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, starving);
            preparedStatement.setInt(3, happiness);
            preparedStatement.setInt(4, health);

            preparedStatement.executeUpdate();
        }
}
    public List<Pet> getAnimalItems() throws SQLException, IOException, ClassNotFoundException {

        String query = "SELECT id,name,hunger level,happiness level ,health FROM pet";

        try (Connection connection = DatabaseConfiguration.getConnection();
             Statement statement = connection.createStatement();
        ) {
            ResultSet resultSet = statement.executeQuery(query);
            List<Pet> pets= new ArrayList<>();

            while (resultSet.next()) {
                Pet pet = new Pet();
                pet.setId(resultSet.getLong("id"));
                pet.setName(resultSet.getString("name"));
                pet.setHungerLevel(resultSet.getInt("starving"));
                pet.setHappinessLevel(resultSet.getInt("happiness"));
                pet.setHealth(resultSet.getInt("health"));

                pets.add(pet);

            }
            return pets;
        }
    }

    public void deleteAnimalItem(long id) throws SQLException, IOException, ClassNotFoundException {
        String sql = "DELETE FROM pet WHERE id = ?";

        try (Connection connection = DatabaseConfiguration.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        }
    }

    public void updateAnimalItem(long id, int hunger_level, int happiness_level, int health) throws SQLException, IOException, ClassNotFoundException {
        String sql = "UPDATE animal SET starving =?,happiness=?,health=?  WHERE id = ?";

        try (Connection connection = DatabaseConfiguration.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            preparedStatement.setInt(1,hunger_level);
            preparedStatement.setInt(2,happiness_level);
            preparedStatement.setInt(3,health);
            preparedStatement.setLong(4,id);

            preparedStatement.executeUpdate();
        }
    }

}
