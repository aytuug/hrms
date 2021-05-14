package aytugakin.hmrs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import aytugakin.hmrs.entities.concretes.Title;

public interface TitleDao extends JpaRepository<Title, Integer> {

}
