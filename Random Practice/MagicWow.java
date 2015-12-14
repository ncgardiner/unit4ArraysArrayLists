import java.util.Scanner;
public class MagicWow
{
    public static void main(String[] args)
    {
        boolean isMagic = true;
        Scanner scan = new Scanner(System.in);
        int numbers[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println("Enter all the numbers to be in the Magic Square. The format will be:\n#1  #2  #3  #4\n#5  #6  #7  #8\n#9  #10 #11 #12\n#13 #14 #15 #16\nSeparate the numbers by spaces.");
        for (int x=0; x<16; x++)
            numbers[x] = scan.nextInt();
        int grid[][]; //16 squares
        grid = new int[4][4];
        int counter=0;
        for (int i=0; i<4; i++)
            for (int j=0; j<4; j++)
            {
                grid[i][j] = numbers[counter];
                counter++;
            }
        int numCheck[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        //Do all the numbers appear once?
        for (int i=0; i<4; i++)
            for (int j=0; j<4;j++)
                for (int n = 0; n<16; n++)
                    if (grid[i][j] == (n+1) && numCheck[n] ==  (n+1))
                        numCheck[n] = 0;
        for (int i=0; i<16; i++)
            if (numCheck[i] != 0)
                isMagic = false;
        //Do the rows add up?
        int first = 0;
        int total = 0;
        int count = 0;
        int rowTotal = 0;
        for (int i=0; i<4; i++)
            for (int j=0; j<4; j++)
            {
                rowTotal += grid[i][j];
                count++;
                if (count == 4)
                {
                    count = 0;
                    if (first==0)
                        total=rowTotal;
                    if (rowTotal!=total)
                        isMagic=false;
                    rowTotal=0;
                }
            }
        //Columns?
        int colTotal = 0;
        for (int j=0; j<4; j++)
            for (int i=0; i<4; i++)
            {
                colTotal += grid[i][j];
                count++;
                if (count == 4)
                {
                    count = 0;
                    if (colTotal!=total)
                        isMagic=false;
                    colTotal=0;
                }
            }
        //Diagonals?
        int diaCount = 0;
        int diaTotal = 0;
        for(int i=0; i<4; i++)
            diaTotal+=grid[i][i];
        if (diaTotal != total)
            isMagic = false;
        diaTotal=0;
        for(int i=3; i>=0; i--)
        {
            diaTotal+= grid[i][count];
            count++;
        }
        if (diaTotal!=total)
            isMagic=false;
        if (isMagic == true)
            System.out.println("It is a magic square!");
        else
            System.out.println("Get outta here with that garbage");
    }
}