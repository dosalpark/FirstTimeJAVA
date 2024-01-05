package Study;

public class ins2Test {
    String  ordId;
    String userId;
    String ordDate;
    String userName;
    String productName;
    String userAdress;

    public ins2Test (String ordDate, String ordId){
        this.ordDate = ordDate;
        this.ordId = ordId;
    }

    public String  getOrdId() {
        return ordId;
    }
    public void setOrdId(String  ordId){
        this.ordId=ordId;
    }
    public String getUserId(){
        return userId;
    }
    public void setuserId(String userId){
        this.userId=userId;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getOrdDate(){
        return ordDate;
    }
    public void setOrdDate(String ordDate){
        this.ordDate=ordDate;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public String getUserAdress(){
        return userAdress;
    }
    public void setUserAdress(String userAdress){
        this.userAdress=userAdress;
    }
}

