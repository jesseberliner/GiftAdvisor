import java.lang.reflect.Array;

public class doStuff
{
    public Gift[] setGifts()
    {
        Gift gifts[] = new Gift[6];

        Gift gift0 = new Gift();
        gift0.setGiftGender("Female");
        gift0.setGiftPrice("High");
        gift0.setGiftAge("Adult");
        gift0.setGiftName("Jewelry");
        gifts[0]=gift0;

        Gift gift1 = new Gift();
        gift1.setGiftGender("Female");
        gift1.setGiftPrice("High");
        gift1.setGiftAge("Teen");
        gift1.setGiftName("Weekend Getaway");
        gifts[1]=gift1;

        Gift gift2 = new Gift();
        gift2.setGiftGender("Female");
        gift2.setGiftPrice("High");
        gift2.setGiftAge("Child");
        gift2.setGiftName("Pony");
        gifts[2]=gift2;

        Gift gift3 = new Gift();
        gift3.setGiftGender("Female");
        gift3.setGiftPrice("Low");
        gift3.setGiftAge("Adult");
        gift3.setGiftName("Bottle of Wine");
        gifts[3]=gift3;

        Gift gift4 = new Gift();
        gift4.setGiftGender("Female");
        gift4.setGiftPrice("Low");
        gift4.setGiftAge("Teen");
        gift4.setGiftName("Selfie Stick");
        gifts[4]=gift4;

        Gift gift5 = new Gift();
        gift5.setGiftGender("Female");
        gift5.setGiftPrice("Low");
        gift5.setGiftAge("Child");
        gift5.setGiftName("Bottle");
        gifts[5]=gift5;

        return gifts;
    }
}
