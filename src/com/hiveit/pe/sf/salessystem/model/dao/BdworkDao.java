package com.hiveit.pe.sf.salessystem.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.hiveit.pe.sf.salessystem.model.bean.ArticulosBean;

public interface BdworkDao{
	
	/*Tabla Articulos*/
	ArticulosBean insertarArticulo (ArticulosBean request) throws SQLException;
	ArticulosBean buscarArtCod(String codarticulo) throws SQLException;
	ArticulosBean buscarArtCod(String codarticulo, ArticulosBean a) throws SQLException;
	boolean eliminarArticulo(String codarticulo) throws SQLException;
	boolean actualizarArticulo(ArticulosBean a) throws SQLException;
	ArrayList<ArticulosBean> mostrarArticulosConsulta() throws SQLException;
	ArrayList<ArticulosBean> mostrarArticulosMantenimiento() throws SQLException;

}
