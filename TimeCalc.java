public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMimutes = (hours*60)+minutes+minutesToAdd;
        int totalHours = totalMimutes/60;
        int newHours = totalHours%24;
        int newMinutes = totalMimutes-(totalHours*60);
        if (totalHours<10 && newMinutes<10){
            System.out.println("0" + newHours + ":0" + newMinutes);
        }
        else if (newHours>=10 && newMinutes<10){
           System.out.println(newHours + ":0" + newMinutes);
        }
        else{
            System.out.println(newHours + ":" + newMinutes);
        }
    }
}
