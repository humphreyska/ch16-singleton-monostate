
// Use Singleton and Monostate pattern
// to ensure proper behavior.


class Clock {
    private int ticks;
    public Clock() { ticks = 0; }
    public int ticks() { return ticks; }
    public void tick() { ticks++; }
    public void tock() { ticks+=10; }
    public String toString() {
	return "Clock reads " + ticks;
    }
}

