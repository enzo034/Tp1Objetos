public class Time
{
    private int hours;
    private int minutes;
    private int seconds;

    public void setHours(int hours) {
        if(hours > 23)
        {
            System.out.println("Wrong number of hours");
        }else
        {
            this.hours = hours;
        }
    }
    public void setMinutes(int minutes) {
        if(minutes > 59)
        {
            System.out.println("Wrong number of minutes");
        }else
        {
            this.minutes = minutes;
        }
    }
    public void setSeconds(int seconds) {
        if(seconds > 59)
        {
            System.out.println("Wrong number of seconds");
        }else
        {
            this.seconds = seconds;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }


    public void showTime()
    {
        if(hours < 10)
        {
            System.out.print("Time = [0" + hours);
        }
        else
        {
            System.out.print("Time = [" + hours);
        }
        if(minutes < 10)
        {
            System.out.print(":0" + minutes);
        }
        else
        {
            System.out.print(":" + minutes);
        }
        if(seconds < 10)
        {
            System.out.print(":0" + seconds + "]\n");
        }
        else
        {
            System.out.print(":" + seconds + "]\n");
        }
    }

    public Time forward1Second()
    {
        ++seconds;
        if(seconds == 60)
        {
            seconds = 0;
            ++minutes;
            if(minutes == 60)
            {
                minutes = 0;
                ++hours;
                if(hours == 24)
                {
                    hours = 0;
                }
            }
        }
        return this;
    }

    public Time goBack1Second()
    {
        --seconds;
        if(seconds == -1)
        {
            seconds = 59;
            --minutes;
            if(minutes == -1)
            {
                minutes = 59;
                --hours;
                if(hours == -1)
                {
                    hours = 23;
                }
            }
        }
        return this;
    }

}
