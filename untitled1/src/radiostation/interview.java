package radiostation;

public class interview implements Parts {
    private String interviewer;
    private int length;
     static final int price=30;

    public interview(String interviewer, int length) {
        this.interviewer = interviewer;
        this.length = length;
    }

    @Override
    public int calculate() {
        return length*price;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "interview{" +
                "interviewer='" + interviewer + '\'' +
                ", length=" + length +
                '}';
    }
}
