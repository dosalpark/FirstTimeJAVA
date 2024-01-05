package Study;

public class Cal3 extends Cal{

    public Cal3(int v1, int v2) {
        super(v1, v2);
        System.out.println("CAL3 INIT");
    }
    public int minus(int v1, int v2){
        return this.v1 - v2;
    }
}
