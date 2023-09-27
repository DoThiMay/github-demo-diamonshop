package DiamonShop.Service.user;

import org.springframework.stereotype.Service;

import DiamonShop.Entity.Users;

@Service
public interface IAccountService {
	public int AddAccount(Users user);
	public Users CheckAccount(Users user);
}
