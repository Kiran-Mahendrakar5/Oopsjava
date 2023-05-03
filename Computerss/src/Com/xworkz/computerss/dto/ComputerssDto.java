package Com.xworkz.computerss.dto;

public class ComputerssDto {
	private String brandName ;
	private String model;
	private String colour;
    private int price;
	private ProcessorDto processor;
	
	
	
	public ComputerssDto(String brandName, String model, String colour, int price, ProcessorDto processor) {
		super();
		this.brandName = brandName;
		this.model = model;
		this.colour = colour;
		this.price = price;
		this.processor = processor;
	}
	
	
	@Override
	public String toString() {
		return "ComputerssDto [brandName=" + brandName + ", model=" + model + ", colour=" + colour + ", price=" + price
				+ ", processor=" + processor + "]";
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ProcessorDto getProcessor() {
		return processor;
	}
	public void setProcessor(ProcessorDto processor) {
		this.processor = processor;
	}


	public ComputerssDto[] readAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object findByModel() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	
	
	
}
