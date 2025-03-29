package Gun28._04_Soru;

public class Hesap {
    private int yatan=0;
    private int cekilen=0;
    private int bakiye=0;

    public void paraYatir(int yatirilan)
    {
        this.yatan+=yatirilan;
    }

    public void paraCek(int cekilenPara)
    {
        this.cekilen+=cekilenPara;
    }

    public int bakiyeGoster()
    {
        return this.yatan-this.cekilen;
    }

}
