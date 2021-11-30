public class DiagonalStar
{
    public static void printSquareStar(int number)
    {
        if(number < 5)
            System.out.println("Invalid Value");
       else
        {
            for(int i = 0; i < number; i++)
            {
                for(int j = 0; j < number; j++)
                {
                    if(i == 0 || i == number - 1 || j == 0 || j == number -1 || i == j || i + j == number - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
//00 01 02 03 04 05 06
//10 11 12 13 14 15 16
//20 21 22 23 24 25 26
//30 31 32 33 34 35 36
//40 41 42 43 44 45 46
//50 51 52 53 54 55 56
//60 61 62 63 64 65 66