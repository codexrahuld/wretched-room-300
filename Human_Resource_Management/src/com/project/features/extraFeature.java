package com.project.features;

		// Login page related extra features

public class extraFeature {
	
	public static final String GREEN_BOLD = "\033[1;32m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_GREEN = "\u001B[32m";
	
	public static void loding() {
    	System.out.println();
    	System.out.print("Loading");
        for(int i=0; i<3; i++) {
        	System.out.print(".");
        	try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        System.out.println("   Done!");
    }
	
	public static void thank() {
    	System.out.println();
    	String str="Thank You...!";
        for(int i=0; i<str.length(); i++) {
        	System.out.print(GREEN_BOLD+str.charAt(i));
        	if(str.charAt(i)!=' ') {
        		try {
    				Thread.sleep(200);
    			} catch (InterruptedException e){}
        	}
        }
        System.out.println(ANSI_RESET);
        System.out.println();
    }
	
}
