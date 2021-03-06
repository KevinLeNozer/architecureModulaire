package eu.unareil.dal.jdbc;

import eu.unareil.bo.Produit;
import eu.unareil.dal.DALException;

import java.util.List;

public interface DAO <T>{
    public void insert(T data) throws DALException;

    public void delete(T data) throws DALException;

    T selectById(long id) throws DALException;

    List<T> selectAll() throws DALException;
}
