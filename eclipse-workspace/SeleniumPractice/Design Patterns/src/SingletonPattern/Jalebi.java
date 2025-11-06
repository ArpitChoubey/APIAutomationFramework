package SingletonPattern;

public class Jalebi {
	
	private static Jalebi jalebi = new Jalebi();
	
	public static Jalebi getjalebi() {
		return jalebi;
	}

}
