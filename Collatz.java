
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String vorc = args[1];
        int number = seed;
        int count = 1;
		if (vorc.equals("v")){
        for (int i = 1; i <= seed; i++) {
            number = i;
            System.out.print(number + " ");
            do {
                if (number % 2 == 0) {
                    number = number / 2;
                    System.out.print(number + " ");
                } else {
                    number = (number * 3) + 1;
                    System.out.print(number + " ");
                }
                count ++;
            } while (number != 1);
            System.out.print("(" + (count) + ")");
            System.out.println();
            count = 1;
        }
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	  }
	  else {
        System.out.println("Every one of the first " + seed  + " hailstone sequences reached 1.");
	  }
	}
}
