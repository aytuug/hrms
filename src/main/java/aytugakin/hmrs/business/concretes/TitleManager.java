package aytugakin.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aytugakin.hmrs.business.abstracts.TitleService;
import aytugakin.hmrs.dataAccess.abstracts.TitleDao;
import aytugakin.hmrs.entities.concretes.Title;
@Service
public class TitleManager implements TitleService{

	private TitleDao titleDao;
	
	@Autowired
	public TitleManager(TitleDao titleDao) {
		super();
		this.titleDao = titleDao;
	}


	@Override
	public List<Title> getAll() {
	
		return this.titleDao.findAll();
	}

}
