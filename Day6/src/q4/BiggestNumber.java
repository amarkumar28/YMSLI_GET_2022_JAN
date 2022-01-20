package q4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BiggestNumber {

	public static void main(String[] args) throws IOException {
		List<Double> number=new ArrayList<>();
		try {
			BufferedReader bufferedReader=new BufferedReader(new FileReader("./src/text.txt"));
			String line=null;
			while((line=bufferedReader.readLine())!=null) {
				number.add(Double.parseDouble(line));
			}		
			System.out.println("Biggest Number is :" + findBiggestNumber(number));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static Double findBiggestNumber(List<Double> number) {
		double maxNumber=0;
		for(int i=0;i<number.size();i++) {
			maxNumber=Math.max(number.get(i), maxNumber);
		}
		return maxNumber;
	}

}
