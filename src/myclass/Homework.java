package myclass;

public class Homework {
	public String name;
	
	public void looper () {
		
		if(this.name.substring(1,5).equalsIgnoreCase("haya")) {
			for(int i = 0 ; i < this.name.length();i++){
				for(int j = 0; j < i;j++) {
					System.out.print("*");
					System.out.print(j);
				}
				System.out.println("");
			}
		}else {
			System.out.println("ERROR!!");
		}
	}
}
