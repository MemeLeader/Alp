package ALPS;

public class Group{
    private boolean recruts;
    private String Alpinist;
    private String Mountain;

    public Group(boolean recruts, String alpinist, String mountain) {
        this.recruts = recruts;
        Alpinist = alpinist;
        Mountain = mountain;
    }

    public void setRecruts(boolean recruts) {
        this.recruts = recruts;
    }

    public void setAlpinist(String alpinist) {
        Alpinist = alpinist;
    }

    public void setMountain(String mountain) {
        Mountain = mountain;
    }
}
