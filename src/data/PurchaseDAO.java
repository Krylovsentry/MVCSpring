package data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
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
    public void addPurchase(String data, int shopId, int clientId, String book, int count, int cost) {

    }

    @Override
    public void deletePurchase(int purchaseId) {

    }

    @Override
    public List<Purchase> findData(int shopId, int clientId, String book) {
        return null;
    }

    @Override
    public List<Purchase> findAll() {
        String sql = "select * from Shop";
        return namedParameterJdbcTemplate.query(sql,new PurchaseMapper());
    }
}
