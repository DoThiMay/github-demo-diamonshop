package DiamonShop.Service.user;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dto.ProductsDto;
import DiamonShop.Entity.Categorys;
import DiamonShop.Entity.Menus;
import DiamonShop.Entity.Offices;
import DiamonShop.Entity.Slides;
@Service
public interface IHomeService{
@Autowired
	public List<Menus> GetDataMenus();
	public List<Slides> GetDataSlides();
	public List<Categorys> GetDataCategorys();
	public List<Offices> GetDataOffices();
	public List<ProductsDto> GetDataProducts();
}