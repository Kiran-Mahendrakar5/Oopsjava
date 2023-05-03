package Com.xworkz.computerss.dao;

import Com.xworkz.computerss.dto.ComputerssDto;

public class ComputerssDao {
	
	ComputerssDto[] device = new ComputerssDto[10];
	
	public boolean saveComputerss(ComputerssDto details ) {
		if (details!=null) {
			if (details.getBrandName()!=null && details.getModel()!=null) {
				if(device!=null) {
					for(int i=0;i<device.length;i++) {
						if(device[i]==null) {
							device[i]=details;
							System.out.println("device saved succefully");
							return true;
						}
						System.out.println("device not null continue loop");
						
					}
					System.out.println("no device found");
					return false;
				}
				System.out.println("device is null");
				return false;
				
			}
			System.out.println("getname &getmodel null");
			
		}
		System.out.println("details is null");
		return false;
		
		
	}
	public ComputerssDto[] readAll() {
		return device;
	}
	public ComputerssDto findByModel(String brand) {
		if (brand != null) {
			
			for (int i = 0; i < device.length; i++) {
				if (device[i]!=null) {
					
					
					if(device[i].getBrandName().equals(brand)) {
						
						
						
					System.out.println("brand found");
					return device[i];
					
					}
					System.out.println("Not matching");
				}
				System.out.println("device is null");
				
			}
			System.out.println("No device found");
			
		}
		System.out.println("brand is null");
		return null;
		
	}
	
	public ComputerssDto findByModel1(String Model) {
		if (Model != null) {
			
			for (int i = 0; i < device.length; i++) {
				if (device[i]!=null) {
					
					
					if(device[i].findByModel().equals(Model)) {
						
						
						
					System.out.println("model found");
					return device[i];
					
					}
					System.out.println("Not matching");
				}
				System.out.println("device is null");
				
			}
			System.out.println("No device found");
			
		}
		System.out.println("model is null");
		return null;
		
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
