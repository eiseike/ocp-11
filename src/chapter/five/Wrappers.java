package chapter.five;

import java.util.ArrayList;
import java.util.List;

public class Wrappers {
	public static void main(String[] args) {
		{
			Boolean aBoolean = Boolean.valueOf(true);
			Byte aByte = Byte.valueOf((byte) 1);
			Short aShort = Short.valueOf((short) 1);
			Integer integer = Integer.valueOf(1);
			Long aLong = Long.valueOf(1);
			Long aLong1 = Long.valueOf(1L);
			Float aFloat = Float.valueOf(1);
			Float aFloat1 = Float.valueOf(1f);
			Double aDouble = Double.valueOf(1);
			Double aDouble1 = Double.valueOf(1d);
			Character character = Character.valueOf('1');
			System.out.println();
		}
		{
			Boolean aTrue = Boolean.valueOf("true");
			Byte aByte = Byte.valueOf("1");
			Short aShort = Short.valueOf("1");
			Integer integer = Integer.valueOf("1");
			Long aLong = Long.valueOf("1");
			//Long aLong1 = Long.valueOf("1L"); //throws NumberFormatException
			Float aFloat = Float.valueOf("1"); // 1.0
			Float aFloat1 = Float.valueOf("1f"); // 1.0
			Float aFloat2 = Float.valueOf("1d"); // 1.0
			Float aFloat3 = Float.valueOf("1."); // 1.0
			Float aFloat4 = Float.valueOf("1.0"); // 1.0
			Double aDouble = Double.valueOf("1"); // 1.0
			Double aDouble1 = Double.valueOf("1f"); // 1.0
			Double aDouble2 = Double.valueOf("1d"); // 1.0
			Double aDouble3 = Double.valueOf("1."); // 1.0
			Double aDouble4 = Double.valueOf("1.0"); // 1.0
			Character character = "1".charAt(0);
			System.out.println();
		}
		{
			boolean aTrue = Boolean.parseBoolean("true");
			byte b = Byte.parseByte("1");
			short i = Short.parseShort("1");
			int i1 = Integer.parseInt("1");
			long l = Long.parseLong("1");
			//long l1 = Long.parseLong("1L"); //throws NumberFormatException
			float v = Float.parseFloat("1"); // 1.0
			float v1 = Float.parseFloat("1f"); // 1.0
			float v2 = Float.parseFloat("1d"); // 1.0
			float v3 = Float.parseFloat("1."); // 1.0
			float v4 = Float.parseFloat("1.0"); // 1.0
			double v5 = Double.parseDouble("1"); // 1.0
			double v6 = Double.parseDouble("1f"); // 1.0
			double v7 = Double.parseDouble("1d"); // 1.0
			double v8 = Double.parseDouble("1."); // 1.0
			double v9 = Double.parseDouble("1.0"); // 1.0
			char c = "1".charAt(0);
			System.out.println("");
		}
		{
			List<Integer> weights = new ArrayList<>();
			Integer w = 50; // autoboxes the int primitive into an Integer obj.
			weights.add(w);                  // [50]
			weights.add(Integer.valueOf(60));     // [50, 60] // manual boxing
			weights.remove(new Integer(50)); // [60] //manual boxing
			double first = weights.get(0);   // 60.0 //autobixing and cast

		}
		{
			List<Integer> heights = new ArrayList<>();
			heights.add(null);
			//int h = heights.get(0); // throws NullPointerException
			Integer h = heights.get(0);
			System.out.println("h = " + h);
		}
	}
}
