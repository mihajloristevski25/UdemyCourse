public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking , int hourOfDay){
        if(hourOfDay >= 0 && hourOfDay < 24)
            if((hourOfDay < 8 || hourOfDay > 22) && barking)
                return true;
            else
                return false;
        else if(hourOfDay < 0 || hourOfDay > 24)
            return false;
        return false;
    }
}
