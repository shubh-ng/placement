
    static String timeConversion(String s) {
        String TwentyFourTime=null;
        int hours=0;
        String[] times = s.split(":");  //taking : separated values
        hours = Integer.parseInt(times[0]); //taking hour as integer input
        char[] secs = times[2].toCharArray(); //taking seconds
        char c = times[2].toCharArray()[2]; //taking P or A for matching PM or AM
        if(hours==12 && c=='A'){    //if 12 morning
            TwentyFourTime = "00:"+times[1]+":"+times[2]+":AM";
            return TwentyFourTime;
        }
        if(hours==12 && c=='P'){    //if 12 noon
            TwentyFourTime = s;
            return TwentyFourTime;
        }
        if(c=='P'){ //if after noon
            hours += 12;
            TwentyFourTime = hours+":"+times[1]+":"+secs[0]+secs[1];
            return TwentyFourTime;
        }
        return s;
    }
