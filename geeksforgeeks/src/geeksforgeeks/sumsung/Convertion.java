package geeksforgeeks.sumsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author chandankumarjena
 * count the number of bits to be flipped to convert
 * A to B
 *
 */
public class Convertion {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int first = Integer.parseInt(bufferedReader.readLine());
		int second = Integer.parseInt(bufferedReader.readLine());
		int xorNumber = first ^ second;
		int count = 0;
		while (xorNumber != 0) {
			count += xorNumber & 1;
			xorNumber >>= 1;
		}
		System.out.print(count);
	}

}
