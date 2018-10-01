 static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String TwentyFourTime=null;
        int hours=0,min=0;
        String[] times = s.split(":");  //taking : separated values
        min = Integer.parseInt(times[1]); //taking minute as integer input
        hours = Integer.parseInt(times[0]); //taking hour as integer input
        char[] secs = times[2].toCharArray(); //taking seconds
        char c = times[2].toCharArray()[2]; //taking P or A for matching PM or AM
        if(hours==12 && min>=0 && c=='A'){    //if 12 morning
            TwentyFourTime = "00:"+times[1]+":"+secs[0]+secs[1];
            return TwentyFourTime;
        }
        if(hours==12 && min>=0 && c=='P'){    //if 12 noon
            return times[0]+":"+times[1]+":"+secs[0]+secs[1];
        }
        if(c=='P'){ //if after noon
            hours += 12;
            TwentyFourTime = hours+":"+times[1]+":"+secs[0]+secs[1];
            return TwentyFourTime;
        }
        return times[0]+":"+times[1]+":"+secs[0]+secs[1];
    }
