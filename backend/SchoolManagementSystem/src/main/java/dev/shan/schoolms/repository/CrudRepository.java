package dev.shan.schoolms.repository;

import java.util.List;

public interface CrudRepository<E> extends SuperRepository {
	E add (E entity);
	E update (E entity);
	boolean delete (E entity);
	boolean delete (Integer id);
	E find (Integer id);
	List<E> findAll ();
	List<E> findByFieldName (String fieldName, Object findValue);
}
