
// THIS CLIENT FAILS
//
// Choose to use either Singleton or Monostate pattern
// and refactor Clock to be impervious to our summer help.

class ClockClient2 {
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
	c = new Clock(); // Don't just remove this! 
	                 // Some well-intentioned but 
	                 // uninformed summer intern 
                         // will accidentally do EXACTLY
	                 // this kind of thing. So as the
	                 // designer we will ensure proper
	                 // singleton behavior using our
	                 // Singleton/Monostate pattern.

	                 // After refactoring Clock, this
	                 // should just work right! AND,
	                 // ClockClient1 should still work!
	c.tock();
	System.out.println(c);
    }
}


