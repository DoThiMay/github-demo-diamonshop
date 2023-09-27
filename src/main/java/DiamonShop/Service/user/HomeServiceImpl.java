package DiamonShop.Service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.CategorysDao;
import DiamonShop.Dao.MenuDao;
import DiamonShop.Dao.OfficesDao;
import DiamonShop.Dao.ProductsDao;
import DiamonShop.Dao.SlidesDao;
import DiamonShop.Dto.ProductsDto;
import DiamonShop.Entity.Categorys;
import DiamonShop.Entity.Menus;
import DiamonShop.Entity.Offices;
import DiamonShop.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categoryDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private OfficesDao officeDao;
	@Autowired
	private ProductsDao productsDao;

	public List<Slides> GetDataSlides() {
		return slidesDao.GetDataSlides();
	}

	public List<Categorys> GetDataCategorys() {
		return categoryDao.GetDataCategorys();
	}

	public List<Menus> GetDataMenus() {
		return menuDao.GetDataMenus();
	}

	@Override
	public List<Offices> GetDataOffices() {
		return officeDao.GetDataOffices();
	}

	@Override
	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataProducts();
		return listProducts;
	}

}
