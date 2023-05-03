package Com.xworkz.computerss;

import Com.xworkz.computerss.dao.ComputerssDao;
import Com.xworkz.computerss.dto.ComputerssDto;
import Com.xworkz.computerss.dto.ProcessorDto;

public class ComputerssRunner {
	
	public static void main(String[] args) {
		
		ComputerssDao dao = new ComputerssDao();
		
		ProcessorDto process = new ProcessorDto("mackbook","i7Genaration","latitude");	
		ComputerssDto dto = new ComputerssDto("apple","ipad","black",750000,process);
		
		
	
		dao.saveComputerss(dto);
		ComputerssDto find = dao.findByBrand("apple");
		System.out.println(find);//positive block
		
		ComputerssDto find1 = dao.findByBrand("dell");
		System.out.println(find1);//negative block
		
		
		ComputerssDto find2 = dao.findByModel("ipad");
		System.out.println(find);//positive block
		
		
		
		
		
		
		

		ComputerssDto[] device = dao.readAll();
		for (int i = 0; i < device.length; i++) {
			if (device[i] != null) { 
				System.out.println(device[i]);
				
			}
				
	}

	}
}
