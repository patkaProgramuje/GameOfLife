package classes;

public class Cell {
    private boolean currentLive;
    private boolean futureLive;
    private int x;
    private int y;
    private String sign = "O";


    public Cell(int x, int y, boolean currentLive) {
        this.x = x;
        this.y = y;
        this.currentLive = currentLive;
    }

    public boolean isCurrentLive() {
        return currentLive;
    }

    public void setCurrentLive(boolean currentLive) {
        this.currentLive = currentLive;
    }

    public boolean isFutureLive() {
        return futureLive;
    }

    public void setFutureLive(boolean futureLive) {
        this.futureLive = futureLive;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

}
