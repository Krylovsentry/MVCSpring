package data;

import java.util.Date;

/**
 * Created by Антон on 27.03.2016.
 */
public class Purchase {

    ////id,дата, продавец, покупатель, книга, количество, сумма.
    private int id;
    private Date date;

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {

        return date;
    }

    private int shopId;
    private int clientId;
    private String book;
    private int count;
    private int cost;

    public void setId(int id) {
        this.id = id;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setBook(String book) {
        this.book= book;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public int getShopId() {
        return shopId;
    }

    public int getClientId() {
        return clientId;
    }

    public String getBookId() {
        return book;
    }

    public int getCount() {
        return count;
    }

    public int getCost() {
        return cost;
    }
}
