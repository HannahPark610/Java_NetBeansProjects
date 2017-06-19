
package FinalGUI;


public class User {
    
    private int shoeid;
    private String typeOfShoes;
    private String color;
    private Double size;
    private int stock;
    
    
    public User(int Shoeid, String TypeOfShoes, String Color, Double Size, int Stock) {
    
        this.shoeid = Shoeid;
        this.typeOfShoes = TypeOfShoes;
        this.color = Color;
        this.size = Size;
        this.stock = Stock;
       
    }
    
    public int getShoeid() {
        return shoeid;
    }        
    
    public String getTypeOfShoes() {
        return typeOfShoes;
    }
    
    public String getColor() {
        return color;
    }
    
    public Double getSize() {
        return size;
    }
    
    public int getStock() {
        return stock;
    }
}
