package com.xworkz.resume;



import com.xworkz.resume.dao.ResumeDao;
import com.xworkz.resume.dto.AddressDto;
import com.xworkz.resume.dto.ResumeDto;

public class ResumeRunner {
	
	public static void main(String[] args) {
		ResumeDao dao = new ResumeDao();
		AddressDto Address = new AddressDto(21,"nearCollege","hosadurga","karnataka");
		ResumeDto dto = new ResumeDto("Kiran","kiranmahendrakar159k@gmail.com","bsc","sathish",973883113,"28may2000",Address);//positive scenarios
		ResumeDto dto1 = new ResumeDto(null,"kiranmahendrakar159k@gmail.com",null,"sathish",973883113,"28may2000",Address);//negative scenarios
		ResumeDto dto2 = new ResumeDto(null,"kiranmahendrakar159k@gmail.com","bsc","sathish",973883113,null,null);//negative scenarios
		
		dao.saveResume(dto);
		System.out.println(".........test.........");
		dao.saveResume(dto1);
		System.out.println(".........test.........");
		dao.saveResume(dto2);
		System.out.println(".........findByName.........");
		System.out.println(".........findByemail.........");
	
		
		
		ResumeDto find = dao.findByName("Kiran");//positive scenarios
		System.out.println(find);
		
		ResumeDto find1 = dao.findByName("kishan");//negative scenarios
		System.out.println(find1);

		
		
		ResumeDto find3 = dao.findByEmail("kiranmahendrakar159k@gmail.com");//positive scenarios
		System.out.println(find3);
		
		ResumeDto find4 = dao.findByEmail("kishan135@gmail.com");//negative scenarios
		System.out.println(find4);
		
		
		System.out.println("...............updateDegreeByName...............");
		dao.updateDegreeByName("Kiran","enginering");
		
		
		System.out.println("...............updatePhoneNumberByEmail...............");
		dao.updatePhoneNumberByEmail("kirannmahendrakar159k@gmail.com", 814702772);

		
		
	
		
		
		
		
		
		ResumeDto[] ref = dao.readAll();
		for (int i = 0; i < ref.length; i++) {
			if (ref[i] != null) { // removing null
				System.out.println(ref[i]);
	}

}
	}
}
