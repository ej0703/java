package ppt;

public class SystemPropertyEx {
	private static String[][] properties = {
			{"java.version","Java Runtime Environment version"},
			{"java.vendor.url", "Java vendor's url"},
			{"java.home","Java installation directory"},
			{"java.vm.specification.version", "Java Virtual Machine specification version"},
			{"java.vm.specification.vendor", "Java Virtual Machine specification vendor"},
			{"java.vm.version", "Java Virtual Machine implementation version"},
			{"java.class.version","Java class format version number"},
			{"java.class.path","Java class path"},
			{"os.name","Operating system name"},
			{"os.arch","Operating system architecture"},
			{"file.separator","File separator"},
			{"path.separator","Path separator"},
			{"line.separator","Line separator"},
			{"user.name","User's account name"},
			{"user.home","User's home directory"},
			{"user.dir","User's current working directory"}
	};
	public static void main(String[] args) {
		String propValue;
		System.out.println("Current Java Properties : ");
		System.out.println("===============================");
		
		for (int i =0;i<properties.length;i++) {
			try {
				propValue = System.getProperty(properties[i][0]);
				System.out.print(properties[i][1]+" = ");
				if(properties[i][0].equals("line.separator")) {
					for(int j=0; j<propValue.length();j++) {
						if(propValue.charAt(j)=='\n') {
							System.out.print("\\n");
						}
						if(propValue.charAt(j)=='\r') {
							System.out.print("\\r");
						}
					};//for
					System.out.println();
				} else {
					if(propValue != null )
						System.out.println(propValue);
					else
						System.out.println("--Not Defind--");
				}//else end
			} catch (SecurityException e) {
				System.out.println("Could not get value of : "+properties);
				System.out.println(e.toString());
			}
		}

	}

}
