import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        doStuff doStuff = new doStuff();
        Gift[] gifts = doStuff.setGifts();

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose gender, Male or Female");
        String gender = scan.next();

        System.out.println("Choose price range, High, Medium, or Low");
        String price = scan.next();

        System.out.println("Choose age, Adult, Teen, or Child");
        String age = scan.next();

        Gift suggestedGift = null;

        for (Gift gift : gifts)
        {
            if(gift.getGiftGender().equalsIgnoreCase(gender) && gift.getGiftPrice().equalsIgnoreCase(price) && gift.getGiftAge().equalsIgnoreCase(age))
            {
                suggestedGift = gift;
            }

        }
        if(suggestedGift!=null)
        {
            System.out.println("Your gift suggestion is: " + suggestedGift.getGiftName());
        }
        else
        {
            System.out.println("Sorry, no gift suggestions for your selection.");
        }
        System.out.println("Your selection is gender:" + gender +", range:" + price + ", age:" +age );



    }


}
