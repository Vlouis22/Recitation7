/**
 * Recitation7 is a class for completing
 *  Reciation 7 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class Recitation7
{
    // define your constants after this comment
    private static String replicate(char ch, int ntimes){
        String str = "";
        for(int i=0, j=ntimes-1; i<ntimes; i++,j--){
            str += ch;
        }
        return str;
    }

    
    public static String leftRightTriangle(int height)
    {
        String str = "";
        for(int row=0; row<height; row++){
            str += replicate('*', row+1)+"\n";
        }

        //add your code here
        return str;
    }

    public static String rightRightTriangle(int height)
    {
        // add your code here
        String str = "";

        for(int row=0; row<height; row++){
            str += replicate(' ', height-row-1) + replicate('*', row+1) + "\n";
        }
        return str;
    }



    public static String circle(int radius)
    {
        String str = "";
        //int i = radius -1;
        int x;

        for(int i = radius-1; i>=-radius+1;i--){
            x = (int)Math.sqrt(radius*radius - i*i);
            str+= replicate(' ',radius-x)+replicate('*', x)+replicate('*',x)+"\n";
        }
        //add your code here
        return str;


        //when y = r, x = 0
        // when x = r, y = 0

        // have to multiply by 2 to get whole circle
        // take radius minus x to get
    }
}
