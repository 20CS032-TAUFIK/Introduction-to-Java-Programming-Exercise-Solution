/**
 * 1.7 (Approximate pi;)pi ; can be computed using the following formula:
 * p = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11+....)
 * Write a program that displays the result of 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11)
 * and 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13). Use 1.0 instead of 1 in your
 * program.
 */
public class Exercise01_07 {
	public static void main(String[] args) {
            System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11));
            System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13));		
	}
}
