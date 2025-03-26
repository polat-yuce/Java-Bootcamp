package Gun25._03_Soru;

public class Rectangle {
    int length;
    int width;

    public void alan()
    {
        System.out.println("Alan="+
                (this.length*this.width) );
    }

    public void cevre()
    {
        System.out.println("Cevre="+
                ( (this.length+this.width)*2 ));
    }

}
