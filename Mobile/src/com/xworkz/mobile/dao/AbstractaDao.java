package com.xworkz.mobile.dao;

import com.xworkz.mobile.dto.MobileDto;

public class AbstractaDao {
	public abstract class AbstractDao {
		public abstract boolean save(MobileDto dto);
		public abstract MobileDto[] readAll();
		public abstract boolean find(String findName);
		public abstract boolean updateNameByColor(String updatecolor,String updateName);

}
}
