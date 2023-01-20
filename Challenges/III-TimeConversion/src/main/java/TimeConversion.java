public class TimeConversion {

    public static String timeConversion(String s) {
        // Write your code here

        Boolean PM = false;
        if (s.contains("PM")){
            PM = true;
        }

        String onlyTime = s.substring(0,8);

        if (PM){
            if (onlyTime.substring(0,2).equals("12")){
                return onlyTime;
            }

            Integer conversion = Integer.parseInt(onlyTime.substring(0,2));
            conversion += 12;

            if (conversion == 24){
                conversion = 00;
            }
            return conversion + onlyTime.substring(2,8);
        }

        if (onlyTime.substring(0,2).equals("12")){
            return "00" + onlyTime.substring(2,8);
        }
        return onlyTime;
    }
}
