package jieproject;

public class Player {

    private String pName;
    private int pts;

    public Player(String pName, int pts){
        this.pName = pName;
        this.pts = pts;
    }

    public String getName() {
        return pName;
    }

    public int getPts() {
        return pts;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }
}

