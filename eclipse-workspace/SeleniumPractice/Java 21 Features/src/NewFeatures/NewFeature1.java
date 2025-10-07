package NewFeatures;

public class NewFeature1 {

	public static void main(String[] args) {
		
		System.out.println("Program Started ");
		
		int a = 45;
		
		int b = 15;
		
		System.out.println(STR."Value of a is {a}");
        System.out.println(STR."Value of b is {b}");
        
        String title = "Contact Page";
        String headline = " Welcome to programming world ";
        String body = "Hope you are doing great ";
        
        String html = STR."""
        	    <html>
        	        <head>
        	            <title>Example Page</title>
        	        </head>
        	        <body>
        	            <h1>{heading}</h1>
        	            <p>{body}</p>
        	        </body>
        	    </html>
        	    """;
        System.out.println(html);
	}

}
