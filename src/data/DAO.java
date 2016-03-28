package data;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Антон on 27.03.2016.
 */
public interface DAO {


    //дата, продавец, покупатель, книга, количество, сумма.
    public void addPurchase(String data, int shopId, int clientId, String book, int count, int cost);
    //Форма для удаления данных о покупке по номеру заказа. Содержит поле ввода – номер заказа и кнопку Delete
    public void deletePurchase(int purchaseId);
    // Форма для поиска данных. Содержит поля ввода: продавец, покупатель, книга и кнопку Search
    public List<Purchase> findData(int shopId, int clientId, String book);

    public List<Purchase> findAll();



    public class PurchaseMapper implements RowMapper<Purchase> {

        @Override
        public Purchase mapRow(ResultSet resultSet, int i) throws SQLException {
            Purchase purchase = new Purchase();

            purchase.setBook(resultSet.getString("book"));
            purchase.setCount(resultSet.getInt("count"));
            purchase.setClientId(resultSet.getInt("client"));
            purchase.setCost(resultSet.getInt("cost"));
            purchase.setId(resultSet.getInt("number"));
            purchase.setDate(resultSet.getString("data"));


            return purchase;
        }
    }


}
