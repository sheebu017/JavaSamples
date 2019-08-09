package JavaSamples.JavaSamples;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
	
	final static String BRANCH="PERF";
	
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World! " +BRANCH+ " "+ new Date());
        for (int i=0;i< 10;i++) {
            System.out.println( " Counting ");
            System.out.println( i);


        }
    }
}
