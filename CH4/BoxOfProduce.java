package CH4;

public class BoxOfProduce {

    private String produce1;
    private String produce2;
    private String produce3;

    public BoxOfProduce(String produce1, String produce2, String produce3){
        this.produce1 = produce1;
        this.produce1 = produce2;
        this.produce3 = produce3;
        System.out.println("produce1: " + produce1 + " produce2: " + produce2 + " produce3:" + produce3);
    }

    public String getProduce1() {
        return produce1;
    }

    public void setProduce1(String produce1) {
        this.produce1 = produce1;
    }

    public String getProduce2() {
        return produce2;
    }

    public void setProduce2(String produce2) {
        this.produce2 = produce2;
    }

    public String getProduce3() {
        return produce3;
    }

    public void setProduce3(String produce3) {
        this.produce3 = produce3;
    }
}
