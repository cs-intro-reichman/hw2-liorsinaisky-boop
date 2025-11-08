
public  class  TestRandom {
	public static void main(String[]  args) {
    int reps = Integer.parseInt(args[0]);
	int bigger = 0;
	int smaller = 0;
	for (;reps>0;reps--){
		double random = Math.random();
		if (random>0.5){
			bigger++;
		}
		else{
			smaller++;
		}
	}
	System.out.println("> 0.5:  " + bigger + " times");
	System.out.println("<= 0.5: " + smaller + " times");
 }
}
