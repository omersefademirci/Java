package business.conctretes;

import business.abstracts.GamerService;
import core.abstracts.GamerCheckService;
import dataAccess.abstracts.GamerDao;
import entities.conctretes.Gamer;

public class GamerManager implements GamerService{
	private GamerCheckService gamerCheckService;
	private GamerDao gamerDao;

	public GamerManager(GamerCheckService gamerCheckService, GamerDao gamerDao) {
		super();
		this.gamerCheckService = gamerCheckService;
		this.gamerDao = gamerDao;
	}
	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealGamer(gamer)) {
			System.out.println("Oyuncu eklendi : "+gamer.getFirstName()+" "+gamer.getLastName());
			gamerDao.add(gamer);
			
		}else {
			System.out.println("Oyuncu eklenemedi bilgilerinizi kontrol edin. ");
		}
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		if(gamerCheckService.checkIfRealGamer(gamer)) {
			System.out.println("Oyuncu silindi : "+gamer.getFirstName()+" "+gamer.getLastName());
		}else {
			System.out.println("Oyuncu silinemedi bilgilerinizi kontrol edin. ");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		if(gamerCheckService.checkIfRealGamer(gamer)) {
			System.out.println("Oyuncu güncellendi : "+gamer.getFirstName()+" "+gamer.getLastName());
		}else {
			System.out.println("Oyuncu güncellendi bilgilerinizi kontrol edin. ");
		}
		
		
	}

}
