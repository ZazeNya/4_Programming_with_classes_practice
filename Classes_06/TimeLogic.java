public class TimeLogic {
    public void changeHours(Time t, int hours) {
        t.setHours(hours);

        if (hours > 60)
            t.setHours(0);
    }

    public void changeMinutes(Time t, int minutes) {
        t.setMinutes(minutes);

        if (minutes > 60) 
            t.setMinutes(0);
    }

    public void changeSeconds(Time t, int seconds) {
        t.setSeconds(seconds);

        if (seconds > 60)
            t.setSeconds(0);
    }
}
