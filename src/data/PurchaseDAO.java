package data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.Date;
import java.util.List;

/**
 * Created by Антон on 27.03.2016.
 */
public class PurchaseDAO implements DAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;

    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }



    @Override
    public void addPurchase(Date date, int shopId, int clientId, String book, int count, int cost) {

        String sql = "INSERT INTO purchase(id, data, shop, client, book, count, cost) " +
                "VALUES ((SELECT id FROM purchase ORDER BY id DESC LIMIT 1)+1,?,?,?,?,?,?)";

        jdbcTemplate.update(sql,date,shopId,clientId,book,count,cost);


    }

    @Override
    public void deletePurchase(int purchaseId) {

        String sql = "DELETE FROM purchase WHERE id =?";
        jdbcTemplate.update(sql,purchaseId);

    }

    @Override
    public List<Purchase> findData(int shopId, int clientId, String book) {

        String sql = null;


        if (shopId == 0 || clientId == 0 || book.equalsIgnoreCase("")){

            if (shopId==0) {
                if (clientId == 0) {

                    if (book.equalsIgnoreCase("")) {
                        sql = "SELECT * from purchase WHERE client IS NOT NULL AND shop IS NOT NULL AND book IS NOT NULL";
                        return namedParameterJdbcTemplate.query(sql, new PurchaseMapper());
                    }

                    sql = "SELECT * from purchase WHERE client IS NOT NULL AND shop IS NOT NULL AND book = " + book;
                    return namedParameterJdbcTemplate.query(sql, new PurchaseMapper());
                }
                sql = "SELECT * from purchase WHERE client = " +
                        clientId + "AND shop IS NOT NULL AND book = " + book;
            }
        }


            sql =  "SELECT * from purchase WHERE client = " +
                    clientId + "AND shop =" + shopId + " AND book = " + book;
            return namedParameterJdbcTemplate.query(sql,new PurchaseMapper());



    }


    public int check(int shopId, int clientId, String book){


        return  shopId != 0?  clientId !=0? book.equalsIgnoreCase("")? 0: 1 : 2 : 3;


    }

    @Override
    public List<Purchase> findAll() {
        String sql = "select * from Shop";
        return namedParameterJdbcTemplate.query(sql,new PurchaseMapper());
    }
}
