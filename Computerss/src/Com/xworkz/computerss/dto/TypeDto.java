package Com.xworkz.computerss.dto;

public enum TypeDto {
	
	
	
	WHITE("white"),BLACK("black");
	String type;
	type(String type){
		this.type=type;
	}

}


ComputerssDto find = dao.findByBrand("dell");
System.out.println(find);
