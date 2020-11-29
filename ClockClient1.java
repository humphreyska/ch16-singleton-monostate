
// 
// This Clock client code works!
// But the other client fails! Go try that one
// and then refactor to ensure proper behavior.

class ClockClient1 {
    // Should output 0, 1, 11, 12, 13, 23, 24
    public static void main(String[] args) {
	Clock c = new Clock();
	System.out.println(c);   // 0
	c.tick();
	System.out.println(c);   // 1
	c.tock();
	System.out.println(c);   // 11
	foo(c);                  // 12
	c.tick();                // 13
	System.out.println(c);
	footoo(c);               // 23
	c.tick();                // 24
	System.out.println(c);
    }
    public static void foo(Clock c) {
	c.tick();
	System.out.println(c);
    }
    public static void footoo(Clock c) {
	c.tock();
	System.out.println(c);
    }
}


