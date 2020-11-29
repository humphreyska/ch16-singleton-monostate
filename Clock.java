
// Use Singleton and Monostate pattern
// to ensure proper behavior.


class Clock {

    //Singleton implementation
    private static Clock theInstance = new Clock();

    public static Clock instance()
    {
        return theInstance;
    }

    private int ticks;
    private Clock() { ticks = 0; }
    public int ticks() { return ticks; }
    public void tick() { ticks++; }
    public void tock() { ticks+=10; }
    public String toString() {
	return "Clock reads " + ticks;
    }
}

